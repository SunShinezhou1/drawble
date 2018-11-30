package com.example.mvp.m;

import java.util.List;

/*
 * @author Wangzhouzhou
 * @emil 1746375316@qq.com
 * create at 2017/3/7
 */
public interface MoudleInterface {
    /**
     * 数据层的接口负责判断数据获取成功与否
     */
    void Success(List<String> list);
    void failde();
}
