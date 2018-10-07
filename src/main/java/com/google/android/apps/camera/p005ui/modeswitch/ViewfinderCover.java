package com.google.android.apps.camera.p005ui.modeswitch;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.p005ui.layout.GcaLayout;
import p000.C0252go;
import p000.gzc;
import p000.hhx;

/* compiled from: PG */
/* renamed from: com.google.android.apps.camera.ui.modeswitch.ViewfinderCover */
public class ViewfinderCover extends GcaLayout {
    /* renamed from: b */
    public ImageView f12887b;
    /* renamed from: c */
    public AnimatedVectorDrawable f12888c;
    /* renamed from: d */
    public final ObjectAnimator f12889d = ObjectAnimator.ofFloat(this, View.ALPHA, new float[]{1.0f, 0.0f});

    public ViewfinderCover(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12889d.setDuration(250);
        this.f12889d.addListener(new gzc(this));
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.f12887b = (ImageView) findViewById(R.id.viewfinder_cover_icon);
        this.f12887b.setImageDrawable(hhx.PHOTO.mo7878a(getResources()));
    }

    @Deprecated
    /* renamed from: a */
    public final void mo12643a(int i, hhx hhx, int i2) {
        mo12644a(hhx);
        if (i2 == C0252go.f5895bo) {
            i = -i;
        }
        this.f12887b.setTranslationX((float) i);
    }

    /* renamed from: a */
    public final void mo12642a() {
        this.f12887b.setTranslationX(0.0f);
        this.f12889d.cancel();
        setAlpha(1.0f);
        setVisibility(0);
    }

    /* renamed from: a */
    public final void mo12644a(hhx hhx) {
        this.f12887b.setImageDrawable(hhx.mo7878a(getResources()));
        this.f12887b.setVisibility(0);
    }
}
