package com.binitshah.kickincharity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.github.paolorotolo.appintro.AppIntro2;
import com.github.paolorotolo.appintro.AppIntroFragment;

public class MainActivity extends AppIntro2 {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Note here that we DO NOT use setContentView();

        // Add your slide fragments here.
        // AppIntro will automatically generate the dots indicator and buttons.
        //addSlide(firstFragment);
        //addSlide(secondFragment);
        //addSlide(thirdFragment);
        //addSlide(fourthFragment);

        // Instead of fragments, you can also use our default slide
        // Just set a title, description, background and image. AppIntro will do the rest.
        addSlide(AppIntroFragment.newInstance(
                getResources().getString(R.string.slide1title),
                getResources().getString(R.string.slide1description),
                R.drawable.logo,
                ContextCompat.getColor(this, R.color.slide1color)));

        addSlide(AppIntroFragment.newInstance(
                getResources().getString(R.string.slide2title),
                getResources().getString(R.string.slide2description),
                R.drawable.slide3,
                ContextCompat.getColor(this, R.color.slide2color)));

        addSlide(AppIntroFragment.newInstance(
                getResources().getString(R.string.slide3title),
                getResources().getString(R.string.slide3description),
                R.drawable.slide4,
                ContextCompat.getColor(this, R.color.slide3color)));

        addSlide(AppIntroFragment.newInstance(
                getResources().getString(R.string.slide4title),
                getResources().getString(R.string.slide4description),
                R.drawable.slide5,
                ContextCompat.getColor(this, R.color.slide4color)));


        addSlide(new LoginFragment());
        // OPTIONAL METHODS
        // Override bar/separator color.
        //setSeparatorColor(Color.parseColor("#002196F3"));

        setDepthAnimation();
        showStatusBar(false);

        // Hide Skip/Done button.
        showSkipButton(true);
        setProgressButtonEnabled(true);

    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        // Do something when users tap on Skip button.
        Intent intent = new Intent(this, ChairtyMapsActivity.class);
        startActivity(intent);
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        // Do something when users tap on Done button.
        Intent intent = new Intent(this, ChairtyMapsActivity.class);
        startActivity(intent);
    }

    @Override
    public void onSlideChanged(@Nullable Fragment oldFragment, @Nullable Fragment newFragment) {
        super.onSlideChanged(oldFragment, newFragment);
        // Do something when the slide changes.
    }
}
