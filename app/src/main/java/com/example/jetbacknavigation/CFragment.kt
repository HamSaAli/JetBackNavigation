package com.example.jetbacknavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.jetbacknavigation.databinding.FragmentABinding
import com.example.jetbacknavigation.databinding.FragmentCBinding

class CFragment : Fragment() {

    lateinit var binding : FragmentCBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentCBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonGoToD.setOnClickListener{v ->
            Navigation.findNavController(v).navigate(R.id.action_CFragment_to_DFragment)
        }

    }
}