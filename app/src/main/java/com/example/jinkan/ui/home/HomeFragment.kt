package com.example.jinkan.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import com.example.jinkan.databinding.FragmentHomeBinding
import com.example.jinkan.models.Top
import com.example.jinkan.recy.Adapterrecy

class HomeFragment : Fragment() {

    private lateinit var viewModelJinkan: ViewModelJinkan
    lateinit var binding: FragmentHomeBinding

    // This property is only valid between onCreateView and
    // onDestroyView.
    lateinit var adapterView: Adapterrecy

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        binding = FragmentHomeBinding.inflate(layoutInflater)
        viewModelJinkan = ViewModelProvider(this).get(ViewModelJinkan::class.java)


        viewModelJinkan.list.observe(viewLifecycleOwner) {

            with(binding.recy) {
                adapterView =
                    Adapterrecy(it, requireContext(), object : Adapterrecy.onClikcsListainer {
                        override fun onclikBundler(top: Top) {


                             val action =HomeFragmentDirections.actionNavigationHomeToDetailss(top.title,top.imageUrl,top.type,top.startDate,top.rank)
                            requireView().findNavController().navigate(action)

                            Toast.makeText(requireContext(), "premuto", Toast.LENGTH_SHORT).show()


                        }

                    })
                adapter = adapterView
                setHasFixedSize(true)

                layoutManager = GridLayoutManager(requireContext(), 2)


            }



        }




        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }
}