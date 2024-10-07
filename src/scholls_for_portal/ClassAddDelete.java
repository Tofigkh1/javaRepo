package scholls_for_portal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClassAddDelete {

    static List<String> classAddDelete = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public List<String> clasAdd() {
        while (true) {
            System.out.print("Sinif və ya siniflərin adını daxil edin cixis ucun 0'a basin: ");

            String className = scanner.nextLine().trim();

            if (className.equals("0")) {
                System.out.println("Daxil edilen sinifler: ");
                break;
            }
            if (classAddDelete.contains(className)) {
                System.out.println("Bu sinif artıq mövcuddur...!");
            } else {
                classAddDelete.add(className);
                System.out.println("Sinif uğurla elave edildi ✔");
            }

            System.out.println("Hazırda siyahıdakı sinifler: " + classAddDelete.size());

        }
        return classAddDelete;

    }

    public List<String> classDelete() {
        while (true) {
            System.out.println("silmek istediyniz sinifin adini daxil edin cixis ucun 0'a basin: ");
            String deleteClassName = scanner.nextLine();
            if (deleteClassName.equals("0")) {
                break;
            }
            if (classAddDelete.isEmpty()) {
                System.out.println("Ilk evvel sinifi daxil etmek lazimdir....!");
            } else if (classAddDelete.contains(deleteClassName)) {
                classAddDelete.remove(deleteClassName);
                System.out.println(deleteClassName + " sinifi ugurla silindi ✔");

            } else {
                System.out.println(deleteClassName + " adinda bir sinif yoxdur ❌");
            }
        }
        System.out.print("Mektebdeki sinifler : ");
        return classAddDelete;
    }

    public List<String> classLook() {

        if (classAddDelete.isEmpty()) {
            System.out.println("Hal hazirda mektebde teyin olunmus bir sinif yoxdur...!");

        } else {
            System.out.println("Hal hazirdaki sinifler bunlardir: ");
        }
        return classAddDelete;


    }}