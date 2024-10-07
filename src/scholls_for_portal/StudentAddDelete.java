package scholls_for_portal;

import java.util.HashMap;
import java.util.Scanner;

public class StudentAddDelete extends ClassAddDelete {
    Scanner scanner = new Scanner(System.in);

    HashMap<String, String> teacherAndClass = new HashMap<>();

    String name;
    String surname;
    
    public StudentAddDelete() {

        System.out.println("Enter the name of the student");

        name = scanner.next();

        System.out.println("Enter the surname of the student");
        surname = scanner.nextLine();

        while(true){
            System.out.print(name + " " + surname + " hansi sinife aiddir ? : ");

            String eduClass = scanner.nextLine();

            if (eduClass.equalsIgnoreCase("yes")){
                break;
            }



        }
    }
}
