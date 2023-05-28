import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen Kilonuzu Giriniz : ");

        int weight = inp.nextInt();

        System.out.print("Lütfen Boyunuzu Metre Cinsinde Giriniz : ");

        double height = inp.nextDouble();

        double index = (double) weight / (height * height);


        System.out.println("Vücut Kitle İndeksiniz : " + index);

    }
}