package com.droidcba.kedditbysteps.commons.extensions

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.fragment.app.Fragment

/**
 * Extension functions for Android Architecture components
 *
 * @author juan.saravia
 */

/**
 * Retrieve ViewModel from current Fragment.
 */
inline fun <reified T : ViewModel> Fragment.getViewModel(viewModelFactory: ViewModelProvider.Factory): T =
        ViewModelProviders.of(this, viewModelFactory)[T::class.java]