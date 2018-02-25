package enpi23.modul3.prak.anrdro.victor_1202150100_modul3;

import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.View;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private ArrayList<Water> WaterArrayList;
    private WaterAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        WaterArrayList = new ArrayList<>();

        mAdapter = new WaterAdapter(this, WaterArrayList);
        mRecyclerView.setAdapter(mAdapter);

        initializeData();
    }

    /**
     * Method for initializing the sports data from resources.
     */
    private void initializeData() {
        String[] waterList = getResources().getStringArray(R.array.water_merk);
        String[] waterInfo = getResources().getStringArray(R.array.water_info);
        TypedArray waterImageRes = getResources().obtainTypedArray(R.array.water_images);

        WaterArrayList.clear();

        for(int i=0;i<waterList.length;i++){
            WaterArrayList.add(new Water(waterList[i],waterInfo[i], waterImageRes.getResourceId(i,0)));

        }
        waterImageRes.recycle();

        mAdapter.notifyDataSetChanged();
    }


}
