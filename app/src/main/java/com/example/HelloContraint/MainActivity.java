package com.example.HelloContraint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount= 0;
    private TextView mShowCount;
    private Button button_zero;
    private Button button_count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.Shown_count);
        button_zero = (Button) findViewById(R.id.button_zero);
        button_count = (Button) findViewById(R.id.button_count);
    }
    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message,
                Toast.LENGTH_SHORT);
        toast.show();
    }
    public void countUp(View view) {
        ++mCount;
        mShowCount.setText(Integer.toString(mCount));
        if (mShowCount != null)
            button_zero.setBackgroundColor(getResources().getColor(R.color.red));

        if(mCount%2==0)
        {
            button_count.setBackgroundColor(getResources().getColor(R.color.green));
        }
        else
            button_count.setBackgroundColor(getResources().getColor(R.color.yellow));
    }
    public void ChangeCount(View view) {
        mCount=0;
        if (mShowCount != null)
            button_zero.setBackgroundColor(getResources().getColor(R.color.grey));
            mShowCount.setText(Integer.toString(mCount));
    }
}