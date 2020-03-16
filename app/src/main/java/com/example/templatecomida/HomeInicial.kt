package com.example.templatecomida


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.fragment_home_inicial.*
import proitappsolutions.com.rumosstore.adapter.ListaComidaAdapter
import proitappsolutions.com.rumosstore.adapter.ListaComidaCarrinhoAdapter

/**
 * A simple [Fragment] subclass.
 */
class HomeInicial : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_inicial, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val layoutManager = LinearLayoutManager(context)
        layoutManager.orientation = RecyclerView.HORIZONTAL
        val adapter = ListaComidaAdapter(view.context, activity)
        recycler_pratos.layoutManager = layoutManager
        recycler_pratos.adapter = adapter

        val layoutManagerC = LinearLayoutManager(context)
        layoutManagerC.orientation = RecyclerView.VERTICAL
        val adapterC = ListaComidaCarrinhoAdapter(view.context, activity)
        recyclerview_carrinho.layoutManager = layoutManagerC
        recyclerview_carrinho.adapter = adapterC
    }

}
