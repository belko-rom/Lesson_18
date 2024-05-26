import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExtraTask {
    public static void main(String[] args) {
        Map<Integer, String> idName = new HashMap<>();
        idName.put(3, "Romeo");
        idName.put(34, "Viki");
        idName.put(5, "Nik");
        idName.put(8, "Pasha");
        idName.put(13, "Kirill");
        idName.put(21, "Polina");

        List<String> reversName = idName.entrySet().stream()
                .filter(name -> List.of(1, 2, 5, 8, 9, 13).contains(name.getKey()))
                .filter(name -> name.getValue().length() % 2 != 0)
                .map(name -> new StringBuilder(name.getValue()).reverse().toString())
                .collect(Collectors.toList());

        System.out.println("Имена задом наперед с нечетной длиной из выбранного набора данных: " + reversName);





    }
}
