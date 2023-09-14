package ra;

import java.util.Scanner;

public class Session6_BT5 {

    // phát triển ứng dụng qulsv sao cho khi số lượng sinh viên vượt
    // quá giá trị lưu trữ thì tự dộng tăng thêm 10 phân tử

    // validate dữ liệu dữ liệu người dùng nhập
    // vào để khôg bị dừng chương trình (thầy cho)
    private static Student[] students = new Student[10]; // tất cả phần tử đều có gia trị = null;

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
        for (Student s:students) {
            if(s!=null){
                s.displayData();
            }
        }
    }

    // thêm moi
    public  static void addStudent(){
        // nhập vào dữ liệu
        Student student = new Student(); // tại sao lại càn tạo mới đối tượng để sử dụng inputData dùng
        // để nhập dữ liệu cho sinh viên
        System.out.println("Nhập Id mới : ");
        int id = InputMethods.getInteger();
        // kiểm tra tồn tại
        if(findById(id)!=null){
            System.err.println("Id đã tồn tại, vui long nhập lại");
            return;
        }
        student.setId(id);
        student.inputData();
        // tìm kiếm phần tử null đầu tiên và thay thế vij trí của dối tượng mới vào vị trí đó
        for (int i = 0; i < students.length; i++) {
            if(students[i]==null){
                students[i] = student;
                System.out.println("Thêm thành công");
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
        student = null;
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

}
