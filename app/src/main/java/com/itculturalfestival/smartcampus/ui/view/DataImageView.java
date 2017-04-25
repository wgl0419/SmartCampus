package com.itculturalfestival.smartcampus.ui.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;

/**
 * @creation_time: 2017/4/14
 * @author: Vegen
 * @e-mail: vegenhu@163.com
 * @describe:
 */

public class DataImageView extends android.support.v7.widget.AppCompatImageView {

    private String absolutePath;

    private Bitmap bitmap;

    public DataImageView(Context context) {
        this(context, null);
    }

    public DataImageView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public DataImageView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public String getAbsolutePath() {
        return absolutePath;
    }

    public void setAbsolutePath(String absolutePath) {
        this.absolutePath = absolutePath;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

}
