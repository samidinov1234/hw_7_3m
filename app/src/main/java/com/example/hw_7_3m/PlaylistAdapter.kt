package com.example.hw_7_3m

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.hw_7_3m.databinding.ItemPlaylistBinding

class PlaylistAdapter(
    private val list: ArrayList<Playlist>,
    val onClick: (model: Playlist) -> Unit
) : Adapter<PlaylistAdapter.PlaylistViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaylistViewHolder {
        return PlaylistViewHolder(ItemPlaylistBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: PlaylistViewHolder, position: Int) {
        holder.bind(list[position])
    }

    inner class PlaylistViewHolder(private val binding:ItemPlaylistBinding) : ViewHolder(binding.root) {
        fun bind(playlist: Playlist)= with(binding) {
            tvName.text = playlist.songOwner
            tvMusicName.text = playlist.songName
            tvLength.text = playlist.length
            itemView.setOnClickListener{
                onClick(playlist)
            }
        }

    }
}