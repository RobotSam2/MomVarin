package com.example.samrobot.momvarin;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    GridLayout mainGrid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainGrid = (GridLayout)findViewById(R.id.mainGrid);

        // set event
        //setSingleEvent(mainGrid);
        setToggleEvent(mainGrid);
    }
    private void setToggleEvent(GridLayout mainGrid){
        // loop all child item of main grid
        for (int i=0;i<mainGrid.getChildCount();i++){
            // You can see all child item is card view so we just cast object to card view
            final CardView cardView = (CardView)mainGrid.getChildAt(i);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (cardView.getCardBackgroundColor().getDefaultColor() == -1)
                    {
                        // Chane background color
                        cardView.setCardBackgroundColor(Color.parseColor("#FF6F00"));
                        Toast.makeText(MainActivity.this, "State : True", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                        Toast.makeText(MainActivity.this, "State : False", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }
    private void setSingleEvent(GridLayout mainGrid){
        // loop all child item of main grid
        for (int i=0;i<mainGrid.getChildCount();i++)
        {
            // You can see all child item is card view so we just cast object to card view
            CardView cardView = (CardView)mainGrid.getChildAt(i);
            final int filalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Here you can replace Toast new Activity code
                    Toast.makeText(MainActivity.this, "Can Clicked Index" + filalI, Toast.LENGTH_SHORT).show();

                }
            });
        }
    }
}


// this is  my test git uploaded to git server
