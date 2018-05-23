package com.test.manage.assets.bean;

import lombok.Data;
import lombok.experimental.Accessors;

@Accessors(chain = true)
@Data
public class AssetsType {
    //资产类型id
    private String assetsTypeId;

    private String description;
}
