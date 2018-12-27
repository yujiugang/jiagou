package bw.com.mvp.home.presenter;

import android.util.Log;

import bw.com.api.Api;
import bw.com.mvp.MainActivity;
import bw.com.mvp.home.model.HomeListModeInter;

public class HomeListPresenter implements IHomeListPresenter,HomeListModeInter.ModuleInterface {

    MainActivity mview;
    private final HomeListModeInter homeListModeInter;
    private String modeInterDate;

    //构造器
    public HomeListPresenter(MainActivity mainActivity){
        this.mview = mainActivity;
        //初始化Model层
        homeListModeInter = new HomeListModeInter(this);
    }

    //回调
    @Override
    public void getModelDate() {
        ////回调model
        homeListModeInter.getDate(Api.SHOPLIST);
        Log.i("","getModelDate:"+modeInterDate);
    }

    @Override
    public void LoadSuccess(String data) {
        mview.getViewData(data);
    }

    @Override
    public void LoadFailed() {
        mview.getViewData("加载失败");
    }

}
