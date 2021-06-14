package br.capsistema.keddidiporetapas.features.news.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import br.capsistema.keddidiporetapas.commons.adapter.ViewType
import br.capsistema.keddidiporetapas.commons.adapter.ViewTypeDelegateAdapter
import br.capsistema.keddidiporetapas.R
import br.capsistema.keddidiporetapas.commons.extensions.inflate

class LoadingDelegateAdapter : ViewTypeDelegateAdapter {

    override fun onCreateViewHolder(parent: ViewGroup) = LoadingViewHolder(parent)

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, item: ViewType) {
    }

    class LoadingViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder(
            parent.inflate(R.layout.news_item_loading))
}