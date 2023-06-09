// Generated by view binder compiler. Do not edit!
package com.example.loyaltyy.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.loyaltyy.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAddTaskBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button mBtnSaveTask;

  @NonNull
  public final EditText mEdtTaskPriority;

  @NonNull
  public final EditText mEdtTaskTitle;

  @NonNull
  public final TextView mTvEnterTaskDetails;

  private ActivityAddTaskBinding(@NonNull LinearLayout rootView, @NonNull Button mBtnSaveTask,
      @NonNull EditText mEdtTaskPriority, @NonNull EditText mEdtTaskTitle,
      @NonNull TextView mTvEnterTaskDetails) {
    this.rootView = rootView;
    this.mBtnSaveTask = mBtnSaveTask;
    this.mEdtTaskPriority = mEdtTaskPriority;
    this.mEdtTaskTitle = mEdtTaskTitle;
    this.mTvEnterTaskDetails = mTvEnterTaskDetails;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAddTaskBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAddTaskBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_add_task, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAddTaskBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.mBtnSaveTask;
      Button mBtnSaveTask = ViewBindings.findChildViewById(rootView, id);
      if (mBtnSaveTask == null) {
        break missingId;
      }

      id = R.id.mEdtTaskPriority;
      EditText mEdtTaskPriority = ViewBindings.findChildViewById(rootView, id);
      if (mEdtTaskPriority == null) {
        break missingId;
      }

      id = R.id.mEdtTaskTitle;
      EditText mEdtTaskTitle = ViewBindings.findChildViewById(rootView, id);
      if (mEdtTaskTitle == null) {
        break missingId;
      }

      id = R.id.mTvEnterTaskDetails;
      TextView mTvEnterTaskDetails = ViewBindings.findChildViewById(rootView, id);
      if (mTvEnterTaskDetails == null) {
        break missingId;
      }

      return new ActivityAddTaskBinding((LinearLayout) rootView, mBtnSaveTask, mEdtTaskPriority,
          mEdtTaskTitle, mTvEnterTaskDetails);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
