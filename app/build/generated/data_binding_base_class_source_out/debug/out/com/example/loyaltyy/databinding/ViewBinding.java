// Generated by view binder compiler. Do not edit!
package com.example.loyaltyy.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBindings;
import com.example.loyaltyy.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ViewBinding implements androidx.viewbinding.ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView mTvTaskTitle;

  @NonNull
  public final LinearLayout myLayout;

  @NonNull
  public final TextView priority;

  private ViewBinding(@NonNull LinearLayout rootView, @NonNull TextView mTvTaskTitle,
      @NonNull LinearLayout myLayout, @NonNull TextView priority) {
    this.rootView = rootView;
    this.mTvTaskTitle = mTvTaskTitle;
    this.myLayout = myLayout;
    this.priority = priority;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ViewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ViewBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.view, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ViewBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.mTvTaskTitle;
      TextView mTvTaskTitle = ViewBindings.findChildViewById(rootView, id);
      if (mTvTaskTitle == null) {
        break missingId;
      }

      id = R.id.myLayout;
      LinearLayout myLayout = ViewBindings.findChildViewById(rootView, id);
      if (myLayout == null) {
        break missingId;
      }

      id = R.id.priority;
      TextView priority = ViewBindings.findChildViewById(rootView, id);
      if (priority == null) {
        break missingId;
      }

      return new ViewBinding((LinearLayout) rootView, mTvTaskTitle, myLayout, priority);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
