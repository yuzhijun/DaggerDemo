package lenovo.medical.com.daggerdemo.modules;

import android.app.Activity;

import dagger.Module;
import dagger.Provides;
import lenovo.medical.com.daggerdemo.presenter.DiskWork;
import lenovo.medical.com.daggerdemo.presenter.IUserHandler;
import lenovo.medical.com.daggerdemo.presenter.IWeatherHandler;
import lenovo.medical.com.daggerdemo.presenter.NetWork;
import lenovo.medical.com.daggerdemo.presenter.UserHandler;
import lenovo.medical.com.daggerdemo.presenter.WeatherHandler;

/**
 * Created by lenovo on 2016/4/8.
 */
@Module
public class ActivityModule {
    private final Activity activity;

    public ActivityModule(Activity activity){
        this.activity = activity;
    }

    @Provides
    @ActivityScope
    Activity provideAcitivity(){
        return this.activity;
    }

    @Provides
    IUserHandler provideUserHandler(NetWork netWork){
        return new UserHandler(netWork);
    }

    @Provides
    IWeatherHandler provideWeatherHandler(DiskWork diskWork){
        return new WeatherHandler(diskWork);
    }

    @Provides
    DiskWork provideDiskHandler(){
        return new DiskWork();
    }
}
