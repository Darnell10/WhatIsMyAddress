package c4q.com.whatismyaddress;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final String SHARED_PREF_KEY ="address_shared_preferences";

    private EditText email;
    private Button submit;
    private Button button_2;
    private SharedPreferences save;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = (EditText) findViewById(R.id.email);
        submit =(Button) findViewById(R.id.button1);
        button_2 =(Button) findViewById(R.id.button2);
        save = getApplicationContext().getSharedPreferences(SHARED_PREF_KEY,MODE_PRIVATE);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor save.edit();
                editor.putString("email", email.getText().toString());
                editor.commit();

            }
        });

        button_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, RecyclerActivity.class);
                intent.putExtra("sharedpref", SHARED_PREF_KEY);
                startActivity(intent);

            }
        });
    }
}
