package com.sky.hyh.customviewsamples.span.spandata;

import android.graphics.Color;
import android.graphics.Typeface;
import com.sky.hyh.customviewsamples.span.CustomTextSpan;

/**
 * Created by hyh on 2018/12/18 16:18
 * E-Mail Address：fjnuhyh122@gmail.com
 */
public class CustomTextSpanData extends BaseSpanData {
    private String mOriStr;//完整文本
    private String mSegmentStr;//分段文本
    private int mStartIndex;
    private int mEndIndex;
    private float mTextSizeSp;
    private Typeface mTypeface;
    private int mColor;
    private int mLeftMarginDp;
    @CustomTextSpan.AlignType
    private int mAlign;

    public CustomTextSpanData(Builder builder) {
        mOriStr = builder.mOriStr;
        mSegmentStr = builder.mSegmentStr;
        mStartIndex = builder.mStartIndex;
        mEndIndex = builder.mEndIndex;
        mTextSizeSp = builder.mTextSizeSp;
        mTypeface = builder.mTypeface;
        mColor = builder.mColor;
        mLeftMarginDp = builder.mLeftMarginDp;
        mAlign = builder.mAlign;
    }

    public String getOriStr() {
        return mOriStr;
    }

    public int getStartIndex() {
        return mStartIndex;
    }

    public int getEndIndex() {
        return mEndIndex;
    }

    public String getSegmentStr() {
        return mSegmentStr;
    }

    @Override
    public CustomTextSpan onCreateSpan() {
        return new CustomTextSpan(mTextSizeSp,
            mTypeface,
            mColor,
            mLeftMarginDp,
            mAlign);
    }

    public static class Builder{
        private String mOriStr;
        private String mSegmentStr;
        private int mStartIndex;
        private int mEndIndex;
        private float mTextSizeSp;
        private Typeface mTypeface = Typeface.SANS_SERIF;
        private int mColor = Color.WHITE;
        private int mLeftMarginDp;
        @CustomTextSpan.AlignType
        private int mAlign = CustomTextSpan.ALIGN_BOTTOM;

        public Builder(String oriStr,int startIndex,int endIndex) {
            mOriStr = oriStr;
            mStartIndex = startIndex;
            mEndIndex = endIndex;
        }

        public Builder setTextSize(float textSizeSp) {
            mTextSizeSp = textSizeSp;
            return this;
        }

        /**
         * 设置字体风格，粗体，斜体，下划线等
         * @param style
         * @return
         */
        public Builder setTypefaceStyle(int style) {
            mTypeface = Typeface.create(mTypeface, style);
            return this;
        }

        public Builder setTypeface(Typeface typeface) {
            mTypeface = typeface;
            return this;
        }

        public Builder setColor(String color) {
            mColor = Color.parseColor(color);
            return this;
        }

        public Builder setColor(int color) {
            mColor = color;
            return this;
        }

        public Builder setLeftMargin(int leftMarginDp) {
            mLeftMarginDp = leftMarginDp;
            return this;
        }

        public Builder setAlign(@CustomTextSpan.AlignType int align) {
            mAlign = align;
            return this;
        }

        public Builder setSegmentStr(String segmentStr){
            mSegmentStr = segmentStr;
            return this;
        }

        public CustomTextSpanData build(){
            return new CustomTextSpanData(this);
        }
    }
}
