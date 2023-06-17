import models.Coffee;
import models.Tea;
import service.CoffeeVendingMachine;
import service.CoffeeVendingMachineImpl;
import service.TeaVendingMachine;
import service.TeaVendingMachineImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CoffeeVendingMachine coffeeVendingMachine = new CoffeeVendingMachineImpl();
        List<Coffee> coffees = new ArrayList<>();
        coffees.add(new Coffee(60,40,0,true,
                "Nescafe","Arabica"));
        coffeeVendingMachine.loadSomething(coffees);
        coffeeVendingMachine.sell(0);
        coffeeVendingMachine.sell(5);
        TeaVendingMachine teaVendingMachine = new TeaVendingMachineImpl();
        List<Tea> teas = new ArrayList<>();
        teas.add(new Tea(60,40,0,true,
                true,"japan"));
        teaVendingMachine.loadSomething(teas);
        teaVendingMachine.sell(0);
        teaVendingMachine.sell(10);
    }
}