package MODUL1;

import java.util.Scanner;

public class Server {

    public static void main(String[] args) {
        // TODO Create Database

        // TODO Create Menu

        // TODO Insert Menu to Database


        // TODO Display Main Menu

        // TODO Create User

        // Display Menu

        System.out.println("Selamat Datang di Restoran EAD");
        System.out.println("Silahkan Register Terlebih Dahulu");
        System.out.println("====================================");

        Scanner userinput = new Scanner(System.in);

        System.out.print("Nama: ");
        String usernama = userinput.nextLine();

        System.out.print("No. Handphone: ");
        int usernomor = userinput.nextInt();
        
        while(true){
            System.out.println("====================================");
            System.out.println("1. Menu");
            System.out.println("2. Pilih Menu");
            System.out.println("3. Keluar");
            System.out.println("====================================");

            System.out.print("Masukkan Pilihan Menu: ");
            int usermenu = userinput.nextInt();

        if (usermenu == 1){
            System.out.println("1. Bakso Rp.10.000");
            System.out.println("2. Mie ayam Rp. 15.000");
            System.out.println("Es teh manis Rp.5.000");
        
        else if (usermenu == 2){
            System.out.println("Masukkan nama menu: ");
            String pilihanmenu = userinput.nextLine();
            System.out.println("Hasil Pencarian : " + pilihanmenu);
        }

        else if (usermenu == 3){
            System.out.println("Terimakasih");
            break;
        }

    }
}
    }
}