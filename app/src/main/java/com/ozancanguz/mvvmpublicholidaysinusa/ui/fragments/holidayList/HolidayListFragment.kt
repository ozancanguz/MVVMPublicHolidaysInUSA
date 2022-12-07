package com.ozancanguz.mvvmpublicholidaysinusa.ui.fragments.holidayList

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.ozancanguz.mvvmpublicholidaysinusa.R
import kotlinx.android.synthetic.main.fragment_holiday_list.*
import kotlinx.android.synthetic.main.fragment_holiday_list.view.*


class HolidayListFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_holiday_list, container, false)

      view.button.setOnClickListener {
            findNavController().navigate(R.id.action_holidayListFragment_to_holidayDetailFragment)
        }


   return view
    }


}