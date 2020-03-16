package proitappsolutions.com.rumosstore.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.templatecomida.Extencoes_Model.Prato
import com.example.templatecomida.R

class InfoDetalheComidaAdapter(
    private val context: Context,
    private val activity: FragmentActivity?) : RecyclerView.Adapter<InfoDetalheComidaAdapter.MyViewHolder>() {

    private var res_room: List<Prato> = mutableListOf()

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_info_detalhe_comida, p0, false)
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
                /*activity?.findNavController(R.id.conteiner_navegacao)?.
                    navigate(
                        HomeInicial.actionInicioFragmentToDetalheRecomendacaoFragment(
                        res_room[posicao].titulo,res_room[posicao].foto,res_room[posicao].corpo
                    ))*/
            }

            /*itemView.txt_rec_titulo.text = res_room[posicao].titulo
            itemView.txt_rec_resumo.text = res_room[posicao].resumo

            Glide.with(context)
                .load(res_room[posicao].foto)
                .into(itemView.img_rec_foto)*/

        }
    }

}