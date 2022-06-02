package com.t.currenyexchange.databinding;
import com.t.currenyexchange.R;
import com.t.currenyexchange.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class CurrencyExchangeBindingImpl extends CurrencyExchangeBinding implements com.t.currenyexchange.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.amountresult, 6);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final com.google.android.material.textfield.MaterialAutoCompleteTextView mboundView1;
    @NonNull
    private final com.google.android.material.textfield.MaterialAutoCompleteTextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public CurrencyExchangeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private CurrencyExchangeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (android.widget.EditText) bindings[3]
            , (android.widget.EditText) bindings[6]
            );
        this.amount.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (com.google.android.material.textfield.MaterialAutoCompleteTextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (com.google.android.material.textfield.MaterialAutoCompleteTextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.t.currenyexchange.generated.callback.OnClickListener(this, 1);
        mCallback2 = new com.t.currenyexchange.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.currencyexchangeViewModel == variableId) {
            setCurrencyexchangeViewModel((com.t.currenyexchange.viewmodels.CurrencyExchangeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCurrencyexchangeViewModel(@Nullable com.t.currenyexchange.viewmodels.CurrencyExchangeViewModel CurrencyexchangeViewModel) {
        updateRegistration(0, CurrencyexchangeViewModel);
        this.mCurrencyexchangeViewModel = CurrencyexchangeViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.currencyexchangeViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeCurrencyexchangeViewModel((com.t.currenyexchange.viewmodels.CurrencyExchangeViewModel) object, fieldId);
            case 1 :
                return onChangeCurrencyexchangeViewModelTo((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeCurrencyexchangeViewModelFrom((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeCurrencyexchangeViewModel(com.t.currenyexchange.viewmodels.CurrencyExchangeViewModel CurrencyexchangeViewModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCurrencyexchangeViewModelTo(androidx.databinding.ObservableField<java.lang.String> CurrencyexchangeViewModelTo, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeCurrencyexchangeViewModelFrom(androidx.databinding.ObservableField<java.lang.String> CurrencyexchangeViewModelFrom, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        com.t.currenyexchange.viewmodels.CurrencyExchangeViewModel currencyexchangeViewModel = mCurrencyexchangeViewModel;
        java.util.ArrayList<java.lang.String> currencyexchangeViewModelCurrencies = null;
        java.lang.String currencyexchangeViewModelToGet = null;
        androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged currencyexchangeViewModelOnamountChanged = null;
        androidx.databinding.ObservableField<java.lang.String> currencyexchangeViewModelTo = null;
        java.lang.String currencyexchangeViewModelFromGet = null;
        androidx.databinding.ObservableField<java.lang.String> currencyexchangeViewModelFrom = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0x9L) != 0) {

                    if (currencyexchangeViewModel != null) {
                        // read currencyexchangeViewModel.currencies
                        currencyexchangeViewModelCurrencies = currencyexchangeViewModel.getCurrencies();
                        // read currencyexchangeViewModel.onamountChanged()
                        currencyexchangeViewModelOnamountChanged = currencyexchangeViewModel.onamountChanged();
                    }
            }
            if ((dirtyFlags & 0xbL) != 0) {

                    if (currencyexchangeViewModel != null) {
                        // read currencyexchangeViewModel.to
                        currencyexchangeViewModelTo = currencyexchangeViewModel.getTo();
                    }
                    updateRegistration(1, currencyexchangeViewModelTo);


                    if (currencyexchangeViewModelTo != null) {
                        // read currencyexchangeViewModel.to.get()
                        currencyexchangeViewModelToGet = currencyexchangeViewModelTo.get();
                    }
            }
            if ((dirtyFlags & 0xdL) != 0) {

                    if (currencyexchangeViewModel != null) {
                        // read currencyexchangeViewModel.from
                        currencyexchangeViewModelFrom = currencyexchangeViewModel.getFrom();
                    }
                    updateRegistration(2, currencyexchangeViewModelFrom);


                    if (currencyexchangeViewModelFrom != null) {
                        // read currencyexchangeViewModel.from.get()
                        currencyexchangeViewModelFromGet = currencyexchangeViewModelFrom.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.amount, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, currencyexchangeViewModelOnamountChanged, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, (androidx.databinding.InverseBindingListener)null);
            com.t.currenyexchange.BindingAdapters.setfrom(this.mboundView1, currencyexchangeViewModelCurrencies, currencyexchangeViewModel);
            com.t.currenyexchange.BindingAdapters.setto(this.mboundView2, currencyexchangeViewModelCurrencies, currencyexchangeViewModel);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, currencyexchangeViewModelFromGet);
        }
        if ((dirtyFlags & 0xbL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, currencyexchangeViewModelToGet);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.mboundView4.setOnClickListener(mCallback1);
            this.mboundView5.setOnClickListener(mCallback2);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // currencyexchangeViewModel
                com.t.currenyexchange.viewmodels.CurrencyExchangeViewModel currencyexchangeViewModel = mCurrencyexchangeViewModel;
                // currencyexchangeViewModel != null
                boolean currencyexchangeViewModelJavaLangObjectNull = false;



                currencyexchangeViewModelJavaLangObjectNull = (currencyexchangeViewModel) != (null);
                if (currencyexchangeViewModelJavaLangObjectNull) {


                    currencyexchangeViewModel.getchangeresult();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // currencyexchangeViewModel
                com.t.currenyexchange.viewmodels.CurrencyExchangeViewModel currencyexchangeViewModel = mCurrencyexchangeViewModel;
                // currencyexchangeViewModel != null
                boolean currencyexchangeViewModelJavaLangObjectNull = false;



                currencyexchangeViewModelJavaLangObjectNull = (currencyexchangeViewModel) != (null);
                if (currencyexchangeViewModelJavaLangObjectNull) {


                    currencyexchangeViewModel.showpervious();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): currencyexchangeViewModel
        flag 1 (0x2L): currencyexchangeViewModel.to
        flag 2 (0x3L): currencyexchangeViewModel.from
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}