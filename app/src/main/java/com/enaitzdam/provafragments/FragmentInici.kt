package com.enaitzdam.provafragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.enaitzdam.provafragments.databinding.FragmentIniciBinding

class FragmentInici : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = FragmentIniciBinding.inflate(inflater)

        binding.buttonGo?.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentInici_to_fragmentFinal, null)
        }

        return binding.root

    }
}
