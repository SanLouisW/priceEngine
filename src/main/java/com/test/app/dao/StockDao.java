package com.test.app.dao;

import com.test.app.dto.StockData;
import com.test.app.gateway.StockDataGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class StockDao {

    @Autowired
    private StockDataGateway stockDataGateway;

    public StockData getStockData(String stock, Date startDate) {
        return stockDataGateway.getStockDailyData(stock, startDate);
    }
}
