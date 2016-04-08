package lenovo.medical.com.daggerdemo.modules;

import dagger.Module;
import dagger.Provides;
import lenovo.medical.com.daggerdemo.presenter.DependentWork;
import lenovo.medical.com.daggerdemo.presenter.DiskWork;

/**
 * Created by lenovo on 2016/4/8.
 */
@Module
public class DependentModule {

    @Provides
    DependentWork getDependentWork(DiskWork diskWork){
        return  new DependentWork(diskWork);
    }
}
