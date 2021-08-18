package com.example.rc

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class Adapter(
    private var dataUser: ArrayList<User>
    ) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return AdapterViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is AdapterViewHolder){
            holder.onBind(dataUser[position])
        }
    }

    override fun getItemCount(): Int {
        return dataUser.size
    }

    class AdapterViewHolder constructor(
        itemView: View
    ) : RecyclerView.ViewHolder(itemView) {

        private val textViews = arrayListOf<TextView>(
            itemView.findViewById(R.id.tv_nama),
            itemView.findViewById(R.id.tv_producer),
            itemView.findViewById(R.id.tv_pesan)
        )
        val imgView = itemView.findViewById<ImageView>(R.id.iv_chara)

        fun onBind(user : User){
            val data = arrayListOf<String>(
                user.getNama(),
                user.getProducer(),
                user.getPesan()
            )
            val img = user.getImg()
            textViews.forEachIndexed { index, textView ->
                textView.text = data[index]
            }
            Glide.with(itemView.context)
                .load(img)
                .into(imgView)
            itemView.setOnClickListener {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(user.getLink()))
                itemView.context.startActivity(intent)
            }
        }



    }

}