package com.example.tareaconelpanajaime.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebChromeClient
import android.webkit.WebViewClient
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.tareaconelpanajaime.databinding.FragmentHomeBinding
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root
        val sitio=binding.sitioplaca2
       sitio.webChromeClient=object:WebChromeClient(){

       }
       sitio.webViewClient=object:WebViewClient(){

       }
        val settings=sitio.settings
        settings.javaScriptEnabled=true
        sitio.loadUrl("https://estudiantes.ugb.edu.sv/Notas")
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}