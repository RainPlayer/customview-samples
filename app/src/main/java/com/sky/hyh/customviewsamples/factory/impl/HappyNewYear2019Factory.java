package com.sky.hyh.customviewsamples.factory.impl;

import com.sky.hyh.customviewsamples.factory.BaseFragmentFactory;
import com.sky.hyh.customviewsamples.fragment.BaseFragment;
import com.sky.hyh.customviewsamples.fragment.impl.HappyNewYear2019Fragment;

public class HappyNewYear2019Factory extends BaseFragmentFactory {
    @Override
    public BaseFragment createFragment() {
        return new HappyNewYear2019Fragment();
    }
}
