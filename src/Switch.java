import java.util.Scanner;

public class Switch {
    /*public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи возраст");
        int age = scanner.nextInt();
        switch (age){
            case 0 :
                System.out.println("Ты родился");
                break;
            case 10 :
                System.out.println("Ты учишься в школе");
                break;
            case 18:
                System.out.println("Ты законил школу");
                break;
            case 19:
                System.out.println("Ты поступил в университет");
                break;
            case 25:
                System.out.println("Ты закончил университет");
                break;
            default:
                System.out.println("Не одно из предыдущих условий не подошло");
        }
    }*/
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи возраст");
        String age = scanner.nextLine();
        switch (age){
            case "ноль" :
                System.out.println("ты родился");
                break;
            case "семь":
                System.out.println("Ты пошёл в школу");
                break;
            case "восемнадцать" :
                System.out.println("ты закончил школу");
                break;
            default:
                System.out.println("Ни одно из предыдущих условий не подошло ");

        }
    }
}
