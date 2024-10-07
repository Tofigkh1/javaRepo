package scholls_for_portal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClassAddDelete {

    static List<String> sinifElaveEtVeSils = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public List<String> sinifElaveEt() {
        while (true) {
            System.out.print("Sinif və ya siniflərin adını daxil edin cixis ucun 0'a basin: ");

            String sinifAdi = scanner.nextLine().trim();

            if (sinifAdi.equals("0")) {
                System.out.println("Daxil edilen sinifler: ");
                break;
            }
            if (sinifElaveEtVeSils.contains(sinifAdi)) {
                System.out.println("Bu sinif artıq mövcuddur...!");
            } else {
                sinifElaveEtVeSils.add(sinifAdi);
                System.out.println("Sinif uğurla elave edildi ✔");
            }

            System.out.println("Hazırda siyahıdakı sinifler: " + sinifElaveEtVeSils);

        }
        return sinifElaveEtVeSils;

    }

    public List<String> sinifSil() {
        while (true) {
            System.out.println("silmek istediyniz sinifin adini daxil edin cixis ucun 0'a basin: ");
            String silineceySinifAdi = scanner.nextLine();
            if (silineceySinifAdi.equals("0")) {
                break;
            }
            if (sinifElaveEtVeSils.isEmpty()) {
                System.out.println("Ilk evvel sinifi daxil etmek lazimdir....!");
            } else if (sinifElaveEtVeSils.contains(silineceySinifAdi)) {
                sinifElaveEtVeSils.remove(silineceySinifAdi);
                System.out.println(silineceySinifAdi + " sinifi ugurla silindi ✔");

            } else {
                System.out.println(silineceySinifAdi + " adinda bir sinif yoxdur ❌");
            }
        }
        System.out.print("Mektebdeki sinifler : ");
        return sinifElaveEtVeSils;
    }

    public List<String> siniflereBax() {

        if (sinifElaveEtVeSils.isEmpty()) {
            System.out.println("Hal hazirda mektebde teyin olunmus bir sinif yoxdur...!");

        } else {
            System.out.println("Hal hazirdaki sinifler bunlardir: ");
        }
        return sinifElaveEtVeSils;


    }}