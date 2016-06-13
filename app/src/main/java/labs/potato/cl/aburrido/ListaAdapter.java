package labs.potato.cl.aburrido;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Leo on 12-06-16.
 */
public class ListaAdapter extends RecyclerView.Adapter<ListaAdapter.ViewHolder> {

private List<ListaOpciones> listaOpcionesList;


    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        CardView mCv;
        TextView mTextView,mTextViewTitle;
        ImageView mImageView;

        public ViewHolder(View v) {
            super(v);

            mTextView = (TextView) v.findViewById(R.id.info_text);
            mImageView= (ImageView) v.findViewById(R.id.image_card);
            mTextViewTitle =(TextView) v.findViewById(R.id.title_text);
        }
    }
    public ListaAdapter(List<ListaOpciones>listaOpcionesList){
        this.listaOpcionesList =listaOpcionesList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_aburrido,parent,false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        holder.mImageView.setImageResource(listaOpcionesList.get(position).getId_imagen());
        holder.mTextView.setText(listaOpcionesList.get(position).getTexto());
        holder.mTextView.setText(listaOpcionesList.get(position).getTitulo());
    }

    @Override
    public int getItemCount() {
        return listaOpcionesList.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

}
