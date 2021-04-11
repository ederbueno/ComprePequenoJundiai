package br.com.edma.comprepequenojundiai.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.edma.comprepequenojundiai.Model.Menu
import br.com.edma.comprepequenojundiai.Model.Restaurant
import br.com.edma.comprepequenojundiai.R
import br.com.edma.comprepequenojundiai.adapter.RestaurantAdapter

class HomeActivity : AppCompatActivity() {

    val recycler by lazy { findViewById<RecyclerView>(R.id.recycler_view) }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val restaurant = getRestaurants()

        recycler.layoutManager = LinearLayoutManager(this)


        val adapter = RestaurantAdapter(restaurant)
        recycler.adapter = adapter

    }

    private fun getRestaurants() : MutableList<Restaurant>{
        val restaurantList = mutableListOf<Restaurant>()
        restaurantList.add(
            Restaurant(
                "Villa Pizza Bar",
                "R. São Francisco de Assis, 63 - Anhangabaú, Jundiaí - SP",
                "Fecha às 22:00",
                R.drawable.pizza,
                getMenu()
            )
        )

        restaurantList.add(
            Restaurant(
                "Villa Pizza Bar",
                "R. São Francisco de Assis, 63 - Anhangabaú, Jundiaí - SP",
                "Fecha às 22:00",
                R.drawable.pizza,
                getMenu()
            )
        )

        restaurantList.add(
            Restaurant(
                "Villa Pizza Bar",
                "R. São Francisco de Assis, 63 - Anhangabaú, Jundiaí - SP",
                "Fecha às 22:00",
                R.drawable.pizza,
                getMenu()
            )
        )

        restaurantList.add(
            Restaurant(
                "Villa Pizza Bar",
                "R. São Francisco de Assis, 63 - Anhangabaú, Jundiaí - SP",
                "Fecha às 22:00",
                R.drawable.pizza,
                getMenu()
            )
        )

        restaurantList.add(
            Restaurant(
                "Villa Pizza Bar",
                "R. São Francisco de Assis, 63 - Anhangabaú, Jundiaí - SP",
                "Fecha às 22:00",
                R.drawable.pizza,
                getMenu()
            )
        )

        return restaurantList
}

    private fun getMenu():  MutableList<Menu>{
        val menuList = mutableListOf<Menu>()

        menuList.add(
            Menu(
                "Pizza Com Alguma Coisa",
                "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis.",
                R.drawable.pizza
            )
        )

        menuList.add(
            Menu(
                "Pizza Com Alguma Coisa",
                "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis.",
                R.drawable.pizza
            )
        )

        menuList.add(
            Menu(
                "Pizza Com Alguma Coisa",
                "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis.",
                R.drawable.pizza
            )
        )

        menuList.add(
            Menu(
                "Pizza Com Alguma Coisa",
                "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis.",
                R.drawable.pizza
            )
        )

        menuList.add(
            Menu(
                "Pizza Com Alguma Coisa",
                "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis.",
                R.drawable.pizza
            )
        )

        menuList.add(
            Menu(
                "Pizza Com Alguma Coisa",
                "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem accusant doloremque laudantium, totam rem aperiam eaque ipsa, quae ab illo inventore veritatis.",
                R.drawable.pizza
            )
        )

        return menuList

    }
}