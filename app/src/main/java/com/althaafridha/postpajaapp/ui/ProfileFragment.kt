package com.althaafridha.postpajaapp.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.content.ContextCompat
import com.althaafridha.postpajaapp.PostActivity
import com.althaafridha.postpajaapp.PostDuactivity
import com.althaafridha.postpajaapp.R

class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val post1: ImageView = view.findViewById(R.id.post_1)
        val post2: ImageView = view.findViewById(R.id.post_2)

        post1.setOnClickListener {
            val intent = Intent(activity, PostActivity::class.java)
            startActivity(intent)
        }

        post2.setOnClickListener {
            val intent = Intent(activity, PostDuactivity::class.java)
            startActivity(intent)
        }

    }
}