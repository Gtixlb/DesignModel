package com.example.factorymothod.service.factory;

import com.example.factorymothod.service.operation.Operation;

/**
 * @version: 1.00.00
 * @description: 工厂类接口
 * @copyright: Copyright (c) 2018 立林科技 All Rights Reserved
 * @company: 厦门立林科技有限公司
 * @author: chd
 * @date: 2019/11/6 11:11
 */
public interface Factory {

        Operation createOperation();
}
