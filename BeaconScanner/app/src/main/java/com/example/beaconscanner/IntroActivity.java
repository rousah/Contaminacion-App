package com.example.beaconscanner;

import android.Manifest;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntro2;
import com.github.paolorotolo.appintro.AppIntro2Fragment;
import com.github.paolorotolo.appintro.AppIntroFragment;
import com.github.paolorotolo.appintro.model.SliderPage;

import net.steamcrafted.materialiconlib.MaterialDrawableBuilder;

public class IntroActivity extends AppIntro2 {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Just create a `SliderPage` and provide title, description, background and image.
        // AppIntro will do the rest.
        SliderPage sliderPage = new SliderPage();
        sliderPage.setTitle("Mide los gases");
        sliderPage.setDescription("Conéctate a tu sensor mediante bluetooth y podrás recibir toda la información de los gases que te rodean");
        sliderPage.setImageDrawable(R.drawable.bluetoothsensor);
        sliderPage.setBgColor(Color.parseColor("#222831"));
      //  sliderPage.setDescColor(Color.parseColor("#FFFFFF"));
        addSlide(AppIntro2Fragment.newInstance(sliderPage));

       // Log.d("pruebas", "" + sliderPage.setDescColor(););

        SliderPage sliderPage2 = new SliderPage();
        sliderPage2.setTitle("Visión Artificial");
        sliderPage2.setDescription("Te diremos la cantidad de contaminación que tienes a tu alrededor a partir de una foto!");
        sliderPage2.setImageDrawable(R.drawable.foto);
        sliderPage2.setBgColor(Color.parseColor("#222831"));
        addSlide(AppIntro2Fragment.newInstance(sliderPage2));

        SliderPage sliderPage3 = new SliderPage();
        sliderPage3.setTitle("Mapa");
        sliderPage3.setDescription("¿Te interesa saber dónde hay más contaminación? Poluzone te lo muestra todo");
        sliderPage3.setImageDrawable(R.drawable.mapfotointro);
        sliderPage3.setBgColor(Color.parseColor("#222831"));
        addSlide(AppIntro2Fragment.newInstance(sliderPage3));

        // Hide Skip/Done button.
        showSkipButton(false);
        setProgressButtonEnabled(true);

        // Permissions
        // Ask for BLUETOOTH permission on the first slide
    //    askForPermissions(new String[]{Manifest.permission.BLUETOOTH}, 1);
        // Ask for CAMERA permission on the second slide
      //  askForPermissions(new String[]{Manifest.permission.CAMERA}, 2);
        // Ask for LOCALIZATION permission on the third slide
        //askForPermissions(new String[]{Manifest.permission.ACCESS_COARSE_LOCATION}, 3);
    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        // Do something when users tap on Skip button.
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        // Do something when users tap on Done button.
    }

    @Override
    public void onSlideChanged(@Nullable Fragment oldFragment, @Nullable Fragment newFragment) {
        super.onSlideChanged(oldFragment, newFragment);
        // Do something when the slide changes.
    }
}