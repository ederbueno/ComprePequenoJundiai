package br.com.edma.comprepequenojundiai.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import br.com.edma.comprepequenojundiai.Model.Menu
import br.com.edma.comprepequenojundiai.R

class MenuDetailsActivity : AppCompatActivity() {

    val btnBack by lazy { findViewById<Button>(R.id.btn_back)}
    val menuName by lazy { findViewById<TextView>(R.id.tv_menu) }
    val menuDesc by lazy { findViewById<TextView>(R.id.tv_desc)}
    val menuImage by lazy { findViewById<ImageView>(R.id.img_menu)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_details)

        val info = intent.extras

        val name = info?.getString("NOME")
        val desc = info?.getString("DESC")
        val img = info?.getInt("IMAGEM")

        if(name != null && desc != null &&  img != null){
             val menu = Menu(name, desc, img)

             menuName.text = menu.name
             menuDesc.text = menu.descripton
             menuImage.setImageResource(img)

        }

        btnBack.setOnClickListener{
            onBackPressed()
        }


    }
}