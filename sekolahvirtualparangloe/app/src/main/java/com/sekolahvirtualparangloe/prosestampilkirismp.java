package com.sekolahvirtualparangloe;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.vr.sdk.widgets.pano.VrPanoramaView;

public class prosestampilkirismp extends AppCompatActivity{

    private VrPanoramaView panoWidgetView;
    private tampilkirismp backgroundtampilkirismp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilkirismp);
        panoWidgetView = (VrPanoramaView) findViewById(R.id.pano_kirismp);
        loadPanoImage();
    }

    private synchronized void loadPanoImage() {
        tampilkirismp task = backgroundtampilkirismp;
        if (task != null && !task.isCancelled()) {
            task.cancel(true);
        }

        VrPanoramaView.Options ViewOptions = new VrPanoramaView.Options();
        ViewOptions.inputType = VrPanoramaView. Options.TYPE_MONO;


        String panoImageName = "smpkiri.jpg";

        task = new tampilkirismp (panoWidgetView, ViewOptions, panoImageName);
        task.execute(this.getAssets());
        backgroundtampilkirismp = task;

    }

}

