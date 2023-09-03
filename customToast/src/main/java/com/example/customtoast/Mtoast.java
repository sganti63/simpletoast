package com.example.customtoast;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Mtoast {
    public static void TMake(Context context, String message) {
        LayoutInflater inflater = LayoutInflater.from(context);// getLayoutInflater();
        View layout = inflater.inflate(R.layout.custom_toasst, null);
        TextView text = layout.findViewById(R.id.text);
        text.setText(message);
        Toast toast = new Toast(context);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();


    }
}
