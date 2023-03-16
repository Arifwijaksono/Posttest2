package posttest2;


import java.util.ArrayList;
import java.util.Scanner;

public class Posttest2 {
    static ArrayList<Data> dataList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        while (true) {
            System.out.println("\nProgram Pendataan Toko Elektronik");
            System.out.println("====================================");
            System.out.println("| 1. Menambah Data               |");
            System.out.println("| 2. Melihat Data                |");
            System.out.println("| 3. Mengubah Data               |");
            System.out.println("| 4. Menghapus Data              |");
            System.out.println("| 5. Keluar Program              |");
            System.out.println("====================================");
            System.out.print("Pilihan: ");
            int pilih = scanner.nextInt();

            switch (pilih) {
                case 1:
                    addData();
                    break;
                case 2:
                    showData();
                    break;
                case 3:
                    updateData();
                    break;
                case 4:
                    deleteData();
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan program ini!");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }

    static void addData() { // // Fungsi addData() untuk melakukan penambahan data
        System.out.println("\n\tMenu Menambahkan Barang ");
        System.out.println("====================================");
        System.out.print("Masukkan kodebrg : ");
        scanner.nextLine(); // utk membuang newline (enter)
        String kodebrg = scanner.next();
        System.out.print("Masukkan Nama Barang (DD/MM/YYYY): ");
        scanner.nextLine();
        String namabrg = scanner.next();
        System.out.print("Masukkan Stok Awal : ");
        scanner.nextLine();
        String stokawal = scanner.next();
        System.out.print("Masukkan Stok Keluar : ");
        int stokkeluar = scanner.nextInt();
        System.out.print("Masukkan Stok Masuk: ");
        int stokmasuk = scanner.nextInt();
        System.out.print("Masukkan Stok Akhir: ");
        int stokakhir = scanner.nextInt();
        System.out.print("Masukkan Harga Beli: ");
        double hargabeli = scanner.nextDouble();
        System.out.print("Masukkan Harga Jual: ");
        double hargajual = scanner.nextDouble();

        var data = new Data(kodebrg, namabrg, stokawal, stokkeluar, stokmasuk, stokakhir, hargabeli, hargajual);
        dataList.add(data);
        System.out.println("====================================");
        System.out.println("Data berhasil ditambahkan!");
    }

    static void showData() {// Fungsi showData() untuk melihat data
        System.out.println("\n\tData KTP Digital Online ");
        System.out.println("====================================");
        if (dataList.isEmpty()) {
            System.out.println("Belum ada data!");
        } else {
            for (int i = 0; i < dataList.size(); i++) {
                System.out.println("\nData ke-" + (i + 1));
                System.out.println("====================================");
                System.out.println("Kode Barang       : " + dataList.get(i).getkodebrg());
                System.out.println("Nama Barang       : " + dataList.get(i).getnamabrg());
                System.out.println("Stok Awal         : " + dataList.get(i).getstokawal());
                System.out.println("Stok Keluar       : " + dataList.get(i).getstokkeluar());
                System.out.println("Stok Masuk        : " + dataList.get(i).getstokmasuk());
                System.out.println("Stok Akhir        : " + dataList.get(i).getstokakhir());
                System.out.println("Harga Beli        : " + dataList.get(i).gethargabeli());
                System.out.println("Harga Jual        : " + dataList.get(i).gethargajual());
                System.out.println("====================================");
            }
        }
    }

    static void updateData() {// Fungsi updateData() untuk melakukan perubahan data
        if (dataList.isEmpty()) {
            System.out.println("\nBelum ada data!");
        } else {
            showData();
            System.out.print("Nomor Barang yang akan diupdate: ");
            int index = scanner.nextInt() - 1; // untuk mengambil input dari pengguna

            if (index < 0 || index >= dataList.size()) {
                System.out.println("Nomor Barang tidak valid!");
            } else {
                System.out.println("\n\tMenu Mengubah Data ");
                System.out.println("====================================");
                System.out.print("Masukkan Kode baru : ");
                String kodebrg = scanner.next();

                System.out.print("Masukkan Nama baru : ");
                String namabrg = scanner.next();

                System.out.print("Masukkan Stok Awal baru : ");
                String stokawal = scanner.next();

                System.out.print("Masukkan Stok Keluar baru : ");
                int stokkeluar = scanner.nextInt();

                System.out.print("Masukkan Stok Masuk baru : ");
                int stokmasuk = scanner.nextInt();
                
                System.out.print("Masukkan Stok Akhir baru : ");
                int stokakhir = scanner.nextInt();
                
                System.out.print("Masukkan Harga Beli baru : ");
                double hargabeli = scanner.nextDouble();
                
                System.out.print("Masukkan Harga Jual baru : ");
                double hargajual = scanner.nextDouble();
                var data = new Data(kodebrg, namabrg, stokawal, stokkeluar, stokmasuk, stokakhir, hargabeli, hargajual);
                dataList.set(index, data); //ini setnya
                System.out.println("====================================");
                System.out.println("Data berhasil diupdate!");
            }
        }
    }

    static void deleteData() { // Fungsi deleteData() untuk melakukan penghapusan data
        if (dataList.isEmpty()) {
            System.out.println("\nBelum ada data!");
        } else {
            showData();
            System.out.println("\n\tMenu Menghapus Data ");
            System.out.println("====================================");
            System.out.print("Nomor data yang akan dihapus: ");
            int index = scanner.nextInt() - 1;

            if (index < 0 || index >= dataList.size()) {
                System.out.println("Nomor data tidak valid!");
            } else {
                dataList.remove(index);
                System.out.println("====================================");
                System.out.println("Data berhasil dihapus!");
            }
        }
    }
}
