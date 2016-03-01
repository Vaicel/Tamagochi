package samsung.ru.tamogochi;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.view.View.OnClickListener;



public class MainActivity extends Activity {
    TextView tv;
    Button fd;
    Button pl;
    Button hg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView)findViewById(R.id.tv);
        fd=(Button)findViewById(R.id.feed);
        pl=(Button)findViewById(R.id.play);
        hg=(Button)findViewById(R.id.hygiene);
    }

    public void feedClick(View view) {
        Pet.feeding();
        tv.setText(Pet.stats());
    }

    public void hygieneClick(View view) {
        Pet.hygiening();
        tv.setText(Pet.stats());
    }

    public void playClick(View view) {
        Pet.playing();
        tv.setText(Pet.stats());
    }
}
