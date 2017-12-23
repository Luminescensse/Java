import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * Тестовое задание
 * @author unknown
 * @version 1.0
 * Ввести с клавиатуры число. Определить, сколько в введенном числе четных цифр, а сколько нечетных.
 */
public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(reader.readLine());
        reader.close();
        
        while(i > 0)
        {
            if( i % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            
            i = i / 10;
        }

        System.out.println("Even: " + even + " Odd: " + odd);
        
        // Мой вариант решения
        
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String str = reader.readLine();
        //reader.close();

        //for (int i = 0; i < str.length(); i++) {

        //    if (Character.getNumericValue(str.charAt(i)) % 2 == 0) {
        //        Solution.even++;
        //    } else {
        //        Solution.odd++;
        //    }
        //}

        //System.out.println("Even: " + even + " Odd: " + odd);
    }
}
