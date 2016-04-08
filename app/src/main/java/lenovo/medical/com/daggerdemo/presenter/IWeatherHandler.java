package lenovo.medical.com.daggerdemo.presenter;

import java.util.List;

import lenovo.medical.com.daggerdemo.models.Weather;

/**
 * Created by lenovo on 2016/4/8.
 */
public interface IWeatherHandler {
    public List<Weather> getWeathers();
}
