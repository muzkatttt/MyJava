import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HotDrinkMachine implements VendingMachine {

    Map<String, Map<String, Integer>> map; // главный Map имеет ключ наименование напитка

    List<HotDrink> list;

    public HotDrinkMachine() {
        this.list = new ArrayList<>();
        this.map = new HashMap<>();
        this.map.put("Black Tea", new HashMap<>() {
            {
                put("price", 350);
                put("volume", 400);
            }
        });
        this.map.put("Green Tea", new HashMap<>() {
            {
                put("price", 400);
                put("volume", 450);
            }
        });
        this.map.put("Red Tea", new HashMap<>() {
            {
                put("price", 300);
                put("volume", 399);
            }
        });
        this.map.put("Aqua", new HashMap<>() {
            {
                put("price", 100);
                put("volume", 10);
            }
        });
        this.map.put("Coffee", new HashMap<>() {
            {
                put("price", 299);
                put("volume", 300);
            }
        });
    }

    @Override
    public Long getPrice(String drink) {
        return Long.valueOf(map.get(drink).get("price"));
    }

    private Integer getVolume(String drink){
        return map.get(drink).get("volume");

    }
    @Override
    public void addDrink(String drink, Long price, int volume) {
        map.put(drink, new HashMap<>() {
            {
                put("price", price.intValue());
                put("volume", volume);
            }
        });
    }

    @Override
    public HotDrink getHotDrink(String drink, int temperature) {
        HotDrink hotDrink = new HotDrink(drink, getPrice(drink), getVolume(drink), temperature);
        list.add(hotDrink);
        return hotDrink;
    }

    @Override
    public List<HotDrink> myList() {
        list.sort(new HotDrinkComparatorPrice());
        return list;
    }
}