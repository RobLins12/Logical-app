package com.example.logical_app.quiz

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.example.logical_app.R

/**
 * A simple [Fragment] subclass.
 * Use the [FinishFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FinishFragment : Fragment() {
    val args: FinishFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_finish, container, false)

        val texto = view.findViewById<TextView>(R.id.textView20)
        texto.setText("Parabéns!! \n\n " + args.nome)
        view.findViewById<Button>(R.id.button10).setOnClickListener { Navigation.findNavController(view).navigate(R.id.action_finishFragment_to_quizFragment) }

        return view
    }

}