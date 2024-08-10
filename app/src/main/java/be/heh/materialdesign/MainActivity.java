package be.heh.materialdesign;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends Activity {
    private TextView tv_main_hello;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_main_hello= (TextView)findViewById(R.id.tv_main_hello);
    }
    @SuppressLint("SetTextI18n")
    public void onMainClickManager(View v) {
        if (v.getId()==R.id.bt_main_hean){
            tv_main_hello.setText("Hello Android !");
            tv_main_hello.setBackgroundColor(Color.RED);
        }
        if (v.getId()==R.id.bt_main_hest){
            tv_main_hello.setText("Hello Students !");
            tv_main_hello.setBackgroundColor(Color.WHITE);
        }
    }
}