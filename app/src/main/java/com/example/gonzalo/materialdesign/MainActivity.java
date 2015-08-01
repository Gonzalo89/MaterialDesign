package com.example.gonzalo.materialdesign;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends Activity {
    private DrawerLayout navDrawerLayout;
    private ListView navList;
    private ArrayList<String> navItms;
    ArrayAdapter<String> navAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Drawer layout
        navDrawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
        navList = (ListView)findViewById(R.id.lista);
        //Declaramos el header el caul sera el layout de header.xml
        View header = getLayoutInflater().inflate(R.layout.header, null);
        //Establecemos header
        navList.addHeaderView(header);

        navItms = new ArrayList<String>();
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("primer elemento");
        lista.add("segundo elemento");
        navAdapter= new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lista);
        navList.setAdapter(navAdapter);

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
