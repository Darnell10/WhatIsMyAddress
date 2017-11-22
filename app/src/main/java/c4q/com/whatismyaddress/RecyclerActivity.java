package c4q.com.whatismyaddress;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RecyclerActivity extends AppCompatActivity {

    private SharedPreferences getPref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        Intent intent = getIntent();
        getPref = getApplication().getSharedPreferences(intent.getStringExtra("sharedPref"), MODE_PRIVATE);

        HashMap<String, ?> enteries = new HashMap<>();

        Map<String, ?> allEntries = getPref.getAll();
        for (Map.Entry<String, ?> entry : allEntries.entrySet()) {
            Log.d("map values", entry.getKey() + ": " + entry.getValue().toString());

        }
    }

}
