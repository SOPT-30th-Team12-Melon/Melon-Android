package org.sopt.jointseminar.melon.presentation.main.home

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class TrendyItemDecoration : RecyclerView.ItemDecoration() {
    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        super.getItemOffsets(outRect, view, parent, state)
        val position = parent.getChildAdapterPosition(view)
        val spanCount = 2
        if (position % spanCount == 0) {
            outRect.bottom = 7
        }
        if (position <= 1) {
            outRect.left = 20
        }
        outRect.right = 10
    }
}