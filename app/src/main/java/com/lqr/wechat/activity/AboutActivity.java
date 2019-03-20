package com.lqr.wechat.activity;

import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import com.lqr.wechat.R;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @创建者 CSDN_LQR
 * @描述 关于微信
 */
public class AboutActivity extends BaseActivity {
    @BindView(R.id.toolbar)
    Toolbar mToolbar;

    @Override
    public void initView() {
        setContentView(R.layout.activity_about);
        ButterKnife.bind(this);
        initToolbar();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void initToolbar() {
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("关于微信");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mToolbar.setNavigationIcon(R.mipmap.ic_back);
    }
}
