import java.util.HashMap;
import java.util.Map;

public class ValuesString {

    public int getValuesNumber(String value) {
        Map<String, String> valueReponseNumber = new HashMap<String, String>();

        valueReponseNumber.put("A", "1");
        valueReponseNumber.put("2", "2");
        valueReponseNumber.put("3", "3");
        valueReponseNumber.put("4", "4");
        valueReponseNumber.put("5", "5");
        valueReponseNumber.put("6", "6");
        valueReponseNumber.put("7", "7");
        valueReponseNumber.put("8", "8");
        valueReponseNumber.put("9","9");
        valueReponseNumber.put("10", "10");
        valueReponseNumber.put("J", "11");
        valueReponseNumber.put("Q", "12");
        valueReponseNumber.put("K", "13");

        if (valueReponseNumber.containsKey(value)) {
            return Integer.parseInt(valueReponseNumber.get(value));
        }

        return -1;
    }

}