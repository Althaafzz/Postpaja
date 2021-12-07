package com.althaafridha.postpajaapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.althaafridha.postpajaapp.R
import com.althaafridha.postpajaapp.data.PostData.listStatus
import com.althaafridha.postpajaapp.data.Status
import com.althaafridha.postpajaapp.databinding.RowItemStatusBinding
import com.bumptech.glide.Glide

class StatusAdapter(private val listStatus: ArrayList<Status>): RecyclerView.Adapter<StatusAdapter.MyViewHolder>(){
    inner class MyViewHolder(val binding: RowItemStatusBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MyViewHolder(
        RowItemStatusBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.apply {
            with(listStatus[position]){
                txtName.text = name
                Glide.with(imgStatus.context).load(img).into(imgStatus)
        }
    }
}

override fun getItemCount(): Int = listStatus.size

}
