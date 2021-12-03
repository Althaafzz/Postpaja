package com.althaafridha.postpajaapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.althaafridha.postpajaapp.R
import com.althaafridha.postpajaapp.data.PostData
import com.althaafridha.postpajaapp.databinding.FragmentHomeBinding
import com.althaafridha.resepibuapp.adapter.PostAdapter

class HomeFragment : Fragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding.rvHome.apply {
            setHasFixedSize(true)

            layoutManager = LinearLayoutManager(activity)
            adapter = PostAdapter(PostData.listPost)

        }
        return binding.root
    }
}