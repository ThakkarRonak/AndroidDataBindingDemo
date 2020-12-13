package com.databindingdemo.android.adapters;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;


import com.databindingdemo.android.models.User;
import com.example.custommanager_recyclerview.BR;
import com.example.custommanager_recyclerview.R;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private ArrayList<User> mArrayListUser = new ArrayList<>();

    private Context mContext;

    public RecyclerViewAdapter(Context mContext) {
        this.mContext = mContext;
    }

    /**
     * set arraylist to adapter
     * @param mArrayList
     */
    public void setArrayListUser(ArrayList<User> mArrayList) {
        mArrayListUser = mArrayList;
        notifyDataSetChanged();
    }

    @Override
    public RecyclerViewAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ViewDataBinding binding = DataBindingUtil.inflate(LayoutInflater.from(mContext),
                R.layout.row_user, parent, false);
        return new MyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(RecyclerViewAdapter.MyViewHolder holder, int position) {
        User obj = getObjForPosition(position);
        //bind object
        holder.bind(obj);
    }

    protected User getObjForPosition(int position) {
        return mArrayListUser.get(position);
    }

    @Override
    public int getItemCount() {
        return mArrayListUser.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        private final ViewDataBinding binding;

        public MyViewHolder(ViewDataBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(Object obj) {
            binding.setVariable(BR.user, obj);
            binding.executePendingBindings();
        }
    }
}
