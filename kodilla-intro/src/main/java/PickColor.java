import java.util.Scanner;

public class PickColor {
    public static void app(){
        Scanner scanner = new Scanner(System.in);
        String color = "";
        System.out.println("Enter first letter of your color:");
        String letter = scanner.next();
        switch (letter){
            case "b":
                color = "blue";
                break;
            case "g":
                color = "green";
                break;
            case "r":
                color = "red";
                break;
            case "w":
                color = "white";
                break;
            case "y":
                color = "yellow";
                break;
            default:
                color = "[REDACTED]";
        }
        System.out.println("Color you have picked is: " + color);
    }

    public static void main(String[] args) {
        PickColor.app();
    }
}
