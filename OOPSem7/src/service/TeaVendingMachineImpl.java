package service;

import models.Tea;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class TeaVendingMachineImpl implements TeaVendingMachine {
    Logger logger = Logger.getAnonymousLogger();

    List<Tea> teas = new ArrayList<>();
    @Override
    public void sell(int id) {
        if (id < teas.size()){
            logger.info(String.valueOf(id));
            logger.info("selling this tea");
            teas.remove(id);
        }else {
            logger.warning("no such id!");
        }
    }


    @Override
    public void loadSomething(List<Tea> drinks) {
        logger.info(drinks.toString());
        logger.info("these drinks are being loaded");
        teas.addAll(drinks);

    }

    @Override
    public String toString() {
        return "TeaVendingMachineImpl{" +
                "teas=" + teas +
                '}';
    }
}
