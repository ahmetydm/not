import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz");
        int puan = scan.nextInt();

     if (puan>=90) {
         System.out.println("çok iyi");
        }
        if (puan<90 && puan>69) {
            System.out.println("iyi");
        }
        if (puan<70 && puan>49) {
            System.out.println("orta");
        }
        if (puan<50) {
            System.out.println("kötü");
        }

    }
}