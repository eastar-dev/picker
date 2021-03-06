package xyz.android.picker.presentation.base

import androidx.recyclerview.widget.RecyclerView

abstract class BaseRecyclerViewAdapter<T, V: RecyclerView.ViewHolder> : RecyclerView.Adapter<V>() {

    private var items: MutableList<T> = mutableListOf()

    protected fun getItem(position: Int): T = items[position]

    override fun getItemCount(): Int = items.size

    fun loadItems(newItems: MutableList<T>) {
        this.items.clear()
        this.items.addAll(newItems)
        notifyDataSetChanged()
    }
}