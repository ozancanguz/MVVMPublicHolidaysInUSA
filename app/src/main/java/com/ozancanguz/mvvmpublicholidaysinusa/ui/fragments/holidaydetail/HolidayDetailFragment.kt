package com.ozancanguz.mvvmpublicholidaysinusa.ui.fragments.holidaydetail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.ozancanguz.mvvmpublicholidaysinusa.R
import com.ozancanguz.mvvmpublicholidaysinusa.databinding.FragmentHolidayDetailBinding


class HolidayDetailFragment : Fragment() {

    private var _binding: FragmentHolidayDetailBinding? = null
    // This property is only valid between onCreateView and
// onDestroyView.
    private val binding get() = _binding!!

    private val args: HolidayDetailFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHolidayDetailBinding.inflate(inflater, container, false)
        var view = binding.root

        if(args.currentHoliday != null) {
           binding.detailsDate.text=args.currentHoliday.date
            binding.detailsName.text=args.currentHoliday.name
            binding.detailsImg.setImageResource(R.drawable.holidayicon)


        }

        return view
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}