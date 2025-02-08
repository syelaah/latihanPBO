package meet12;
/**
 *
 * @author sye
 */
public class Mahasiswa {
        
    private String NIM, Nama, Alamat;
        
    public Mahasiswa(String NIM, String Nama, String Alamat){
        this.NIM = NIM;
        this.Nama = Nama;
        this.Alamat = Alamat;
    }

    public String getNIM() {
        return NIM;
    }

    public String getNama() {
        return Nama;
    }

    public String getAlamat() {
        return Alamat;
    }    
}