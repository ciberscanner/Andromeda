package com.kiwabolab.andromeda.vista.adaptador;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.kiwabolab.andromeda.R;
import com.kiwabolab.andromeda.modelo.Contrato;

import java.util.ArrayList;
import java.util.List;

public class ItemContrato extends ArrayAdapter<Contrato> {
    //----------------------------------------------------------------------------------------------
    //Variables
    private Context context;
    //----------------------------------------------------------------------------------------------
    //Constructor
    public ItemContrato(Context context, List<Contrato> contratos ) {
        super(context, 0, contratos);
        this.context =  context;
    }
    //----------------------------------------------------------------------------------------------
    //
    public long getItemId(int position) {
        return position;
    }
    //----------------------------------------------------------------------------------------------
    //
    public View getView(int position, View convertView, ViewGroup parent) {
        final Contrato contrato = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_contrato, parent, false);
        }
        final TextView nombre = (TextView) convertView.findViewById(R.id.name_entidad);
        final TextView descripcion = (TextView) convertView.findViewById(R.id.descripcion);
        final TextView fecha = (TextView) convertView.findViewById(R.id.firmado);
        final TextView valor = (TextView) convertView.findViewById(R.id.valor);

        nombre.setText(contrato.getNombreEntidad());
        descripcion.setText(contrato.getDescripciNDelProceso());


        String x=contrato.getValorDelContrato();
        String text = contrato.getValorDelContrato();
        switch (contrato.getValorDelContrato().length()) {
            case 4:
                x = text.substring(0, 1) + "." + text.substring(1, text.length());
                break;
            case 5:
                x = text.substring(0, 2) + "." + text.substring(2, text.length());
                break;
            case 6:
                x = text.substring(0, 3) + "." + text.substring(3, text.length());
                break;
            case 7:
                x = text.substring(0, 1) + "." + text.substring(1, text.length());
                x = x.substring(0, 5) + "." + x.substring(5, x.length());
                break;
            case 8:
                x = text.substring(0, 2) + "." + text.substring(2, text.length());
                x = x.substring(0, 6) + "." + x.substring(6, x.length());
                break;
            case 9:
                x = text.substring(0, 3) + "." + text.substring(3, text.length());
                x = x.substring(0, 7) + "." + x.substring(7, x.length());
                break;
        }
        valor.setText(x);

        if(contrato.getFechaDeFirma().length()>10){
            fecha.setText(contrato.getFechaDeFirma().substring(0,10));
        }else{
            fecha.setText(contrato.getFechaDeFirma());
        }

        return convertView;
    }
}