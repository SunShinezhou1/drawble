package com.example.mvp.m;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
 * @author Wangzhouzhou
 * @emil 1746375316@qq.com
 * create at 2017/3/7
 */
public class data {

    //负责解析数据
    MoudleInterface moudleInterface;
    //承载数据的集合
    List<String> list = new ArrayList<>();

    public data(MoudleInterface moudleInterface) {
        this.moudleInterface = moudleInterface;
    }


    public void getdata(){
        for (int i=0;i<50;i++){
            list.add(i+"");
        }
        moudleInterface.Success(list);
    }
}
