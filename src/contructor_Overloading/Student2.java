package contructor_Overloading;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class Student2 {
    String student;
    int age;
    String id;
//contructor defaul
    public Student2() {
    }
//contructor overloading

    public Student2(String student, String id) {
        this.student = student;
        this.id = id;
    }

    public Student2(String student, int age) {
        this.student = student;
        this.age = age;
    }

    public Student2(String student, int age, String id) {
        this.student = student;
        this.age = age;
        this.id = id;
    }

   

    
 // show method
    void showData(){
        System.out.println(student + ""+ age +""+id);
    }
 
    public static void main(String args[]) {
  Student2 s1 = new Student2("Viet", 25,"01");
  Student2 s2 = new Student2("Viet",22);
  s1.showData();
  s2.showData();
 }
    
  
                            

//     nguoi dung co the se truyen vao nhieu laij gia tri cho tham so int,float,byte..
//    khi do ta se su dung  OVERLOADING cho thuoc tinh 
//     nhu vay ung voi tham so truyen vao java se goi phon thuc tuong ung 
}
