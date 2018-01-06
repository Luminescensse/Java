import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Удаление повторов и заданных значений из Map
 * @author junior
 * @version 1.0
 */
public class Solution {
    public static HashMap<String, String> createMap() {

        HashMap<String, String> map = new HashMap<>();
        map.put("Иванов", "Иван");
        map.put("Сидоров", "Петр");
        map.put("Никитин", "Саша");
        map.put("Петров", "Дима");
        map.put("Земин", "Тимур");
        map.put("Басыров", "Саша");
        map.put("Хомин", "Руслан");
        map.put("Лапин", "Федя");
        map.put("Митин", "Саша");
        map.put("Семин", "Саша");

        return map;
    }
	
	
	// Удаляем из Map повторяющиеся значения
    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {

        HashMap<String, String> mapcopy = new HashMap<>(map);

        for (HashMap.Entry pair: mapcopy.entrySet()) {
            if (Collections.frequency(mapcopy.values(), pair.getValue()) > 1) {
                map.remove(pair.getKey());
            }
        }

        System.out.println(map);
    }

	// удаляем из Map заданное значение
    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
		
        HashMap<String, String> copy = new HashMap<String, String>(map);
		
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
		
        removeTheFirstNameDuplicates(createMap());
    }
}