package ra;

import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    public  int age;
    private boolean sex;
    private String address;
    private  String phone;

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    public  void inputData(){

        System.out.println("Nhập tên sv");
        this.name=InputMethods.getString();
        System.out.println("Nhập tuổi");
        this.age= InputMethods.getInteger();
        System.out.println("Nhập giới tính");
        this.sex= InputMethods.getBoolean();
        System.out.println("Nhập địa chỉ sv");
        this.address=InputMethods.getString();
        System.out.println("Nhập sô điện thoại sv");
        this.phone=InputMethods.getString();
    }
    public void displayData(){
        System.out.println("-----------------------------------");
        System.out.println("id : "+ id +" | name : "+name);
        System.out.println("age : "+ age + " tuổi | sex : " + (sex?"Nam":"Nữ"));
        System.out.println("address : "+address +" | phone : "+phone );
        System.out.println("-----------------------------------");
    }
}