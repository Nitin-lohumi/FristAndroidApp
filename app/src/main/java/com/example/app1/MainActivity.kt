package com.example.app1
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    lateinit var diceImage:ImageView
    lateinit var body: View
    lateinit var changeMode:Button
    lateinit var clickbait: Button
    lateinit var textView:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.main_activity)
        textView = findViewById(R.id.textView)
        changeMode = findViewById(R.id.changeModeButton)
        body =  findViewById(R.id.body)
        changeMode.setOnClickListener {
            modes()
        }
        clickbait = findViewById(R.id.button)
        diceImage=findViewById(R.id.imageView)
        clickbait.setOnClickListener {
            exchange()
        }
    }

    private fun modes() {
        if(changeMode.text.equals("dark Mode")){
            body.setBackgroundResource(R.color.black)
            textView.setBackgroundResource(R.color.white)
            changeMode.text="Light mode"
            textView.text ="this is dark mode"
        }else{
            changeMode.text="dark Mode"
            textView.text ="Dice Rollar"
            textView.setBackgroundResource(R.color.black)
            body.setBackgroundResource(R.color.white)
            changeMode.setBackgroundResource(R.color.black)
        }
    }

    private fun exchange() {
        val randomNum = Random.nextInt(1,7)
        val diceNumber  = when(randomNum){
              1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(diceNumber)
    }
}

