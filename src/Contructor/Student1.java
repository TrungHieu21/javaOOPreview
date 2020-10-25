/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contructor;

/**
 *
 * @author ADMIN
 */
public class Student1 {

    int id;
    String name;

    Student1(int i, String n) {
        this.id = i;
        this.name = n;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String args[]) {
        Student1 s1 = new Student1(111, "Viet");
        Student1 s2 = new Student1(222, "Tuts");
        s1.display();
        s2.display();
    }

//    Một constructor có tham số truyền vào được gọi là constructor tham số.
//Constructor tham số được sử dụng để cung cấp các giá trị khác nhau cho các đối tượng khác nhau.
}
