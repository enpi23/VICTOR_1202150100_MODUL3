package enpi23.modul3.prak.anrdro.victor_1202150100_modul3;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Enpi23 on 25/02/2018.
 */

public class RecycleViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    TextView tvTitle, tvSubTitle;
    CardView cardView;
    ItemClickListener itemClickListener;


    public RecycleViewHolder(View itemView) {
        super(itemView);

        tvTitle = (TextView) itemView.findViewById(R.id.title);
        tvSubTitle = (TextView) itemView.findViewById(R.id.subTitle);
        cardView = (CardView) itemView.findViewById(R.id.cardView);

        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        this.itemClickListener.onItemClick(this.getLayoutPosition());
    }

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }
}
