package com.example.mylearn

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.mylearn.databinding.FragmentFirstBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FirstFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FirstFragment : Fragment() {

    private var binding: FragmentFirstBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFirstBinding.inflate(inflater, container, false)

        binding?.tvopenBottomSheet?.setOnClickListener {
            findNavController().navigate(R.id.bottomSheet)
        }

        binding?.txt1?.setOnClickListener {
            val num = binding?.etNum?.text?.toString() ?: "7"
            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(
                num = num.toInt(),
                user = null
            )
            findNavController().navigate(action)
        }

        return binding?.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

}