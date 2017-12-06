package pmc.intent5;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MultipleAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple);
    }

    public void openSecond(View v){
        Intent i=new Intent(this,SecondActivity.class);
        startActivity(i);
    }

    public void openThird(View v){
        Intent i=new Intent(this,ThirdActivity.class);
        startActivity(i);
    }
}
