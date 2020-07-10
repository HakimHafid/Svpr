package com.sekolahvirtualparangloe;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.vr.sdk.widgets.pano.VrPanoramaView;

public class prosestampilkirisma extends AppCompatActivity{

    private VrPanoramaView panoWidgetView;
    private tampilkirisma backgroundtampilkirisma;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilkirisma);
        panoWidgetView = (VrPanoramaView) findViewById(R.id.pano_kirisma);
        loadPanoImage();
    }

    private synchronized void loadPanoImage() {
        tampilkirisma task = backgroundtampilkirisma;
        if (task != null && !task.isCancelled()) {
            task.cancel(true);
        }
        VrPanoramaView.Options ViewOptions = new VrPanoramaView.Options();
        ViewOptions.inputType = VrPanoramaView. Options.TYPE_MONO;


        String panoImageName = "smakiri.jpg";

        task = new tampilkirisma (panoWidgetView, ViewOptions, panoImageName);
        task.execute(this.getAssets());
        backgroundtampilkirisma = task;

    }

}
