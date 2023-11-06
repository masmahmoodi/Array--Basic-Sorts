public class SelectionSort {
    
    
    public static void main(String[] args) {
        int a[] = {4,2,6,5,1,3};       
        
        for (int i = 0; i < a.length; i++) {
            int minIndex = i;
            for (int j = i+1; j < a.length; j++) {
                 
                if(a[j] <a[minIndex]){
                   minIndex = j;
                }
                
            }
            if(i != minIndex){
            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
            }
        }
        
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
            
        }
        
        
        
        
    }
    
    
    
}
