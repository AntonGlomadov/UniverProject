package ru.glomadov.univerproject.ui

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import ru.glomadov.univerproject.R
import ru.glomadov.univerproject.databinding.FragmentEventsBinding

class Holidays : Fragment() {

    companion object {
        fun newInstance() = Holidays()
    }

    private lateinit var holidaysViewModel: HolidaysViewModel
    private var _binding: FragmentEventsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        holidaysViewModel =
            ViewModelProvider(this).get(holidaysViewModel::class.java)

        _binding = FragmentEventsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textEvents
        holidaysViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root     }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}