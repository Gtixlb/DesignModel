package com.example.factorymothod.controller;

import com.example.factorymothod.service.factory.Factory;
import com.example.factorymothod.service.factory.impl.SubFactory;
import com.example.factorymothod.service.operation.Operation;

/**
 * @version: 1.00.00
 * @description: 工厂方法模式测试
 * @copyright: Copyright (c) 2018 立林科技 All Rights Reserved
 * @company: 厦门立林科技有限公司
 * @author: chenhaidi
 * @date: 2019-11-06 11:15
 */
public class FactoryModelController {

    private static Factory addFactory,subFactory;

    private static Operation add,sub;

    public static void main(String[] args) throws Exception {

//        Factory addFactory = (Factory) Class.forName("com.example.factorymothod.service.factory.impl.AddFactory").newInstance();
        addFactory = (Factory) Class.forName("com.example.factorymothod.service.factory.impl.AddFactory").newInstance();
//        Operation add = addFactory.createOperation();
        add = addFactory.createOperation();
        System.out.println(add.getResult(1,1));

        Factory subFactory = new SubFactory();
        Operation sub = subFactory.createOperation();
        System.out.println(sub.getResult(2,1));

        double sub1 = new SubFactory().createOperation().getResult(2,1);
        System.out.println(sub1);

    }
}
