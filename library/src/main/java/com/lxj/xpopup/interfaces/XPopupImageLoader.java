package com.lxj.xpopup.interfaces;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;

import java.io.File;

public interface XPopupImageLoader{
    void loadImage(int position, @NonNull Object uri, @NonNull View imageView);

    /**
     * 获取图片对应的文件
     * @param context
     * @param uri
     * @return
     */
    File getImageFile(@NonNull Context context, @NonNull Object uri);
}
