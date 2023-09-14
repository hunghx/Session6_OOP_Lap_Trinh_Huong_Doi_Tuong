package ra;

import java.util.Scanner;

public class Session6_BT5 {
    private static Student[] students = new Student[100]; // tất cả phần tử đều có gia trị = null;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // tạo menu
        while (true){
            System.out.println("-----------------Menu----------------");
            System.out.println("1. Hiển thị danh sách tất cả học sinh\n" + // READ
                    "2. Thêm mới học sinh\n" + //CREATE
                    "3. Sửa thông tin học sinh dựa vào mã học sinh\n" + // UPDATE
                    "4. Xoá học sinh\n" +   // DELETE
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
                    editById(sc);
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
    public  static void addStudent(Scanner sc){
        // nhập vào dữ liệu
        Student student = new Student(); // tại sao lại càn tạo mới đối tượng để sử dụng inputData dùng
        // để nhập dữ liệu cho sinh viên
        System.out.println("Nhập Id mới : ");
        int id = Integer.parseInt(sc.nextLine());
        // kiểm tra tồn tại
        if(findById(id)!=null){
            System.err.println("Id đã tồn tại, vui long nhập lại");
            return;
        }
        student.setId(id);
        student.inputData(sc);
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
    public  static void editById(Scanner sc){
        // nhập vàoo id cần sửa
        System.out.println("Hãy nhập id cần sửa");
        int id = Integer.parseInt(sc.nextLine());
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
        student.inputData(sc);
        System.out.println("Cập nhật thành công");
    }
    public  static void deleteById(Scanner sc){
        // nhập vàoo id cần xóa
        System.out.println("Hãy nhập id cần xóa");
        int id = Integer.parseInt(sc.nextLine()); // Id gọi là định danh của đối tượng
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
