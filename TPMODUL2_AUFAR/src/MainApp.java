public class MainApp {
    public static void main(String[] args) throws Exception {
        System.out.println("Class Laptop");
        Laptop laptop1 = new Laptop("Seagate", 8, (float) 2.40, true);
        laptop1.informasi();
        laptop1.bukaGame("Valo");
        laptop1.kirmEmail("aufarnugratma@gmail.com");
        laptop1.kirmEmail("aufarnugratama@gmail.com", "akusiapa@gmail.com");
        System.out.println("");

        System.out.println("Class Handphone");
        Handphone handphone1 = new Handphone("Samsung",6, (float) 2.20, false);
        handphone1.informasi();
        handphone1.telfon(628128082);
        handphone1.kirimSMS(62091231);
        handphone1.kirimSMS(628128082, 62091231);
    }

}
