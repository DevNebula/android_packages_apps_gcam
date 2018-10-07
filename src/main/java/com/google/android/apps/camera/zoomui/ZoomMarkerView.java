package com.google.android.apps.camera.zoomui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import p000.hpr;
import p000.jri;

/* compiled from: PG */
public class ZoomMarkerView extends View {
    /* renamed from: a */
    public final hpr f2639a;
    /* renamed from: b */
    public boolean f2640b;
    /* renamed from: c */
    public float f2641c;
    /* renamed from: d */
    public float f2642d;
    /* renamed from: e */
    public float f2643e;
    /* renamed from: f */
    public float f2644f = 1.0f;

    public ZoomMarkerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2639a = new hpr(context.getResources());
        this.f2641c = this.f2644f;
    }

    public ZoomMarkerView(Context context, hpr hpr) {
        super(context);
        this.f2639a = hpr;
    }

    protected void onDraw(Canvas canvas) {
        if (this.f2640b) {
            boolean z;
            hpr hpr = this.f2639a;
            float f = this.f2641c;
            float f2 = this.f2642d;
            float width = (float) getWidth();
            if (hpr.f6804i != 0.0f) {
                z = true;
            } else {
                z = false;
            }
            jri.m13396a(z, (Object) "max zoom value hasn't been initialized properly");
            if (hpr.f6805j >= 1.0f) {
                z = true;
            } else {
                z = false;
            }
            jri.m13396a(z, (Object) "min zoom value hasn't been initialized properly");
            float f3 = hpr.f6805j;
            if (f >= f3) {
                z = true;
            } else {
                z = false;
            }
            Float valueOf = Float.valueOf(f3);
            Float valueOf2 = Float.valueOf(hpr.f6804i);
            Float valueOf3 = Float.valueOf(f);
            jri.m13402a(z, "zoom must be in the range [%s, %s]: %s", valueOf, valueOf2, valueOf3);
            f3 = hpr.f6804i;
            if (f <= f3) {
                z = true;
            } else {
                z = false;
            }
            jri.m13402a(z, "zoom must be in the range [%s, %s]: %s", Float.valueOf(hpr.f6805j), Float.valueOf(f3), valueOf3);
            if (f2 >= 0.0f) {
                z = true;
            } else {
                z = false;
            }
            Object valueOf4 = Float.valueOf(f2);
            jri.m13400a(z, "scale must be in the range [0, 1]: %s", valueOf4);
            if (f2 <= 1.0f) {
                z = true;
            } else {
                z = false;
            }
            jri.m13400a(z, "scale must be in the range [0, 1]: %s", valueOf4);
            if (f2 != 0.0f) {
                float f4 = hpr.f6797b;
                f3 = hpr.f6796a;
                float f5 = hpr.f6798c;
                float f6 = hpr.f6801f;
                f = (((float) (Math.log((double) (f / hpr.f6805j)) / Math.log((double) (hpr.f6804i / hpr.f6805j)))) * ((width - f6) - f6)) + f6;
                width = (f3 * f2) / 2.0f;
                f3 = hpr.f6797b;
                f4 = f3 - (f4 * f2);
                f5 = f3 - (f5 * f2);
                f6 = f - width;
                width += f;
                Path path = new Path();
                path.moveTo(f, f3);
                path.lineTo(width, f5);
                path.lineTo(width, hpr.f6799d + f4);
                path.quadTo(width, f4, width - hpr.f6799d, f4);
                path.lineTo(hpr.f6799d + f6, f4);
                path.quadTo(f6, f4, f6, hpr.f6799d + f4);
                path.lineTo(f6, f5);
                path.lineTo(f, f3);
                path.close();
                canvas.drawPath(path, hpr.f6802g);
                String concat = String.valueOf(String.format("%.1f", new Object[]{valueOf3})).concat(" X");
                hpr.f6803h.setTextSize(f2 * hpr.f6800e);
                Rect rect = new Rect();
                hpr.f6803h.getTextBounds(concat, 0, concat.length(), rect);
                canvas.drawText(concat, f, (f4 + ((f5 - f4) / 2.0f)) + ((float) (rect.height() / 2)), hpr.f6803h);
            }
        }
    }

    /* renamed from: a */
    public final void mo2757a(float f) {
        boolean z;
        boolean z2 = true;
        float f2 = this.f2643e;
        if (f <= f2) {
            z = true;
        } else {
            z = false;
        }
        Object valueOf = Float.valueOf(f2);
        Object valueOf2 = Float.valueOf(f);
        jri.m13401a(z, "marker position must be in range [1,%s] was: %s", valueOf, valueOf2);
        if (f < 1.0f) {
            z2 = false;
        }
        jri.m13401a(z2, "marker position must be in range [1,%s] was: %s", Float.valueOf(this.f2643e), valueOf2);
        this.f2641c = f;
        invalidate();
    }
}
