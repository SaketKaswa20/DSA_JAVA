import java.util.Scanner;

public class Assignment_2 {
    public static void main(String[] args) {
//        1. Area Of Circle Java Program and Perimeter Of Circle
        Scanner input= new Scanner(System.in);
        System.out.println("Enter radius of circle");
        float r= input.nextFloat();
        double pi= 3.14;
        float Area=  (pi)*(r)*(r);
        float Permeter= 2*pi*r;
        System.out.println("Area "+ Area);
        System.out.println("Perimeter "+ Permeter);
    }
}
