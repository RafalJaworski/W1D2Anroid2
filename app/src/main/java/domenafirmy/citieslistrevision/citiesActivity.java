package domenafirmy.citieslistrevision;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class citiesActivity extends AppCompatActivity {

    private RecyclerView rv ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cities);

        rv = (RecyclerView) findViewById(R.id.list);

        List<String> cities =  new ArrayList<>();
        cities.add("Aberdeen");
        cities.add("Edinburg");
        cities.add("Glasgow");
        cities.add("Invernes");
        cities.add("Chester");
        cities.add("London");
        cities.add("Liverpool");
        cities.add("Manchester");
    }
}
