public class TransportasiAir {
    protected int jumlahKursi,biaya;

    public TransportasiAir(int jumlahKursi,int biaya){
        this.jumlahKursi = jumlahKursi;
        this.biaya = biaya;
    }

    public void informasi(){
        System.out.println("Transportasi Air Jenis Tidak diketahui dengan kursi berjumlah " + jumlahKursi + " ditetapkan dengan biaya sebesar Rp. " + biaya);
    }

    public void beralayar(){
        System.out.println("Transportasi Air Jenis Tidak diketahui sedang berlayar");
    }

    public void beralabuh(){
        System.out.println("Transportasi Air Jenis Tidak diketahui berlabuh di pantai");
    }
    
}
