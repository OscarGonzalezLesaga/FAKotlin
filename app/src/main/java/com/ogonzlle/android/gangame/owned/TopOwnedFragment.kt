package com.ogonzlle.android.gangame.owned

import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.view.View
import com.ogonzlle.android.commons.BR
import com.ogonzlle.android.commons.BaseListFragment
import com.ogonzlle.android.commons.DataBindingRecyclerAdapter
import com.ogonzlle.android.gangame.R
import com.ogonzlle.android.gangame.TopGame


class TopOwnedFragment : BaseListFragment() {
    override fun getAdapter(): RecyclerView.Adapter<*> {
        return DataBindingRecyclerAdapter<TopGame>(BR.topGame, R.layout.item_top_game)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (listAdapter as DataBindingRecyclerAdapter<TopGame>).items.addAll(getDummiesTopGame())
        listAdapter.notifyDataSetChanged()
    }

    fun getDummiesTopGame(): ArrayList<TopGame> {
        return arrayListOf(TopGame("Counter Strikem", 134540403, 9, "Valve", 8F, 23, ""))
    }

}