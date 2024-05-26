import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(32);
        numbers.add(4);
        numbers.add(4);
        numbers.add(53);
        numbers.add(6);
        System.out.println(numbers);
        int sum = numbers.stream()
                .distinct()
                .filter(num -> num % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Сумма четных элементов без дубликатов: " + sum);

    }
}