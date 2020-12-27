package com.opensource.mors;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PixelFormat;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.andremion.counterfab.CounterFab;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.io.FileDescriptor;

/**
 * Created by anupamchugh on 01/08/17.
 */

public class FloatingWidgetService extends Service {


    private WindowManager mWindowManager;
    private View mOverlayView;
    private FloatingActionButton mFloatingActionButton;
//    CounterFab counterFab;
    RelativeLayout counterFab;
    TextView textView;


    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return new BubbleBinder();
    }

    public void setText(String text){
        textView.setText(text);
    }
    public void setColor(String color){
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
//            textView.tint
            return;
        }
//        Log.d("FloatingWidgetService", color);
        if (color.equals("green")){
//            Log.d("FloatingWidgetService", "GREEN!");
            mFloatingActionButton.setBackgroundTintList(ColorStateList.valueOf(((0xff) << 24 | (0x00) << 16 | (0xff) << 8 | (0x00))));
        }else if (color.equals("red")){
//            Log.d("FloatingWidgetService", "RED!");
            mFloatingActionButton.setBackgroundTintList(ColorStateList.valueOf(((0xff) << 24 | (0xff) << 16 | (0x00) << 8 | (0x00))));
        }else{
            mFloatingActionButton.setBackgroundTintList(ColorStateList.valueOf(Integer.valueOf(color)));

        }


    }
    @SuppressLint("ClickableViewAccessibility")
    @Override
    public void onCreate() {
        super.onCreate();

        setTheme(R.style.AppTheme);

        mOverlayView = LayoutInflater.from(this).inflate(R.layout.overlay_layout, null);
        int LAYOUT_FLAG;
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            LAYOUT_FLAG = WindowManager.LayoutParams.TYPE_APPLICATION_OVERLAY;
        } else {
            LAYOUT_FLAG = WindowManager.LayoutParams.TYPE_PHONE;
        }
        mFloatingActionButton = mOverlayView.findViewById(R.id.floating_button);

        final WindowManager.LayoutParams params = new WindowManager.LayoutParams(
                WindowManager.LayoutParams.WRAP_CONTENT,
                WindowManager.LayoutParams.WRAP_CONTENT,
                LAYOUT_FLAG,
                WindowManager.LayoutParams.FLAG_NOT_FOCUSABLE,
                PixelFormat.TRANSLUCENT);


        //Specify the view position
        params.gravity = Gravity.TOP | Gravity.LEFT;        //Initially view will be added to top-left corner
        params.x = 0;
        params.y = 100;


        mWindowManager = (WindowManager) getSystemService(WINDOW_SERVICE);
        mWindowManager.addView(mOverlayView, params);


        counterFab = mOverlayView.findViewById(R.id.fabHead);
        textView = mOverlayView.findViewById(R.id.floating_text);
//        counterFab.setCount(1);
        counterFab.setOnTouchListener(new View.OnTouchListener() {
            private int initialX;
            private int initialY;
            private float initialTouchX;
            private float initialTouchY;

            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:

                        //remember the initial position.
                        initialX = params.x;
                        initialY = params.y;


                        //get the touch location
                        initialTouchX = event.getRawX();
                        initialTouchY = event.getRawY();


                        return true;
                    case MotionEvent.ACTION_UP:

                        //Add code for launching application and positioning the widget to nearest edge.
                        return true;
                    case MotionEvent.ACTION_MOVE:


                        float Xdiff = Math.round(event.getRawX() - initialTouchX);
                        float Ydiff = Math.round(event.getRawY() - initialTouchY);


                        //Calculate the X and Y coordinates of the view.
                        params.x = initialX + (int) Xdiff;
                        params.y = initialY + (int) Ydiff;

                        //Update the layout with new X & Y coordinates
                        mWindowManager.updateViewLayout(mOverlayView, params);


                        return true;
                }
                return false;
            }
        });


    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mOverlayView != null)
            mWindowManager.removeView(mOverlayView);
    }

    public class BubbleBinder extends Binder {

         public FloatingWidgetService getService() {
            return FloatingWidgetService.this;
        }
    }
}