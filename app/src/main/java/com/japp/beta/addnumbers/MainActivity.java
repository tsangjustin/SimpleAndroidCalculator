package com.japp.beta.addnumbers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
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
    public boolean onOptionsItemSelected(MenuItem item)
    {
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

    public void onAddButtonClick(View v)
    {
        long num1, num2, sum;

        EditText e1 = (EditText)findViewById(R.id.num1Input);
        EditText e2 = (EditText)findViewById(R.id.num2Input);
        TextView t1 = (TextView)findViewById(R.id.userResult);

        if (!e1.getText().toString().equals("") && !e2.getText().toString().equals(""))
        {
            num1 = Long.parseLong(e1.getText().toString());
            num2 = Long.parseLong(e2.getText().toString());
            sum = num1 + num2;
            t1.setText(Long.toString(sum));
            e1.setText("");
            e2.setText("");
        }
    }

    public void onSubtractButtonClick(View v)
    {
        long num1, num2, sum;

        EditText e1 = (EditText)findViewById(R.id.num1Input);
        EditText e2 = (EditText)findViewById(R.id.num2Input);
        TextView t1 = (TextView)findViewById(R.id.userResult);

        if (!e1.getText().toString().equals("") && !e2.getText().toString().equals(""))
        {
            num1 = Long.parseLong(e1.getText().toString());
            num2 = Long.parseLong(e2.getText().toString());
            sum = num1 - num2;
            t1.setText(Long.toString(sum));
            e1.setText("");
            e2.setText("");
        }
    }

    public void onMultiplyButtonClick(View v)
    {
        long num1, num2, sum;

        EditText e1 = (EditText)findViewById(R.id.num1Input);
        EditText e2 = (EditText)findViewById(R.id.num2Input);
        TextView t1 = (TextView)findViewById(R.id.userResult);

        if (!e1.getText().toString().equals("") && !e2.getText().toString().equals(""))
        {
            num1 = Long.parseLong(e1.getText().toString());
            num2 = Long.parseLong(e2.getText().toString());
            sum = num1 * num2;
            t1.setText(Long.toString(sum));
            e1.setText("");
            e2.setText("");
        }
    }

    public void onDivideButtonClick(View v)
    {
        long num1, num2, sum;

        EditText e1 = (EditText)findViewById(R.id.num1Input);
        EditText e2 = (EditText)findViewById(R.id.num2Input);
        TextView t1 = (TextView)findViewById(R.id.userResult);

        if (!e1.getText().toString().equals("") && !e2.getText().toString().equals(""))
        {
            num1 = Long.parseLong(e1.getText().toString());
            num2 = Long.parseLong(e2.getText().toString());
            if (num2 == 0)
            {
                t1.setText("Inf");
            }
            else
            {
                sum = num1 / num2;
                t1.setText(Long.toString(sum));
            }
            e1.setText("");
            e2.setText("");
        }
    }

    public void onClearButtonClick(View v)
    {
        EditText e1 = (EditText)findViewById(R.id.num1Input);
        EditText e2 = (EditText)findViewById(R.id.num2Input);
        TextView t1 = (TextView)findViewById(R.id.userResult);

        e1.setText("");
        e2.setText("");
        t1.setText("");
    }

    public void onConvBinary(View v)
    {
        long num1;
        EditText e1 = (EditText)findViewById(R.id.num1Input);
        TextView t1 = (TextView)findViewById(R.id.userResult);

        if (!e1.getText().toString().equals(""))
        {
            num1 = Long.parseLong(e1.getText().toString());
            t1.setText(Long.toBinaryString(num1));
            e1.setText("");
        }
    }

    public void onConvHexadecimal(View v)
    {
        long num1;
        EditText e1 = (EditText)findViewById(R.id.num1Input);
        TextView t1 = (TextView)findViewById(R.id.userResult);

        if (!e1.getText().toString().equals(""))
        {
            num1 = Long.parseLong(e1.getText().toString());
            t1.setText(Long.toHexString(num1));
            e1.setText("");
        }
    }
}
