package com.example.factorymothod.service.operation.impl;

import com.example.factorymothod.service.operation.Operation;

/**
 * @version: 1.00.00
 * @description: 具体产品类：加法运算
 * @copyright: Copyright (c) 2018 立林科技 All Rights Reserved
 * @company: 厦门立林科技有限公司
 * @author: chenhaidi
 * @date: 2019-11-06 10:27
 */
public class Add implements Operation {
    @Override
    public double getResult(double parameter1, double parameter2) {
        return parameter1 + parameter2;
    }
}
