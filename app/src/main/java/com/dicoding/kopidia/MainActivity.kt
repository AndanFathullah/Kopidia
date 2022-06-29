package com.dicoding.kopidia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private  lateinit var rvKopi :RecyclerView
    private var list: ArrayList<Kopi> = arrayListOf()

    private fun showSelectedKopi(kopi: Kopi) {
        Toast.makeText(this, "Kamu memilih " + kopi.name, Toast.LENGTH_SHORT).show()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.profile, menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }
    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.profile -> {
                val moveIntent = Intent(this@MainActivity, profile::class.java)
                startActivity(moveIntent)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        rvKopi = findViewById(R.id.rv_heroes)
        rvKopi.setHasFixedSize(true)

        list.addAll(KopiData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvKopi.layoutManager = LinearLayoutManager(this)
        val listHeroAdapter = ListKopiAdapter(list)
        rvKopi.adapter = listHeroAdapter

        listHeroAdapter.setOnItemClickCallback(object : ListKopiAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Kopi) {
                val moveWithDataIntent = Intent(this@MainActivity, DetailActivity::class.java)

                moveWithDataIntent.putExtra(DetailActivity.EXTRA_NAME, data.name)
                moveWithDataIntent.putExtra(DetailActivity.EXTRA_IMG, data.photo)
                moveWithDataIntent.putExtra(DetailActivity.EXTRA_DETAIL, data.detail)

                startActivity(moveWithDataIntent)
            }
        })
    }
}