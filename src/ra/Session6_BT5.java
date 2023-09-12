package ra;

import java.util.Scanner;

public class Session6_BT5 {
    private static Student[] students = new Student[100];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // tạo menu
        while (true){
            System.out.println("-----------------Menu----------------");
            System.out.println("1. Hiển thị danh sách tất cả học sinh\n" +
                    "2. Thêm mới học sinh\n" +
                    "3. Sửa thông tin học sinh dựa vào mã học sinh\n" +
                    "4. Xoá học sinh\n" +
                    "5. Thoát");
            System.out.println("Hãy nhập vào lưạ chon của bạn");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    displayAll();
                    break;
                case 2:
                    addStudent(sc);
                    break;
                case 3:

                    break;
                case 4:
                    deleteById(sc);

                    break;
                case 5:
                    System.out.println("Thoát chương trình");
                    System.exit(0);
                    break;
                default:
                    System.err.println("VUi lòng nhập từ 1 - 5");
                    break;
            }
        }

    }
    // thêm mới
    public  static void displayAll(){
        for (Student s:students) {
            if(s!=null){
                s.displayData();
            }
        }
    }
    // thêm moi
    public  static void addStudent(Scanner sc){
        // nhập vào dữ liệu
        Student student = new Student();
        student.inputData(sc);
        for (int i = 0; i < students.length; i++) {
            if(students[i]==null){
                students[i] = student;
                System.out.println("Thêm thành công");
                break;
            }
        }

    }
    public  static void deleteById(Scanner sc){
        // nhập vàoo id cần xóa
        int id = Integer.parseInt(sc.nextLine());
        boolean check = true;
        for (int i = 0; i < students.length; i++) {
            if(students[i]!=null && students[i].getId()==id){
                students[i] = null;
                System.out.println("Xóa thành công");
                check =false;
                break;
            }
        }
        if (check){
            // chưa đc xóa
            System.err.println("Xóa thất bại");
        }
    }
    static class Student {
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
        public  void inputData(Scanner sc){
            System.out.println("Nhập Id : ");
            this.id = Integer.parseInt(sc.nextLine());
            System.out.println("Nhập tên sv");
            this.name=sc.nextLine();
            System.out.println("Nhập tuổi");
            this.age= Integer.parseInt(sc.nextLine());
            System.out.println("Nhập giới tính");
            this.sex= Boolean.parseBoolean(sc.nextLine());
            System.out.println("Nhập địa chỉ sv");
            this.address=sc.nextLine();
            System.out.println("Nhập sô điện thoại sv");
            this.phone=sc.nextLine();
        }
        public void displayData(){
            System.out.println("-----------------------------------");
            System.out.println("id : "+ id +" | name : "+name);
            System.out.println("age : "+ age + " tuổi | sex : " + (sex?"Nam":"Nữ"));
            System.out.println("address : "+address +" | phone : "+phone );
            System.out.println("-----------------------------------");
        }
    }
}
