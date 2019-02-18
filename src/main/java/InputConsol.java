import java.util.Scanner;

public class InputConsol {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    String day, feeling;
        System.out.println("Какой сегодня день недели?");
    day = input.nextLine();
        System.out.println("Как твое настроение?");
    feeling = input.nextLine();
    String text;
    text = "Cегодня " + day + ", настроение " + feeling ;
        System.out.println(text);
    }
}
