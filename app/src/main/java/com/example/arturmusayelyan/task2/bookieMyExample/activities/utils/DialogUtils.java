package com.example.arturmusayelyan.task2.bookieMyExample.activities.utils;

import android.app.Dialog;
import android.content.Context;
import android.view.Window;

/**
 * Created by artur.musayelyan on 31/01/2018.
 */

public class DialogUtils {
    public static void showWSuccesDialog(Context context,String message,String titleMessage){
        Dialog dialog=new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(true);
       // dialog.setContentView();
    }
}
