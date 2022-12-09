public class MainApp {
    public static void main(String[] args) throws Exception {
    TransportasiAir transportasiAir1 = new TransportasiAir(4, 20000);
    transportasiAir1.informasi();
    transportasiAir1.beralayar();
    transportasiAir1.beralabuh();

    
    System.out.println("");
    Sampan sampan1 = new Sampan(20, 50000, 2);
    sampan1.informasi();
    sampan1.beralayar();
    sampan1.beralabuh();
    sampan1.beralabuh(2);

    System.out.println("");
    Kapal kapal1 = new Kapal(50, 100000, "Diesel");
    kapal1.informasi();
    kapal1.beralayar();
    kapal1.beralayar(20);
    kapal1.beralabuh();
    }
}
