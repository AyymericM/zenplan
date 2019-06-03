package com.example.zenplan

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView

class TodosFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_todos, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        // items
        // val todoItems = arrayOf("Hello 1", "Hello 2", "Hello 3")
        // val listView = view.findViewById(R.id.todoListView) as ListView
        // val listViewAdapter = ArrayAdapter<String>(
        //     activity!!.applicationContext,
        //     R.layout.card_view,
        //     todoItems
        // )
        // listView.adapter = listViewAdapter
    }

    companion object {
        fun newInstance(): TodosFragment = TodosFragment()
    }
}