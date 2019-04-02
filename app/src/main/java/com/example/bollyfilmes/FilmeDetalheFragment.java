package com.example.bollyfilmes;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class FilmeDetalheFragment extends Fragment {

    private ItemFilme itemFilme;


    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        if (getArguments() != null){
            itemFilme = (ItemFilme) getArguments().getSerializable(MainActivity.KEY_FILME);

        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_filme_detalhe, container, false);

        //Acrescentou essa verificacao
        if (itemFilme == null)
            return view;

        TextView titulo = (TextView) view.findViewById(R.id.item_titulo);
        titulo.setText(itemFilme.getTitulo());

        TextView data = (TextView) view.findViewById(R.id.item_data);
        data.setText(itemFilme.getDataLancamento());

        TextView desc = (TextView) view.findViewById(R.id.item_desc);
        desc.setText(itemFilme.getDescricao());

        RatingBar avaliacao = (RatingBar) view.findViewById(R.id.item_avaliacao);
        avaliacao.setRating(itemFilme.getAvaliacao());

        Button btnTrailer = (Button) view.findViewById(R.id.item_btn_trailer);

        return view;
    }


}




