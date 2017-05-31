package kcci.bombgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Vector;

public class PlayActivity extends AppCompatActivity
{
    private ImageView[] arrayLine = new ImageView[9];
    private int lineBomb = 0;

    View.OnClickListener listener = new View.OnClickListener()
    {
        @Override
        public void onClick(View v)
        {
            switch (v.getId()) {
                case R.id.imageViewLine1:
                    arrayLine[0].setImageResource(R.drawable.c1);
                    if(lineBomb==0) gameOver();
                    break;
                case R.id.imageViewLine2:
                    arrayLine[1].setImageResource(R.drawable.c2);
                    if(lineBomb==1) gameOver();
                    break;
                case R.id.imageViewLine3:
                    arrayLine[2].setImageResource(R.drawable.c3);
                    if(lineBomb==2) gameOver();
                    break;
                case R.id.imageViewLine4:
                    arrayLine[3].setImageResource(R.drawable.c4);
                    if(lineBomb==3) gameOver();
                    break;
                case R.id.imageViewLine5:
                    arrayLine[4].setImageResource(R.drawable.c5);
                    if(lineBomb==4) gameOver();
                    break;
                case R.id.imageViewLine6:
                    arrayLine[5].setImageResource(R.drawable.c6);
                    if(lineBomb==5) gameOver();
                    break;
                case R.id.imageViewLine7:
                    arrayLine[6].setImageResource(R.drawable.c7);
                    if(lineBomb==6) gameOver();
                    break;
                case R.id.imageViewLine8:
                    arrayLine[7].setImageResource(R.drawable.c8);
                    if(lineBomb==7) gameOver();
                    break;
                case R.id.imageViewLine9:
                    arrayLine[8].setImageResource(R.drawable.c9);
                    if(lineBomb==8) gameOver();
                    break;
            }
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);

        arrayLine[0] = (ImageView)findViewById(R.id.imageViewLine1);
        arrayLine[1] = (ImageView)findViewById(R.id.imageViewLine2);
        arrayLine[2] = (ImageView)findViewById(R.id.imageViewLine3);
        arrayLine[3] = (ImageView)findViewById(R.id.imageViewLine4);
        arrayLine[4] = (ImageView)findViewById(R.id.imageViewLine5);
        arrayLine[5] = (ImageView)findViewById(R.id.imageViewLine6);
        arrayLine[6] = (ImageView)findViewById(R.id.imageViewLine7);
        arrayLine[7] = (ImageView)findViewById(R.id.imageViewLine8);
        arrayLine[8] = (ImageView)findViewById(R.id.imageViewLine9);

        Intent intent = getIntent();
        int lineCount = intent.getIntExtra(MainActivity.NAME_LINE_COUNT,3);
        for(int i=0 ; i<lineCount; i++) {
            arrayLine[i].setVisibility(View.VISIBLE);
            arrayLine[i].setOnClickListener(listener);
        }

        lineBomb = (int)(Math.random()*lineCount);

        ImageView imageViewBack =
                (ImageView)findViewById(R.id.imageViewBack);
        imageViewBack.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                finish();
            }
        });
    }

    public void gameOver() {
        Intent intent = new Intent(PlayActivity.this,
                GameOverActivity.class);
        startActivity(intent);
        finish();
    }
}














