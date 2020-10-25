/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contructor_super;

/**
 *
 * @author ADMIN
 */
public class Student extends Person {

//    khi lop cha co qua nhieu contructor ta can phai su dung tu khoa SUPER de giup lop con xac dinh 
//    contructor nao tu lop cha can goi
    public Student(String name,String address) { //nhaan thong tin cua doi tuong tu lop con
        super(name,address); // Gọi tới constructor 2 tham số của lớp cha
    }

    public static void main(String[] args) {
        Student s1 = new Student("Trung","anna");
        System.out.println(s1.getName()+s1.getAddress());
        System.out.println("");
    }

}
