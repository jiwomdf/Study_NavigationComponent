package com.programmergabut.studynavigationcomponent

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.NavigationUI
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment: Fragment(R.layout.fragment_home) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button_login.setOnClickListener {
            findNavController().navigate(HomeFragmentDirections.actionHomeFragmentToLoginFragment())
        }
    }
}