import ru.netology.service.CustomsService;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how GIGA IDE suggests fixing it.
        System.out.printf("Добро пожаловать в калькулятор пошлины");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цену товара (в руб.):");
        int price = scanner.nextInt();
        System.out.println("Введите вес товара (в кг.)");
        int weight = scanner.nextInt();
        System.out.println("Размер пошлины (в руб.) составит: "+ calculateCustoms(price,weight));
    }


    public static int calculateCustoms(int price, int weight)
    {
        int customsPrice = price/100;
        int customsPriceWeight = weight * CustomsService.CUSTOM_WEIGHT;
        return customsPriceWeight + customsPrice;
    }
}
