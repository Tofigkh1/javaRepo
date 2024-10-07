package scholls_for_portal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ClassPortal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClassAddDelete classAddDelete = new ClassAddDelete();
        TeacherAddDelete teacherAddDelete=new TeacherAddDelete();

        while (true) {
            System.out.println("========== Məktəb Portalı ==========");
            System.out.println("1. Sinif əlavə et");
            System.out.println("2. Sinif sil");
            System.out.println("3. Bütün siniflərə bax");
            System.out.println("4. Müəllim əlavə et");
            System.out.println("5. Müəllim sil");
            System.out.println("6. Bütün müəllimlərə bax");
            System.out.println("7. Tələbə əlavə et");
            System.out.println("8. Tələbə sil");
            System.out.println("9. Bütün tələbələrə bax");
            System.out.println("10. Çıxış");
            System.out.print("Zəhmət olmasa seçim edin: ");

            int portalNumber;
            try {
                portalNumber = scanner.nextInt();
            } catch (InputMismatchException e) {

                System.out.println("❌ Yalniz reqem daxil edin: ");
                scanner.next();
                continue;
            }
            switch (portalNumber) {
                case 1:
                    System.out.println(classAddDelete.clasAdd());
                    break;
                case 2:
                    System.out.println(classAddDelete.classDelete());
                    break;
                case 3:
                    System.out.println(classAddDelete.classLook());
                    break;
                case 4:
                    System.out.println(teacherAddDelete.teacherAdd());
                    break;
                case 5:
                    System.out.println(teacherAddDelete.teacherDelete());
                    break;
                case 6:
                    System.out.println();
                    break;
                case 7:
                    System.out.println();
                    break;
                case 8:
                    System.out.println();
                    break;
                case 9:
                    System.out.println();
                    break;
                case 10:
                    System.out.println();
                    break;
            }

        }
    }
}