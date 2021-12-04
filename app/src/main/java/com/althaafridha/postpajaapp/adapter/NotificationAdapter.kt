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
import com.althaafridha.postpajaapp.data.Notification
import com.althaafridha.postpajaapp.data.PostData.listNotif
import com.althaafridha.postpajaapp.databinding.RowItemExploreBinding
import com.althaafridha.postpajaapp.databinding.RowItemNotifBinding


class NotificationAdapter(private val listNotificationLiked: ArrayList<Notification>): RecyclerView.Adapter<NotificationAdapter.MyViewHolder>() {
    inner class MyViewHolder(val binding: RowItemNotifBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = MyViewHolder(
        RowItemNotifBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: NotificationAdapter.MyViewHolder, position: Int) {
        holder.binding.apply {
            with(listNotificationLiked[position]){
                txtUserNotif.text = profileName
                txtHour.text = hour
                Glide.with(imgNotif.context).load(profileImage).into(imgNotif)
            }
        }

    }

    override fun getItemCount(): Int = listNotificationLiked.size



}