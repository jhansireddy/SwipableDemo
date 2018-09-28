package learnings.db.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.loopeer.itemtouchhelperextension.ItemTouchHelperExtension;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        CustomRecyclerAdapter adapter = new CustomRecyclerAdapter(this);
        recyclerView.setAdapter(adapter);
        ItemTouchHelperCallback callback = new ItemTouchHelperCallback();
        ItemTouchHelperExtension helperExtension = new ItemTouchHelperExtension(callback);
        helperExtension.attachToRecyclerView(recyclerView);
    }
}
