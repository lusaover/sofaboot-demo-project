package com.lusaover.demo.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

/**
 * @author lusao
 * @version 1.0
 * @description: TODO
 * @date 2022/7/12 10:03
 */
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        Object userName =getFieldValByName("name", metaObject);
        if (userName == null){
            setFieldValByName("name", "youke", metaObject);
        }

    }

    @Override
    public void updateFill(MetaObject metaObject) {

    }
}
