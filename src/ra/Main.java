package ra;

public class Main{
    // định nghĩa class
    public static void main(String[] args) {
        // static dùng để đinh nghĩa vùng nhớ 1 lần duy nhất khi khai báo lớp ,
        // static thuộc sở hữu của lớp chứ ko phải của đối tượng
        // khới tạo đối tượng
        MyClass myClass1 = new MyClass(10,"namtx");
        MyClass myClass2 = new MyClass(12,"hunghx");
        // myClass là 1 đối tượng cua lớp MyClass
        myClass1.display();
        // truy cập thuộc tính của 1 thuộc tính khác
        myClass1.subClass.displayMessage();
        System.out.println(myClass1.name); // 12
        System.out.println(myClass2.name); // 12
        MyClass.number =100;
        System.out.println(myClass1.number); // 100
        System.out.println(myClass2.number); // 100

        MyClass myClass=null;
//        System.out.println(myClass.name);


        Book book1 = new Book("B001","Dê mèn",200,140000,"Tô Hoài");
        Book book2 = new Book("B002","Thor",200,140000,"Alex");
        // thay dổi thuộc tính
        book1.setName("Thỏ và Rùa");
        System.out.println(book1.getName());

        // từ khóa this
        System.out.println(book1.toString());
        System.out.println(book2.toString());
    }
}