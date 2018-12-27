package bw.com.mvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import bw.com.mvp.home.presenter.HomeListPresenter;
import bw.com.mvp.home.view.IHomeListView;

public class MainActivity extends AppCompatActivity implements IHomeListView {

    private TextView tv;
    private HomeListPresenter homeListPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化控件
        tv = findViewById(R.id.tv);
        //初始化presenter
        homeListPresenter = new HomeListPresenter(this);
        homeListPresenter.getModelDate();
    }

    @Override
    public void getViewData(String mViewData) {
        tv.setText(mViewData);
    }
}
