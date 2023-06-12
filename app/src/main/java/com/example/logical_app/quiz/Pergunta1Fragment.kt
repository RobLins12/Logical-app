package com.example.logical_app.quiz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.example.logical_app.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Pergunta1Fragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class Pergunta1Fragment : Fragment() {

    val args: Pergunta1FragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_pergunta1, container, false)

        view.findViewById<Button>(R.id.button5).setOnClickListener { Navigation.findNavController(view).navigate(R.id.action_pergunta1Fragment4_to_quizFragment) }

        view.findViewById<Button>(R.id.button7).setOnClickListener {
            val action = Pergunta1FragmentDirections.actionPergunta1Fragment4ToPergunta2Fragment(args.nome.toString())
            Navigation.findNavController(view).navigate(action) }

        view.findViewById<Button>(R.id.button8).setOnClickListener { Navigation.findNavController(view).navigate(R.id.action_pergunta1Fragment4_to_quizFragment) }
        view.findViewById<Button>(R.id.button9).setOnClickListener { Navigation.findNavController(view).navigate(R.id.action_pergunta1Fragment4_to_quizFragment) }

        return  view;
    }

}