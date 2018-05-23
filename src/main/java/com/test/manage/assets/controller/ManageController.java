package com.test.manage.assets.controller;

import com.test.manage.assets.bean.AssetsStore;
import com.test.manage.assets.bean.AssetsType;
import com.test.manage.assets.bean.ColorType;
import com.test.manage.assets.bean.SizeType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ManageController {

    private ArrayList colorTypeList;
    private ArrayList sizeTypeList;
    private ArrayList assetsTypeList;
    private AssetsStore assetsStore;

    @RequestMapping("/record")
    public void recordStore() {
       initData();

    }



    private void initData(){
        colorTypeList = new ArrayList<>();
        colorTypeList.add(new ColorType().setColorTypeId("color001").setDescription("白色"));
        colorTypeList.add(new ColorType().setColorTypeId("color002").setDescription("黑色"));

        sizeTypeList = new ArrayList<>();
        sizeTypeList.add(new SizeType().setSizeTypeId("size001").setDescription("中号120cm"));
        sizeTypeList.add(new SizeType().setSizeTypeId("size002").setDescription("大号160cm"));

        assetsTypeList = new ArrayList<>();
        assetsTypeList.add(new AssetsType().setAssetsTypeId("assets001").setDescription("桌子"));
        assetsTypeList.add(new AssetsType().setAssetsTypeId("assets002").setDescription("椅子"));
    }

    private void enteringAssets(){
        assetsStore = new AssetsStore().setId("1").setBatchNo("batch001")
                .setProvider("供应商1").setAssetsTypeId("assets001").setPrice(10000)
                .setStore(20).setTotalStore(20).setDistributeNum(0).setMaintainNum(0);
    }
}
