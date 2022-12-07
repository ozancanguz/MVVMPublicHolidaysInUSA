package com.ozancanguz.mvvmpublicholidaysinusa.ui.fragments.holidayList

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.ozancanguz.mvvmpublicholidaysinusa.R
import com.ozancanguz.mvvmpublicholidaysinusa.databinding.FragmentHolidayDetailBinding
import com.ozancanguz.mvvmpublicholidaysinusa.databinding.FragmentHolidayListBinding
import com.ozancanguz.mvvmpublicholidaysinusa.viewmodels.HolidayViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.fragment_holiday_list.*
import kotlinx.android.synthetic.main.fragment_holiday_list.view.*
import kotlinx.coroutines.ExperimentalCoroutinesApi

@ExperimentalCoroutinesApi
@AndroidEntryPoint
class HolidayListFragment : Fragment() {
    private var _binding: FragmentHolidayListBinding? = null
    // This property is only valid between onCreateView and
// onDestroyView.
    private val binding get() = _binding!!

    private lateinit var listviewModel:HolidayViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHolidayListBinding.inflate(inflater, container, false)
        val view = binding.root

          listviewModel=ViewModelProvider(this).get(HolidayViewModel::class.java)
          observeLiveData()


        return view
    }

    private fun observeLiveData() {

        listviewModel.requestHoliday()
        listviewModel.holidayList.observe(viewLifecycleOwner, Observer {
            Log.d("holidays",""+it)
        })
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}