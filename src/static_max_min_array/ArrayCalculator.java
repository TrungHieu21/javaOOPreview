
package static_max_min_array;

/**
 *
 * @author HIEU_PHAM
 */
public class ArrayCalculator {

    // maxOfArray(arr: int[]) và maxOfArray(arr: double[]) là hai phương thức static được nạp chồng, 
    // hai phương thức này trả về giá trị lớn nhất trong mảng arr.
    public static int maxOfArray(int arr[]) {

        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[0]) {
                maxValue = arr[i];
            }

        }
        return maxValue;
    }
    
    
   
//    ===========================================

    public static double maxOfArray(double arr2[]) {

        double minValue = arr2[0];
        for (int i = 1; i < arr2.length; i++) {
            if (arr2[i] > arr2[0]) {
                minValue = arr2[i];
            }

        }
        return minValue;
    }
//    ===========================================
    // minOfArray(arr: int[]) và minOfArray(arr: double[]) là hai phương thức static được nạp chồng,
    // hai phương thức này trả về giá trị nhỏ nhất trong mảng arr.

    public static int minOfArray(int arr[]) {

        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[0]) {
                maxValue = arr[i];
            }

        }
        return maxValue;
    }
//    ===========================================

    public static double minOfArray(double arr2[]) {

        double minValue = arr2[0];
        for (int i = 1; i < arr2.length; i++) {
            if (arr2[i] < arr2[0]) {
                minValue = arr2[i];
            }

        }
        return minValue;
    }
//    ===========================================
//sorting elements in array
    public static void sortArr(int arr []){
        
        int temp;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("loop out is  : "+i +"\t"+ arr [i]);
           for(int j =0;j < arr.length;j++){
               System.out.println("loop in is  : "+j+"\t"+ arr [j]);
               if(arr [i] < arr [j]){
                   temp = arr [i];
                   arr [i] = arr [j];
                   arr [j] = temp;
               }
           }
           
            }
        System.out.print("Ascending Order is  : ");
        for (int i =0 ;i < arr.length; i++){
            System.out.print( + arr [i]);
        }
    }
    
}
