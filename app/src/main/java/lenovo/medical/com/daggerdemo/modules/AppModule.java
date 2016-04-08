package lenovo.medical.com.daggerdemo.modules;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import lenovo.medical.com.daggerdemo.BaseApplication;

/**
 * Created by lenovo on 2016/4/8.
 */
@Module
public class AppModule {

    private BaseApplication app;

    public AppModule(BaseApplication app){
        this.app = app;
    }

    @Provides
    @Singleton
    public BaseApplication provideApp(){
        return this.app;
    }
}
