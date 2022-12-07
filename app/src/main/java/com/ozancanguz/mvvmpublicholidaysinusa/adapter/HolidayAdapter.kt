package com.ozancanguz.mvvmpublicholidaysinusa.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.ozancanguz.mvvmpublicholidaysinusa.R
import com.ozancanguz.mvvmpublicholidaysinusa.model.Holiday
import com.ozancanguz.mvvmpublicholidaysinusa.ui.fragments.holidayList.HolidayListFragmentDirections
import kotlinx.android.synthetic.main.holiday_row_layout.view.*

class HolidayAdapter:RecyclerView.Adapter<HolidayAdapter.MyViewHolder>() {

    private var holidayList= emptyList<Holiday>()

    fun UpdateData(newData:List<Holiday>){
        this.holidayList=newData.toMutableList()
        notifyDataSetChanged()
    }

    class MyViewHolder(view: View):RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var inflater=LayoutInflater.from(parent.context)
        val view=inflater.inflate(R.layout.holiday_row_layout,parent,false)

        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        var currentHoliday=holidayList[position]
        holder.itemView.holiday_date.text=currentHoliday.date
        holder.itemView.holiday_name.text=currentHoliday.name
        holder.itemView.movies_img.setImageResource(R.drawable.holidayicon)

        holder.itemView.setOnClickListener {
           val directions=HolidayListFragmentDirections.actionHolidayListFragmentToHolidayDetailFragment(currentHoliday)
            holder.itemView.findNavController().navigate(directions)
        }

    }

    override fun getItemCount(): Int {
        return holidayList.size
    }


}