package com.flutterwave.raveandroid.ach;

import com.flutterwave.raveandroid.rave_remote.responses.RequeryResponse;

public class NullAchView implements AchContract.View {
    @Override
    public void showProgressIndicator(boolean active) {

    }

    @Override
    public void onAmountValidated(String amountToSet, int visibility) {

    }

    @Override
    public void showRedirectMessage(boolean b) {

    }

    @Override
    public void onPaymentError(String message) {

    }

    @Override
    public void showWebView(String authUrl, String flwRef) {

    }

    @Override
    public void onRequerySuccessful(RequeryResponse response, String responseAsJSONString, String flwRef) {

    }

    @Override
    public void onPaymentFailed(String message, String responseAsJSONString) {

    }

    @Override
    public void onPaymentSuccessful(String status, String flwRef, String responseAsJSONString) {

    }

    @Override
    public void showAmountError(String msg) {

    }

    @Override
    public void showFee(String authUrl, String flwRef, String chargedAmount, String currency) {

    }

    @Override
    public void onValidationSuccessful(String amount) {

    }
}
