package com.marvin.a08_navigation_02.ui.slideshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.marvin.a08_navigation_02.databinding.FragmentSlideshowBinding
import com.marvin.a08_navigation_02.R

class SlideshowFragment : Fragment() {

    private var _binding: FragmentSlideshowBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSlideshowBinding.inflate(inflater, container, false)
        val root: View = binding.root

        var text_notifications = root.findViewById<TextView>(R.id.text_slideshow)
        text_notifications.setText(R.string.message_notifications)

        return root
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}