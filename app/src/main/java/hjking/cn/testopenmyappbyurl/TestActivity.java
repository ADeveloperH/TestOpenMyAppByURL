package hjking.cn.testopenmyappbyurl;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class TestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        getIntentData();
    }

    private void getIntentData() {
        Intent intent = getIntent();
        String action = intent.getAction();

        if(Intent.ACTION_VIEW.equals(action)){
            Uri uri = intent.getData();
            if(uri != null){
                String name = uri.getQueryParameter("name");
                String age= uri.getQueryParameter("age");
                Toast.makeText(TestActivity.this,
                        "获取到的数据：：" + "name:" + name + "age:" + age,Toast.LENGTH_LONG)
                        .show();
            }
        }
    }
}
