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
public class Person {
//    Constructor của lớp con luôn gọi tới constructor luôn gọi tới constructor của lớp cha,
//    nếu bạn không chỉ rõ là cần gọi tới constructor nào của lớp cha thì lớp con sẽ luôn gọi tới constructor mặc định của lớp cha.
    
    private  String name ;
    private  String address ;

    // contructor
   public Person(String name) {
		this.name = name;
	}
   public Person(String name,String address ) { 
		this.name = name;
		this.address = address;
	}
   
   
   
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name ;
    }

    public void setName(String name) {
        this.name = name;
    }
    

}
