public class Handphone extends Perangkat{
    protected boolean fingerprint;

    public Handphone(String drive, int ram, float processor,boolean fingerprint){
        super(drive, ram, processor);
        this.fingerprint = fingerprint;
    }

    public void informasi(){
        if (fingerprint == false){
            System.out.println("Handphone ini memiliki drive tipe " + drive + " dengan ram sebesar " + ram + " GB dan Processor secepat " + processor + "Ghz. Selain itu Handphone ini TIDAK memiliki fingerprint");
        }
        else{
            System.out.println("Handphone ini memiliki drive tipe " + drive + " dengan ram sebesar " + ram + " GB dan Processor secepat " + processor + "Ghz. Selain itu Handphone ini memiliki fingerprint");
        }
    }

    public void telfon(int no_hp){
        System.out.println("Handphone berhasil menghubungkan telfon ke No " + no_hp);
    }

    public void kirimSMS(int no_hp){
        System.out.println("Handphone berhasil mengirimkan SMS ke No " + no_hp);
    }

    public void kirimSMS(int no_hp1, int no_hp2){
        System.out.println("Handphone berhasil mengirimkan SMS ke No " + no_hp1 +" dan ke No " + no_hp2);
    }
}
