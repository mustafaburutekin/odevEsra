import java.util.Scanner;

public class Not_hesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Harf veya not giriniz:");
        String giris = scanner.next();

        double not1;
        if (giris.matches("\\d+")) { // Girilen değer sayı mı kontrolü
            not1 = Double.parseDouble(giris);
        } else {
            switch (giris) {
                case "AA":
                    not1 = 100;
                    break;
                case "BA":
                case "BB":
                    not1 = 85;
                    break;
                case "CB":
                case "CC":
                    not1 = 75;
                    break;
                case "DC":
                case "DD":
                    not1 = 65;
                    break;
                case "FF":
                    not1 = 55;
                    break;
                default:
                    System.out.println("Geçersiz giriş.");
                    scanner.close();
                    return;
            }

            double ortalama = not1; // Harf notuna göre ortalama hesaplanıyor
            String durum;

            if (ortalama >= 90 && ortalama <= 100) {
                durum = "Pekiyi";
            } else if (ortalama >= 85 && ortalama <= 89) {
                durum = "iyi-Pekiyi";
            } else if (ortalama >= 80 && ortalama <= 84) {
                durum = " iyi";
            } else if (ortalama >= 70 && ortalama <= 79) {
                durum = " Orta-iyi";
            } else if (ortalama >= 60 && ortalama <= 69) {
                durum = " Orta";
            } else if (ortalama >= 55 && ortalama <= 59) {
                durum = " Gecer";
            } else if (ortalama >= 50 && ortalama <= 54) {
                durum = " Gecer";
            } else {
                durum = "Basarisiz";
            }

            System.out.println("Ortalama " + ortalama + " ile " + durum + " olarak değerlendirildiniz.");

            scanner.close();
            return;
        }

        // Eğer harf notu girilmediyse, ikinci notu sormak için devam ediyoruz
        System.out.print("İkinci notunuzu giriniz: ");
        double not2 = scanner.nextDouble();

        double ortalama = (not1 * 0.4) + (not2 * 0.6);
        String durum;

        if (ortalama >= 90 && ortalama <= 100) {
            durum = "Pekiyi";
        } else if (ortalama >= 85 && ortalama <= 89) {
            durum = "iyi-Pekiyi";
        } else if (ortalama >= 80 && ortalama <= 84) {
            durum = " iyi";
        } else if (ortalama >= 70 && ortalama <= 79) {
            durum = " Orta-iyi";
        } else if (ortalama >= 60 && ortalama <= 69) {
            durum = " Orta";
        } else if (ortalama >= 55 && ortalama <= 59) {
            durum = " Gecer";
        } else if (ortalama >= 50 && ortalama <= 54) {
            durum = " Gecer";
        } else {
            durum = "Basarisiz";
        }

        System.out.println("Ortalama " + ortalama + " ile " + durum + " olarak değerlendirildiniz.");

        scanner.close();
    }
}
