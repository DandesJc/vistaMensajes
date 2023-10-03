package com.example.clase02_10_2023;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;


public class ListAdapter extends BaseAdapter {
    Context contexto;

    String [] nombres, mensaje, horaUltimoMensaje, numeroTelefono, pais;
    int idImagen;

    LayoutInflater inflater;

    public ListAdapter(Context contexto, String[] nombres, String[] mensaje, String[] horaUltimoMensaje, String[] numeroTelefono, String[] pais, int idImagen) {
        this.contexto = contexto;
        this.nombres = nombres;
        this.mensaje = mensaje;
        this.horaUltimoMensaje = horaUltimoMensaje;
        this.numeroTelefono = numeroTelefono;
        this.pais = pais;
        this.idImagen = idImagen;
        inflater = LayoutInflater.from(contexto);
    }

    @Override
    public int getCount(){return nombres.length;}

    @Override
    public Object getItem(int I){return null;}

    @Override
    public long getItemId(int i){return 0;}

    @Override
    public View getView(int i, View view, ViewGroup viewGroup){
        view = inflater.inflate(R.layout.list_item, null);
        ImageView fotoPerfil = view.findViewById(R.id.fotoPerfil);
        TextView nombreUsuario = view.findViewById(R.id.nombrePersona);
        TextView ultimoMensaje = view.findViewById(R.id.mensaje);
        TextView horaMensaje = view.findViewById(R.id.horaMensaje);
        fotoPerfil.setImageResource(idImagen);
        nombreUsuario.setText(nombres[i]);
        ultimoMensaje.setText(mensaje[i]);
        horaMensaje.setText(horaUltimoMensaje[i]);
        return view;
    }


}
