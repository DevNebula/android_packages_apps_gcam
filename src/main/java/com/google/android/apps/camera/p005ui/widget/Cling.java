package com.google.android.apps.camera.p005ui.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.widget.TextView;
import p000.hfx;

/* compiled from: PG */
/* renamed from: com.google.android.apps.camera.ui.widget.Cling */
public class Cling extends TextView {
    /* renamed from: a */
    public boolean f2625a;
    /* renamed from: b */
    private View f2626b;
    /* renamed from: c */
    private final int[] f2627c;
    /* renamed from: d */
    private final OnLayoutChangeListener f2628d;

    public Cling(Context context) {
        super(context);
        this.f2626b = null;
        this.f2627c = new int[2];
        this.f2628d = new hfx(this);
        this.f2625a = false;
    }

    public Cling(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2626b = null;
        this.f2627c = new int[2];
        this.f2628d = new hfx(this);
        this.f2625a = false;
    }

    /* renamed from: a */
    public final void mo2744a() {
        View view = this.f2626b;
        if (view != null) {
            view.getLocationInWindow(this.f2627c);
            int i = this.f2627c[0];
            int width = this.f2626b.getWidth();
            int i2 = this.f2627c[1];
            int width2 = getWidth();
            int height = getHeight();
            getLocationInWindow(this.f2627c);
            int i3 = this.f2627c[0];
            float translationX = getTranslationX();
            int i4 = this.f2627c[1];
            float translationY = getTranslationY();
            setTranslationX((float) (((i + (width / 2)) - (width2 / 2)) - (i3 - ((int) translationX))));
            setTranslationY((float) ((i2 - height) - (i4 - ((int) translationY))));
        }
    }

    public void draw(Canvas canvas) {
        if (!this.f2625a) {
            super.draw(canvas);
        }
    }

    /* renamed from: a */
    public final void mo2745a(View view) {
        if (view == null) {
            View view2 = this.f2626b;
            if (view2 != null) {
                view2.removeOnLayoutChangeListener(this.f2628d);
                this.f2626b = null;
                return;
            }
            return;
        }
        this.f2626b = view;
        this.f2626b.addOnLayoutChangeListener(this.f2628d);
        if (this.f2626b.getVisibility() == 8) {
            this.f2625a = true;
        } else {
            mo2744a();
        }
    }
}
