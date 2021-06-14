package br.capsistema.keddidiporetapas.features.news

import br.capsistema.keddidiporetapas.commons.RedditNews

/**
 * @author juan.saravia
 */
sealed class NewsState {
    class Success(val redditNews: RedditNews) : NewsState()
    class Error(val message: String?) : NewsState()
}