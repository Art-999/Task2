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

/**
 * Created by artur.musayelyan on 19/01/2018.
 */

public class Loader {
    public class Loader extends RelativeLayout {
        final int ANIM_DURATION = 500;
        Context context;
        private View loginIn;
        private View loginOut;
        private boolean isStarting;
        private ObjectAnimator anim;
        private Animation animRotLeft;

        public Loader(Context context){
            super(context);
            this.context = context;
            init();
        }

        public Loader(Context context, AttributeSet attrs) {
            super(context, attrs);
            this.context = context;
            init();
        }

        public boolean isStarting() {
            return isStarting;
        }

        private void init() {
            inflate(getContext(), R.layout.loader_view, this);
            loginIn = findViewById(R.id.login_in);
            loginOut = findViewById(R.id.login_out);
        }

        public void start() {
            if (isStarting) return;
            isStarting = true;
            setAlpha(0f);
            setVisibility(View.VISIBLE);
            animate().alpha(1f).setDuration(ANIM_DURATION).setListener(null);
            animRotLeft = AnimationUtils.loadAnimation(context, R.anim.rotate_animation_left);
            loginOut.startAnimation(animRotLeft);
            rot();
        }

        public void end() {
            if (!isStarting) return;
            isStarting = false;
            animRotLeft.cancel();
            animate().alpha(0f).setDuration(ANIM_DURATION).setListener(new AnimatorListenerAdapter() {

                @Override
                public void onAnimationEnd(Animator animation) {
                    setVisibility(View.GONE);
                }
            });
            anim.end();
        }

        private void rot() {
            anim = (ObjectAnimator) AnimatorInflater.loadAnimator(context, R.animator.flipping);
            anim.setTarget(loginIn);
            anim.setDuration(1750);
            anim.setRepeatCount(ValueAnimator.INFINITE);
            anim.start();
        }
    }

}
