package com.example.arturmusayelyan.task2.bookieMyExample.network;

import android.content.Context;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import cz.msebera.android.httpclient.entity.StringEntity;

/**
 * Created by artur.musayelyan on 19/01/2018.
 */

public class BookieHttpClient {
    //uxaki nayel, usumnasirel u pordzel haskanal

    private static final String BASE_URL = "http://bookie.betconstruct.com/api/";

    private static AsyncHttpClient client = new AsyncHttpClient();

    public static void get(Context context, String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {
        client.get(context, url, params, responseHandler);
    }

    public static void post(Context context, String url, StringEntity entity, AsyncHttpResponseHandler responseHandler) {
        client.post(context, getAbsoluteUrl(url), entity, "application/json", responseHandler);
    }

    public static void cancelAllRequest() {
        client.cancelAllRequests(true);
    }

    private static String getAbsoluteUrl(String relativeUrl) {
        return BASE_URL + relativeUrl;
    }
}
