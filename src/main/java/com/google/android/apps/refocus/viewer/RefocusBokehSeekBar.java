package com.google.android.apps.refocus.viewer;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.SeekBar;
import p000.hss;
import p000.hst;
import p000.huj;

/* compiled from: PG */
public class RefocusBokehSeekBar extends SeekBar {
    /* renamed from: a */
    public float f2652a = -1.0f;
    /* renamed from: b */
    public huj f2653b = null;
    /* renamed from: c */
    public hst f2654c = null;

    public RefocusBokehSeekBar(Context context) {
        super(context);
        m1377b();
    }

    public RefocusBokehSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m1377b();
    }

    public RefocusBokehSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m1377b();
    }

    /* renamed from: b */
    private final void m1377b() {
        setOnSeekBarChangeListener(new hss(this));
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        mo2809a();
    }

    /* renamed from: a */
    public final void mo2809a() {
        if (this.f2652a != -1.0f && this.f2654c != null) {
            int width = getWidth();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            float f = this.f2652a;
            this.f2654c.mo8100a(((int) (((float) ((width - paddingLeft) - paddingRight)) * f)) + getPaddingLeft());
        }
    }
}
