package com.lusaover.demo;

import com.lusaover.common.pojo.Goods;
import com.lusaover.common.pojo.User;
import com.lusaover.common.service.GoodsService;
import com.lusaover.demo.mapper.GoodsMapper;
import com.lusaover.demo.mapper.UserMapper;
import com.lusaover.demo.service.impl.GoodsServiceImpl;
import com.lusaover.demo.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.baomidou.dynamic.datasource.annotation.DS;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.security.PrivateKey;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.PrimitiveIterator;

@SpringBootTest
class ProviderApplicationTests {

	@Resource
	private UserMapper userMapper;

	@Resource
	private GoodsMapper goodsMapper;

	@Autowired
	private GoodsService goodsService;


	@Test
	void deleteUser(){
		Integer id = 4;
		userMapper.deleteById(id);
	}

	@Test
	void contextLoads() {
		User user = new User();
		user.setAge(22);
		user.setEmail("15779715305@163.com");
		user.setGender(2);
		user.setName("守望");
		user.setTel("15779715305");
		userMapper.insert(user);

	}

	@Test
	void getById(){
		System.out.println(userMapper.selectList(null));
	}

	@Test
	void findtime() throws ParseException {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
		Date date = new Date();
		date = simpleDateFormat.parse(simpleDateFormat.format(date));
		System.out.println(date);
	}


	@Test
	void initGoods(){
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
		Goods goods = new Goods();
		goods.setGid(766521);
		goods.setGname("保温杯");
		goods.setRemaining(60);
		goods.setPrice(new BigDecimal("12.6"));
		goods.setPurchasePrice(new BigDecimal("8.7"));
		goods.setDepository(5);
		goods.setInDate(new Date());
		goods.setLastDate(new Date());
		System.out.println(goods);
//		goodsServiceImpl.saveGoods(goods);
		System.out.println(goodsService.getGoodsList());
//		goodsMapper.insert(goods);
//		System.out.println(goodsMapper.selectList(null));

	}

	@Test
	void diffGoods(){
		System.out.println(goodsService.getGoodsList());
	}

}
