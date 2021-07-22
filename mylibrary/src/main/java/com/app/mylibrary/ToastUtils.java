package com.app.mylibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * @author Gson
 * @date 2021/7/22 15:09
 */
public class ToastUtils {
    public static void toast(Context context,String msg){
        Toast.makeText(context.getApplicationContext(), msg, Toast.LENGTH_SHORT).show();
    }
}
