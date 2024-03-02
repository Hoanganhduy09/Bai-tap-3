package Com.tn;

import java.util.Scanner;

public class Student {
    public String student;

    public static void main(String[] args) {
        Person student = new Person();
        Scanner sc = new Scanner(System.in);
        System.out.println("   ");
        student.name = sc.nextLine();
        student.sex = sc.nextLine();
        student.address = sc.nextLine();
        student.dateofbirth = sc.nextInt();


        System.out.println("   ");
        student.showInfo();
    }
}
