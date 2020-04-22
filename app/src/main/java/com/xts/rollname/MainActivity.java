package com.xts.rollname;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "MainActivity";
    /**
     * gua
     */
    private Button mBtn;
    private BaseQuickAdapter<String, BaseViewHolder> mAdapter;
    private int mNum = 9;
    private FlowLayout mFl;
    private ArrayList<String> mList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mBtn = (Button) findViewById(R.id.btn);
        mBtn.setOnClickListener(this);
        mFl = findViewById(R.id.fl);

        mList = new ArrayList<>();

        ArrayList<String> c = RandomUtil.getRandomUtil().randomData(mNum);
        Log.d(TAG, "initView: " + c.size());
        mList.addAll(c);

        addView();

    }

    private void addView() {
        for (int i = 0; i < mList.size(); i++) {
            View inflate = LayoutInflater.from(this).inflate(R.layout.item, null);
            TextView tv = inflate.findViewById(R.id.tv);
            YScratchView ysv = inflate.findViewById(R.id.ysv);
            tv.setText(mList.get(i));
            mFl.addView(inflate);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.btn:
                randomData();
                break;
        }
    }

    private void randomData() {
        mFl.removeAllViews();
        mList.clear();
        mList.addAll(RandomUtil.getRandomUtil().randomData(mNum));
        addView();
    }
}
