public class Laptop extends Perangkat {
    protected boolean webcam;

    public Laptop(String drive, int ram, float processor,boolean webcam){
        super(drive, ram, processor);
        this.webcam = webcam;
    }

    public void informasi(){
        if (webcam == false){
            System.out.println("Laptop ini memiliki drive tipe " + drive + " dengan ram sebesar " + ram + " GB dan Processor secepat " + processor + "Ghz. Selain itu Laptop ini TIDAK memiliki Webcam");
        }
        else{
            System.out.println("Laptop ini memiliki drive tipe " + drive + " dengan ram sebesar " + ram + " GB dan Processor secepat " + processor + "Ghz. Selain itu Laptop ini memiliki Webcam");
        }
    }

    public void bukaGame(String nama_game){
        System.out.println("Laptop berhasil membuka game " + nama_game);
    }

    public void kirmEmail(String email){
        System.out.println("Laptop berhasil mengirim email ke " + email);
    }

    public void kirmEmail(String email1, String email2){
        System.out.println("Laptop berhasil mengirim email ke " + email1 +" dan ke " + email2);
    }
}
