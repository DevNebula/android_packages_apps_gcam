package com.google.android.apps.camera.p005ui.views;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Size;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.bottombar.BottomBar;
import com.google.android.apps.camera.optionsbar.OptionsBarView;
import com.google.android.apps.camera.p005ui.layout.GcaLayout;
import java.util.List;
import p000.bli;
import p000.cct;
import p000.gal;
import p000.gcb;
import p000.gxs;
import p000.gxu;
import p000.gxv;
import p000.gxw;
import p000.gxx;
import p000.gxy;
import p000.gye;
import p000.gyh;
import p000.hdy;
import p000.hfr;
import p000.hfs;
import p000.hft;
import p000.hgo;
import p000.hir;
import p000.hjt;
import p000.ipz;
import p000.iqm;
import p000.jqk;

/* compiled from: PG */
/* renamed from: com.google.android.apps.camera.ui.views.MainActivityLayout */
public class MainActivityLayout extends GcaLayout {
    /* renamed from: f */
    private static final String f12891f = bli.m887a("MainActivityLayout");
    /* renamed from: b */
    public List f12892b;
    /* renamed from: c */
    public FrameLayout f12893c = null;
    /* renamed from: d */
    public gye f12894d;
    /* renamed from: e */
    public hfs f12895e;
    /* renamed from: g */
    private final WindowManager f12896g;
    /* renamed from: h */
    private BottomBar f12897h;
    /* renamed from: i */
    private ipz f12898i = null;

    public MainActivityLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ((hfr) ((cct) context).mo2254a(hfr.class)).mo13534a(this);
        this.f12896g = (WindowManager) context.getSystemService("window");
    }

    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        try {
            Trace.beginSection("MAL.dispatchApplyWindowInsets");
            WindowInsets dispatchApplyWindowInsets = super.dispatchApplyWindowInsets(windowInsets);
            return dispatchApplyWindowInsets;
        } finally {
            Trace.endSection();
        }
    }

    public void dispatchConfigurationChanged(Configuration configuration) {
        Trace.beginSection("MAL.dispatchConfigurationChanged");
        hdy.m3138a(getContext());
        super.dispatchConfigurationChanged(configuration);
        hdy.f6441a = null;
        Trace.endSection();
    }

    /* renamed from: b */
    private final gxw m8549b() {
        return !this.f12894d.mo13502a() ? ((gxy) this.f12894d.mo9715b()).mo7530b() : gxw.f6145a;
    }

    /* renamed from: c */
    private final boolean m8550c() {
        return this.f12893c != null;
    }

    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f12897h = (BottomBar) findViewById(R.id.bottom_bar);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        hfs hfs = this.f12895e;
        if (motionEvent.getActionMasked() == 0 && hfs != null) {
            Object obj;
            int i;
            hjt hjt = new hjt(motionEvent, getRootView());
            hgo hgo = hfs.f6535a;
            gal gal = hgo.f20083g;
            PointF a = hjt.mo7913a();
            View view = gal.f5222b;
            float f = a.x;
            float f2 = a.y;
            float x = view.getX();
            float y = view.getY();
            float width = ((float) view.getWidth()) + x;
            float height = ((float) view.getHeight()) + y;
            if (f < x) {
                obj = null;
            } else if (f > width) {
                obj = null;
            } else if (f2 < y) {
                obj = null;
            } else if (f2 <= height) {
                obj = 1;
            } else {
                obj = null;
            }
            if (obj == null) {
                OptionsBarView optionsBarView = hgo.f20083g.f5222b;
                if (optionsBarView.f23291e == null) {
                    obj = null;
                } else {
                    optionsBarView.mo14600a();
                    i = 1;
                }
            } else {
                obj = null;
            }
            if (obj != null) {
                f2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                if (this.f12894d.mo13502a()) {
                    i = 0;
                } else {
                    Rect a2 = ((gxy) jqk.m13354c((gxy) this.f12894d.mo9715b())).mo7529a().mo7513a();
                    i = f2 > ((float) a2.left) ? f2 < ((float) a2.right) ? y2 > ((float) a2.top) ? y2 < ((float) a2.bottom) ? 1 : 0 : 0 : 0 : 0;
                }
                return i ^ 1;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        hdy.f6441a = null;
    }

    public void onMeasure(int i, int i2) {
        Trace.beginSection("MAL.onMeasurePrologue");
        Context context = getContext();
        hdy.m3138a(context);
        Size size = new Size(MeasureSpec.getSize(i), MeasureSpec.getSize(i2));
        gxx a = m8549b().mo7523c().mo7527a(hir.m3236a(hdy.m3139b(context), hdy.m3140c(context), size.getWidth(), size.getHeight()));
        a.f6146a = size;
        gxw a2 = a.mo7526a();
        if (m8548a(a2)) {
            this.f12897h.setUiOrientation(a2.mo7521a());
            mo12647a();
        }
        Trace.endSection();
        super.onMeasure(i, i2);
    }

    /* renamed from: a */
    public final void mo12648a(int i, int i2, boolean z) {
        gxw b = m8549b();
        gxx a = b.mo7523c().mo7527a(hir.m3237a(this.f12896g.getDefaultDisplay(), getContext(), b.mo7524d().getWidth(), b.mo7524d().getHeight()));
        a.f6147b = new Size(i, i2);
        b = a.mo7528a(z).mo7526a();
        if (m8550c()) {
            this.f12898i = ipz.m4076a(i, i2);
        }
        if (m8548a(b)) {
            requestLayout();
            invalidate();
        }
    }

    /* renamed from: a */
    private final boolean m8548a(gxw gxw) {
        if (!this.f12894d.mo13502a() && (((gxy) this.f12894d.mo9715b()).mo7530b().equals(gxw) ^ 1) == 0) {
            return false;
        }
        gyh a;
        Trace.beginSection("updateLayoutBoxes");
        gxv a2 = gxu.m2932a(gxw, hdy.m3140c(getContext()), getContext());
        String str = f12891f;
        String valueOf = String.valueOf(a2);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 16);
        stringBuilder.append("Updated layout: ");
        stringBuilder.append(valueOf);
        bli.m888a(str, stringBuilder.toString());
        if (m8550c()) {
            a = gxu.m2933a(a2.mo7520h(), a2.mo7517e(), (ipz) jqk.m13354c(this.f12898i), hdy.m3140c(getContext()), gcb.m2522a(iqm.m4098c(hdy.m3139b(getContext())), true));
        } else {
            a = null;
        }
        valueOf = f12891f;
        String valueOf2 = String.valueOf(a);
        StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf2).length() + 23);
        stringBuilder2.append("Updated viewfinderSpec:");
        stringBuilder2.append(valueOf2);
        bli.m888a(valueOf, stringBuilder2.toString());
        this.f12894d.f19824a = new gxs(gxw, a2, a);
        Trace.endSection();
        return true;
    }

    /* renamed from: a */
    public final void mo12647a() {
        gxw b = m8549b();
        List<hft> list = this.f12892b;
        if (list != null && b.mo7521a() != null) {
            for (hft a : list) {
                a.mo13535a(b.mo7521a());
            }
        }
    }
}
