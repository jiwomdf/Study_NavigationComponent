package com.programmergabut.studynavigationcomponent

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_login.*

class LoginFragment: Fragment(R.layout.fragment_login) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button_confirm.setOnClickListener {
            val userName = edit_text_username.text.toString()
            val password = edit_text_password.text.toString()
            findNavController().navigate(LoginFragmentDirections.actionLoginFragmentToWelcomeFragment(
                userName, password
            ))
        }
    }
}