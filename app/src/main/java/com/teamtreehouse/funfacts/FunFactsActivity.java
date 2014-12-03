package com.teamtreehouse.funfacts;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class FunFactsActivity extends Activity {

    private FactBook mFactBook = new FactBook();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        //Declare(create) our View variables and assign them the Views from the layout (xml) file
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        //TextView was the class in the xml file that displayed the text
        Button showFactButton = (Button) findViewById(R.id.showFactButton);
        //Button was the class that housed the button.
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    String fact = mFactBook.getFact();
                //Update the label with our dynamic fact
                factLabel.setText(fact);

            }
        };
        showFactButton.setOnClickListener(listener);
    }

}
