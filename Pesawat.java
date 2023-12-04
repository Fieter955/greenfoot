import greenfoot.*;

public class Pesawat extends Actor
{
    private int timer = 0; // Variabel untuk menghitung waktu sejak laser terakhir ditembakkan
    private int delay = 30; // Jarak waktu antara setiap tembakan laser (dalam frame)

    public void act()
    {
        if (Greenfoot.isKeyDown("w")) // Bergerak ke depan saat tombol 'w' ditekan
        {
            setLocation(getX(), getY() - 4);
        }
         if (Greenfoot.isKeyDown("s")) // Bergerak ke belakang saat tombol 's' ditekan
        {
            setLocation(getX(), getY() + 4);
        }
        if (Greenfoot.isKeyDown("a")) // Bergerak ke kiri saat tombol 'a' ditekan
        {
            setLocation(getX() - 4, getY());
        }
        if (Greenfoot.isKeyDown("d")) // Bergerak ke kanan saat tombol 'd' ditekan
        {
            setLocation(getX() + 4, getY());
        }
        if (Greenfoot.isKeyDown("q")) // Bergerak ke diagonal kiri atas saat tombol 'q' ditekan
        {
            setLocation(getX() - 4, getY() - 4);
        }
        if (Greenfoot.isKeyDown("e")) // Bergerak ke diagonal kanan atas saat tombol 'e' ditekan
        {
            setLocation(getX() + 4, getY() - 4);
        }
        if (Greenfoot.isKeyDown("z")) // Bergerak ke diagonal kiri bawah saat tombol 'z' ditekan
        {
            setLocation(getX() - 4, getY() + 4);
        }
        if (Greenfoot.isKeyDown("c")) // Bergerak ke diagonal kanan bawah saat tombol 'c' ditekan
        {
            setLocation(getX() + 4, getY() + 4);
        }
        
        if (timer >= delay) {
            // Membuat instance baru dari kelas Laser
            Laser laser = new Laser();

            getWorld().addObject(laser, getX() + 70, getY()); // Menampilkan laser di layar

            // Mengatur ulang timer untuk menghitung waktu hingga tembakan laser berikutnya
            timer = 0;
        } else {
            // Meningkatkan nilai timer
            timer++;
        }
    }
}
