package cn.wmc.www.miewen

import android.graphics.Color
import android.media.MediaPlayer
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    var mp : MediaPlayer?= null ;

    var btn_hi:Button? = null;
    var btn_bl:Button? = null;
    var btn_low:Button? = null;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mp =  MediaPlayer.create(this, R.raw.bl);
        mp!!.start();

        btn_hi = findViewById(R.id.btn_hi)
        btn_bl = findViewById(R.id.btn_bl)
        btn_low = findViewById(R.id.btn_low)
    }

    var imgId = 0;
    fun changeImg(view: View){
        var img = findViewById<ImageView>(R.id.imageView)
        var img2 = findViewById<ImageView>(R.id.imageView2)
        if(imgId == 0){
            img.setImageResource(R.mipmap.fly)
            img2.setImageResource(R.mipmap.close)
            imgId  = 1;
            mp!!.pause();
        }else{
            img.setImageResource(R.mipmap.logo)
            img2.setImageResource(R.mipmap.open)
            imgId  = 0
            mp!!.start();
        }

    }

    fun hi(view: View){
        changeBtnCor(1)
        mp!!.stop()
        mp =  MediaPlayer.create(this, R.raw.hi);
        mp!!.start();
        mp!!.isLooping =true
    }fun bl(view: View){
        changeBtnCor(2)
        mp!!.stop()
        mp =  MediaPlayer.create(this, R.raw.bl);
        mp!!.start();
        mp!!.isLooping =true
    }fun low(view: View){
        changeBtnCor(3)
        mp!!.stop()
        mp =  MediaPlayer.create(this, R.raw.low);
        mp!!.start();
        mp!!.isLooping =true
    }


    fun changeBtnCor(index:Int){
        when(index){
            1 ->{
                btn_hi!!.setTextColor(Color.BLACK)
                btn_bl!!.setTextColor(Color.WHITE)
                btn_low!!.setTextColor(Color.WHITE)
            }
            2 ->{
                btn_hi!!.setTextColor(Color.WHITE)
                btn_bl!!.setTextColor(Color.BLACK)
                btn_low!!.setTextColor(Color.WHITE)
            }
            3 ->{
                btn_hi!!.setTextColor(Color.WHITE)
                btn_bl!!.setTextColor(Color.WHITE)
                btn_low!!.setTextColor(Color.BLACK)
            }
        }
    }
}

