package vn.linh.androidgetrawx

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnTouchListener { v, event ->
            if (event.action == MotionEvent.ACTION_DOWN) {
                Log.i("TAG", "event " + event.rawX + "event " + event.x)
                Log.i("TAG", "layout2 " + layout_2.x + "layout3 " + layout_3.x + " button " + button.x)
            }
            false
        }
    }
}
