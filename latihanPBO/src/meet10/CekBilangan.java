package meet10;

/**
 *
 * @author sye
 */
public class CekBilangan {
    public static void main(String[] args) {
        int[]bilangan = {9,3,7,8,2,4};
        
        int temp;
        
        System.out.println("Bilangan sebelum diurutkan");
        
        for(int i : bilangan){
            System.out.print(i + " ");
        }
        
        System.out.println("\nBilangan setelah diurutkan");
        
        for(int i = 0; i<bilangan.length; i++){
            for(int j=i+1; j<bilangan.length; j++){
                if(bilangan[i] > bilangan[j]){
                    temp = bilangan[i];
                    bilangan[i] = bilangan[j];
                    bilangan[j] = temp;
                }
            }
            System.out.print(bilangan[i] + " ");
        }
    } 
}
