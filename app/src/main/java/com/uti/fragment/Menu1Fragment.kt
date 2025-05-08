package com.uti.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

// TODO: Rename parameter arguments, choose names that match
// Mendefinisikan konstanta kunci untuk menyimpan parameter ke dalam Bundle
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Menu1Fragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class Menu1Fragment : Fragment() {
    // TODO: Rename and change types of parameters
    // Variabel yang menampung isi dari argument Bundle yang dikirim ke fragment
    private var param1: String? = null
    private var param2: String? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            // Mengambil nilai param1 dan param2 dari Bundle jika ada
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu1, container, false)
    }

    companion object {
        // Fungsi factory untuk membuat instance baru dari fragment dengan parameter
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Menu1Fragment().apply {
                arguments = Bundle().apply {
                    // Menyimpan parameter ke dalam Bundle agar bisa diambil saat fragment dibuat
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

}