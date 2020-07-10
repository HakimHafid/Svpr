package com.sekolahvirtualparangloe;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.vr.sdk.widgets.pano.VrPanoramaView;

public class prosestampilbelakangsma extends AppCompatActivity {

    private VrPanoramaView panoWidgetView;
    private tampilbelakangsma backgroundtampilbelakangsma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilbelakangsma);
        panoWidgetView = (VrPanoramaView) findViewById(R.id.pano_belakangsma);
        loadPanoImage();
    }

    private synchronized void loadPanoImage() {
        tampilbelakangsma task = backgroundtampilbelakangsma;
        if (task != null && !task.isCancelled()) {
            task.cancel(true);
        }
        VrPanoramaView.Options ViewOptions = new VrPanoramaView.Options();
        ViewOptions.inputType = VrPanoramaView.Options.TYPE_MONO;


        String panoImageName = "smabelakang.jpg";

        task = new tampilbelakangsma (panoWidgetView, ViewOptions, panoImageName);
        task.execute(this.getAssets());
        backgroundtampilbelakangsma = task;

    }
}
