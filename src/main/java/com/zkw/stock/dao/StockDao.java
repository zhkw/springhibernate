package com.zkw.stock.dao;

import com.zkw.stock.model.Stock;

public interface StockDao {
    void save(Stock stock);
    void update(Stock stock);
    void delete(Stock stock);
    Stock findByStockCode(String stockCode);
}
