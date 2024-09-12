package com.zrq.learncompose.common.webview

import android.app.Activity
import android.content.pm.ActivityInfo
import android.view.View
import android.webkit.WebChromeClient
import android.webkit.WebChromeClient.CustomViewCallback
import android.webkit.WebView
import android.widget.FrameLayout


fun WebView.setWebChromeClient(activity: Activity) {
    webChromeClient = object : WebChromeClient() {
        override fun onShowCustomView(view: View?, callback: CustomViewCallback?) {
            super.onShowCustomView(view, callback)
            if (mCustomView != null) {
                callback?.onCustomViewHidden();
                return;
            }
            mCustomView = view;
            mFrameLayout = activity.window.decorView as FrameLayout

            mFrameLayout!!.addView(mCustomView);
            mCustomViewCallback = callback;
            setVisibility(View.GONE);
            activity.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        }

        override fun onHideCustomView() {
            setVisibility(View.VISIBLE);
            if (mCustomView == null) {
                return;
            }
            setVisibility(View.VISIBLE);
            mFrameLayout?.removeView(mCustomView);
            mCustomViewCallback?.onCustomViewHidden();
            mCustomView = null;
            activity.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
            super.onHideCustomView();
        }
    }

}

private var mCustomView: View? = null
private var mCustomViewCallback: CustomViewCallback? = null
private var mFrameLayout: FrameLayout? = null