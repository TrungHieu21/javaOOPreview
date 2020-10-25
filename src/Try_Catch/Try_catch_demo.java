/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Try_Catch;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Try_catch_demo {
    
    public static void main(String[] args) {
         int arr[] ={5,6,7,8};
         
        try {
        System.out.println(arr [4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("index does not exist!");
        }
       
        
            
            
        
        
    }

   
}
