package com.example.jinkan.recy

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.jinkan.databinding.RecyItemLayoutBinding
import com.example.jinkan.models.Top


class Adapterrecy(private val dataSet: List<Top>) :
    RecyclerView.Adapter<Adapterrecy.ViewHolder>() {

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    inner class ViewHolder(binding: RecyItemLayoutBinding) : RecyclerView.ViewHolder(binding.root) {
        val textView: TextView = binding.tTitolo
        val img: ImageView = binding.imageView
    }

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(
            RecyItemLayoutBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element

        viewHolder.textView.text = dataSet[position].title


    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = dataSet.size

}




