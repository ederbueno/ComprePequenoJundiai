package br.com.edma.comprepequenojundiai.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.edma.comprepequenojundiai.Model.Menu
import br.com.edma.comprepequenojundiai.R
import br.com.edma.comprepequenojundiai.adapter.MenuAdapter
import org.w3c.dom.Text

class RestaurantDetailsActivity : AppCompatActivity() {

    val recycler by lazy {findViewById<RecyclerView>(R.id.rv_menu)}
    val btnBack by lazy { findViewById<Button>(R.id.btn_back) }
    val restaurantName by lazy { findViewById<TextView>(R.id.tv_restaurant)}
    val restaurantImage by lazy { findViewById<ImageView>(R.id.img_restaurant)}


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaurant_details)

        val info = intent.extras
        val menu = info?.getSerializable("MENU") as MutableList<Menu>
        val name = info.getString("NOME")
        val imagem = info.getInt("IMAGEM")

        if(name !=null && imagem != null){
            restaurantName.text = name
            restaurantImage.setImageResource(imagem)
        }

        recycler.layoutManager = GridLayoutManager(this, 2)

        val adapter = MenuAdapter(menu)
        recycler.adapter = adapter

        btnBack.setOnClickListener {
            onBackPressed()
        }
    }
}