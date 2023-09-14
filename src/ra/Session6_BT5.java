package ra;

import java.util.Arrays;
import java.util.Scanner;

public class Session6_BT5 {

    // phát triển ứng dụng qlsv sao cho khi số lượng sinh viên vượt
    // quá giá trị lưu trữ thì tự dộng tăng thêm 10 phân tử

    // validate dữ liệu dữ liệu người dùng nhập
    // vào để khôg bị dừng chương trình (thầy cho)
    private static Student[] students = new Student[4];// tất cả phần tử đều có gia trị = null;
    static {
    students[0] = new Student(1,"hung0",22,true,"Hà Nội","0984733526");
    students[1] = new Student(2,"hung1",22,true,"Hà Nội","0923833526");
    students[2] = new Student(3,"hung2",22,true,"Hà Nội","0928333526");
    students[3] = new Student(4,"hung3",22,true,"Hà Nội","0949733526");
    }
    private static int size = 4;
    public static void main(String[] args) {

        // tạo menu
        while (true){
            System.out.println("-----------------Menu----------------");
            System.out.println("1. Hiển thị danh sách tất cả học sinh\n" + // READ
                    "2. Thêm mới học sinh\n" + //CREATE
                    "3. Sửa thông tin học sinh dựa vào mã học sinh\n" + // UPDATE
                    "4. Xoá học sinh\n" +   // DELETE
                    "5. Thoát");
            System.out.println("Hãy nhập vào lưạ chon của bạn");
            int choice = InputMethods.getInteger();
            switch (choice){
                case 1:
                    displayAll();
                    break;
                case 2:
                    addStudent();
                    break;
                case 3:
                    editById();
                    break;
                case 4:
                    deleteById();

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

    } // phương thức chạy chương trình
    // thêm mới
    public static void displayAll(){
        if (size==0){
            System.err.println("Chưa có sv nào ");
            return;
        }
        for (Student s:students) {
            if(s!=null){
                s.displayData();
            }
        }
    }

    // thêm moi
    public  static void addStudent(){
        // kiểm ta xem đẫ đầy chưa
        if(students.length == size){
            reSize();
        }

        // nhập vào dữ liệu
        Student student = new Student(); // tại sao lại càn tạo mới đối tượng để sử dụng inputData dùng
        // để nhập dữ liệu cho sinh viên
        int id = getNewId();
        student.setId(id);
        student.inputData();
        // tìm kiếm phần tử null đầu tiên và thay thế vij trí của dối tượng mới vào vị trí đó
        for (int i = 0; i < students.length; i++) {
            if(students[i]==null){
                students[i] = student;
                System.out.println("Thêm thành công");
                size++;
                break;
            }
        }

    }
    // chỉnh sửa
    public  static void editById(){
        // nhập vàoo id cần sửa
        System.out.println("Hãy nhập id cần sửa");
        int id = InputMethods.getInteger();
        Student student = findById(id);
        if(student==null){
            System.err.println("Không tìm thấy Id");
            return;
        }
        // in ra giá trị cũ
        System.out.println("Giá trị cũ");
        student.displayData();
        System.out.println("Hãy nhập thông tin mới");
        // tiến hanh sửa
        student.inputData();
        System.out.println("Cập nhật thành công");
    }
    public  static void deleteById(){
        // nhập vàoo id cần xóa
        System.out.println("Hãy nhập id cần xóa");
        int id = InputMethods.getInteger() ;// Id gọi là định danh của đối tượng
        // dùng để phân biệt các đội tượng với nhau
        Student student = findById(id);
        if(student==null){
            System.err.println("Không tìm thấy idd");
            return;
        }
        for (int i = 0; i < students.length; i++) {
            if (students[i]!=null && students[i].getId()==id){
                students[i] =null;
                break;
            }
        }

        System.out.println("Xóa thanh công");
        size--;
    }
    // tìm kiếm theo id
    public static Student findById(int id){
        Student student = null;
        for (int i = 0; i < students.length; i++) {
            if (students[i]!=null && students[i].getId()==id){
                student =students[i];
                break;
            }
        }
        return student;
    }
    // mở rộng mảng thêm 10 ô chứa
    public static void reSize(){
        Student[] list = new Student[students.length+10];
        // sao chép giá trij từ mảng cũ sang
        for (int i = 0; i < students.length; i++) {
            list[i] = students[i];
        }
        students = list;
    }
    // tự tạo id tự tăng
    public static int getNewId(){
        int idMax = 0;
        for (Student s:students
             ) {
            if(s!=null && idMax<s.getId()){
                idMax = s.getId();
            }
        }
        return idMax+1;
    }

}
