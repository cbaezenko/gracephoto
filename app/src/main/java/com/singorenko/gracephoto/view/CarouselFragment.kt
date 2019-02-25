package com.singorenko.gracephoto.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager

import com.singorenko.gracephoto.R
import kotlinx.android.synthetic.main.fragment_carousel.*

class CarouselFragment : Fragment() {

    val arrayList: ArrayList<String> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView: View = inflater.inflate(R.layout.fragment_carousel, container, false)
        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        rv_carousel.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        rv_carousel.adapter = CarouselAdapter(arrayList,context!!)
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            CarouselFragment().apply {
            }
    }
}
