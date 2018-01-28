package com.example.pramodjc96.crypto;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    //public double usd;

    public String inputText1;
    public String inputText2;

    EditText amt;

    public String amount;
    String amtEntered;

    Float num;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });





//        TextView tv = (TextView)
//                findViewById(R.id.Amount);
//        amount = tv.getText().toString();

//        TextView tv = (TextView)
//                findViewById(R.id.numb);
//        amtEntered = (tv.getText().toString());




        //Float.valueOf(amt.getText().toString());







        convert(findViewById(R.id.butt));

        //amt = (EditText)findViewById(R.id.numb);

    }

    private static final String[] cryptos = new String[] {
            "USD", "BTC", "ETH", "LTC", "XRP"
    };

    private EditText entamt;
    private TextView textout;


    String p;
    double preconv;

    public void convert(View view) {


        textout = (TextView) findViewById(R.id.res);
        //textout.setText(entamt.getText());

        try {
            entamt = (EditText) findViewById(R.id.numb);
            p = entamt.getText().toString();
            preconv = Double.parseDouble(p); //this is the double value of the entered amount
        } catch (NumberFormatException e) {
        }


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, cryptos);
        AutoCompleteTextView textView = (AutoCompleteTextView)
                findViewById(R.id.Crypto);
        textView.setAdapter(adapter);

        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, cryptos);
        AutoCompleteTextView textView2 = (AutoCompleteTextView)
                findViewById(R.id.FinalCurr);
        textView2.setAdapter(adapter2);

        inputText1 = textView.getText().toString();
        inputText2 = textView2.getText().toString();



        CharSequence postconv;


        //amtEntered = Float.valueOf(amount);

//        TextView output = (TextView) findViewById(R.id.res);
//        output.setText(amt.getText());
        //num = Float.valueOf(amtEntered);
        NumberFormat nf = new DecimalFormat("####.0000");


        CharSequence error2 = "Please check input fields.";




        // handle error if none of these was typed in --> error will come if incorrect inputtext1, doesn't matter if inputtext2 is right or not initially
        if (inputText1.equals("USD")) {
            if (inputText2.equals("USD")) {
//                TextView output = (TextView) findViewById(R.id.res);
//                output.setText(amt.toString());

//                entamt = entamt * 2;
//                textout.setText(entamt.getText());
                //double x = 0;
                postconv = String.valueOf(nf.format(preconv));
                textout.setText(postconv);
            }
            else if (inputText2.equals("BTC")) {
                postconv = String.valueOf(nf.format(preconv * 0.000088));
                textout.setText(postconv);
            }
            else if (inputText2.equals("ETH")) {
                postconv = String.valueOf(nf.format(preconv * 0.0009138751285));
                textout.setText(postconv);
            }
            else if (inputText2.equals("LTC")) {
                postconv = String.valueOf(nf.format(preconv * 0.00550));
                textout.setText(postconv);
            }
            else if (inputText2.equals("XRP")) {
                postconv = String.valueOf(nf.format(preconv * 0.7874015748));
                textout.setText(postconv);
            }
            else {
                textout.setText(error2);
            }
        }
        else if(inputText1.equals("BTC")) {
            if (inputText2.equals("USD")) {
                postconv = String.valueOf(nf.format(preconv * 11490.30));
                textout.setText(postconv);
            }
            else if (inputText2.equals("BTC")) {
                postconv = String.valueOf(nf.format(preconv));
                textout.setText(postconv);
            }
            else if (inputText2.equals("ETH")) {
                postconv = String.valueOf(nf.format(preconv * 10.26845638));
                textout.setText(postconv);
            }
            else if (inputText2.equals("LTC")) {
                postconv = String.valueOf(nf.format(preconv * 63.14149590));
                textout.setText(postconv);
            }
            else if (inputText2.equals("XRP")) {
                postconv = String.valueOf(nf.format(preconv * 9185));
                textout.setText(postconv);
            }
            else {
                textout.setText(error2);
            }
        }
        else if(inputText1.equals("ETH")) {
            if (inputText2.equals("USD")) {
                postconv = String.valueOf(nf.format(preconv * 1118.99));
                textout.setText(postconv);
            }
            else if (inputText2.equals("BTC")) {
                postconv = String.valueOf(nf.format(preconv * 0.09738562));
                textout.setText(postconv);
            }
            else if (inputText2.equals("ETH")) {
                postconv = String.valueOf(nf.format(preconv));
                textout.setText(postconv);
            }
            else if (inputText2.equals("LTC")) {
                postconv = String.valueOf(nf.format(preconv * 6.14907378));
                textout.setText(postconv);
            }
            else if (inputText2.equals("XRP")) {
                postconv = String.valueOf(nf.format(preconv * 894.46211891));
                textout.setText(postconv);
            }
            else {
                textout.setText(error2);
            }
        }
        else if(inputText1.equals("LTC")) {
            if (inputText2.equals("USD")) {
                postconv = String.valueOf(nf.format(preconv * 181.98));
                textout.setText(postconv);
            }
            else if (inputText2.equals("BTC")) {
                postconv = String.valueOf(nf.format(preconv * 0.01583745));
                textout.setText(postconv);
            }
            else if (inputText2.equals("ETH")) {
                postconv = String.valueOf(nf.format(preconv * 0.16262612));
                textout.setText(postconv);
            }
            else if (inputText2.equals("LTC")) {
                postconv = String.valueOf(nf.format(preconv));
                textout.setText(postconv);
            }
            else if (inputText2.equals("XRP")) {
                postconv = String.valueOf(nf.format(preconv * 145.46290227));
                textout.setText(postconv);
            }
            else {
                textout.setText(error2);
            }
        }
        else if(inputText1.equals("XRP")) {
            if (inputText2.equals("USD")) {
                postconv = String.valueOf(nf.format(preconv * 1.25));
                textout.setText(postconv);
            }
            else if (inputText2.equals("BTC")) {
                postconv = String.valueOf(nf.format(preconv * 0.00010888));
                textout.setText(postconv);
            }
            else if (inputText2.equals("ETH")) {
                postconv = String.valueOf(nf.format(preconv * 0.00111799));
                textout.setText(postconv);
            }
            else if (inputText2.equals("LTC")) {
                postconv = String.valueOf(nf.format(preconv * 0.00687461));
                textout.setText(postconv);
            }
            else if (inputText2.equals("XRP")) {
                postconv = String.valueOf(nf.format(preconv));
                textout.setText(postconv);
            }
            else {
                textout.setText(error2);
            }
        }
        else {
            //error handle

        }


        //

//        if (!inputText1.equals("USD") || !inputText1.equals("BTC") || !inputText1.equals("ETH") || !inputText1.equals("LTC") || !inputText1.equals("XRP")) {
//            CharSequence c;
//            c = "Please check input fields.";
//            textout.setText(c);
//
//        }

        // if statements for conversion calculations
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
