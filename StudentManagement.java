import java.util.Scanner;
import java.util.ArrayList;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
public class StudentManagement {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while(true){

            System.out.println("\n1.Add Student");
            System.out.println("2.View Students");
            System.out.println("3.Exit");

            int choice = sc.nextInt();

            if(choice==1){

                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                students.add(new Student(id,name));
            }
            else if(choice==2){

                for(Student s : students){
                    System.out.println(s.id+" "+s.name);
                }
            }
            else if (choice == 3) {
                break;
            }
        }
    }
}