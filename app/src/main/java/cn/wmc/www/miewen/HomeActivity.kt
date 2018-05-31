package cn.wmc.www.miewen

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import java.util.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        var homeImg = findViewById<ImageView>(R.id.home_img);
        var random = Random()
        var i = random.nextInt(5)

        when(i){
            0 ->homeImg.setImageResource(R.mipmap.h_0)
            1 ->homeImg.setImageResource(R.mipmap.h_1)
            2 ->homeImg.setImageResource(R.mipmap.h_2)
            3 ->homeImg.setImageResource(R.mipmap.h_3)
            4 ->homeImg.setImageResource(R.mipmap.h_4)
            5 ->homeImg.setImageResource(R.mipmap.h_5)
            else -> homeImg.setImageResource(R.mipmap.h_0)
        }


        var intent = Intent(this,MainActivity::class.java);
        var timer = Timer();
        var timerTask = object : TimerTask(){
            override fun run() {
                startActivity(intent);
            }
        }
        timer.schedule(timerTask,1000*3);
    }


    fun toMain(view: View){
        var intent = Intent(this,MainActivity::class.java);
        startActivity(intent)
    }

}
