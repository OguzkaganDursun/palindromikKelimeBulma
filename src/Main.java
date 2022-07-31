import java.util.Scanner;
public class Main {

    static boolean palindromMu(String str)
    {
        int i = 0;
        int j = str.length() - 1;
        while (i < j)
        {
            if (str.charAt(i) != str.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Palindrom Olup Olmadigini Kontrol Edeceginiz Kelimeyi Giriniz : ");
        String girilenKelime = scan.nextLine();

        if (palindromMu(girilenKelime))
        {
            System.out.println(girilenKelime + " Palindrom Kelimedir.");
        }
        else
        {
            System.out.println(girilenKelime + " Palindrom Kelime Degildir.");
        }
    }
}
