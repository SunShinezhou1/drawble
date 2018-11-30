package com.example.mvp.v;

import java.util.List;

/*
 * @author Wangzhouzhou
 * @emil 1746375316@qq.com
 * create at 2017/3/7
 */
public interface ViewInterface {
    /**
     * 这里的P层接口主要负责传递数据 通知m层加载数据
     * m层加载完成后通知View负责展示数据
     */

    void showLoading();
    void hideLoading();
    void setListItem(List<String> data);
    void failed();
    void showMessage(String message);


}
