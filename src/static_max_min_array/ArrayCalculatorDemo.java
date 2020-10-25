/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package static_max_min_array;

/**
 *
 * @author HIEU_PHAM
 */
public class ArrayCalculatorDemo {
    public static void main(String[] args) {
        int arr [] = new int []{3,4,2};
        double arr2 [] = new double []{1.3, 4.2, 6.7};
    // thuoc tinh va phuong thuc static duoc goi thong qua CLASS chu khong thong qua doi tuong
    System.out.println("max of array :");
    System.out.println(ArrayCalculator.maxOfArray(arr));
     System.out.println("min of array :");
    System.out.println(ArrayCalculator.minOfArray(arr));
     System.out.println("max of array :");
    System.out.println(ArrayCalculator.maxOfArray(arr2));
     System.out.println("min of array :");
    System.out.println(ArrayCalculator.minOfArray(arr2));
    ArrayCalculator.sortArr(arr);
    }
    

    
}
