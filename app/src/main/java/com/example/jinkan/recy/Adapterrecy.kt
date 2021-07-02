package com.example.jinkan.recy

import android.app.Application
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.jinkan.databinding.RecyItemLayoutBinding
import com.example.jinkan.models.Myapp
import com.example.jinkan.models.Top


class Adapterrecy(private val dataSet: List<Top>,val context: Context,val onClickListener: onClikcsListainer) :
    RecyclerView.Adapter<Adapterrecy.ViewHolder>() {



    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    inner class ViewHolder(val binding: RecyItemLayoutBinding) : RecyclerView.ViewHolder(binding.root)


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

        viewHolder.binding.tTitolo.text = dataSet[position].title
        Glide.with(context).load(dataSet[position].imageUrl)
            .into(viewHolder.binding.imageView)

        viewHolder.binding.cardView.setOnClickListener {

            onClickListener.onclikBundler(top = dataSet[position])


        }


    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = dataSet.size


    interface  onClikcsListainer{

        fun onclikBundler(top: Top)

    }

}




