package com.althaafridha.postpajaapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.althaafridha.postpajaapp.R
import com.althaafridha.postpajaapp.data.PostData
import com.althaafridha.postpajaapp.databinding.FragmentExploreBinding
import com.althaafridha.postpajaapp.databinding.FragmentHomeBinding
import com.althaafridha.resepibuapp.adapter.ExplorePostAdapter
import com.althaafridha.resepibuapp.adapter.PostAdapter

class ExploreFragment : Fragment() {
    private var _binding: FragmentExploreBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentExploreBinding.inflate(inflater, container, false)

        binding.rvExplore.apply {
            setHasFixedSize(true)

            layoutManager = GridLayoutManager(activity, 3)
            adapter = ExplorePostAdapter(PostData.exploreImage)

        }
        return binding.root
    }
}