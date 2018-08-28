package com.example.diogenes.samplebroadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class HelloReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("aulafafica", "Recebendo a resposta da minha MinhaMensagemBroadcast !!!");
    }
}
