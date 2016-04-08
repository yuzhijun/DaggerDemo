package lenovo.medical.com.daggerdemo.components;

import dagger.Component;
import lenovo.medical.com.daggerdemo.MainActivity;
import lenovo.medical.com.daggerdemo.modules.SubActivityModule;

/**
 * Created by lenovo on 2016/4/8.
 */
@Component(modules = SubActivityModule.class)
public interface SubActivityComponent extends ActivityComponent {
    void inject(MainActivity mainActivity);
}
