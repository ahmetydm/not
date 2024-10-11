import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz");
        int point = scan.nextInt();

     if (point>=90) {
         System.out.println("çok iyi");
        }
        if (point<90 && point>69) {
            System.out.println("iyi");
        }
        if (point<70 && point>49) {
            System.out.println("orta");
        }
        if (point<50) {
            System.out.println("kötü");
        }

    }
}