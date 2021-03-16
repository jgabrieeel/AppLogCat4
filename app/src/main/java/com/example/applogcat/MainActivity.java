package com.example.applogcat;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Instanciar um objeto da classe operaçaco
        Operacao calcular = new Operacao(7, 8);


        System.out.println("------- Entrou no onCreate da MainActivity --------");
        System.out.print("--------------- Visualizando o LogCat ---------------");
        System.out.print("-----------------------------------------------------");
        System.out.print("Operador1: ");
        System.out.println(calcular.getOperador1());
        System.out.print("Operador2: ");
        System.out.println(calcular.getOperador2());
        System.out.print("SOMA: ");
        System.out.println(calcular.Soma());
        System.out.print("SUBTRACAO: ");
        System.out.println(calcular.Subtracao());
        System.out.print("MULTIPLICACAO: ");
        System.out.println(calcular.Multiplicacao());
        System.out.print("DIVISAO: ");
        System.out.println(calcular.Divisao());
        System.out.println("===================================================");


        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}