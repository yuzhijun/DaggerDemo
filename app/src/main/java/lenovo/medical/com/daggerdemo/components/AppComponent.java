package lenovo.medical.com.daggerdemo.components;

import javax.inject.Singleton;

import dagger.Component;
import lenovo.medical.com.daggerdemo.BaseApplication;
import lenovo.medical.com.daggerdemo.modules.AppModule;

/**
 * Created by lenovo on 2016/4/8.
 */
@Singleton
@Component(modules = {
        AppModule.class
})
public interface AppComponent {
    void inject(BaseApplication app);
}
