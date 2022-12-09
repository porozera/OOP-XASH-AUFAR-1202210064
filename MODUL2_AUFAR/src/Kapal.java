public class Kapal extends TransportasiAir {
    protected String mesin;

    public Kapal(int jumlahKursi, int biaya, String mesin){
        super(jumlahKursi, biaya);
        this.mesin = mesin;
    }

    @Override
    public void informasi(){
        System.out.println("Transportasi Air Jenis Kapal dengan kursi berjumlah " + jumlahKursi + " ditetapkan dengan biaya sebesar Rp. " + biaya);
    }

    @Override
    public void beralayar(){
        System.out.println("Transportasi Air Jenis Kapal sedang berlayar menggunakan mesin " + mesin+ " dengan kecepatan yang tidak stabil");
    }

    public void beralayar(int kecepatan){
        System.out.println("Transportasi Air Jenis Kapal sedang berlayar menggunakan mesin " + mesin+ " dengan kecepatan stabil di kisaran " + kecepatan +" knot");
    }

    @Override
    public void beralabuh(){
        System.out.println("Transportasi Air Jenis Kapal berlabuh di pantai");
    }
    
}
