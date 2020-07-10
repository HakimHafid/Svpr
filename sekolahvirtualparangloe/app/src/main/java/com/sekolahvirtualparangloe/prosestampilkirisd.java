package com.sekolahvirtualparangloe;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.vr.sdk.widgets.pano.VrPanoramaView;

public class prosestampilkirisd extends AppCompatActivity{

    private VrPanoramaView panoWidgetView;
    private tampilkirisd backgroundtampilkirisd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilkirisd);
        panoWidgetView = (VrPanoramaView) findViewById(R.id.pano_kirisd);
        loadPanoImage();
    }

    private synchronized void loadPanoImage() {
        tampilkirisd task = backgroundtampilkirisd;
        if (task != null && !task.isCancelled()) {
            task.cancel(true);
        }

        VrPanoramaView.Options ViewOptions = new VrPanoramaView.Options();
        ViewOptions.inputType = VrPanoramaView. Options.TYPE_MONO;


        String panoImageName = "sdkiri.jpg";

        task = new tampilkirisd (panoWidgetView, ViewOptions, panoImageName);
        task.execute(this.getAssets());
        backgroundtampilkirisd = task;

    }

}

