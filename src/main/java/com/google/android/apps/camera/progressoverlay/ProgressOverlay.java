package com.google.android.apps.camera.progressoverlay;

import android.content.Context;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
public class ProgressOverlay extends FrameLayout {
    /* renamed from: a */
    public AnimatedVectorDrawable f2582a;
    /* renamed from: b */
    private ImageView f2583b;

    public ProgressOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        ((LayoutInflater) getContext().getSystemService("layout_inflater")).inflate(R.layout.progress_overlay, this);
        this.f2583b = (ImageView) findViewById(R.id.progress_circular);
        this.f2582a = (AnimatedVectorDrawable) getContext().getDrawable(R.drawable.processing_indicator_animation);
        this.f2583b.setImageDrawable(this.f2582a);
    }
}
