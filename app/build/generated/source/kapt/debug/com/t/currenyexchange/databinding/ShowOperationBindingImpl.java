package com.t.currenyexchange.databinding;
import com.t.currenyexchange.R;
import com.t.currenyexchange.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ShowOperationBindingImpl extends ShowOperationBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ShowOperationBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }
    private ShowOperationBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            );
        this.listitem.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
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

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.showoperationViewModel == variableId) {
            setShowoperationViewModel((com.t.currenyexchange.viewmodels.ShowOprationsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setShowoperationViewModel(@Nullable com.t.currenyexchange.viewmodels.ShowOprationsViewModel ShowoperationViewModel) {
        updateRegistration(0, ShowoperationViewModel);
        this.mShowoperationViewModel = ShowoperationViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.showoperationViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeShowoperationViewModel((com.t.currenyexchange.viewmodels.ShowOprationsViewModel) object, fieldId);
        }
        return false;
    }
    private boolean onChangeShowoperationViewModel(com.t.currenyexchange.viewmodels.ShowOprationsViewModel ShowoperationViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
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
        java.util.ArrayList<com.t.currenyexchange.Models.ExchangeOperation> showoperationViewModelOperations = null;
        com.t.currenyexchange.viewmodels.ShowOprationsViewModel showoperationViewModel = mShowoperationViewModel;

        if ((dirtyFlags & 0x3L) != 0) {



                if (showoperationViewModel != null) {
                    // read showoperationViewModel.operations
                    showoperationViewModelOperations = showoperationViewModel.getOperations();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.t.currenyexchange.BindingAdapters.setshowopertaion(this.listitem, showoperationViewModelOperations);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): showoperationViewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}