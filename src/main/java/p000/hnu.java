package p000;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.OnScaleGestureListener;
import android.view.View;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: hnu */
public final class hnu {
    /* renamed from: a */
    public static boolean f6750a = false;
    /* renamed from: b */
    public final GestureDetector f6751b;
    /* renamed from: c */
    public final ScaleGestureDetector f6752c;
    /* renamed from: d */
    public final hnm f6753d;
    /* renamed from: e */
    public final hnt f6754e;
    /* renamed from: f */
    public final hnl f6755f;
    /* renamed from: g */
    public final hnp f6756g;
    /* renamed from: h */
    public final hns f6757h;
    /* renamed from: i */
    public final hnq f6758i;
    /* renamed from: j */
    public final hnk f6759j;
    /* renamed from: k */
    public final kcx f6760k;
    /* renamed from: l */
    public final ilp f6761l;
    /* renamed from: m */
    public int f6762m;
    /* renamed from: n */
    public boolean f6763n;
    /* renamed from: o */
    public boolean f6764o;
    /* renamed from: p */
    public float f6765p;
    /* renamed from: q */
    public float f6766q;
    /* renamed from: r */
    public int f6767r;
    /* renamed from: s */
    private final View f6768s;
    /* renamed from: t */
    private final OnGestureListener f6769t = new hnv(this);
    /* renamed from: u */
    private final OnScaleGestureListener f6770u = new hnw(this);

    public hnu(hnx hnx, hnm hnm, hnt hnt, hnp hnp, hns hns, hnq hnq, hnk hnk, hnl hnl, ilp ilp, View view, Context context) {
        this.f6751b = new GestureDetector(hnx.f6773a, this.f6769t, hnx.f6774b);
        this.f6752c = new ScaleGestureDetector(hnx.f6773a, this.f6770u, hnx.f6774b);
        this.f6752c.setQuickScaleEnabled(false);
        this.f6753d = (hnm) jri.m13404b((Object) hnm);
        this.f6754e = (hnt) jri.m13404b((Object) hnt);
        this.f6756g = (hnp) jri.m13404b((Object) hnp);
        this.f6757h = (hns) jri.m13404b((Object) hns);
        this.f6758i = (hnq) jri.m13404b((Object) hnq);
        this.f6759j = (hnk) jri.m13404b((Object) hnk);
        this.f6755f = hnl;
        this.f6762m = C0252go.f5858bD;
        this.f6760k = kee.m13694a(hnj.ZOOM, context.getResources().getString(R.string.preference_double_tap_zoom), hnj.SWITCH_CAMERA, context.getResources().getString(R.string.preference_double_tap_switch_camera), hnj.NONE, context.getResources().getString(R.string.preference_double_tap_none));
        this.f6761l = ilp;
        this.f6768s = view;
    }

    /* renamed from: a */
    public final PointF mo7977a(MotionEvent motionEvent) {
        return new hjt(motionEvent, this.f6768s).mo7913a();
    }

    /* renamed from: a */
    public final hnn mo7978a() {
        if (this.f6762m == C0252go.f5859bE) {
            return this.f6753d;
        }
        if (this.f6762m == C0252go.f5860bF) {
            return this.f6754e;
        }
        return hnn.f6748a;
    }
}
