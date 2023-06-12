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

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Pergunta3Fragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class Pergunta3Fragment : Fragment() {

    val args: Pergunta3FragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_pergunta2, container, false)

        view.findViewById<Button>(R.id.button5).setOnClickListener {
            val action = Pergunta3FragmentDirections.actionPergunta3FragmentToPerguta4Fragment(args.nome.toString())
            Navigation.findNavController(view).navigate(action) }

        view.findViewById<Button>(R.id.button7).setOnClickListener { Navigation.findNavController(view).navigate(R.id.action_pergunta3Fragment_to_quizFragment) }
        view.findViewById<Button>(R.id.button8).setOnClickListener { Navigation.findNavController(view).navigate(R.id.action_pergunta3Fragment_to_quizFragment) }
        view.findViewById<Button>(R.id.button9).setOnClickListener { Navigation.findNavController(view).navigate(R.id.action_pergunta3Fragment_to_quizFragment) }

        return view
    }

}