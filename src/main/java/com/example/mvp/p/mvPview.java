package com.example.mvp.p;

import android.widget.PopupMenu;
import android.widget.Toast;

import com.example.mvp.m.MoudleInterface;
import com.example.mvp.m.data;
import com.example.mvp.v.ViewInterface;

import java.util.List;

/*
 * @author Wangzhouzhou
 * @emil 1746375316@qq.com
 * create at 2017/3/7
 */
public class mvPview implements MoudleInterface {
    ViewInterface viewInterface;

    //要调用m层
   data data = new data(this);

    public mvPview(ViewInterface viewInterface) {
        this.viewInterface = viewInterface;
    }

    public void handledata(){
        viewInterface.showLoading();
        data.getdata();
    }
    public void Itemonclik(int position){
        viewInterface.showMessage("您点击了"+position);
    }
    @Override
    public void Success(List<String> list) {
        //数据加载成功后隐藏进度条
        viewInterface.hideLoading();
        //把数据给view层拿过去
        viewInterface.setListItem(list);

    }

    @Override
    public void failde() {
        viewInterface.failed();
    }
}
