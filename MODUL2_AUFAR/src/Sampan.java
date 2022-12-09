public class Sampan extends TransportasiAir{
    protected int layar;

    public Sampan (int jumlahKursi, int biaya, int layar){
        super(jumlahKursi, biaya);
        this.layar = layar;
    }

    @Override
    public void informasi(){
        System.out.println("Transportasi Air Jenis Sampan dengan kursi berjumlah " + jumlahKursi + " ditetapkan dengan biaya sebesar Rp. " + biaya);
    }

    @Override
    public void beralayar(){
        System.out.println("Transportasi Air Jenis Sampan sedang berlayar menggunakan "+layar+" layar");
    }

    @Override
    public void beralabuh(){
        System.out.println("Transportasi Air Jenis Sampan berlabuh di pantai tanpa jangkar");
    }

    public void beralabuh(int jangkar){
        System.out.println("Transportasi Air Jenis Sampan berlabuh di pantai menggunakan "+jangkar+" jangkar");
    }
    
    
    
}
