package scholls_for_portal;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TeacherAddDelete extends ClassAddDelete {
    Scanner scanner = new Scanner(System.in);
    HashMap<String, String> muellimVeSinif = new HashMap<>();
    String ad;
    String soyAd;

    public String muellimDaxilEt() {
        System.out.print("Muellim adini daxil edin: ");
        ad = scanner.nextLine();

        System.out.print("Muellim soyadini daxil edin: ");
        soyAd = scanner.nextLine();
        while (true) {
            System.out.print(ad + " " + soyAd + " hansi sinife ders deyecey ? : ");

            String dersDeyeceyiSinif = scanner.nextLine();
            String adVeSoyad = ad + " " + soyAd;
            if (dersDeyeceyiSinif.equals("0")) {
                break;
            }

            if (sinifElaveEtVeSils.contains(dersDeyeceyiSinif)) {

                muellimVeSinif.put(dersDeyeceyiSinif, adVeSoyad);

                String umumi = muellimVeSinif.get(dersDeyeceyiSinif) + " " +
                        dersDeyeceyiSinif + " sinifine ders deyecey , " +
                        "cixis ucun 0 abasin...!";

                System.out.println(umumi);

            } else {
                System.out.println("Bele bir sinif hal hazirda yoxdur , cixis ucun 0 abasin..!");
            }
        }
        return "muellim ugurla sinife teyin edildi.";
    }



    public String  muellimiSil() {
        System.out.print("Siyahidan silmek isdediyniz muellimin ilk once adini:  ");
        String adSilme = scanner.nextLine();

        System.out.print("Sonra ise soyadini daxil edin: ");
        String soyAdSilme = scanner.nextLine();

        String adVeSoyad = adSilme + " " + soyAdSilme;

        String sinifKeyToRemove = null;

        for (Map.Entry<String, String> entry : muellimVeSinif.entrySet()) {
            if (entry.getValue().equals(adVeSoyad)) {
                sinifKeyToRemove = entry.getKey();
                break;
            }
        }

        if (sinifKeyToRemove != null) {
            muellimVeSinif.remove(sinifKeyToRemove);
            System.out.println(adVeSoyad + " ders dediyi siniflerden  silindi.");
        } else {
            System.out.println("Bele bir muellim yoxdur.");
        }

        return "Silme prosesi tamamlandi.";
    }
}


