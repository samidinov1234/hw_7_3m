package com.example.hw_7_3m

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hw_7_3m.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding
    private val list = arrayListOf(
        Playlist("Мирбек Атабеков", "Моя любимая", "2:59"),
        Playlist("Hiro", "Люби", "3:07"),
        Playlist("Мирбек Атабеков", "Кечки Бишкек", "4:21"),
        Playlist("Rvmvn", "За душу мою", "3:12"),
        Playlist("TUMA", "Брюнетка", "2:45"),
        Playlist("WSB", "Любовь", "2:30"),
        Playlist("Скриптонит , Ulukmanapo", "До конца", "0:44"),
        Playlist("Nuricko , Ulukmanapo", "С тобой", "0:57"),
        Playlist("Yurrvch", "Боль внутри", "1:56"),
        Playlist("Ulukmanapo", "Моя Принцесса", "3:44"),
    )
    private val adapter = PlaylistAdapter(list, this::onClick)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.playlistRv.adapter = adapter
    }

    fun onClick(model:Playlist){
        val intent = Intent(requireActivity(), SecondActivity::class.java)
        intent.putExtra("model", model)
        startActivity(intent)
    }
}