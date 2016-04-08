package lenovo.medical.com.daggerdemo.modules;

import dagger.Module;
import dagger.Provides;
import lenovo.medical.com.daggerdemo.presenter.SubWork;
import lenovo.medical.com.daggerdemo.presenter.UserHandler;

/**
 * Created by lenovo on 2016/4/8.
 */
@Module
public class SubActivityModule {

    @Provides
    SubWork provideSubWork(UserHandler userHandler){
        return new SubWork(userHandler);
    }
}
