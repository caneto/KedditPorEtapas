package br.capsistema.keddidiporetapas.commons.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.capsistema.keddidiporetapas.commons.adapter.ViewType

interface ViewTypeDelegateAdapter {

    fun onCreateViewHolder(parent: ViewGroup): RecyclerView.ViewHolder

    fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType)
}