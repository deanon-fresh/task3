import ru.netology.service.CustomService;
import java.util.Scanner;

public class Main {
public static int sum1;

    //выполнение 1 задания
    /*public static int result;

     public static int calculation2 (int price, int weight) {
        result = price/100 + weight*100;
        return result;
    } */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите цену товара (в руб.) ");
        int price = scanner.nextInt();
        System.out.print("Введите вес товара (в кг.) ");
        int weight = scanner.nextInt();

        //часть кода для 1 задания
        //calculation2(price, weight);
        //System.out.println("Размер пошлины в руб. составит " + result + " руб.");

        CustomService.calculation(price, weight);
        System.out.println("Размер пошлины в руб. составит " + sum1 + " руб.");
    }
}