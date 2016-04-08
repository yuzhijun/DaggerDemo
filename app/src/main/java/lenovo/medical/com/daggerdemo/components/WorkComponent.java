package lenovo.medical.com.daggerdemo.components;

import dagger.Component;
import lenovo.medical.com.daggerdemo.MainActivity;
import lenovo.medical.com.daggerdemo.modules.WorkModule;

/**
 * Created by lenovo on 2016/4/8.
 */
@Component(modules = WorkModule.class)
public interface WorkComponent {
    void inject(MainActivity activity);
}
