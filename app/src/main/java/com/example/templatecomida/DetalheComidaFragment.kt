package com.example.templatecomida


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_detalhe_comida.*
import kotlinx.android.synthetic.main.fragment_home_inicial.*
import proitappsolutions.com.rumosstore.adapter.InfoDetalheComidaAdapter
import proitappsolutions.com.rumosstore.adapter.ListaComidaCarrinhoAdapter
import proitappsolutions.com.rumosstore.adapter.ListaComidaInfoComidaAdapter

/**
 * A simple [Fragment] subclass.
 */
class DetalheComidaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_detalhe_comida, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val layoutManagerC = LinearLayoutManager(context)
        layoutManagerC.orientation = RecyclerView.HORIZONTAL
        val adapterC = InfoDetalheComidaAdapter(view.context, activity)
        recycler_detalhe_comida_inf.layoutManager = layoutManagerC
        recycler_detalhe_comida_inf.adapter = adapterC

        val layoutManagerCinfo = LinearLayoutManager(context)
        layoutManagerCinfo.orientation = RecyclerView.HORIZONTAL
        val adapterC_info = ListaComidaInfoComidaAdapter(view.context, activity)
        recycler_view_info_prato.layoutManager = layoutManagerCinfo
        recycler_view_info_prato.adapter = adapterC_info

        circleIndicator.attachToRecyclerView(recycler_view_info_prato)

        imageButton2.setOnClickListener {
            getFragmentManager()?.popBackStack()
        }
    }


}
