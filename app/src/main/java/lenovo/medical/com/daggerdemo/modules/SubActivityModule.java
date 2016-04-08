package lenovo.medical.com.daggerdemo.modules;

import dagger.Module;
import dagger.Provides;
import lenovo.medical.com.daggerdemo.presenter.DiskWork;
import lenovo.medical.com.daggerdemo.presenter.SubWork;

/**
 * Created by lenovo on 2016/4/8.
 */
@Module
public class SubActivityModule {

//    @Provides
//    SubWork provideSubWork(UserHandler userHandler){
//        return new SubWork(userHandler);
//    }

    @Provides
    SubWork provideSubWork(DiskWork diskWork){
        return new SubWork(diskWork);
    }
}
