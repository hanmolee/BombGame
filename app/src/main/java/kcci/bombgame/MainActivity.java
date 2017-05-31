package kcci.bombgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
{
    public static final String NAME_LINE_COUNT = "lineCount";
    private ImageView imageViewLineNumber;
    private int lineCount = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageViewStart =
                (ImageView)findViewById(R.id.imageViewStart);
        imageViewStart.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent =new Intent(MainActivity.this,
                        PlayActivity.class);

                intent.putExtra(NAME_LINE_COUNT, lineCount);

                startActivity(intent);
            }
        });

        ImageView imageViewLeft =
                (ImageView)findViewById(R.id.imageViewLeft);
        ImageView imageViewRight =
                (ImageView)findViewById(R.id.imageViewRight);
        imageViewLineNumber =
                (ImageView)findViewById(R.id.imageViewLineNumber);

        imageViewLeft.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(lineCount>2) {
                    lineCount--;
                    setLineCountImage(lineCount);
                }
            }
        });

        imageViewRight.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(lineCount<9) {
                    lineCount++;
                    setLineCountImage(lineCount);
                }
            }
        });


    }

    private void setLineCountImage(int lineCount)
    {
        switch (lineCount) {
            case 2: imageViewLineNumber
                    .setImageResource(R.drawable.n2);
                break;
            case 3:imageViewLineNumber
                    .setImageResource(R.drawable.n3);
                break;
            case 4:imageViewLineNumber
                    .setImageResource(R.drawable.n4);
                break;
            case 5:imageViewLineNumber
                    .setImageResource(R.drawable.n5);
                break;
            case 6:imageViewLineNumber
                    .setImageResource(R.drawable.n6);
                break;
            case 7:imageViewLineNumber
                    .setImageResource(R.drawable.n7);
                break;
            case 8:imageViewLineNumber
                    .setImageResource(R.drawable.n8);
                break;
            case 9:imageViewLineNumber
                    .setImageResource(R.drawable.n9);
                break;
        }
    }
}













