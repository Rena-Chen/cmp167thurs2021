
public class insertionSort {
   public static void main(String[] args) {
	   int [] arr = {2, 5, 1, 3, 4};
	   for (int i = 1; i < arr.length; ++i) {
           int curr = arr[i];
           int j = i - 1;

           while (j >= 0 && arr[j] > curr) {
               arr[j + 1] = arr[j];
               j = j - 1;
           }
           arr[j + 1] = curr;
       }
   
   
   for(int print = 0; print < arr.length; print++) {
	   System.out.print(arr[print] + " ");
   }

}  
}
