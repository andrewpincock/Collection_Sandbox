package com.example.andrewpincock.collection_sandbox;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;


public class MainActivity extends Activity {

    public class testGuitarBean{
        public void main(String[] args){
            guitarBean guitar = new guitarBean();

            guitar.setGuitarBrand("Fender");
            guitar.setGuitarModel("Precision");
            guitar.setYear(1970);

            System.out.print(guitar.getYear());
            System.out.print(guitar.getGuitarBrand());
            System.out.print(guitar.getGuitarModel());
        }
    }

    public static void main(String[] args){
        System.out.print("Here!\n\n\n");

        //Create ArrayList. Automatically resizes when items are added.
        ArrayList guitarArrayList = new ArrayList();

        //Add items to Arraylist
        guitarArrayList.add("Fender");
        guitarArrayList.add("Gibson");
        guitarArrayList.add("Schecter");

        //Display output to screen
        for (int i = 0; i <guitarArrayList.size(); i++){
            System.out.println(guitarArrayList.get(i));
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
