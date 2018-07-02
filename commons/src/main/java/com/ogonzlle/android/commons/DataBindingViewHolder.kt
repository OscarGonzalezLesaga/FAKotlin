package com.ogonzlle.android.commons

import android.databinding.ViewDataBinding
import android.support.v7.widget.RecyclerView

class DataBindingViewHolder<MODEL>(val itemVariableId: Int, val binding: ViewDataBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bindItem(model: MODEL) {
        binding.setVariable(itemVariableId, model)
        binding.executePendingBindings()
    }
}