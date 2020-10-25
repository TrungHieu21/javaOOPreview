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
public class Student {
    private String nameST;
    private int age ;
    private String address;
    private String id;

    public String getNameST() {
        return nameST;
    }

    public void setNameST(String nameST) {
        this.nameST = nameST;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
//contructor
    public Student() {
    }

    public Student(String nameST, int age) {
        this.nameST = nameST;
        this.age = age;
    }

    public Student(String nameST, int age, String id) {
        this.nameST = nameST;
        this.age = age;
        this.id = id;
    }
    
    void setDataST(){
        System.out.println("information about student :\n" + "id"+id +"\nname:"+nameST);
    }
    
    public static void main(String[] args) {
        Student student = new Student();
        student.setDataST();
    }
        
}
