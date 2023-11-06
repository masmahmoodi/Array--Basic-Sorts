
public class Sorting {
    
    public static void main(String[] args) {
        
        int a[] = {7,6,1,5,10};
        
        for (int i = a.length-1; i < a.length; i--) {
            
            for (int j = 0; j < i; j++) {
               if(a[j] > a[j+1]){
                   int temp = a[j];
                   a[j] = a[j+1];
                   a[j+1] = temp;
               }
                
            }
            
        }
 
        for (int j = 0; j < a.length; j++) {
                System.out.println(a[j]);  
        }
    }
    
}
