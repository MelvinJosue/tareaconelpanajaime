package com.example.tareaconelpanajaime.ui.dashboard

import android.media.MediaPlayer
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.tareaconelpanajaime.R
import com.example.tareaconelpanajaime.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel =
            ViewModelProvider(this).get(DashboardViewModel::class.java)

        _binding = FragmentDashboardBinding.inflate(inflater, container, false)
        val root: View = binding.root
       var mp:MediaPlayer?=null
        mp=MediaPlayer.create(this.context, R.raw.ugb)
        val pausar=binding.btnpausa
        pausar.setOnClickListener {
            mp.stop()

        }
      val playstacion=binding.btnreproducir
        playstacion.setOnClickListener {
            mp.start()
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}