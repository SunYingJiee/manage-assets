package com.test.manage.assets.bean;


import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class SizeType {
    //资产规格id
    private String sizeTypeId;

    private String description;
}
