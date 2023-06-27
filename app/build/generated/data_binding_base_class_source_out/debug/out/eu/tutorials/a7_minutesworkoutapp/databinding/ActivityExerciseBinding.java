// Generated by view binder compiler. Do not edit!
package eu.tutorials.a7_minutesworkoutapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import eu.tutorials.a7_minutesworkoutapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityExerciseBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ProgressBar ExerciseBar;

  @NonNull
  public final FrameLayout flExerciseView;

  @NonNull
  public final FrameLayout flRestView;

  @NonNull
  public final ImageView ivImage;

  @NonNull
  public final ProgressBar progressBar;

  @NonNull
  public final Toolbar toolbarExercise;

  @NonNull
  public final TextView tvExerciseName;

  @NonNull
  public final TextView tvExerciseTimer;

  @NonNull
  public final TextView tvTimer;

  @NonNull
  public final TextView tvTitle;

  @NonNull
  public final TextView tvUpComingExercise;

  @NonNull
  public final TextView tvUpComingLabel;

  private ActivityExerciseBinding(@NonNull ConstraintLayout rootView,
      @NonNull ProgressBar ExerciseBar, @NonNull FrameLayout flExerciseView,
      @NonNull FrameLayout flRestView, @NonNull ImageView ivImage, @NonNull ProgressBar progressBar,
      @NonNull Toolbar toolbarExercise, @NonNull TextView tvExerciseName,
      @NonNull TextView tvExerciseTimer, @NonNull TextView tvTimer, @NonNull TextView tvTitle,
      @NonNull TextView tvUpComingExercise, @NonNull TextView tvUpComingLabel) {
    this.rootView = rootView;
    this.ExerciseBar = ExerciseBar;
    this.flExerciseView = flExerciseView;
    this.flRestView = flRestView;
    this.ivImage = ivImage;
    this.progressBar = progressBar;
    this.toolbarExercise = toolbarExercise;
    this.tvExerciseName = tvExerciseName;
    this.tvExerciseTimer = tvExerciseTimer;
    this.tvTimer = tvTimer;
    this.tvTitle = tvTitle;
    this.tvUpComingExercise = tvUpComingExercise;
    this.tvUpComingLabel = tvUpComingLabel;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityExerciseBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityExerciseBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_exercise, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityExerciseBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ExerciseBar;
      ProgressBar ExerciseBar = ViewBindings.findChildViewById(rootView, id);
      if (ExerciseBar == null) {
        break missingId;
      }

      id = R.id.flExerciseView;
      FrameLayout flExerciseView = ViewBindings.findChildViewById(rootView, id);
      if (flExerciseView == null) {
        break missingId;
      }

      id = R.id.flRestView;
      FrameLayout flRestView = ViewBindings.findChildViewById(rootView, id);
      if (flRestView == null) {
        break missingId;
      }

      id = R.id.ivImage;
      ImageView ivImage = ViewBindings.findChildViewById(rootView, id);
      if (ivImage == null) {
        break missingId;
      }

      id = R.id.progressBar;
      ProgressBar progressBar = ViewBindings.findChildViewById(rootView, id);
      if (progressBar == null) {
        break missingId;
      }

      id = R.id.toolbarExercise;
      Toolbar toolbarExercise = ViewBindings.findChildViewById(rootView, id);
      if (toolbarExercise == null) {
        break missingId;
      }

      id = R.id.tvExerciseName;
      TextView tvExerciseName = ViewBindings.findChildViewById(rootView, id);
      if (tvExerciseName == null) {
        break missingId;
      }

      id = R.id.tvExerciseTimer;
      TextView tvExerciseTimer = ViewBindings.findChildViewById(rootView, id);
      if (tvExerciseTimer == null) {
        break missingId;
      }

      id = R.id.tvTimer;
      TextView tvTimer = ViewBindings.findChildViewById(rootView, id);
      if (tvTimer == null) {
        break missingId;
      }

      id = R.id.tvTitle;
      TextView tvTitle = ViewBindings.findChildViewById(rootView, id);
      if (tvTitle == null) {
        break missingId;
      }

      id = R.id.tvUpComingExercise;
      TextView tvUpComingExercise = ViewBindings.findChildViewById(rootView, id);
      if (tvUpComingExercise == null) {
        break missingId;
      }

      id = R.id.tvUpComingLabel;
      TextView tvUpComingLabel = ViewBindings.findChildViewById(rootView, id);
      if (tvUpComingLabel == null) {
        break missingId;
      }

      return new ActivityExerciseBinding((ConstraintLayout) rootView, ExerciseBar, flExerciseView,
          flRestView, ivImage, progressBar, toolbarExercise, tvExerciseName, tvExerciseTimer,
          tvTimer, tvTitle, tvUpComingExercise, tvUpComingLabel);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
