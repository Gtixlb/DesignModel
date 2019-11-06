package com.example.simplefactory.utils;

import com.example.simplefactory.service.Operation;
import com.example.simplefactory.service.impl.Add;
import com.example.simplefactory.service.impl.Sub;

/**
 * @version: 1.00.00
 * @description: 简单工厂类（核心类）
 * @copyright: Copyright (c) 2018 立林科技 All Rights Reserved
 * @company: 厦门立林科技有限公司
 * @author: chenhaidi
 * @date: 2019-11-06 10:30
 */
public class SimpleFactory {
    public static Operation createOperation(String operation){
        Operation operationObject = null;
        switch (operation){
            case "+":
                operationObject = new Add();
                break;
            case "-":
                operationObject = new Sub();
                break;
        }
        return operationObject;
    }
}
