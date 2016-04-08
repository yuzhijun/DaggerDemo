package lenovo.medical.com.daggerdemo.components;


import dagger.Component;
import lenovo.medical.com.daggerdemo.MainActivity;
import lenovo.medical.com.daggerdemo.modules.ActivityModule;
import lenovo.medical.com.daggerdemo.modules.ActivityScope;
import lenovo.medical.com.daggerdemo.presenter.DiskWork;
import lenovo.medical.com.daggerdemo.presenter.IUserHandler;

/**
 * Created by lenovo on 2016/4/8.
 */
@ActivityScope
@Component(dependencies = AppComponent.class,modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(MainActivity mainActivity);
//    DiskWork diskWork();
}
