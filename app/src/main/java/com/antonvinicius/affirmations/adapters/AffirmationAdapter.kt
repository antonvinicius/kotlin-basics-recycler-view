package com.antonvinicius.affirmations.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.antonvinicius.affirmations.databinding.ListItemBinding
import com.antonvinicius.affirmations.models.Affirmation

class AffirmationAdapter(
    private val context: Context, private val dataSet: List<Affirmation>
) : RecyclerView.Adapter<AffirmationAdapter.AffirmationViewHolder>() {

    class AffirmationViewHolder(private val binding: ListItemBinding) : ViewHolder(binding.root) {
        fun bind(title: String, imageResourceId: Int) {
            binding.itemTitle.text = title
            binding.imagePicture.setImageResource(imageResourceId)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AffirmationViewHolder {
        val affirmationBinding = ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AffirmationViewHolder(affirmationBinding)
    }

    override fun onBindViewHolder(holder: AffirmationViewHolder, position: Int) {
        val affirmation = dataSet[position]
        holder.bind(context.getString(affirmation.stringResourceId), affirmation.imageResourceId)
    }

    override fun getItemCount() = dataSet.size
}