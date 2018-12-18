package com.eas.uzapzap.uzapzap.ui.base


import android.os.Bundle
import android.support.annotation.StringRes
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.eas.uzapzap.uzapzap.R

abstract class BaseFragment : Fragment() {

    @StringRes
    abstract fun getTitulo() : Int


}
