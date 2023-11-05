
package Method;

import java.util.Scanner;

public class LuasDanVolume {
    //Balok
    static int hitungLuasPermukaan(int p, int l, int t)
    {
    int hasil = 2 * ((p*l) + (p*t) + (l*t));
    return hasil;
    }
    static int volume(int p, int l, int t) 
    {
    int hasil = (p * l * t );
    return hasil;
    }
    
    //Kubus
    static int LuasKubus(int r)
    {
        int luas = (6 * (r*r));
        return luas;
    }
    static int volumeKubus(int r)
    {
        int volume = (r * r * r);
        return volume;
   }
    
    //Prisma Segitiga
    static double LuasPrisma(double alas, double tinggiAlas, double sisiAlas
    , double tinggiPrisma, double LuasAlas, double kelilingPrisma, double luasPermukaan)
    {
    double luas = (alas * tinggiAlas);
    double keliling = (3 * sisiAlas);
    double luasPermukaanPrismaSegitiga =(( 2 * LuasAlas) + (kelilingPrisma * tinggiPrisma));
    return luasPermukaanPrismaSegitiga;
    }
    
    //Luas Permukaan Tabung
    static double LuasTabung(double jari_jari, double tinggi)
    {
        double luas = (2 * (22.0/7.0) * jari_jari * (jari_jari + tinggi));
        return luas;
    }
    //Luas Bola
    static double LuasBola( double R)
    {
        double luas = (4 * (22.0/7.0) * (R*R));
        return luas;
    }
    
    public static void main(String[] args) {
        Scanner baru = new Scanner(System.in);
        int angka;
        System.out.println("# Program Menghtung Luas / Volume Permukaan Bangun Ruang# ");
        System.out.println("===============================================");
        System.out.print("# Pilih Angka :1, 2, 3, 4, 5, 6, 7 : \n"
                + "1. Menghitung Luas Permukaan Balok\n"
                + "2. Menghitung Volume Balok \n"
                + "3. Menghiting Luas Kubus \n"
                + "4. Menghitung Volume Kubus \n"
                + "5. Menghitung Luas Prisma Segitiga \n"
                + "6. Menghitung Luas Permukaan Tabung \n"
                + "7. Menghitung Luas Permukaan Bola \n"
 
        );
        System.out.print("=====> MASUKAN ANGKA <===== : ");
        angka = baru.nextInt();
        System.out.println();
        
        switch(angka){
            case 1 :
                System.out.println(" ======Menghitung Luas Balok======");
                System.out.print(" Masukan Panjang Balok : ");
                int p = baru.nextInt();
                System.out.print(" Masukan Lebar Balok : ");
                int l = baru.nextInt();
                System.out.print(" Masukan Tinggi Balok : ");
                int t = baru.nextInt();
                System.out.println("Luas Permukaan Balok Adalah : " + hitungLuasPermukaan(p, l,t) + "cm");
                break;
            case 2 :
                 System.out.println(" ======Menghitung Volume Balok======");
                System.out.print(" Masukan Panjang Balok : ");
                p = baru.nextInt();
                System.out.print(" Masukan Lebar Balok : ");
                l = baru.nextInt();
                System.out.print(" Masukan Tinggi Balok : ");
                t = baru.nextInt();
                System.out.println("Volume Permukaan Balok Adalah : " + volume(p,  l, t)+ "cm" );
            case 3 : 
                System.out.println(" ======Menghitung Luas Kubus======");
                System.out.print(" Masukan Panjang R : ");
                int r = baru.nextInt();
                System.out.println("Luas Permukaan Kubus Adalah : " + LuasKubus(r) + "cm");
                break;
            case 4 :
                System.out.println(" ======Menghitung Volume Kubus======");
                System.out.print(" Masukan Panjang R : ");
                r = baru.nextInt();
                System.out.println("Volume Permukaan Kubus Adalah : " + volumeKubus(r) + "cm");
                break;
            case 5 :
                System.out.println(" ======Menghitung Luas Prisma Segitiga======");
                System.out.print(" Masukan Alas : ");
                double alas = baru.nextDouble();
                System.out.print(" Masukan Tinggi : ");
                double tinggiAlas= baru.nextDouble();
                System.out.print(" Masukan sisi Alas : ");
                double sisiAlas = baru.nextDouble();
                System.out.print(" Masukan Tinggi Prisma  : ");
                double tinggiPrisma= baru.nextDouble();
                System.out.print(" Masukan Luas Alas : ");
                double LuasAlas = baru.nextDouble();
                System.out.println(" Masuka Keliling Prisma : ");
                double kelilingPrisma = baru.nextDouble();
                System.out.println("Masukan Luas Permukaan : ");
                double luasPermukaan = baru.nextDouble();
                System.out.println("Luas Permukaan Kubus Adalah : " +  LuasPrisma( alas, tinggiAlas,  sisiAlas
    , tinggiPrisma,  LuasAlas,  kelilingPrisma, luasPermukaan) + "cm");
                break; 
            case 6:
                System.out.println("======Menghitung Luas Tabung======");
                System.out.print(" Masukan Jari-jari: ");
                double jari_jari = baru.nextDouble();
                System.out.print(" Masukan Tinggi Tabung : ");
                double tinggi = baru.nextInt();
                System.out.println("Luas Permukaan Tabung Adalah : " + LuasTabung(jari_jari, tinggi)+"cm");
            case 7 :
                System.out.println("======Menghitung Luas Bola======");
                System.out.println(" Masukan r : ");
                double R = baru.nextDouble();
                System.out.println("Luas Permukaan Bola Adalah : " + LuasBola(R) );
            default:
                System.out.println("Sekian kalo kurang buat lagi gaa :D ");}
   }
