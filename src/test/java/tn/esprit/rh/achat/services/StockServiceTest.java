package tn.esprit.rh.achat.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import tn.esprit.rh.achat.entities.Stock;

import java.util.List;

public class StockServiceTest {

    @Autowired
    IStockService ss;

    @Test
    @Order(1)
    public void testRetrieveAllUsers() {
        List<Stock> listProduits = ss.retrieveAllStocks();
        Assertions.assertEquals(0, listProduits.size());
    }
    //comment
}
