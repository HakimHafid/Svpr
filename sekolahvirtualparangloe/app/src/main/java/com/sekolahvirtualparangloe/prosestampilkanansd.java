package com.sekolahvirtualparangloe;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.vr.sdk.widgets.pano.VrPanoramaView;

public class prosestampilkanansd extends AppCompatActivity{

    private VrPanoramaView panoWidgetView;
    private tampilkanansd backgroundtampilkanansd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilkanansd);
        panoWidgetView = (VrPanoramaView) findViewById(R.id.pano_kanansd);
        loadPanoImage();
    }

    private synchronized void loadPanoImage() {
        tampilkanansd task = backgroundtampilkanansd;
        if (task != null && !task.isCancelled()) {
            task.cancel(true);
        }

        VrPanoramaView.Options ViewOptions = new VrPanoramaView.Options();
        ViewOptions.inputType = VrPanoramaView. Options.TYPE_MONO;


        String panoImageName = "sdkanan.jpg";

        task = new tampilkanansd (panoWidgetView, ViewOptions, panoImageName);
        task.execute(this.getAssets());
        backgroundtampilkanansd = task;

    }

}
