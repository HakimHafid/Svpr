package com.sekolahvirtualparangloe;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.google.vr.sdk.widgets.pano.VrPanoramaView;
public class prosestampilbelakangsmp extends AppCompatActivity {

    private VrPanoramaView panoWidgetView;
    private tampilbelakangsmp backgroundtampilbelakangsmp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampilbelakangsmp);
        panoWidgetView = (VrPanoramaView) findViewById(R.id.pano_belakangsmp);
        loadPanoImage();
    }

    private synchronized void loadPanoImage() {
        tampilbelakangsmp task = backgroundtampilbelakangsmp;
        if (task != null && !task.isCancelled()) {
            task.cancel(true);
        }
        VrPanoramaView.Options ViewOptions = new VrPanoramaView.Options();
        ViewOptions.inputType = VrPanoramaView.Options.TYPE_MONO;


        String panoImageName = "smpbelakang.jpg";

        task = new tampilbelakangsmp (panoWidgetView, ViewOptions, panoImageName);
        task.execute(this.getAssets());
        backgroundtampilbelakangsmp = task;

    }
}