import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final int NUMBER_OF_PLOTS = 20;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите цену участка за кв.м(500 - 1499).\n" +
                    "Введите 0 для завершения программы.");
            int price = scanner.nextInt();
            if (price == 0) {
                break;
            } else {
                List<LandPlot> landPlots = new ArrayList<>();
                for (int i = 0; i < NUMBER_OF_PLOTS; i++) {
                    landPlots.add(new LandPlot());
                }
                System.out.println("Список участков с ценой, не более " + price + " рублей за кв.м: ");
                landPlots.stream()
                        .filter(a -> a.getPrice() / (a.getLength() * a.getWidth()) <= price)
                        .toList()
                        .forEach(System.out::println);
            }
        }
    }
}