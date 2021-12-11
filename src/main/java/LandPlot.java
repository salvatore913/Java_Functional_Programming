import java.util.Random;

public class LandPlot {
    private final int length;
    private final int width;
    private final int price;
    private final int MIN_LENGTH = 10;
    private final int MIN_WIDTH = 10;
    private final int MIN_PRICE = 499;

    public LandPlot() {
        Random random = new Random();
        length = random.nextInt(20) + MIN_LENGTH;
        width = random.nextInt(10) + MIN_WIDTH;
        price = length * width * (random.nextInt(1000) + MIN_PRICE);
    }

    public int getPrice() {
        return price;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public String toString() {
        return "Земельный участок длиной " + length +
                " м, шириной " + width +
                " м, стоимостью " + price +
                " рублей.";
    }
}