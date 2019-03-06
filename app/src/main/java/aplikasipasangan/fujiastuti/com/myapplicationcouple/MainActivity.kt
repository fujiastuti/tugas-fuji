package aplikasipasangan.fujiastuti.com.myapplicationcouple

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnMatch.setOnClickListener {Pasangan()}
    }

    fun Pasangan() {
        val randomCowo = Random().nextInt (3)+1
        val randomCewe = Random().nextInt (3)+1
        val drawableResCewe = when (randomCewe) {
            1-> R.drawable.cewe1
            2-> R.drawable.cewe2
            else -> R.drawable.cewe3
        }
        val drawableResCowo = when (randomCowo) {
            1->R.drawable.cowo1
            2->R.drawable.cowo2
            else -> R.drawable.cowo3
        }
        ivDadul.setImageResource (drawableResCewe)
        ivDadu2.setImageResource(drawableResCowo)
    }
}
