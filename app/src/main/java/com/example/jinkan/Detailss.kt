package com.example.jinkan

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.jinkan.databinding.FragmentDetailssBinding


class Detailss : Fragment() {
    val args : DetailssArgs by navArgs()

    lateinit var binding: FragmentDetailssBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentDetailssBinding.inflate(layoutInflater)



        binding.tTitolo.text=args.nome

        return binding.root


    }


}