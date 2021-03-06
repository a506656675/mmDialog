package com.mumu.dialog.adapter;


import androidx.annotation.Nullable;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.mumu.dialog.PickBaseEntity;
import com.mumu.dialog.PickEntity;
import com.mumu.dialog.R;

import java.util.List;

/**
 * @author : zlf
 * date    : 2019/5/24
 * github  : https://github.com/mamumu
 * blog    : https://www.jianshu.com/u/281e9668a5a6
 * desc    :
 */
public class Pick2Adapter extends BaseQuickAdapter<PickEntity.RestbodyBean.Higher2LevelBean, BaseViewHolder> {

    public Pick2Adapter(@Nullable List data) {
        super(R.layout.item_pick, data);
    }

    @Override
    protected void convert(BaseViewHolder helper, PickEntity.RestbodyBean.Higher2LevelBean data) {
        //将每一个需要赋值的id和对应的数据绑定
        helper.setText(R.id.cb_item_pick, data.getName());
        if(data.isChecked()){
            helper.setChecked(R.id.cb_item_pick,true);
        }else {
            helper.setChecked(R.id.cb_item_pick,false);
        }

        //设置title的点击监听
        helper.addOnClickListener(R.id.cb_item_pick);
    }
}
