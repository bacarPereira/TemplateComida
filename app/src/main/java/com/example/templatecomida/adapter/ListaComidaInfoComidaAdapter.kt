package proitappsolutions.com.rumosstore.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.templatecomida.Extencoes_Model.Prato
import com.example.templatecomida.HomeInicial
import com.example.templatecomida.HomeInicialDirections
import com.example.templatecomida.R

class ListaComidaInfoComidaAdapter(
    private val context: Context,
    private val activity: FragmentActivity?) : RecyclerView.Adapter<ListaComidaInfoComidaAdapter.MyViewHolder>() {

    private var res_room: List<Prato> = mutableListOf()

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_pratos_info, p0, false)
        return MyViewHolder(view)
    }

    override fun getItemCount(): Int = 6//res_room.size

    fun setLista(resultado: List<Prato>) {

        res_room = resultado

        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: MyViewHolder, posicao: Int) {
            holder.mudarDados(posicao)
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun mudarDados(posicao: Int) {

            itemView.setOnClickListener {
                activity?.findNavController(R.id.conteiner_navegacao)?.
                    navigate(
                        HomeInicialDirections.actionHomeInicialToDetalheComidaFragment())
            }

        }
    }

}