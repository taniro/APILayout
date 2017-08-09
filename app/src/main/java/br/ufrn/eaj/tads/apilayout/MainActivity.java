package br.ufrn.eaj.tads.apilayout;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        //TableLayout
        TableLayout table = new TableLayout(this);
        int pixels10 = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 10, getResources().getDisplayMetrics());
        table.setPadding(pixels10, pixels10, pixels10, pixels10);
        table.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
        table.setColumnStretchable(1, true);

        //TextView "Lista de Produtos"
        TextView produtosView = new TextView(this);
        produtosView.setText("Lista de Produtos");
        table.addView(produtosView);

        //Primeira View
        View v = new View(this);
        int pixels2 = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 2, getResources().getDisplayMetrics());
        v.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, pixels2));
        v.setBackgroundColor(Color.parseColor("#FF909090"));
        table.addView(v);

        //TableRow 1, Produto A - 100R$
        TableRow tr = new TableRow(this);
        TextView pa = new TextView(this);
        pa.setText("Produto A");
        TextView r1 = new TextView(this);
        r1.setText("100 R$");
        r1.setGravity(Gravity.RIGHT);
        tr.addView(pa);
        tr.addView(r1);
        table.addView(tr);

        //TableRow 2, Produto B - 200R$
        TableRow tr2 = new TableRow(this);
        TextView pa2 = new TextView(this);
        pa2.setText("Produto B");
        TextView r2 = new TextView(this);
        r2.setText("200 R$");
        r2.setGravity(Gravity.RIGHT);
        tr2.addView(pa2);
        tr2.addView(r2);
        table.addView(tr2);

        //TableRow 3, Produto C - 300R$
        TableRow tr3 = new TableRow(this);
        TextView pa3 = new TextView(this);
        pa3.setText("Produto C");
        TextView r3 = new TextView(this);
        r3.setText("300 R$");
        r3.setGravity(Gravity.RIGHT);
        tr3.addView(pa3);
        tr3.addView(r3);
        table.addView(tr3);

        //Segunda View
        View v2 = new View(this);
        v2.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, pixels2));
        v2.setBackgroundColor(Color.parseColor("#FF909090"));
        table.addView(v2);

        //LinearLayout
        LinearLayout ll = new LinearLayout(this);
        ll.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.MATCH_PARENT));
        ll.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL);
        int pixels35 = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 35, getResources().getDisplayMetrics());

        //Botão 1, Cancelar
        Button b1 = new Button(this);
        b1.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, pixels35));
        b1.setText("Cancelar");
        //Botão 2, Confirmar
        Button b2 = new Button(this);
        b2.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, pixels35));
        b2.setText("Confirmar");

        ll.addView(b1);
        ll.addView(b2);
        table.addView(ll);

        setContentView(table);
    }
}
