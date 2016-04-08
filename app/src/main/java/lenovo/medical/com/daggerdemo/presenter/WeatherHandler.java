package lenovo.medical.com.daggerdemo.presenter;

import java.util.List;

import javax.inject.Inject;

import lenovo.medical.com.daggerdemo.models.Weather;

/**
 * Created by lenovo on 2016/4/8.
 */
public class WeatherHandler implements IWeatherHandler {
    private DiskWork diskWork;
    @Inject
    public WeatherHandler(DiskWork diskWork){
        this.diskWork = diskWork;
    }

    @Override
    public List<Weather> getWeathers() {
        return diskWork.getWeathers();
    }
}
