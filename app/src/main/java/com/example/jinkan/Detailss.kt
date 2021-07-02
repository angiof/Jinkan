package com.example.jinkan

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.example.jinkan.databinding.FragmentDetailssBinding


class Detailss : Fragment() {
    val args: DetailssArgs by navArgs()

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


        Glide.with(requireActivity()).load(args.url)
            .centerCrop()
            .into(binding.imgCopertina)

        binding.genere.text = "Genere : ${args.genere}"
        binding.tTitle.text = args.data
        binding.textView2.text = args.data
        binding.tRank.text=args.rank.toString()

        return binding.root


    }


}