import java.util.ArrayList;

/**
 * Добавление дублирующей строки в список, если строка списка содержит букву "o"
 * @author Luminescensse
 * @version 1.0
 */
public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();

        list.add("one");
        list.add("two");
        list.add("three");
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        for (int i = list.size() - 1; i >= 0 ; i--) {
            if (list.get(i).contains("o")) {
                list.add(i, list.get(i));
            }
        }
        return list;
    }
}
