package khvorostov.example.com

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class whatIsThisPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_what_is_this_page)
    }
    fun toMain(view: View) {
        val main = Intent (this, MainActivity::class.java)
        startActivity(main)
    }
}