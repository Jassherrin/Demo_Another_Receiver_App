package sg.edu.rp.c346.id18015871.demoanotherreceiverapp;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class AnotherBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"Received in Another BroadcastReceiver",
                Toast.LENGTH_LONG).show();
    }
}
