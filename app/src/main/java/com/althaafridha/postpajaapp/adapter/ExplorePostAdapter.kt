package com.althaafridha.resepibuapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.althaafridha.postpajaapp.R
import com.althaafridha.postpajaapp.data.Post
import com.althaafridha.postpajaapp.databinding.RowItemPostBinding
import com.bumptech.glide.Glide
import com.google.android.material.snackbar.Snackbar
import android.app.Activity
import android.content.Context
import com.althaafridha.postpajaapp.databinding.RowItemExploreBinding


class ExplorePostAdapter(private val listExplorePost: Array<String>): RecyclerView.Adapter<ExplorePostAdapter.MyViewHolder>() {
    inner class MyViewHolder(val binding: RowItemExploreBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MyViewHolder(
        RowItemExploreBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: ExplorePostAdapter.MyViewHolder, position: Int) {
        holder.binding.apply {
            Glide.with(ivExplorePostImage.context).load(listExplorePost[position]).into(ivExplorePostImage)
        }

    }

    override fun getItemCount(): Int = listExplorePost.size



}