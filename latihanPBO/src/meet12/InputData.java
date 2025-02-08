package meet12;
import java.util.ArrayList;
/**
 *
 * @author sye
 */
public class InputData {
         ArrayList<Mahasiswa>listmahasiswa;
         public InputData(){
             listmahasiswa = new ArrayList();
         }
         public void insertData(String nim, String nama, String alamat){
             Mahasiswa mhs = new Mahasiswa(nim, nama, alamat);
             listmahasiswa.add(mhs);
         }
         public ArrayList<Mahasiswa>getALL(){
             return listmahasiswa;
         }
         public void deleteData(int index){
             listmahasiswa.remove(index);
         }
     }
    
