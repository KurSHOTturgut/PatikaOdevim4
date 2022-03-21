import java.util.Scanner;
import java.math.*;
public class ArmstrongNumber {
    public static void main(String[] args) {
        while (true) {
            int a, b;
            Scanner input = new Scanner(System.in);
            System.out.print("Lütfen başlangıç sayısını giriniz:");
            a = input.nextInt();
            System.out.print("Lütfen bitiş sayısını giriniz:");
            b = input.nextInt();
            if (a<0 || b<0){
                System.out.println("Değer aralıkları negatif olamaz!");
                continue;
            }
            else if (a>b){
                System.out.println("İlk değer ikinciden büyük olamaz!");
                continue;
            }


        while (a!=b){
            int sayi, sayi2, sayi3, basamak=0, toplam = 0, kalan;
           sayi=a;
           sayi2=a;
           sayi3=a;
            if (sayi == 0) {
                basamak = 1;
            }
            while (sayi != 0) {
                sayi /= 10;
                basamak++;
            }
            while (sayi2 != 0) {
                kalan = sayi2 % 10;
                toplam += Math.pow(kalan, basamak);
                sayi2 /= 10;
            }
            if (sayi3 == toplam) {
                System.out.println(toplam);
            }
            a++;
        }
        break;
        }
    }


}