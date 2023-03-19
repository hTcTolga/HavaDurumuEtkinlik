import  java.util.Scanner;
public class HavaDurumuEtkinlik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sicaklik;
        System.out.print("Sıcaklık Değerini Giriniz: ");
        sicaklik=input.nextInt();

        if (sicaklik < 5){
            System.out.print("Kayak Yapabilirsin.");}
        if (sicaklik >= 5 && sicaklik<=15) {
            System.out.print("Sinemaya Gidebilirsin");}
        if (sicaklik> 15 && sicaklik<25){
            System.out.print("Pinkiğe Gidebilirsin");}
        if (sicaklik>=25){System.out.print("Yüzmeye Gidebilirsin");}
        else {}

    }
}
