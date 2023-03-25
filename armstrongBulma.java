import java.util.Scanner;
/*
Armstrong Sayı Nedir ?
N haneli bir sayının basamaklarının n’inci üstlerinin toplamı, sayının kendisine eşitse, böyle sayılara Armstrong sayı denir.

Örneğin 407 sayısını ele alalım. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir. Bu da 407 sayısının armstrong bir sayı olduğunu gösterir.

1342 sayısına da bakalım. (1^4)+(3^4)+(4^4)+(2^4) =1+81+256+16=354 sayısı 1342’ye eşit olmadığı için armstrong sayı olmaz.
 */
public class armstrongBulma {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number,birlerBas,b,onlarBas,yuzlerBas,sonuc;
        int sonuc1=1,sonuc2=1,sonuc3=1;
        System.out.print("kontrol etmek istediğiniz sayıyı giriniz:");
        number=input.nextInt();
        birlerBas=number%10;
        b=number/10;
        onlarBas=b%10;
        yuzlerBas=b/10;
        for(int i=1;i<=3;i++) {
            sonuc1*=birlerBas;
        }for(int j=1;j<=3;j++) {
            sonuc2*=onlarBas;
        }for(int k=1;k<=3;k++) {
            sonuc3*=yuzlerBas;
        }
        sonuc=sonuc1+sonuc2+sonuc3;



        if(number==sonuc) {
            System.out.println("girdiğiniz sayı armstrong sayıdır.");
        }else{
            System.out.println("girilen sayı armstrong sayı değildir.");
        }

    }
}
