package khvorostov.example.com

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class GitActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_git)
    }
    fun toMain(view: View) {
        val main = Intent (this, MainActivity::class.java)
        startActivity(main)
    }
}