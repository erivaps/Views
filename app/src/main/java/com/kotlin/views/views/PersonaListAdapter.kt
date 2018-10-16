package com.kotlin.views.views

import android.content.Context
import android.support.v7.view.menu.ActionMenuItemView
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class PersonaListAdapter(private val list: ArrayList<Persona>,
                         private val context: Context):
        RecyclerView.Adapter<PersonaListAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(list[position])
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bindItem(persona: Persona) {
            var nombres = itemView.findViewById(R.id.txtNombre) as TextView
            var apellido = itemView.findViewById(R.id.txtApellido) as TextView
            nombres.setText(persona.nombres)
            apellido.setText(persona.apellidos)
        }

    }


}