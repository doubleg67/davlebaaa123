package com.example.xd123.fragments

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.xd123.R

class NotificationFragment: Fragment(R.layout.notification_fragment) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<TextView>(R.id.text).text = NotificationFragmentArgs.fromBundle(requireArguments()).name
    }
}