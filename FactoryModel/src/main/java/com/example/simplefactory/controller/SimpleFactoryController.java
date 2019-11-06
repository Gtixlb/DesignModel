package com.example.simplefactory.controller;

import com.example.simplefactory.service.Operation;
import com.example.simplefactory.utils.SimpleFactory;

/**
 * @version: 1.00.00
 * @description: 用户端测试
 * @copyright: Copyright (c) 2018 立林科技 All Rights Reserved
 * @company: 厦门立林科技有限公司
 * @author: chenhaidi
 * @date: 2019-11-06 10:35
 */
public class SimpleFactoryController {
    public static void main(String[] args) {

        /**
         * 多态使用
         * Operation add = new Add();
         * Operation sub = new Sub();
         */
        Operation add = SimpleFactory.createOperation("+");
        Operation sub = SimpleFactory.createOperation("-");

        System.out.println(add.getResult(1,1));
        System.out.println(sub.getResult(2,1));
    }

}
