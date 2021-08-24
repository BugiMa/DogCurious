package com.example.dogcurious.ui

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.dogcurious.R
import com.example.dogcurious.databinding.FragmentCurioListBinding

class CurioListFragment : Fragment() {

    private var _binding: FragmentCurioListBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModelCurio: SharedViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCurioListBinding.inflate(inflater, container, false)

        viewModelCurio = ViewModelProvider(this).get(SharedViewModel::class.java)



        return inflater.inflate(R.layout.fragment_curio_list, container, false)
    }
}