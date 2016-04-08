package lenovo.medical.com.daggerdemo.components;

import javax.inject.Singleton;

import dagger.Component;
import lenovo.medical.com.daggerdemo.MainActivity;
import lenovo.medical.com.daggerdemo.modules.ActivityScope;
import lenovo.medical.com.daggerdemo.modules.DependentModule;
import lenovo.medical.com.daggerdemo.modules.DependentScope;

/**
 * Created by lenovo on 2016/4/8.
 */
@DependentScope
@Component(dependencies = ActivityComponent.class,modules = DependentModule.class)
public interface DependentComponent {
    void inject(MainActivity mainActivity);
}
