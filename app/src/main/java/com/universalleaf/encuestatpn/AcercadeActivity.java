package com.universalleaf.encuestatpn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class AcercadeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acercade);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflator = getMenuInflater();
        inflator.inflate(R.menu.main_menu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.opt_about:
                //hacer acerca de
                Toast.makeText(this, R.string.m_action_about, Toast.LENGTH_SHORT).show();
                Intent i = new Intent(this, AcercadeActivity.class);
                startActivity(i);
                break;
            case R.id.opt_settings:
                //Accesion de configuracion
                Toast.makeText(this, R.string.m_action_settings, Toast.LENGTH_SHORT).show();
                break;
            case R.id.opt_exit:
                //Accion de salir
                Toast.makeText(this, R.string.m_action_exit, Toast.LENGTH_SHORT).show();
                Intent exit = new Intent(this, MainActivity.class);
                startActivity(exit);
                break;
            default:
                return true;

        }
        return super.onOptionsItemSelected(item);
    }
}
