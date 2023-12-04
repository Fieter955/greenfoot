import greenfoot.*;

public class musuh extends Actor
{
    private boolean isSpawned = false; // Variabel status untuk melacak apakah objek telah muncul atau belum

    public void act()
    {
        // Muncul setiap dua detik secara acak dari sebelah kanan jika belum muncul
        if (!isSpawned && Greenfoot.getRandomNumber(100) < 3) {
            getWorld().addObject(new musuh(), getWorld().getWidth() - 1, Greenfoot.getRandomNumber(getWorld().getHeight()));
           
            isSpawned = true; // Set variabel status menjadi true agar objek tidak muncul berlipat ganda
        }

        // Bergerak ke kiri secara otomatis
        move(-1);

        // Hapus objek jika mencapai batas kiri layar
        if (getX() <= 0) {
            getWorld().removeObject(this);
        }
    }
}
