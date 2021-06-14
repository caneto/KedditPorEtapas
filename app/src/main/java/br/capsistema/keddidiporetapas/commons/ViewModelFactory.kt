package br.capsistema.keddidiporetapas.commons

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.Lazy
import javax.inject.Inject

/**
 * Lazy ViewModel Factory to be used for scopes and subscopes.
 *
 * @author caneto
 */
class ViewModelFactory<T : ViewModel>
@Inject constructor(private val viewModel: @JvmSuppressWildcards Lazy<T>) : ViewModelProvider.Factory {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T = viewModel.get() as T
}