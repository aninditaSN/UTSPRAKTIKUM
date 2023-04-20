package com.example.modulempat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Activity2 : AppCompatActivity() {
    lateinit var recycle: RecyclerView
    lateinit var recyclerAdapter: ClassAdapter
    lateinit var listData: ArrayList<DataHero>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val btn: Button = findViewById(R.id.button)
        btn.setOnClickListener {
            val intent = Intent(this@Activity2, MainActivity::class.java)
            startActivity(intent)
        }

        recycle = findViewById(R.id.idRVCourses)
        recycle.setHasFixedSize(true)
        listData = ArrayList()

        val layoutManager = GridLayoutManager(this, 2)
        recycle.layoutManager = layoutManager
        recyclerAdapter = ClassAdapter(listData, this)

        recycle.adapter =  recyclerAdapter
        listData.add(DataHero("Beatrix", "210441100080", "Marksman", R.drawable.beatrix))
        listData.add(DataHero("Miya", "210441100070", "Marksman", R.drawable.miya))
        listData.add(DataHero("Esmeralda", "210441100060", "Tank", R.drawable.esmeralda))
        listData.add(DataHero("Hilda", "210441100050", "Tank", R.drawable.hilda))
        listData.add(DataHero("Zilong", "210441100040", "Assassin", R.drawable.zilong))
        listData.add(DataHero("Lancelot", "210441100030", "Assassin", R.drawable.lancelot))
        listData.add(DataHero("Badang", "210441100020", "Fighter", R.drawable.badang))
        listData.add(DataHero("Dyroth", "210441100010", "Fighter", R.drawable.dhyrot))
        listData.add(DataHero("Alice", "2104411000009", "Mage", R.drawable.alice))
        listData.add(DataHero("Kagura", "210441100008", "Mage", R.drawable.kagura))
        listData.add(DataHero("Nana", "210441100007", "Mage", R.drawable.nana))
        listData.add(DataHero("khufra", "2104411000006", "Tank", R.drawable.khufra))
        listData.add(DataHero("Ruby", "210441100005", "Tank", R.drawable.ruby))
        listData.add(DataHero("Ling", "210441100004", "Assassin", R.drawable.ling2))
        listData.add(DataHero("Fanny", "210441100003", "Assassin", R.drawable.fanny))
        listData.add(DataHero("Franco", "210441100002", "Tank", R.drawable.fran))
        listData.add(DataHero("Gatot kaca", "210441100045", "Fighter", R.drawable.gatot))
        listData.add(DataHero("Layla", "2104411000067", "Marksman", R.drawable.layla))
        listData.add(DataHero("Guinevere", "210441100089", "Fighter", R.drawable.guin))
        listData.add(DataHero("Yin", "210441100054", "Fighter", R.drawable.yin))
        listData.add(DataHero("Chou", "2104411000044", "Fighter", R.drawable.chou))
        listData.add(DataHero("Lunox", "2104411000088", "Mage", R.drawable.lun))
        listData.add(DataHero("Hylos", "210441100076", "Tank", R.drawable.hy))
        listData.add(DataHero("Julian", "21041000489", "Fighter", R.drawable.jul))
    }


        override fun onCreateOptionsMenu(menu: Menu?): Boolean {
            menuInflater.inflate(R.menu.options_menu, menu)
            return super.onCreateOptionsMenu(menu)
}

        override fun onOptionsItemSelected(item: MenuItem): Boolean {
            if (item.itemId == R.id.menu_list) { showList()
    } else if (item.itemId == R.id.menu_grid) {
        showGrid()
    }
    return super.onOptionsItemSelected(item)
}

private fun showGrid() {
    val layoutManager = GridLayoutManager(this, 2)
    recycle.layoutManager = layoutManager
    recyclerAdapter       = ClassAdapter(listData,this)
    recycle.adapter = recyclerAdapter
}

private fun showList() {
    val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    recycle.layoutManager = layoutManager
    recyclerAdapter       = ClassAdapter(listData,this)
    recycle.adapter = recyclerAdapter
}
}