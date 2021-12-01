package tw.healthycare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class M_a001 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.m_a001);
        setupviewcomponent();
    }

    private void setupviewcomponent() {
        Spinner s001 = (Spinner) findViewById(R.id.m_a001_s001);


        ArrayAdapter<CharSequence> adapterSexList =
                ArrayAdapter.createFromResource(
                        this,
                        R.array.m_a001_s001,
                        R.layout.spinner_item);
        s001.setAdapter(adapterSexList);

    }


}