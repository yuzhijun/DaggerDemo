package lenovo.medical.com.daggerdemo;

import android.os.Bundle;
import android.widget.TextView;

import javax.inject.Inject;

import lenovo.medical.com.daggerdemo.components.AppComponent;
import lenovo.medical.com.daggerdemo.components.DaggerActivityComponent;
import lenovo.medical.com.daggerdemo.components.DaggerDependentComponent;
import lenovo.medical.com.daggerdemo.modules.ActivityModule;
import lenovo.medical.com.daggerdemo.modules.DependentModule;
import lenovo.medical.com.daggerdemo.presenter.DiskWork;

public class MainActivity extends BaseActivity {

//    @Inject
//    UserHandler userHandler;
//
//    @Inject
//    WeatherHandler weatherHandler;

//    @Inject
//    WrapperWork wrapperWork;
//    @Inject
//    SubWork subWork;

//    @Inject
//    DependentWork dependentWork;

    @Inject
    DiskWork diskWork;

    private TextView tvShow;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvShow = (TextView) findViewById(R.id.tvShow);

//        tvShow.setText(userHandler.getUsers().get(0).getName());
//        tvShow.setText(weatherHandler.getWeathers().get(0).getName());
//        tvShow.setText(wrapperWork.getWrapperUser().get(0).getName());
//        tvShow.setText(subWork.getWrapperWeather().get(0).getName());
//        tvShow.setText(dependentWork.getWrapperWeather().get(0).getName());

        tvShow.setText(diskWork.getWeathers().get(0).getName());
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
//        DaggerSubActivityComponent.builder()
//                .subActivityModule(new SubActivityModule())
//                .build()
//                .inject(this);

        DaggerDependentComponent.builder()
                .dependentModule(new DependentModule())
                .activityComponent(DaggerActivityComponent.builder()
                        .appComponent(appComponent)
                        .activityModule(new ActivityModule(this))
                        .build())
                .build().inject(this);
    }
}
