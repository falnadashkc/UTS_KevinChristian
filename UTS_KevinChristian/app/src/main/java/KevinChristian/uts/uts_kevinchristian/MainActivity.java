package KevinChristian.uts.uts_kevinchristian;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private EditText et_namalengkap, et_nomor;
private CheckBox CB_FB, CB_IG, CB_WS;
private Button btn_daftar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_namalengkap = findViewById(R.id.et_namalengkap);
        et_nomor = findViewById(R.id.et_nomor);

        CB_FB = findViewById(R.id.CB_FB);
        CB_IG = findViewById(R.id.CB_IG);
        CB_WS = findViewById(R.id.CB_WS);

        btn_daftar = findViewById(R.id.btn_Daftar);
    }
}