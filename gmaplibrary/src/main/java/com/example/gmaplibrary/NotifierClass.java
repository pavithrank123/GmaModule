package com.example.gmaplibrary;

import android.content.Context;
import android.widget.Toast;

class NotifierClass {

    private void showNotification(Context context,String string)
    {
        Toast.makeText(context,string,Toast.LENGTH_SHORT);
    }
}
