// Generated by data binding compiler. Do not edit!
package com.t.currenyexchange.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.t.currenyexchange.R;
import com.t.currenyexchange.viewmodels.ShowOprationsViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ShowOperationBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView listitem;

  @Bindable
  protected ShowOprationsViewModel mShowoperationViewModel;

  protected ShowOperationBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RecyclerView listitem) {
    super(_bindingComponent, _root, _localFieldCount);
    this.listitem = listitem;
  }

  public abstract void setShowoperationViewModel(
      @Nullable ShowOprationsViewModel showoperationViewModel);

  @Nullable
  public ShowOprationsViewModel getShowoperationViewModel() {
    return mShowoperationViewModel;
  }

  @NonNull
  public static ShowOperationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_showexcahngeoperation, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ShowOperationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ShowOperationBinding>inflateInternal(inflater, R.layout.activity_showexcahngeoperation, root, attachToRoot, component);
  }

  @NonNull
  public static ShowOperationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_showexcahngeoperation, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ShowOperationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ShowOperationBinding>inflateInternal(inflater, R.layout.activity_showexcahngeoperation, null, false, component);
  }

  public static ShowOperationBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ShowOperationBinding bind(@NonNull View view, @Nullable Object component) {
    return (ShowOperationBinding)bind(component, view, R.layout.activity_showexcahngeoperation);
  }
}
