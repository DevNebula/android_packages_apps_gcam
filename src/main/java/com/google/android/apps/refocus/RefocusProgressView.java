package com.google.android.apps.refocus;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
public class RefocusProgressView extends View {
    /* renamed from: a */
    public boolean f2645a;
    /* renamed from: b */
    private final Drawable f2646b = getResources().getDrawable(R.drawable.refocus_arrow_top);
    /* renamed from: c */
    private final Drawable f2647c = getResources().getDrawable(R.drawable.refocus_arrow_bottom);
    /* renamed from: d */
    private final Drawable f2648d = getResources().getDrawable(R.drawable.ic_phone_graphic);
    /* renamed from: e */
    private final Drawable f2649e = getResources().getDrawable(R.drawable.ic_warning_graphic);

    public RefocusProgressView(Context context) {
        super(context);
    }

    public RefocusProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RefocusProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        this.f2646b.draw(canvas);
        this.f2647c.draw(canvas);
        if (this.f2645a) {
            this.f2649e.draw(canvas);
        } else {
            this.f2648d.draw(canvas);
        }
    }

    /* renamed from: a */
    public final void mo2763a(float f) {
        int height = getHeight();
        int floor = (int) Math.floor((double) (((float) getWidth()) / 2.0f));
        int minimumHeight = this.f2646b.getMinimumHeight();
        int minimumWidth = this.f2646b.getMinimumWidth();
        int minimumWidth2 = this.f2647c.getMinimumWidth();
        int intrinsicHeight = this.f2648d.getIntrinsicHeight();
        int intrinsicWidth = this.f2648d.getIntrinsicWidth();
        int intrinsicWidth2 = this.f2649e.getIntrinsicWidth();
        int intrinsicHeight2 = this.f2649e.getIntrinsicHeight();
        height = ((height - 8) - minimumHeight) - intrinsicHeight;
        int floor2 = (int) Math.floor((double) (((float) height) * f));
        height = (height + minimumHeight) - floor2;
        minimumHeight = height + 4;
        int i = (minimumHeight + 4) + intrinsicHeight;
        int i2 = intrinsicHeight / intrinsicHeight2;
        minimumWidth /= 2;
        this.f2646b.setBounds(floor - minimumWidth, 0, minimumWidth + floor, height);
        height = intrinsicWidth / 2;
        this.f2648d.setBounds(floor - height, minimumHeight, height + floor, intrinsicHeight + minimumHeight);
        height = (intrinsicWidth2 * i2) / 2;
        this.f2649e.setBounds(floor - height, minimumHeight, height + floor, (intrinsicHeight2 * i2) + minimumHeight);
        height = minimumWidth2 / 2;
        this.f2647c.setBounds(floor - height, i, height + floor, i + floor2);
        invalidate();
    }
}
