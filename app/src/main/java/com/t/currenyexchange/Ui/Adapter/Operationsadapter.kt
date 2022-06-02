package com.t.currenyexchange.Ui.Adapter


import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.t.currenyexchange.Models.ExchangeOperation
import com.t.currenyexchange.R
import com.t.currenyexchange.databinding.OperationBinding
import com.t.currenyexchange.viewmodels.OperationViewmodel


/**
 * Created by سيد on 04/06/2017.
 */
class Operationsadapter : RecyclerView.Adapter<Operationsadapter.MyViewHolder>()  {

    internal var context: Context? = null
    private var horizontalList: List<ExchangeOperation> = ArrayList<ExchangeOperation>()
    lateinit var movieItem: OperationBinding

    var size = 0
    fun setdata(movies: List<ExchangeOperation>) {
        this.horizontalList = movies
        notifyDataSetChanged()
    }

    public class MyViewHolder(designsBinding: OperationBinding) : RecyclerView.ViewHolder(designsBinding.getRoot()) {


        internal var designsBinding: OperationBinding
            internal set

        init {
            this.designsBinding = designsBinding
        }

        fun bind(design: OperationViewmodel) {
            designsBinding.operationViewModel = design
            designsBinding.executePendingBindings()
        }

         fun getDesignsBinding(): OperationBinding {
            return designsBinding
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        movieItem = DataBindingUtil.inflate(LayoutInflater.from(parent.context),
                R.layout.item_operation, parent, false)
        context = movieItem.root.context
        return MyViewHolder(movieItem)
    }

    @SuppressLint("ResourceAsColor")
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val designs = horizontalList[position]
        val design = OperationViewmodel()
        design.setdata(designs)
        holder.bind(design)
    }


    override fun getItemCount(): Int {
        return horizontalList.size
    }

   
}

