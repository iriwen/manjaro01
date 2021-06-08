package com.java.code.spring.extention;

import com.java.code.annotation.ManjaroService;
import com.java.code.controller.ExcelOperationController;
import com.java.code.spring.event.MyAppListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * created by iriwen on 2021/02/26.
 * 注解传递
 *
 */
@ManjaroService
public class DefinetionInitializeOperation implements InitializingBean {

    private final Logger logger = LoggerFactory.getLogger(ExcelOperationController.class);

    private List<String> list ;

    @Override
    public void afterPropertiesSet() throws Exception {
        String[] strs = {"a", "b"};
        list = Stream.of(strs).collect(Collectors.toList());
        //Collections.addAll(list, strs);
        logger.info("list size : {}",list.size());
        MyAppListener myApplicationListener = ApplicationContextHelper.getBean(MyAppListener.class);

        logger.info("get bean from application Context :{}", myApplicationListener, getClass());
    }
}
