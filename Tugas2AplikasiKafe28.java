import java.util.Scanner;

public class Tugas2AplikasiKafe28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 10000, 20000};

        System.out.println("Menu Kafe");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp " + harga[i]);
        }

        System.out.print("Cari menu makanan/minuman: ");
        String cari = input.nextLine();
        boolean ada = false;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cari)) {
                System.out.println("Menu " + menu[i] + " tersedia dengan harga Rp " + harga[i]);
                ada = true;
                break;
            }
        }

        if (!ada) {
            System.out.println("Menu tidak tersedia.");
        }

        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int jumlahItem = input.nextInt();
        input.nextLine();

        String[] pesanan = new String[jumlahItem];
        int[] jumlah = new int[jumlahItem];
        int totalBiaya = 0;

        for (int i = 0; i < jumlahItem; i++) {
            System.out.print("Nama menu ke-" + (i + 1) + ": ");
            pesanan[i] = input.nextLine();
            System.out.print("Jumlah porsi: ");
            jumlah[i] = input.nextInt();
            input.nextLine();
        }

        for (int i = 0; i < jumlahItem; i++) {
            for (int j = 0; j < menu.length; j++) {
                if (menu[j].equalsIgnoreCase(pesanan[i])) {
                    totalBiaya += harga[j] * jumlah[i];
                }
            }
        }

        System.out.println("STRUK PESANAN");
        for (int i = 0; i < jumlahItem; i++) {
            System.out.println("- " + pesanan[i] + " (" + jumlah[i] + "x)");
        }
        System.out.println("Total Biaya Keseluruhan: Rp " + totalBiaya);
    }
}