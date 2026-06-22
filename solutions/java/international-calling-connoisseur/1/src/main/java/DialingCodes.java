import java.util.HashMap;
import java.util.Map;

public class DialingCodes {

    public HashMap<Integer,String> internationalCallDictionary = new HashMap<>();

    public Map<Integer, String> getCodes() {
        return internationalCallDictionary;
    }

    public void setDialingCode(Integer code, String country) {
        internationalCallDictionary.put(code,country);
    }

    public String getCountry(Integer code) {
        return internationalCallDictionary.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if (getCodes().containsKey(code) || getCodes().containsValue(country)){
            return;
        } else {
            internationalCallDictionary.put(code,country);
        }
    }

    public Integer findDialingCode(String country) {
        if (!internationalCallDictionary.containsValue(country)) {
            return null;
        }

        return internationalCallDictionary.keySet()
                .stream()
                .mapToInt(code -> code)
                .sum();
    }

    public void updateCountryDialingCode(Integer code, String country) {

        if (findDialingCode(country) == null) {
            return;
        }

        internationalCallDictionary.remove(findDialingCode(country));
        internationalCallDictionary.put(code, country);

    }
}
