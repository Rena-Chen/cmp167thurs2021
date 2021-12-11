
public class selectionSort {
   public static void main(String[] args) {
	   int [] arr = {2, 5, 1, 3, 4};
	   for (int i = 0; i < arr.length-1; i++){
           int minIndex = i;
           for (int j = i+1; j < arr.length; j++)
               if (arr[j] < arr[minIndex])
                   minIndex = j;
           
           int temp = arr[minIndex];
           arr[minIndex] = arr[i];
           arr[i] = temp;
          
           }
	   for(int print = 0; print < arr.length; print++) {
    	   System.out.print(arr[print] + " ");
       }
   }	  
}
