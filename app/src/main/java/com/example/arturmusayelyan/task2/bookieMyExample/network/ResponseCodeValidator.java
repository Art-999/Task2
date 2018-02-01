package com.example.arturmusayelyan.task2.bookieMyExample.network;

import android.content.Context;

import com.example.arturmusayelyan.task2.bookieMyExample.enums.StatusCodeType;

import org.json.JSONObject;

/**
 * Created by artur.musayelyan on 01/02/2018.
 */

public class ResponseCodeValidator {
    // havaqum enq est backend-ic ekac tvyalneri

    private static String statusMessage;
    private static String titleMessage;
    private static final String STATUS_OK="Ok";
    private static final String STATUS_ERROR="error";

    public ResponseCodeValidator(){

    }

    public static int validateResponseCodeInfo(final Context context, JSONObject responce){
        String responseStatus=responce.optString("status");
        int statusCode=0;
        if(responce.optJSONArray("notification").length()!=0){
            JSONObject jsonObject=responce.optJSONArray("notification").optJSONObject(0);
            statusCode=jsonObject.optInt("code");
            statusMessage=jsonObject.optString("content");
            titleMessage=jsonObject.optString("title");
        }
        if(responseStatus.equals(STATUS_OK)){
            return 0;
        }
        else if(responseStatus.toLowerCase().contains(STATUS_ERROR)){
            System.out.println("statusMessage: " + statusMessage + " code: " + responseStatus);
            if(statusCode== StatusCodeType.TOKEN_EXPIRED.getStatusCode()){
                //Dialog.showErrorDialog...

                return statusCode;
            }
        }
       return 0;
    }
    public static String getStatusMessage(){
        return statusMessage;
    }
    public static String getTitleMessage(){
        return titleMessage;
    }
}
