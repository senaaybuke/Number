import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayac=1;
        boolean control =false;
        while(!control){
            System.out.println("Lutfen bir sayi giriniz");
            int sayi = scanner.nextInt();
            if (sayi<0 || sayi>500){
                System.out.println("Lutfen 0 ile 500 araliginda bir sayi giriniz");
                sayac++;
            } else {
                if (50<sayi && sayi<100){
                control =true;
                System.out.println("Sayiniz " + sayac + ".Secimde bulunmustur");
            }else {
                sayac++;
            }

            }


        }


    }
}