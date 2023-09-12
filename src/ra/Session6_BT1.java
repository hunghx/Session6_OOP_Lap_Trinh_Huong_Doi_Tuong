package ra;

import java.util.Scanner;

public class Session6_BT1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c1 = new Circle();
        c1.inputData(sc);
        c1.displayData();
        System.out.println("chu vi của hinh tròn c1 là "+c1.chuVi());
        System.out.println("diện tích của hinh tròn c1 là "+c1.dienTich());
    }
   static class Circle{
        private double radius;
        private  String color;

        public Circle() {
        }

        public Circle(double radius, String color) {
            this.radius = radius;
            this.color = color;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public double chuVi(){
            return 2*Math.PI*radius;
        }
        public double dienTich(){
            return Math.PI*radius*radius;
        }
        public  void inputData(Scanner scanner){
            System.out.println("Nhâp bán kính của hình tròn ");
            this.radius = Double.parseDouble(scanner.nextLine());
            System.out.println("Nhập màu sắc của hình tròn");
            this.color = scanner.nextLine();
        }
        public  void displayData(){
            System.out.println("Hình tròn có bán kính : "+radius + " và màu sắc : " + color);
        }
    }
}
