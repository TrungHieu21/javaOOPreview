/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package static_max_min_array;

/**
 *
 * @author ADMIN
 */
public class Exercise {

    int[] arr = {3, 5, 7, 30, 10, 5, 8, 23, 0, -5};
    int sum = 0;
    double avg;
    int count = arr.length;

    //    TỔNG và TRUNG BÌNH CỘNG của các giá trị phần tử trong mảng.
    //     {3, 5, 7, 30, 10, 5, 8, 23, 0, -5}.
    //=====================================================
    public void arrDemoCaculator() {
        for (int i = 0; i < count; i++) {
            //tinh tong cac phan tu trong mang
            sum += arr[i];
        }
//        tinh gia tri trung binh cua cac phan tu
        avg = (double) sum / count;

        System.out.println("sum of elements:" + sum);
        System.out.println("avg of elements:" + avg);
    }
    //=====================================================

    public static void main(String[] args) {
        Exercise Exercise = new Exercise();
        Exercise.arrDemoCaculator();
    }
}
