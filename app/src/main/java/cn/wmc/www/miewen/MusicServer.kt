package cn.wmc.www.miewen

import android.app.Service
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder

class MusicServer : Service() {

    var mp : MediaPlayer? = null;
    override fun onBind(intent: Intent?): IBinder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onDestroy() {
        super.onDestroy()
        mp!!.stop()
    }
    override fun onStart(intent: Intent?, startId: Int) {
        super.onStart(intent, startId)

        if(mp == null){
            mp = MediaPlayer.create(this,R.raw.bl)
            mp!!.isLooping = true
            mp!!.start()
        }
    }

}