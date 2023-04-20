package com.example.modulempat

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ClassAdapter (private val listHero: ArrayList<DataHero>, private val context: Context
): RecyclerView.Adapter<ClassAdapter.CourseViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CourseViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.activity_data_hero,
            parent, false
        )
        return CourseViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CourseViewHolder, position: Int) {
        holder.nama.text = listHero.get(position).Name
        holder.nim.text = listHero.get(position).Nim
        holder.role.text = listHero.get(position).Role
        holder.gambar.setImageResource(listHero.get(position).Img)
    }

    override fun getItemCount(): Int {
        return listHero.size
    }

    class CourseViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val gambar: ImageView = itemView.findViewById(R.id.idgambar)
        val nama: TextView = itemView.findViewById(R.id.idnama)
        val nim: TextView = itemView.findViewById(R.id.idnim)
        val role: TextView = itemView.findViewById(R.id.idrole)
    }

}