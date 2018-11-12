package `in`.biwin.kotlinfirst

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toastMe(view: View){
        val count  = findViewById(R.id.textView) as TextView
        val countString = count.text.toString()

        val myToast = Toast.makeText(this, "Current count is " + countString, Toast.LENGTH_SHORT)
        myToast.show()
    }

    fun countMe(view: View){
        val textViewValue = findViewById(R.id.textView) as TextView
        val countString = textViewValue.text.toString()
        var count: Int = Integer.parseInt(countString)
        count ++
        textViewValue.text = count.toString()
    }

    fun randomMe(view: View){
        val randomIntent = Intent(this, Main2Activity::class.java)
        startActivity(randomIntent)
    }

}
