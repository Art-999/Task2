package com.example.arturmusayelyan.task2.bookieMyExample.views;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;

import com.example.arturmusayelyan.task2.R;

/**
 * Created by artur.musayelyan on 22/01/2018.
 */

public class Loader extends RelativeLayout {
    private final int ANIM_DURATION = 500;
    private View iconLoader;
    private View circleLoader;
    private Context context;
    private ObjectAnimator animator;
    private Animation animRotLeft;
    private boolean isStarting;

    public Loader(Context context) {
        super(context);
        this.context = context;
        init();
    }

    public Loader(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.context = context;
        init();
    }

    private void init() {
        View view = inflate(context, R.layout.loader_view, this);
        circleLoader = view.findViewById(R.id.circle_loading_view);
        iconLoader = view.findViewById(R.id.icon_loading_view);
    }

    public void start() {
        if (isStarting) {
            return;
        }
        isStarting = true;
        setAlpha(0f);
        setVisibility(VISIBLE);
        animate().alpha(1f).setDuration(ANIM_DURATION).setListener(null);
        animRotLeft = AnimationUtils.loadAnimation(context, R.anim.rotate_animation_eft);
        circleLoader.startAnimation(animRotLeft);
        rot();
    }

    public void end() {
        if (!isStarting) {
            return;
        }
        isStarting = false;
        animRotLeft.cancel();
        animate().alpha(0f).setDuration(ANIM_DURATION).setListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animation) {
                setVisibility(GONE);
            }
        });
        animator.end();
    }

    private void rot() {
        animator = (ObjectAnimator) AnimatorInflater.loadAnimator(context, R.animator.flipping);
        animator.setTarget(iconLoader);
        animator.setDuration(1750);
        animator.setRepeatCount(ValueAnimator.INFINITE);
        animator.start();
    }
}
