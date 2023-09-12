package ra;

 public class MyClass {

    // khối
    static {
        System.out.println("đây là 1 khối lệnh");
    }
    // định nghĩa 1 class
    // các thuộc tính

    static int number = 0;
    String name = "hunghx";
    SubClass subClass = new SubClass();


    // Dùng phương thức khởi tạo để tạo ra đối tượng
    public MyClass(){
        // phương thức khởi tạo không tham số
        System.out.println("đây là phương thức khởi tạo không tham số của lớp MyClass");
    }
    public MyClass(int num){
        // phương thức khởi tạo 1 tham số
        this.number = num;
    }
    public MyClass(int num, String name){
        // phương thức khởi tạo 2 tham số
        this.number = num;
        this.name = name;
    }

    public void display(){
        System.out.println("My name is "+this.name);
        System.out.println("My number is "+this.number);
    }


    // định nghĩa lớp con
    static class SubClass{
        String message = "đây là lớp con";
        public SubClass(){
        }
        public void displayMessage(){
            System.out.println(message);
        }
    }

}
