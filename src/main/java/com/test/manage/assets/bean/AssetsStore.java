package com.test.manage.assets.bean;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class AssetsStore {
    private String id;

    private String batchNo;

    //供应商
    private String provider;

    //资产类型id
    private String assetsTypeId;

    //价格
    private long price;

    //说明
    private String description;

    //剩余库存
    private int store;

    //总库存
    private int totalStore;

    //分配出去的数量
    private int distributeNum;

    //维修中的数量
    private int maintainNum;
}
