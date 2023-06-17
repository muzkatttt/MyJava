package service;

import models.Coffee;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class CoffeeVendingMachineImpl implements CoffeeVendingMachine{
    Logger logger = Logger.getAnonymousLogger();

    private List<Coffee> coffees = new ArrayList<>();


    @Override
    public void sell(int id) {
        if (id < coffees.size()){
            logger.info(String.valueOf(id));
            coffees.remove(id);
            logger.info("drink has been sold!");
        }else {
            logger.warning("no such coffee!");
        }


    }

    @Override
    public void loadSomething(List<Coffee> drinks) {
        logger.info(drinks.toString());
        logger.info("these drinks are being loaded");
        coffees.addAll(drinks);

    }

    @Override
    public String toString() {
        return "CoffeeVendingMachineImpl{" +
                "coffees=" + coffees +
                '}';
    }
}
