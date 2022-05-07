package com.neupanedinesh.wordlee.wordgame

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout

class RowView : ConstraintLayout {

    private val TAG = RowView::class.simpleName

    constructor(context: Context) : super(context) {
        initView()
    }

    constructor(context: Context, attr: AttributeSet? = null) : super(context, attr) {
        initView()
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        initView()
    }


    private fun initView() {
        val rootView = (context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater)
            .inflate(R.layout.row_view, this, true)

        // Load and use rest of views here
        //  val awesomeBG= rootView.findViewById<ImageView>(R.id.awesomeBG)

    }

}