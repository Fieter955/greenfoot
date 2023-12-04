import greenfoot.*;

public class Laser extends Actor {
    public int speed = 5;
    private boolean collided = false; // Variabel untuk menandai apakah sudah terjadi kolisi
    
    public void act() {
        if (!collided) {
            move(speed);

            if (isAtEdge()) {
                getWorld().removeObject(this);
            } else {
                checkCollision();
            }
        }
    }

    public void checkCollision() {
        // Hanya periksa kolisi jika belum ada kolisi sebelumnya
        if (!collided) {
            Actor target = getOneIntersectingObject(musuh.class);
            if (target != null) {
                Boom boom = new Boom();
                getWorld().addObject(boom, getX(), getY());
                getWorld().removeObject(target);
                getWorld().removeObject(this); // Hapus objek Laser
                collided = true; // Tandai kolisi sebagai true untuk menghindari kolisi lebih lanjut
            }
        }
    }
}
