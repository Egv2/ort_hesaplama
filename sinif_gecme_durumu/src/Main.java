import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        int mat, turkce, fizik, ing, kimya;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz:");
        mat = input.nextInt();
        System.out.print("Türkçe notunuzu giriniz:");
        turkce = input.nextInt();
        System.out.print("Fizik notunuzu giriniz:");
        fizik = input.nextInt();
        System.out.print("İngilizce notunuzu giriniz:");
        ing= input.nextInt();
        System.out.print("Kimya notunuzu giriniz:");
        kimya= input.nextInt();

        double ort = (mat+turkce+fizik+ing+kimya) / 5;

        if (ort <=55) {
            System.out.println("Sınıfta kaldın, seneye biraz daha sıkı çalış! :)");
        } else {
            System.out.println("Sınıfı geçtin. Tebrikler!");
        }
        System.out.println("Ortalaman:" +ort);

    }
}
