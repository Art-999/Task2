package com.example.arturmusayelyan.task2.bookieMyExample.network;

import android.content.Context;
import android.support.v4.app.FragmentActivity;

import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.JsonHttpResponseHandler;

import cz.msebera.android.httpclient.entity.StringEntity;

/**
 * Created by artur.musayelyan on 19/01/2018.
 */

public class WebServiceManager {
//    public static void getConfig(Context context,AsyncHttpResponseHandler responseHandler){
//        BookieHttpClient.get(context,context.getString(R.string.config_url),null,responseHandler);
//    }

    public static void getTutorialSliderInfo(Context context, StringEntity entity, AsyncHttpResponseHandler responseHandler) {
        BookieHttpClient.post(context, EndpointTypes.DICTIONARY.toString(), entity, responseHandler);
    }

    //----------- User Service's calls ----------------
    public static void sendSignInData(Context context, StringEntity entity, AsyncHttpResponseHandler responseHandler) {
        BookieHttpClient.post(context, EndpointTypes.USER.toString(), entity, responseHandler);
    }

    public static void sendRegistrationData(Context context, StringEntity entity, AsyncHttpResponseHandler responseHandler) {
        BookieHttpClient.post(context, EndpointTypes.USER.toString(), entity, responseHandler);
    }


    public static void sendVerificationCode(Context context, StringEntity entity, AsyncHttpResponseHandler responseHandler) {
        BookieHttpClient.post(context, EndpointTypes.USER.toString(), entity, responseHandler);
    }

    public static void sendUserUpdateInfo(Context context, StringEntity entity, AsyncHttpResponseHandler responseHandler) {
        BookieHttpClient.post(context, EndpointTypes.USER.toString(), entity, responseHandler);
    }

    public static void setVerified(Context context, StringEntity entity, AsyncHttpResponseHandler responseHandler) {
        BookieHttpClient.post(context, EndpointTypes.USER.toString(), entity, responseHandler);
    }

    public static void setCheckForgotPasswordCode(Context context, StringEntity entity, AsyncHttpResponseHandler responseHandler) {
        BookieHttpClient.post(context, EndpointTypes.USER.toString(), entity, responseHandler);
    }

    public static void sendGoogleData(Context context, StringEntity entity, AsyncHttpResponseHandler responseHandler) {
        BookieHttpClient.post(context, EndpointTypes.USER.toString(), entity, responseHandler);
    }


    public static void sendForgotPasswordCode(Context context, StringEntity entity, AsyncHttpResponseHandler responseHandler) {
        BookieHttpClient.post(context, EndpointTypes.USER.toString(), entity, responseHandler);
    }

    public static void updateLocation(Context context, StringEntity entity, AsyncHttpResponseHandler responseHandler) {
        BookieHttpClient.post(context, EndpointTypes.USER.toString(), entity, responseHandler);
    }

    public static void sendForgotPasswordData(Context context, StringEntity entity, AsyncHttpResponseHandler responseHandler) {
        BookieHttpClient.post(context, EndpointTypes.USER.toString(), entity, responseHandler);
    }

    public static void getCountryList(Context context, StringEntity entity, AsyncHttpResponseHandler responseHandler) {
        BookieHttpClient.post(context, EndpointTypes.COMMONFUNCTIONS.toString(), entity, responseHandler);
    }

    public static void getCongratulationText(Context context, StringEntity entity, AsyncHttpResponseHandler responseHandler) {
        BookieHttpClient.post(context, EndpointTypes.DICTIONARY.toString(), entity, responseHandler);
    }
    public static void getPrivacyPolicyText(Context context, StringEntity entity, AsyncHttpResponseHandler responseHandler) {
        BookieHttpClient.post(context, EndpointTypes.DICTIONARY.toString(), entity, responseHandler);
    }

    public static void getSportList(Context context, StringEntity entity, AsyncHttpResponseHandler responseHandler) {
        BookieHttpClient.post(context, EndpointTypes.SPORT.toString(), entity, responseHandler);
    }

    public static void getMarketListForSport(Context context, StringEntity entity, AsyncHttpResponseHandler responseHandler) {
        BookieHttpClient.post(context, EndpointTypes.SPORT.toString(), entity, responseHandler);
    }

    public static void createOrUpdateGame(Context context, StringEntity entity, AsyncHttpResponseHandler responseHandler) {
        BookieHttpClient.post(context, EndpointTypes.GAME.toString(), entity, responseHandler);
    }

    public static void deleteGame(Context context, StringEntity entity, AsyncHttpResponseHandler responseHandler) {
        BookieHttpClient.post(context, EndpointTypes.GAME.toString(), entity, responseHandler);
    }

    public static void getGameList(FragmentActivity context, StringEntity entity, AsyncHttpResponseHandler responseHandler) {
        BookieHttpClient.post(context, EndpointTypes.GAME.toString(), entity, responseHandler);
    }

    public static void getBetList(Context context, StringEntity entity, AsyncHttpResponseHandler responseHandler) {
        BookieHttpClient.post(context, EndpointTypes.Bet.toString(), entity, responseHandler);
    }



