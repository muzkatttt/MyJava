
import java.util.HashMap;
import java.util.Map;

public class Passports {
    private Map<String, String> map = new HashMap<>();

    void add(String numPassports, String lastName) {
        map.put(numPassports, lastName);
    }

    String getByNumPassport(String numPassport) {
        return numPassport + ": " + map.get(numPassport);
    }

    String getByLastName(String lastName) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue().equals(lastName)) {
                stringBuilder.append(entry.getKey());
                stringBuilder.append(": ");
                stringBuilder.append(entry.getValue());
                stringBuilder.append("\n");
            }
        }
        if (stringBuilder.length() == 0) {
            return "записей нет.";
        }
        return stringBuilder.toString();
    }

    String getAllList() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry entry : map.entrySet()) {
            stringBuilder.append(entry.getKey());
            stringBuilder.append(": ");
            stringBuilder.append(entry.getValue());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    String getAllList2() {
        return map.toString();
    }
}

