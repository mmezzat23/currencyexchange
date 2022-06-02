package com.t.currenyexchange.databinding;
import com.t.currenyexchange.R;
import com.t.currenyexchange.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class OperationBindingImpl extends OperationBinding  {

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
    private final android.widget.FrameLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView4;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public OperationBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private OperationBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            );
        this.mboundView0 = (android.widget.FrameLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.operationViewModel == variableId) {
            setOperationViewModel((com.t.currenyexchange.viewmodels.OperationViewmodel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setOperationViewModel(@Nullable com.t.currenyexchange.viewmodels.OperationViewmodel OperationViewModel) {
        updateRegistration(0, OperationViewModel);
        this.mOperationViewModel = OperationViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.operationViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeOperationViewModel((com.t.currenyexchange.viewmodels.OperationViewmodel) object, fieldId);
            case 1 :
                return onChangeOperationViewModelOnservse((androidx.databinding.ObservableField<com.t.currenyexchange.Models.ExchangeOperation>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeOperationViewModel(com.t.currenyexchange.viewmodels.OperationViewmodel OperationViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeOperationViewModelOnservse(androidx.databinding.ObservableField<com.t.currenyexchange.Models.ExchangeOperation> OperationViewModelOnservse, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        java.lang.String operationViewModelOnservseFrom = null;
        java.lang.String operationViewModelOnservseAmountresult = null;
        java.lang.String operationViewModelOnservseAmount = null;
        java.lang.String operationViewModelOnservseTo = null;
        com.t.currenyexchange.Models.ExchangeOperation operationViewModelOnservseGet = null;
        com.t.currenyexchange.viewmodels.OperationViewmodel operationViewModel = mOperationViewModel;
        androidx.databinding.ObservableField<com.t.currenyexchange.Models.ExchangeOperation> operationViewModelOnservse = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (operationViewModel != null) {
                    // read operationViewModel.onservse
                    operationViewModelOnservse = operationViewModel.getOnservse();
                }
                updateRegistration(1, operationViewModelOnservse);


                if (operationViewModelOnservse != null) {
                    // read operationViewModel.onservse.get()
                    operationViewModelOnservseGet = operationViewModelOnservse.get();
                }


                if (operationViewModelOnservseGet != null) {
                    // read operationViewModel.onservse.get().from
                    operationViewModelOnservseFrom = operationViewModelOnservseGet.getFrom();
                    // read operationViewModel.onservse.get().amountresult
                    operationViewModelOnservseAmountresult = operationViewModelOnservseGet.getAmountresult();
                    // read operationViewModel.onservse.get().amount
                    operationViewModelOnservseAmount = operationViewModelOnservseGet.getAmount();
                    // read operationViewModel.onservse.get().to
                    operationViewModelOnservseTo = operationViewModelOnservseGet.getTo();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, operationViewModelOnservseFrom);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, operationViewModelOnservseTo);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, operationViewModelOnservseAmount);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, operationViewModelOnservseAmountresult);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): operationViewModel
        flag 1 (0x2L): operationViewModel.onservse
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}