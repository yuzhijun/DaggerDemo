package lenovo.medical.com.daggerdemo.presenter;

import java.util.ArrayList;
import java.util.List;

import lenovo.medical.com.daggerdemo.models.Weather;

/**
 * Created by lenovo on 2016/4/8.
 */
public class DiskWork {

    public List<Weather> getWeathers(){
        List<Weather> weathers = new ArrayList<>();

        for (int i = 0;i < 6;i++){

            Weather weather = new Weather();
            weather.setName("weather" + i);
            weathers.add(weather);
        }
        return  weathers;
    }
}
