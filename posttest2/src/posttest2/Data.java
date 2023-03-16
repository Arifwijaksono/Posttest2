package posttest2;


class Data { // digunakan untuk menyimpan informasi tentang objek-objek yang dibuat dalam program.
    private String kodebrg; // atribut yang hanya bisa diakses di class yang sama
    private String namabrg;
    private int stokawal;
    private int stokkeluar;
    private int stokmasuk;
    private int stokakhir;
    private double hargabeli;
    private double hargajual;
    // untuk membuat objek baru dari class dgn nilai atribut yang telah
    // diinisialisasi pada saat objek dibuat.
    public Data(String kodebrg, String namabrg, String stokawal1, int stokawal, int stokkeluar, int stokmasuk, double hargabeli, double hargajual) {
        this.kodebrg = kodebrg; // untuk menginisialisasi atribut "name"
        this.namabrg = namabrg;
        this.stokawal = stokawal;
        this.stokkeluar = stokkeluar;
        this.stokmasuk = stokmasuk;
        this.stokakhir = stokakhir;
        this.hargabeli = hargabeli;
        this.hargajual = hargajual;
    }

    /**
     * @return the name
     */
    public String getkodebrg() {
        return kodebrg;
    }

    /**
     * @param kodebrg the kodebrg to set
     */
    public void setkodebrg(String name) {
        this.kodebrg = kodebrg;
    }

    /**
     * @return the namabrg
     */
    public String getnamabrg() {
        return namabrg;
    }

    /**
     * @param namabrg the namabrg to set
     */
    public void setnamabrg(String namabrg) {
        this.namabrg = namabrg;
    }

    /**
     * @return the stokawal
     */
    public int getstokawal() {
        return stokawal;
    }

    /**
     * @param stokawal the stokawal to set
     */
    public void setstokawal(int stokawal) {
        this.stokawal = stokawal;
    }

    /**
     * @return the stokkeluar
     */
    public int getstokkeluar() {
        return stokkeluar;
    }

    /**
     * @param stokkeluar the stokkeluar to set
     */
    public void setstokkeluar(int stokkeluar) {
        this.stokkeluar = stokkeluar;
    }

    /**
     * @return the stokmasuk
     */
    public int getstokmasuk() {
        return stokmasuk;
    }

    /**
     * @param stokmasuk the stokmasuk to set
     */
    public void setstokmasuk(double stokmasuk) {
        this.stokmasuk = (int) stokmasuk;
    }
    
    /**
     * @return the stokakhir
     */
    public int getstokakhir() {
        return stokakhir;
    }

    /**
     * @param stokakhir the stokakhir to set
     */
    public void setstokakhir(int stokakhir) {
        this.stokakhir = stokakhir;
    }
    /**
     * @return the hargabeli
     */
    public double gethargabeli() {
        return hargabeli;
    }

    /**
     * @param hargabeli the hargabeli to set
     */
    public void sethargabeli(double hargabeli) {
        this.hargabeli = hargabeli;
    }
    /**
     * @return the hargajual
     */
    public double gethargajual() {
        return hargajual;
    }

    /**
     * @param hargajual the hargajual to set
     */
    public void sethargajual(double hargajual) {
        this.hargajual = hargajual;
    }
 
}
