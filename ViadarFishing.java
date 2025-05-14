import java.util.Scanner;

public class ViadarFishing {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Identitas
        System.out.println("=========================================================");
        System.out.println("                    Viadar Fishing");
        System.out.println("             The Most Complete Fishing Shop");
        System.out.println("=========================================================");
        System.out.println("No. Urut : 02");
        System.out.println("NIM      : 230103172");
        System.out.println("Nama     : Muh. Syailendra S.V");
        System.out.println("---------------------------------------------------------");

        // Menu utama
        System.out.println("Menu Pilihan:");
        System.out.println("1. Joran Pancing");
        System.out.println("2. Reel Pancing");
        System.out.println("3. Senar Pancing");
        System.out.println("4. Kail Pancing");
        System.out.println("5. Lure Pancing");
        System.out.print("Pilihan Menu (1-5) = ");
        int pilihan = input.nextInt();

        String namaBarang = "";
        int harga = 0;

        // Pilihan kategori
        if (pilihan == 1) {
            // Joran Pancing
            System.out.println("Pilih Joran Pancing:");
            System.out.println("1. Daido Trisula Terror   - Rp. 1.100.000");
            System.out.println("2. Daido Kraken           - Rp. 1.200.000");
            System.out.println("3. Daido Athena III       - Rp. 300.000");
            System.out.println("4. Daido Alexa JS         - Rp. 250.000");
            System.out.print("Masukan pilihan: ");
            int pilihanJoran = input.nextInt();

            if (pilihanJoran == 1) {
                namaBarang = "Daido Trisula Terror";
                harga = 1100000;
            } else if (pilihanJoran == 2) {
                namaBarang = "Daido Kraken";
                harga = 1200000;
            } else if (pilihanJoran == 3) {
                namaBarang = "Daido Athena III";
                harga = 300000;
            } else if (pilihanJoran == 4) {
                namaBarang = "Daido Alexa JS";
                harga = 250000;
            } else {
                System.out.println("Pilihan tidak valid.");
                return;
            }
        } else if (pilihan == 2) {
            // Reel Pancing
            System.out.println("Pilih Reel Pancing:");
            System.out.println("1. Daido Diablo 6000RK    - Rp. 900.000");
            System.out.println("2. Daido Baratus 2000     - Rp. 550.000");
            System.out.println("3. Daido Predator BC      - Rp. 700.000");
            System.out.print("Masukan pilihan: ");
            int pilihanReel = input.nextInt();

            if (pilihanReel == 1) {
                namaBarang = "Daido Diablo 6000RK";
                harga = 900000;
            } else if (pilihanReel == 2) {
                namaBarang = "Daido Baratus 2000";
                harga = 550000;
            } else if (pilihanReel == 3) {
                namaBarang = "Daido Predator BC";
                harga = 700000;
            } else {
                System.out.println("Pilihan tidak valid.");
                return;
            }
        } else if (pilihan == 3) {
            // Senar Pancing
            System.out.println("Pilih Senar Pancing:");
            System.out.println("1. Daido Kingkong PE 12X  - Rp. 80.000");
            System.out.println("2. Daido Finesse          - Rp. 120.000");
            System.out.print("Masukan pilihan: ");
            int pilihanSenar = input.nextInt();

            if (pilihanSenar == 1) {
                namaBarang = "Daido Kingkong PE 12X";
                harga = 80000;
            } else if (pilihanSenar == 2) {
                namaBarang = "Daido Finesse";
                harga = 120000;
            } else {
                System.out.println("Pilihan tidak valid.");
                return;
            }
        } else if (pilihan == 4) {
            // Kail Pancing
            System.out.println("Pilih Kail Pancing:");
            System.out.println("1. Daichi No 12           - Rp. 12.000");
            System.out.println("2. Kyoto No 14            - Rp. 10.000");
            System.out.println("3. Daichi No 10           - Rp. 10.000");
            System.out.print("Masukan pilihan: ");
            int pilihanKail = input.nextInt();

            if (pilihanKail == 1) {
                namaBarang = "Daichi No 12";
                harga = 12000;
            } else if (pilihanKail == 2) {
                namaBarang = "Kyoto No 14";
                harga = 10000;
            } else if (pilihanKail == 3) {
                namaBarang = "Daichi No 10";
                harga = 10000;
            } else {
                System.out.println("Pilihan tidak valid.");
                return;
            }
        } else if (pilihan == 5) {
            // Lure Pancing
            System.out.println("Pilih Lure Pancing:");
            System.out.println("1. Minnow Sinking 7g-15g  - Rp. 25.000");
            System.out.println("2. Spoon 3g - 7g          - Rp. 15.000");
            System.out.println("3. Softlure 50 Piece      - Rp. 50.000");
            System.out.println("4. Metal Jig 7g - 15g     - Rp. 30.000");
            System.out.println("5. Popper 7g - 40g        - Rp. 70.000");
            System.out.print("Masukan pilihan: ");
            int pilihanLure = input.nextInt();

            if (pilihanLure == 1) {
                namaBarang = "Minnow Sinking 7g-15g";
                harga = 25000;
            } else if (pilihanLure == 2) {
                namaBarang = "Spoon 3g - 7g";
                harga = 15000;
            } else if (pilihanLure == 3) {
                namaBarang = "Softlure 50 Piece";
                harga = 50000;
            } else if (pilihanLure == 4) {
                namaBarang = "Metal Jig 7g - 15g";
                harga = 30000;
            } else if (pilihanLure == 5) {
                namaBarang = "Popper 7g - 40g";
                harga = 70000;
            } else {
                System.out.println("Pilihan tidak valid.");
                return;
            }
        } else {
            System.out.println("Pilihan menu tidak valid.");
            return;
        }

        // Input jumlah barang
        System.out.print("Masukkan jumlah barang: ");
        int jumlah = input.nextInt();

        // Hitung total harga
        int total = harga * jumlah;
        double diskon = 0;

        // IF Bersarang untuk diskon
        if (jumlah >= 3) {
            if (total >= 500000) {
                diskon = 0.15;
            } else {
                diskon = 0.10;
            }
        }

        double potongan = total * diskon;
        double totalBayar = total - potongan;

        // Output struk
        System.out.println("\n========== STRUK PEMBELIAN ==========");
        System.out.println("Barang         : " + namaBarang);
        System.out.println("Harga Satuan   : Rp " + harga);
        System.out.println("Jumlah         : " + jumlah);
        System.out.println("Total Harga    : Rp " + total);
        System.out.println("Diskon         : " + (diskon * 100) + "%");
        System.out.println("Potongan       : Rp " + potongan);
        System.out.println("Total Bayar    : Rp " + totalBayar);
        System.out.println("=======================================");
    }
}
