package com.example.gmaplibrary;

import android.content.Context;
import android.widget.Toast;

public class NotifierClass {

    public void showNotification(Context context,String string)
    {
        Toast.makeText(context,string,Toast.LENGTH_SHORT);
    }
}
