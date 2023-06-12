package com.example.logical_app.quiz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.example.logical_app.R

/**
 * A simple [Fragment] subclass.
 * Use the [Perguta4Fragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class Perguta4Fragment : Fragment() {

    val args: Perguta4FragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_pergunta2, container, false)

        view.findViewById<Button>(R.id.button5).setOnClickListener { Navigation.findNavController(view).navigate(R.id.action_perguta4Fragment_to_quizFragment) }
        view.findViewById<Button>(R.id.button7).setOnClickListener { Navigation.findNavController(view).navigate(R.id.action_perguta4Fragment_to_quizFragment) }
        view.findViewById<Button>(R.id.button8).setOnClickListener {
            val action = Perguta4FragmentDirections.actionPerguta4FragmentToFinishFragment(args.nome.toString())
            Navigation.findNavController(view).navigate(action) }
        view.findViewById<Button>(R.id.button9).setOnClickListener { Navigation.findNavController(view).navigate(R.id.action_perguta4Fragment_to_quizFragment) }

        return view
    }

}