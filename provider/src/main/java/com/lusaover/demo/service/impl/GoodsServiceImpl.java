package com.lusaover.demo.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lusaover.common.pojo.Goods;
import com.lusaover.common.service.GoodsService;
import com.lusaover.demo.mapper.GoodsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author lusao
 * @version 1.0
 * @description: TODO
 * @date 2022/7/12 15:21
 */
@Component
@Service
@DS("slave")
public class GoodsServiceImpl extends ServiceImpl<GoodsMapper, Goods> implements GoodsService {

    @Resource
    private GoodsMapper goodsMapper;

    @Override
    public List<Goods> getGoodsList() {
        return goodsMapper.selectList(null);
    }

    @Override
    public Goods getGoodsById(Integer gid) {
        return goodsMapper.selectById(gid);
    }

    @Override
    public boolean saveGoods(Goods goods) {
        try{
            goodsMapper.insert(goods);
            return true;
        }catch (Exception e){
            System.out.println(e);
            return false;
        }

    }

    @Override
    public boolean putInGoods(int id, int count) {
        Goods goods = new Goods();
        goods.setGid(id);
        goods.setRemaining(goodsMapper.selectById(id).getRemaining() + count);
        try{
            goodsMapper.updateById(goods);
            return true;
        }catch (Exception e){
            System.out.println(e);
            return false;
        }
    }

    @Override
    public boolean pushGoods(int id, int count) {
        Goods goods = new Goods();
        goods.setGid(id);
        goods.setRemaining(goodsMapper.selectById(id).getRemaining() - count);
        try{
            goodsMapper.updateById(goods);
            return true;
        }catch (Exception e){
            System.out.println(e);
            return false;
        }
    }

    @Override
    public boolean deleteGoods(Integer id) {
        try{
            goodsMapper.deleteById(id);
            return true;
        }catch (Exception e){
            System.out.println(e);
            return false;
        }

    }

    @Override
    public boolean changePrice(int id, BigDecimal price) {
        Goods goods = new Goods();
        goods.setGid(id);
        goods.setPrice(price);
        try{
            goodsMapper.updateById(goods);
            return true;
        }catch (Exception e){
            System.out.println(e);
            return false;
        }
    }

    @Override
    public boolean changePurchasePrice(int id, BigDecimal price) {
        Goods goods = new Goods();
        goods.setGid(id);
        goods.setPurchasePrice(price);
        try{
            goodsMapper.updateById(goods);
            return true;
        }catch (Exception e){
            System.out.println(e);
            return false;
        }

    }
}
