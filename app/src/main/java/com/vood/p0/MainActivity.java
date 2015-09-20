package com.vood.p0;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //listener
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = getApplicationContext();
                CharSequence appNameText = ((Button) view).getText();
                CharSequence toastText = String.format("This button will launch my %s app!", appNameText);
                int duration = Toast.LENGTH_SHORT;

                Toast.makeText(context, toastText, duration).show();
            }
        };

        //buttons
        Button one = (Button) findViewById(R.id.button);
        one.setOnClickListener(onClickListener);
        Button two = (Button) findViewById(R.id.button2);
        two.setOnClickListener(onClickListener);
        Button three = (Button) findViewById(R.id.button3);
        three.setOnClickListener(onClickListener);
        Button four = (Button) findViewById(R.id.button4);
        four.setOnClickListener(onClickListener);
        Button five = (Button) findViewById(R.id.button5);
        five.setOnClickListener(onClickListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
