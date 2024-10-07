package scholls_for_portal;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TeacherAddDelete extends ClassAddDelete {
    Scanner scanner = new Scanner(System.in);
    HashMap<String, String> teacherAndClass = new HashMap<>();
    String name;
    String surname;

    public String teacherAdd() {
        System.out.print("Muellim adini daxil edin: ");
        name = scanner.nextLine();

        System.out.print("Muellim soyadini daxil edin: ");
        surname = scanner.nextLine();
        while (true) {
            System.out.print(name + " " + surname + " hansi sinife ders deyecey ? : ");

            String eduClass = scanner.nextLine();
            String nameAndSurname = name + " " + surname;
            if (eduClass.equals("0")) {
                break;
            }

            if (classAddDelete.contains(eduClass)) {

                teacherAndClass.put(eduClass, nameAndSurname);

                String general = teacherAndClass.get(eduClass) + " " +
                        eduClass + " sinifine ders deyecey , " +
                        "cixis ucun 0 abasin...!";

                System.out.println(general);

            } else {
                System.out.println("Bele bir sinif hal hazirda yoxdur , cixis ucun 0 abasin..!");
            }
        }
        return "muellim ugurla sinife teyin edildi.";
    }



    public String  teacherDelete() {
        System.out.print("Siyahidan silmek isdediyniz muellimin ilk once adini:  ");
        String nameDelete = scanner.nextLine();

        System.out.print("Sonra ise soyadini daxil edin: ");
        String surnameDelete = scanner.nextLine();

        String nameAndSurname = nameDelete + " " + surnameDelete;

        String classKeyToRemove = null;

        for (Map.Entry<String, String> entry : teacherAndClass.entrySet()) {
            if (entry.getValue().equals(nameAndSurname)) {
                classKeyToRemove = entry.getKey();
                break;
            }
        }

        if (classKeyToRemove != null) {
            teacherAndClass.remove(classKeyToRemove);
            System.out.println(nameAndSurname + " ders dediyi siniflerden  silindi.");
        } else {
            System.out.println("Bele bir muellim yoxdur.");
        }

        return "Silme prosesi tamamlandi.";
    }
}


