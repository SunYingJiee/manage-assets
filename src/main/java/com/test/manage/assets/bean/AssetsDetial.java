package com.test.manage.assets.bean;

import com.test.manage.assets.enums.AssetsStatus;
import com.test.manage.assets.enums.DistributeStatus;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;


@Data
@Accessors(chain = true)
public class AssetsDetial {
    private String id;

    private String batchNo;

    private String assetsTypeId;

    private String sizeTypeId;

    private String colorTypeId;

    //价格
    private long price;

    //资产状态
    private AssetsStatus status;

    //资产分配状态
    private DistributeStatus distributeStatus;

    //分配时间
    private Date distributeTime;

    //分配到的地方
    private String distributeArea;

    //维修完成时间
    private Date maintainTime;
}
