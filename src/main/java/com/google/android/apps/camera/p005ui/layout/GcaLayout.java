package com.google.android.apps.camera.p005ui.layout;

import android.content.Context;
import android.graphics.Rect;
import android.os.Trace;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import p000.C0252go;
import p000.bli;
import p000.cct;
import p000.gxv;
import p000.gxy;
import p000.gyb;
import p000.gyc;
import p000.gyh;
import p000.jqk;
import p000.kbn;

/* compiled from: PG */
/* renamed from: com.google.android.apps.camera.ui.layout.GcaLayout */
public class GcaLayout extends FrameLayout {
    /* renamed from: b */
    private static final String f2609b = bli.m887a("GcaLayout");
    /* renamed from: a */
    public kbn f2610a;
    /* renamed from: c */
    private gxv f2611c;

    public GcaLayout(Context context) {
        super(context);
        m1358a(context);
    }

    public GcaLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m1358a(context);
    }

    public GcaLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m1358a(context);
    }

    protected boolean checkLayoutParams(LayoutParams layoutParams) {
        return layoutParams instanceof gyc;
    }

    protected FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return new gyc(C0252go.f5893bm);
    }

    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new gyc(getContext(), attributeSet);
    }

    /* renamed from: a */
    private final void m1358a(Context context) {
        ((gyb) ((cct) context).mo2254a(gyb.class)).mo13501a(this);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Trace.beginSection(String.valueOf(getTag().toString()).concat(".onLayout"));
        super.onLayout(z, i, i2, i3, i4);
        Trace.endSection();
    }

    public void onMeasure(int i, int i2) {
        Trace.beginSection(String.valueOf(getTag().toString()).concat(".onMeasure"));
        gxy gxy = (gxy) jqk.m13354c((gxy) this.f2610a.mo9715b());
        if (!(gxy == null || this.f2611c == gxy.mo7529a())) {
            gxv a = gxy.mo7529a();
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                gyc gyc = (gyc) childAt.getLayoutParams();
                int i4 = gyc.f6153a;
                if (i4 != 0) {
                    switch (i4 - 1) {
                        case 0:
                            GcaLayout.m1359a(gyc, childAt, a.mo7514b());
                            break;
                        case 1:
                            GcaLayout.m1359a(gyc, childAt, a.mo7517e());
                            break;
                        case 2:
                            GcaLayout.m1359a(gyc, childAt, a.mo7519g());
                            break;
                        case 3:
                            GcaLayout.m1359a(gyc, childAt, a.mo7518f());
                            break;
                        case 4:
                            GcaLayout.m1359a(gyc, childAt, a.mo7516d());
                            break;
                        case 5:
                            GcaLayout.m1359a(gyc, childAt, a.mo7513a());
                            break;
                        case 6:
                            gyh c = gxy.mo7531c();
                            if (c != null) {
                                gyc.width = c.mo7545e().getWidth();
                                gyc.height = c.mo7545e().getHeight();
                                gyc.gravity = c.mo7541a();
                                gyc.setLayoutDirection(c.mo7542b());
                                gyc.setMargins(c.mo7543c().left, c.mo7543c().top, c.mo7543c().right, c.mo7543c().bottom);
                                childAt.setLayoutParams(gyc);
                                childAt.setPadding(c.mo7544d().left, c.mo7544d().top, c.mo7544d().right, c.mo7544d().bottom);
                                break;
                            }
                            GcaLayout.m1359a(gyc, childAt, a.mo7519g());
                            break;
                        case 7:
                            GcaLayout.m1359a(gyc, childAt, a.mo7515c());
                            break;
                        default:
                            break;
                    }
                }
            }
            this.f2611c = a;
        }
        super.onMeasure(i, i2);
        Trace.endSection();
    }

    public void requestLayout() {
        super.requestLayout();
        this.f2611c = null;
    }

    /* renamed from: a */
    private static void m1359a(gyc gyc, View view, Rect rect) {
        if (rect.width() < 0 || rect.height() < 0) {
            String str = f2609b;
            String valueOf = String.valueOf(rect);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 38);
            stringBuilder.append("rect box has negative width or height ");
            stringBuilder.append(valueOf);
            bli.m888a(str, stringBuilder.toString());
            return;
        }
        gyc.width = rect.width();
        gyc.height = rect.height();
        gyc.setMargins(rect.left, rect.top, 0, 0);
        view.setLayoutParams(gyc);
    }
}
