import java.util.Scanner;
public class javabasic2{
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int nilai;
        System.out.println("input nilai = ");
        nilai = userInput.nextInt(); 

        if (nilai >= 0 && nilai <= 20) {
            System.out.println(" Huruf mutu Anda : E");
        } else if (nilai >= 21 && nilai <= 40) {
            System.out.println("Huruf mutu Anda : D");
        } else if (nilai >= 41 && nilai <= 60) {
            System.out.println("Huruf mutu Anda : C");
        } else if (nilai >= 61 && nilai <= 80) {
            System.out.println("Huruf mutu Anda : B");
        } else if (nilai >= 81 && nilai <= 100) {
            System.out.println("Huruf mutu Anda : A");
        } else if (nilai >= 100) {
            System.out.println("Nilai yang diinput melebihi batas");
        }
  }
}
