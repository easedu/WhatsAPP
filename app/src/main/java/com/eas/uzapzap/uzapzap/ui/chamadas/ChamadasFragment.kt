package com.eas.uzapzap.uzapzap.ui.chamadas


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.eas.uzapzap.uzapzap.R
import com.eas.uzapzap.uzapzap.ui.base.BaseFragment

class ChamadasFragment : BaseFragment() {

    override fun getTitulo(): Int {
        return R.string.tab_chamada
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_chamadas, container, false)
    }


}
