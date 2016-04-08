package lenovo.medical.com.daggerdemo.presenter;

import java.util.List;

import javax.inject.Inject;

import lenovo.medical.com.daggerdemo.models.Weather;

/**
 * Created by lenovo on 2016/4/8.
 */
public class DependentWork {

    private DiskWork diskWork;

    @Inject
    public DependentWork(DiskWork diskWork){
        this.diskWork = diskWork;
    }

    public List<Weather> getWrapperWeather(){
        return diskWork.getWeathers();
    }
}
