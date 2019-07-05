package com.e.group5currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText amountshillings;
    private TextView amountdollars;
    private Button   convert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





    }
    public  void convertMethod (View view){

        EditText amountshillings =(EditText) findViewById(R.id.et_amount_shillings_id);
        TextView amountdollars =(TextView) findViewById(R.id.tv_amount_dollars_id);

        Double shillingsamount =Double.parseDouble(amountshillings.getText().toString());

        Double dollarsamount =shillingsamount/100;

        amountdollars.setText(shillingsamount/100 + "");




    }




}
