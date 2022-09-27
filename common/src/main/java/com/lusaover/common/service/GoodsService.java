package com.lusaover.common.service;



import com.lusaover.common.pojo.Goods;

import java.math.BigDecimal;
import java.util.List;

public interface GoodsService {

    public List<Goods> getGoodsList();


    public Goods getGoodsById(Integer gid);


    public boolean saveGoods(Goods goods);


    public boolean putInGoods(int id, int count);

    public boolean pushGoods(int id, int count);


    public boolean deleteGoods(Integer id);

    public boolean changePrice(int id, BigDecimal price);

    public boolean changePurchasePrice(int id, BigDecimal price);

}
