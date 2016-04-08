package lenovo.medical.com.daggerdemo;

import android.os.Bundle;
import android.widget.TextView;

import javax.inject.Inject;

import lenovo.medical.com.daggerdemo.components.AppComponent;
import lenovo.medical.com.daggerdemo.components.DaggerSubActivityComponent;
import lenovo.medical.com.daggerdemo.modules.SubActivityModule;
import lenovo.medical.com.daggerdemo.presenter.SubWork;

public class MainActivity extends BaseActivity {

//    @Inject
//    UserHandler userHandler;
//
//    @Inject
//    WeatherHandler weatherHandler;

//    @Inject
//    WrapperWork wrapperWork;
    @Inject
    SubWork subWork;

    private TextView tvShow;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvShow = (TextView) findViewById(R.id.tvShow);

//        tvShow.setText(userHandler.getUsers().get(0).getName());
//        tvShow.setText(weatherHandler.getWeathers().get(0).getName());
//        tvShow.setText(wrapperWork.getWrapperUser().get(0).getName());
        tvShow.setText(subWork.getWrapperUser().get(0).getName());
    }

    @Override
    protected void setupComponent(AppComponent appComponent) {
//        DaggerActivityComponent.builder()
//                .appComponent(appComponent)
//                .activityModule(new ActivityModule(this))
//                .build()
//                .inject(this);
//        DaggerWorkComponent.builder()
//                .workModule(new WorkModule())
//                .build()
//                .inject(this);
        DaggerSubActivityComponent.builder()
                .subActivityModule(new SubActivityModule())
                .build()
                .inject(this);
    }
}
