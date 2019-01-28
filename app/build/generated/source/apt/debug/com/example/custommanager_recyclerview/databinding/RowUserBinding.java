package com.example.custommanager_recyclerview.databinding;
import com.example.custommanager_recyclerview.R;
import com.example.custommanager_recyclerview.BR;
import android.view.View;
public class RowUserBinding extends android.databinding.ViewDataBinding  {

    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    private final android.widget.LinearLayout mboundView0;
    public final android.widget.TextView tvFname;
    public final android.widget.TextView tvLname;
    // variables
    private com.databindingdemo.android.models.User mUser;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RowUserBinding(android.databinding.DataBindingComponent bindingComponent, View root) {
        super(bindingComponent, root, 0);
        final Object[] bindings = mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvFname = (android.widget.TextView) bindings[1];
        this.tvFname.setTag(null);
        this.tvLname = (android.widget.TextView) bindings[2];
        this.tvLname.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    public boolean setVariable(int variableId, Object variable) {
        switch(variableId) {
            case BR.user :
                setUser((com.databindingdemo.android.models.User) variable);
                return true;
        }
        return false;
    }

    public void setUser(com.databindingdemo.android.models.User User) {
        this.mUser = User;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.user);
        super.requestRebind();
    }
    public com.databindingdemo.android.models.User getUser() {
        return mUser;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.databindingdemo.android.models.User user = mUser;
        java.lang.String userFname = null;
        java.lang.String userLname = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (user != null) {
                    // read user.fname
                    userFname = user.getFname();
                    // read user.lname
                    userLname = user.getLname();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvFname, userFname);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvLname, userLname);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;

    public static RowUserBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static RowUserBinding inflate(android.view.LayoutInflater inflater, android.view.ViewGroup root, boolean attachToRoot, android.databinding.DataBindingComponent bindingComponent) {
        return android.databinding.DataBindingUtil.<RowUserBinding>inflate(inflater, com.example.custommanager_recyclerview.R.layout.row_user, root, attachToRoot, bindingComponent);
    }
    public static RowUserBinding inflate(android.view.LayoutInflater inflater) {
        return inflate(inflater, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static RowUserBinding inflate(android.view.LayoutInflater inflater, android.databinding.DataBindingComponent bindingComponent) {
        return bind(inflater.inflate(com.example.custommanager_recyclerview.R.layout.row_user, null, false), bindingComponent);
    }
    public static RowUserBinding bind(android.view.View view) {
        return bind(view, android.databinding.DataBindingUtil.getDefaultComponent());
    }
    public static RowUserBinding bind(android.view.View view, android.databinding.DataBindingComponent bindingComponent) {
        if (!"layout/row_user_0".equals(view.getTag())) {
            throw new RuntimeException("view tag isn't correct on view:" + view.getTag());
        }
        return new RowUserBinding(bindingComponent, view);
    }
    /* flag mapping
        flag 0 (0x1L): user
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}