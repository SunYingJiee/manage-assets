package com.test.manage.assets.bean;

import lombok.Data;
import lombok.experimental.Accessors;


@Accessors(chain = true)
@Data
public class ColorType {

    //资产颜色id
    private String colorTypeId;

    private String description;
}
