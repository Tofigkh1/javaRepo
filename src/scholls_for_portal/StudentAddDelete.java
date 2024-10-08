package scholls_for_portal;

import java.util.HashMap;
import java.util.Scanner;

public class StudentAddDelete extends ClassAddDelete {
    Scanner scanner = new Scanner(System.in);

    HashMap<String, String> studentAndClass = new HashMap<>();

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
            String nameAndSurname = name + " " + surname;
            if (eduClass.equalsIgnoreCase("yes")){
                break;
            }

            if(classAddDelete.contains(eduClass)){
                studentAndClass.put(eduClass, nameAndSurname);

                String general = studentAndClass.get(eduClass)+ "" + eduClass + "sinifinde dersde oxuyur" + "cixis ucun 0 basin";

                System.out.println(general);

            } else {
                System.out.println(eduClass + "sinifinde dersde oxuyur");
            }
        }


    }

    public String studentDelete() {
        System.out.println("Enter the name of the student");
        String nameDelete = scanner.nextLine();

        System.out.print("Enter the surname of the student ");
        String surnameDelete = scanner.nextLine();

        String nameAndSurname = nameDelete + " " + surnameDelete;

        String classKeyToRemove = null;

        for (String key : studentAndClass.keySet()) {
            if (studentAndClass.get(key).equals(nameAndSurname)) {
                classKeyToRemove = key;
                break;
            }
        }

        if (classKeyToRemove != null) {
            studentAndClass.remove(classKeyToRemove);
            return nameAndSurname + " removed from class " + classKeyToRemove;
        } else {
            return "Student " + nameAndSurname + " not found.";
        }
    }

}
