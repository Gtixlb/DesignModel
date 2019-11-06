package com.example.factorymothod.service.factory.impl;

import com.example.factorymothod.service.factory.Factory;
import com.example.factorymothod.service.operation.Operation;
import com.example.factorymothod.service.operation.impl.Add;

/**
 * @version: 1.00.00
 * @description: 加法工厂类
 * @copyright: Copyright (c) 2018 立林科技 All Rights Reserved
 * @company: 厦门立林科技有限公司
 * @author: chenhaidi
 * @date: 2019-11-06 11:13
 */
public class AddFactory implements Factory {
    @Override
    public Operation createOperation() {
        return new Add();
    }
}
