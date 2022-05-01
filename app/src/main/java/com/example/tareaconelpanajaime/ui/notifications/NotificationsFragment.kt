package com.example.tareaconelpanajaime.ui.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebChromeClient
import android.webkit.WebViewClient
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.tareaconelpanajaime.databinding.FragmentNotificationsBinding

class NotificationsFragment : Fragment() {

    private var _binding: FragmentNotificationsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val notificationsViewModel =
            ViewModelProvider(this).get(NotificationsViewModel::class.java)

        _binding = FragmentNotificationsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val sitio=binding.sitio3placa
        sitio.webChromeClient=object: WebChromeClient(){

        }
        sitio.webViewClient=object: WebViewClient(){

        }
        val settings=sitio.settings
        settings.javaScriptEnabled=true
        sitio.loadUrl("https://estudiantes.ugb.edu.sv/Calendarizacion")
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}