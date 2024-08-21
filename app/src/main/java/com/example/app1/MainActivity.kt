package com.example.app1
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    lateinit var diceImage:ImageView;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.main_activity);
        val clickbait: Button = findViewById(R.id.button);
        diceImage=findViewById(R.id.imageView);
        clickbait.setOnClickListener {
            exchange();
        }
    }
    private fun exchange() {
        val randomNum = Random.nextInt(1,7);
        val diceNumber  = when(randomNum){
              1->R.drawable.dice_1;
              2->R.drawable.dice_2;
              3->R.drawable.dice_3;
              4->R.drawable.dice_4;
              5->R.drawable.dice_5;
             else -> R.drawable.dice_6;
        }
        diceImage.setImageResource(diceNumber);
    }
}

