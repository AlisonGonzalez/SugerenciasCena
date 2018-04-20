package mx.itesm.edu.earthone.sugerenciascena

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    val cenas = arrayListOf("HotDog", "Comida china", "Tamales")
    val calorias = arrayListOf("290", "500", "153")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        comidaText.text = cenas[0] + " - " + calorias[0] + " calorías"

        agrega.setOnClickListener{
            val nuevaCena = nuevaText.text.toString()
            val nuevoCal = nuevoCaloria.text.toString()
            cenas.add(nuevaCena)
            calorias.add(nuevoCal)
            nuevaText.text.clear()
            nuevoCaloria.text.clear()
        }
        selecciona.setOnClickListener{
            val aleatorio = Random()
            val cenaAleatoria = aleatorio.nextInt(cenas.count())
            comidaText.text = cenas[cenaAleatoria] + " - " + calorias[cenaAleatoria] + " calorías"
        }
    }
}
