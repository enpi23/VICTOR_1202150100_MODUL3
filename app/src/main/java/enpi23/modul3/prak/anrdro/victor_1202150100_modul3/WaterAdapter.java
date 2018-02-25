package enpi23.modul3.prak.anrdro.victor_1202150100_modul3;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;

/**
 * Created by Enpi23 on 24/02/2018.
 */
class WaterAdapter extends RecyclerView.Adapter<RecycleViewHolder> {

    private ArrayList<Water> WaterArrayList;
    private Context Context;

    WaterAdapter(Context Context, ArrayList<Water> waterData) {
        this.WaterArrayList = waterData;
        this.Context = Context;
    }

    @Override
    public RecycleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.water_list, parent, false);
        return new RecycleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecycleViewHolder holder, int position) {

        final String NameMerk = WaterArrayList.get(position).getNama();
        final String InfoMerk = WaterArrayList.get(position).getDeskripsi();
        final int MerkImage = WaterArrayList.get(position).getGambar();

        holder.tvTitle.setText(NameMerk);
        holder.tvSubTitle.setText(InfoMerk);
        holder.cardView.setBackgroundResource(MerkImage);

        holder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClick(int pos) {
                openDetailActivity(NameMerk, InfoMerk, MerkImage);
                Toast.makeText(Context, NameMerk, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return WaterArrayList.size();
    }

    private void openDetailActivity(String nama, String deskripsi, int gambar) {
        Intent intent = new Intent(Context.getApplicationContext(), DetailActivity.class);
        intent.putExtra("NameMerk", nama);
        intent.putExtra("InfoMerk", deskripsi);
        intent.putExtra("MerkImage", gambar);
        Context.startActivity(intent);
    }
}

