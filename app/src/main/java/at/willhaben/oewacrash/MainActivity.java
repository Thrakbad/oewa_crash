package at.willhaben.oewacrash;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import de.spring.mobile.survey.SpringMobileSurvey;

public class MainActivity extends AppCompatActivity {

    private volatile SpringMobileSurvey spring;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spring = new SpringMobileSurvey("site", "app", this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        spring.checkSurvey();
    }
}
