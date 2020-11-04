package khvorostov.example.com

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun openNewYear(view: View) {
        val newYear = Intent (this, newYearImage::class.java)
        startActivity(newYear)
    }
    fun toMain(view: View) {
        val main = Intent (this, MainActivity::class.java)
        startActivity(main)
    }
    fun aboutYear(view: View) {
        val about = Intent (this, aboutNewYear::class.java)
        startActivity(about)
    }
    fun whatIsPage(view: View) {
        val pg = Intent (this, whatIsThisPage::class.java)
        startActivity(pg)
    }

}
