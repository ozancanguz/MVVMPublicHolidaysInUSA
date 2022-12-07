package com.ozancanguz.mvvmpublicholidaysinusa.ui.fragments.holidayList

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.ozancanguz.mvvmpublicholidaysinusa.R
import com.ozancanguz.mvvmpublicholidaysinusa.databinding.FragmentHolidayDetailBinding
import com.ozancanguz.mvvmpublicholidaysinusa.databinding.FragmentHolidayListBinding
import kotlinx.android.synthetic.main.fragment_holiday_list.*
import kotlinx.android.synthetic.main.fragment_holiday_list.view.*


class HolidayListFragment : Fragment() {
    private var _binding: FragmentHolidayListBinding? = null
    // This property is only valid between onCreateView and
// onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHolidayListBinding.inflate(inflater, container, false)
        val view = binding.root


        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}