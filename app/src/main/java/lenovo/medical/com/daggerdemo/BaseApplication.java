package lenovo.medical.com.daggerdemo;

import android.app.Application;
import android.content.Context;

import lenovo.medical.com.daggerdemo.components.AppComponent;
import lenovo.medical.com.daggerdemo.components.DaggerAppComponent;
import lenovo.medical.com.daggerdemo.modules.AppModule;

/**
 * Created by lenovo on 2016/4/8.
 */
public class BaseApplication extends Application {
    private AppComponent appComponent;
    @Override
    public void onCreate() {
        super.onCreate();
        setupGraph();
    }

    private void setupGraph() {
         appComponent = DaggerAppComponent.builder()
                 .appModule(new AppModule(this))
                 .build();
        appComponent.inject(this);
    }

    public static BaseApplication get(Context context){
        return (BaseApplication)context.getApplicationContext();
    }

    public AppComponent component(){
        return this.appComponent;
    }
}
