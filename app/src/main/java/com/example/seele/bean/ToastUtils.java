package com.example.seele.bean;

import android.app.Application;
import android.content.Context;
import android.widget.Toast;

/**
 * Created by SEELE on 2017/8/9.
 */
public class ToastUtils {
    private static Application mContext;
    private static Toast mInstance = null;

    /**
     * 短时间的Toast
     * @param message 显示信息
     */
    public static void shortShow(String message){
        mInstance = Toast.makeText(mContext,message,Toast.LENGTH_SHORT);
        mInstance.show();
    }

    /**
     * 长时间的Toast
     * @param context 上下文
     * @param message 显示信息
     */
    public static void longShow(Context context,String message){
        mInstance = Toast.makeText(context,message,Toast.LENGTH_LONG);
        mInstance.show();
    }

    public static Toast getInstance(Context context){
        if(mInstance == null){
            synchronized (Toast.class){
                if(mInstance == null){
                    mInstance = new Toast(context);
                    mInstance.setText("iop");
                    mInstance.show();
                }
            }
        }
        return mInstance;
    }


}
