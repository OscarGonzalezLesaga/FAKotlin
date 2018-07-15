package com.ogonzlle.android.gangame.deals

import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.view.View
import com.ogonzlle.android.commons.BR
import com.ogonzlle.android.commons.BaseListFragment
import com.ogonzlle.android.commons.DataBindingRecyclerAdapter
import com.ogonzlle.android.gangame.Deal
import com.ogonzlle.android.gangame.R

class DealsFragment : BaseListFragment() {
    override fun getAdapter(): RecyclerView.Adapter<*> {
        return DataBindingRecyclerAdapter<Deal>(BR.deal, R.layout.item_deal)
    }

    override fun getLayoutResId(): Int {
        return R.layout.fragment_deals
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (listAdapter as DataBindingRecyclerAdapter<Deal>).items.addAll(getDummiesDeals())
        listAdapter.notifyDataSetChanged()
    }

    fun getDummiesDeals(): ArrayList<Deal> {
        return arrayListOf(Deal("Counter Strike", 0.99F, 9.99F, 80, 80, ""))
    }


}