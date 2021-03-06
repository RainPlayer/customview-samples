package com.sky.hyh.customviewsamples.factory.impl;

import com.sky.hyh.customviewsamples.factory.BaseFragmentFactory;
import com.sky.hyh.customviewsamples.fragment.BaseFragment;
import com.sky.hyh.customviewsamples.fragment.impl.GraduleTitleViewPagerFragment;

public class GraduleTitleViewPagerFactory extends BaseFragmentFactory {
    @Override
    public BaseFragment createFragment() {
        return new GraduleTitleViewPagerFragment();
    }
}