    public static void getGameListWithTotalInfo(Context context, StringEntity entity, AsyncHttpResponseHandler responseHandler) {
        BookieHttpClient.post(context, EndpointTypes.GAME.toString(), entity, responseHandler);
    }


    public static void getMarketFields(Context context, StringEntity entity, AsyncHttpResponseHandler responseHandler) {
        BookieHttpClient.post(context, EndpointTypes.SPORT.toString(), entity, responseHandler);
    }

    public static void createMarket(Context context, StringEntity entity, AsyncHttpResponseHandler responseHandler) {
        BookieHttpClient.post(context, EndpointTypes.SPORT.toString(), entity, responseHandler);
    }

    public static void deleteMarket(Context context, StringEntity entity, AsyncHttpResponseHandler responseHandler) {
        BookieHttpClient.post(context, EndpointTypes.SPORT.toString(), entity, responseHandler);
    }

    public static void getMyBets (Context context, StringEntity entity, AsyncHttpResponseHandler responseHandler){
        BookieHttpClient.post(context,EndpointTypes.Bet.toString(),entity,responseHandler);
    }
    public static void getInvitedGames (Context context, StringEntity entity, AsyncHttpResponseHandler responseHandler){
        BookieHttpClient.post(context,EndpointTypes.GAME.toString(),entity,responseHandler);
    }

    public static void getAcceptGames (Context context, StringEntity entity, AsyncHttpResponseHandler responseHandler){
        BookieHttpClient.post(context,EndpointTypes.Bet.toString(),entity,responseHandler);
    }

    public static void getDenyGame(Context context, StringEntity entity, AsyncHttpResponseHandler responseHandler){
        BookieHttpClient.post(context,EndpointTypes.Bet.toString(),entity,responseHandler);
    }

    public static void getOpenBets (Context context, StringEntity entity, AsyncHttpResponseHandler responseHandler){
        BookieHttpClient.post(context,EndpointTypes.Bet.toString(),entity,responseHandler);
    }

    public static void createEvent(Context context, StringEntity entity, AsyncHttpResponseHandler responseHandler) {
        BookieHttpClient.post(context, EndpointTypes.SPORT.toString(), entity, responseHandler);
    }

    public static void placeBet(Context context, StringEntity entity, AsyncHttpResponseHandler responseHandler) {
        BookieHttpClient.post(context, EndpointTypes.Bet.toString(), entity, responseHandler);
    }
    public static void markAsUsed(Context context, StringEntity entity, AsyncHttpResponseHandler responseHandler) {
        BookieHttpClient.post(context, EndpointTypes.Bet.toString(), entity, responseHandler);
    }

    public static void getFieldsForResult(Context context, StringEntity entity, AsyncHttpResponseHandler responseHandler){
        BookieHttpClient.post(context, EndpointTypes.GAME.toString(), entity, responseHandler);
    }

    public static void getGame(Context context, StringEntity entity, AsyncHttpResponseHandler responseHandler) {
        BookieHttpClient.post(context, EndpointTypes.GAME.toString(), entity, responseHandler);
    }

    public static void getGameBetInfo (Context context, StringEntity entity, AsyncHttpResponseHandler responseHandler){
        BookieHttpClient.post(context,EndpointTypes.GAME.toString(),entity,responseHandler);
    }

    public static void getBetInfo (Context context, StringEntity entity, AsyncHttpResponseHandler responseHandler){
        BookieHttpClient.post(context,EndpointTypes.Bet.toString(),entity,responseHandler);
    }
    public static void getGameResultPerBet (Context context, StringEntity entity, AsyncHttpResponseHandler responseHandler){
        BookieHttpClient.post(context,EndpointTypes.GAME.toString(),entity,responseHandler);
    }

    public static void createResult(Context context, StringEntity entity, AsyncHttpResponseHandler responseHandler) {
        BookieHttpClient.post(context, EndpointTypes.GAME.toString(), entity, responseHandler);
    }


    public static void createSport(FragmentActivity activity, StringEntity entity, JsonHttpResponseHandler responseHandler) {
        BookieHttpClient.post(activity, EndpointTypes.SPORT.toString(), entity, responseHandler);

    }

    public static void checkGameInfo(FragmentActivity activity, StringEntity entity, JsonHttpResponseHandler responseHandler) {
        BookieHttpClient.post(activity, EndpointTypes.GAME.toString(), entity, responseHandler);
    }

    public static void getUserListForInvitation(FragmentActivity activity, StringEntity entity, JsonHttpResponseHandler responseHandler) {
        BookieHttpClient.post(activity, EndpointTypes.USER.toString(), entity, responseHandler);
    }

    public static void inviteToGame(FragmentActivity activity, StringEntity entity, JsonHttpResponseHandler responseHandler) {
        BookieHttpClient.post(activity, EndpointTypes.USER.toString(), entity, responseHandler);
    }

    public static void getUsersListInvitedToGame(FragmentActivity activity, StringEntity entity, JsonHttpResponseHandler responseHandler) {
        BookieHttpClient.post(activity, EndpointTypes.USER.toString(), entity, responseHandler);
    }
}
