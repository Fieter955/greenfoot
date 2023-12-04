import greenfoot.*;

public class Boom extends Actor
{
    private int timer = 0; // Variabel untuk menghitung waktu objek Boom muncul
    private int duration = 40; // Durasi objek Boom muncul (1 detik = 60 frame)
    private int rotationSpeed = 2; // Kecepatan putaran objek Boom

    public void act()
    {
        if (timer < duration) {
            // Objek Boom masih harus muncul
            // Menambahkan rotasi pada objek Boom
            setRotation(getRotation() + rotationSpeed);
            // Memperbarui timer
            timer++;
        } else {
            // Objek Boom sudah muncul selama 1 detik
            // Menghilangkan objek Boom dari dunia
            getWorld().removeObject(this);
        }
    }
}
