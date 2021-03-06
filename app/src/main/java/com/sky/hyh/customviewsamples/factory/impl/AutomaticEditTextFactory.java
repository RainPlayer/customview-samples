package com.sky.hyh.customviewsamples.factory.impl;

import com.sky.hyh.customviewsamples.factory.BaseFragmentFactory;
import com.sky.hyh.customviewsamples.fragment.BaseFragment;
import com.sky.hyh.customviewsamples.fragment.impl.AutomaticEditTextFragment;

/**
 * Created by hyh on 2019/2/26 15:50
 * E-Mail Address：fjnuhyh122@gmail.com
 */
public class AutomaticEditTextFactory extends BaseFragmentFactory {
    @Override
    public BaseFragment createFragment() {
        return new AutomaticEditTextFragment();
    }
}
