package lenovo.medical.com.daggerdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import lenovo.medical.com.daggerdemo.components.AppComponent;

/**
 * Created by lenovo on 2016/4/8.
 */
public abstract class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setupComponent((AppComponent)BaseApplication.get(this).component());
    }

    protected abstract void setupComponent(AppComponent appComponent);
}
