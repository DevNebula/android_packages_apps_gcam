package com.google.android.apps.refocus.viewer;

import android.content.Context;
import android.graphics.Point;
import android.graphics.RectF;
import android.preference.PreferenceManager;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.refocus.processing.EditingFinishedListener;
import com.google.android.apps.refocus.processing.ProgressListener;
import p000.bli;
import p000.gxa;
import p000.gxc;
import p000.gxd;
import p000.gxe;
import p000.gxf;
import p000.gxg;
import p000.hsn;
import p000.hso;
import p000.hsp;
import p000.hsq;
import p000.ikd;

/* compiled from: PG */
public class RGBZFocusControls extends FrameLayout implements ProgressListener, hsq {
    /* renamed from: a */
    public static final String f12900a = bli.m887a("RGBZFcsCtrls");
    /* renamed from: b */
    public final RectF f12901b = new RectF();
    /* renamed from: c */
    public final int f12902c;
    /* renamed from: d */
    public int f12903d = 0;
    /* renamed from: e */
    public hso f12904e = null;
    /* renamed from: f */
    public hsp f12905f;
    /* renamed from: g */
    public EditingFinishedListener f12906g = null;
    /* renamed from: h */
    public boolean f12907h = false;
    /* renamed from: i */
    private final GestureDetector f12908i = new GestureDetector(getContext(), new hsn(this));
    /* renamed from: j */
    private gxa f12909j;
    /* renamed from: k */
    private gxc f12910k;
    /* renamed from: l */
    private Point f12911l;

    public RGBZFocusControls(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
        this.f12902c = getResources().getDimensionPixelSize(R.dimen.refocus_editor_cling_width);
        if (PreferenceManager.getDefaultSharedPreferences(getContext()).getBoolean("should_show_cling_for_refocus_scrubber", true)) {
            LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f12902c, -2);
            layoutParams.gravity = 83;
            this.f12904e = new hso(this, context);
            addView(this.f12904e, layoutParams);
        }
        this.f12909j = new gxa(context, attributeSet);
        this.f12909j.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f12910k = new gxc(this.f12909j, new ikd());
        addView(this.f12909j);
    }

    public void onDone() {
    }

    /* renamed from: a */
    public final void mo8095a(RectF rectF) {
        this.f12901b.set(rectF);
        gxc gxc = this.f12910k;
        gxc.f6105c.execute(new gxf(gxc, rectF));
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f12903d = i3 - i;
        mo12661a();
    }

    public void onProgress(float f) {
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f12908i.onTouchEvent(motionEvent);
        return true;
    }

    /* renamed from: a */
    public final void mo12662a(boolean z, float f) {
        if (z) {
            hsp hsp = this.f12905f;
            if (hsp != null) {
                hsp.mo8093a(f);
            }
        }
        if (f < 0.0f || f > 1.0f) {
            String str = f12900a;
            StringBuilder stringBuilder = new StringBuilder(62);
            stringBuilder.append("Bokeh indicator value was out of (0..1) range: ");
            stringBuilder.append(f);
            bli.m891b(str, stringBuilder.toString());
            if (f > 1.0f) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
        }
        if (!(this.f12909j.f19791b.mo7587a() || this.f12909j.f19790a.mo7587a())) {
            Point point = this.f12911l;
            if (point != null) {
                gxc gxc = this.f12910k;
                int i = point.x;
                int i2 = point.y;
                if (gxc.f6106d) {
                    gxc.f6105c.execute(new gxd(gxc, i, i2));
                }
            }
        }
        gxc gxc2 = this.f12910k;
        gxc2.f6105c.execute(new gxg(gxc2, (0.5f * f) + 0.15f));
        invalidate();
    }

    /* renamed from: a */
    public final void mo12663a(boolean z, int i, int i2) {
        this.f12911l = new Point(i, i2);
        if (z) {
            hsp hsp = this.f12905f;
            if (hsp != null) {
                hsp.mo8094a(i, i2);
                gxc gxc = this.f12910k;
                Point point = this.f12911l;
                gxc.f6105c.execute(new gxe(gxc, point.x, point.y));
            }
        }
    }

    /* renamed from: a */
    public final void mo12661a() {
        hsp hsp = this.f12905f;
        if (hsp != null) {
            mo12662a(false, hsp.mo8091B_());
            float[] C_ = this.f12905f.mo8092C_();
            if (C_ != null) {
                mo12663a(false, (int) C_[0], (int) C_[1]);
            }
        }
    }
}
