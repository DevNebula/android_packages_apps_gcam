package com.google.android.apps.camera.p005ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p000.hga;
import p000.hgb;
import p000.hgc;

/* compiled from: PG */
/* renamed from: com.google.android.apps.camera.ui.widget.TracedFrameLayout */
public class TracedFrameLayout extends FrameLayout {
    /* renamed from: a */
    private final hgb f2631a = TracedFrameLayout.m1368a(this);

    public TracedFrameLayout(Context context) {
        super(context);
    }

    public TracedFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TracedFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public TracedFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    private static hgb m1368a(View view) {
        Object tag = view.getTag();
        if (tag == null) {
            return hga.f20009a;
        }
        return new hgc(tag.toString());
    }

    public void draw(Canvas canvas) {
        this.f2631a.mo7867a("draw");
        super.draw(canvas);
        this.f2631a.mo7866a();
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f2631a.mo7867a("onLayout");
        super.onLayout(z, i, i2, i3, i4);
        this.f2631a.mo7866a();
    }

    protected void onMeasure(int i, int i2) {
        this.f2631a.mo7867a("onMeasure");
        super.onMeasure(i, i2);
        this.f2631a.mo7866a();
    }
}
