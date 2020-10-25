/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contructor_defual;

/**
 *
 * @author ADMIN
 */
public class Student {
    int id;  
    String name;  
   
    void display() {
        System.out.println(id+" "+name);
    }  
   
    public static void main(String args[]) {
        Student s1=new Student();  
        Student s2=new Student();  
        s1.display();  
        s2.display();  
    }  
    
    
   // Giải thích: Trong ví dụ trên, bạn không tạo bất kỳ constructor nào,
   // vì vậy trình biên dịch tự động tạo một constructor mặc định cho bạn. 
   // Giá trị 0 và null được cung cấp bởi constructor mặc định đó.
}
