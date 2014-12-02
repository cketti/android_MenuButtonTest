package de.cketti.menubuttontest;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        switch (id) {
            case R.id.menu_item_1:
                return true;
            case R.id.menu_item_1_1:
                Toast.makeText(this, "Menu item 1.1", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_item_1_2:
                Toast.makeText(this, "Menu item 1.2", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_item_2:
                // Use default action
                break;
            case R.id.menu_item_2_1:
                Toast.makeText(this, "Menu item 2.1", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_item_2_2:
                Toast.makeText(this, "Menu item 2.2", Toast.LENGTH_SHORT).show();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
