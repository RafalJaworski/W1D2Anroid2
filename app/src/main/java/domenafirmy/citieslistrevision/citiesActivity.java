package domenafirmy.citieslistrevision;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

public class citiesActivity extends AppCompatActivity {

    private RecyclerView rv ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cities);

        rv = (RecyclerView) findViewById(R.id.list);
    }
}
