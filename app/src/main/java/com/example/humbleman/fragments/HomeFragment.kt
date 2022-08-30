package com.example.humbleman.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.fragment_home.*
import com.example.humbleman.CardViewItemAdapter
import com.example.humbleman.Item
import com.example.humbleman.ItemData
import com.example.humbleman.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {
    //ISIAN
    private lateinit var rvItem: RecyclerView
    private var list: ArrayList<Item> = arrayListOf()

    //ISIAN 3

    //BATAS 3


    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<CardViewItemAdapter.CardViewViewHolder>? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        (activity as AppCompatActivity).supportActionBar?.title = "Home"
        // Inflate the layout for this fragment
        //ISIAN
        val rootView: View = inflater.inflate(R.layout.fragment_home, container, false)
        rvItem = rootView.findViewById(R.id.rv_item)
        rvItem.setHasFixedSize(true)
        list.addAll(ItemData.listData)
        showRecyclerCardView()
        //BATAS
        return rootView
    }
    //ISIAN
    private fun showRecyclerCardView() {
        //ISIAN
        val activity = activity as Context
        //BATAS
        rvItem.layoutManager = LinearLayoutManager(activity)
        val cardViewItemAdapter = CardViewItemAdapter(list)
        rvItem.adapter = cardViewItemAdapter
    }
    //BATAS
}