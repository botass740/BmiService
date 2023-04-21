import java.lang.module.FindException;

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double height = 1.87;
        int weight = 98;
        int index = service.calculate((double) height, weight);

        System.out.println("Рост - " + height + " м.");
        System.out.println("Вес - " + weight + " кг.");
        System.out.println("Индекс массы тела составляет - " + index);

        System.out.println();
        System.out.println("Рост - 1.75 м.");
        System.out.println("Вес - 84 кг.");
        System.out.println("Индекс массы тела составляет - " + service.calculate(height = 1.75, weight = 84));

        System.out.println();
        System.out.println("Рост - 2.05 м.");
        System.out.println("Вес - 113 кг.");
        System.out.println("Индекс массы тела составляет - " + service.calculate(height = 2.05, weight = 113));
    }
}