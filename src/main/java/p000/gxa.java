package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: gxa */
public final class gxa extends View implements gwy, gzk {
    /* renamed from: a */
    public final gwu f19790a = new gwu(this.f19793d, this.f19796g);
    /* renamed from: b */
    public final gxh f19791b = new gxh(this.f19793d, this.f19796g);
    /* renamed from: c */
    public bsn f19792c;
    /* renamed from: d */
    private final gzi f19793d = new gzi(this, new hkc());
    /* renamed from: e */
    private final gzl f19794e;
    /* renamed from: f */
    private final float f19795f;
    /* renamed from: g */
    private final Paint f19796g;
    /* renamed from: h */
    private gwz f19797h;
    /* renamed from: i */
    private boolean f19798i;
    /* renamed from: j */
    private float f19799j;
    /* renamed from: k */
    private int f19800k;
    /* renamed from: l */
    private int f19801l;

    static {
        bli.m887a("FocusRingView");
        bsa bsa = new bsa("camera.focus.debug");
    }

    public gxa(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ((gxb) ((cct) context).mo2254a(gxb.class)).mo13488a(this);
        Resources resources = getResources();
        this.f19796g = gxa.m11867a(resources, (int) R.color.focus_color);
        gxa.m11867a(resources, (int) R.color.focus_debug);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.focus_circle_min_size);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.focus_circle_max_size);
        this.f19795f = (float) resources.getDimensionPixelSize(R.dimen.focus_circle_initial_size);
        this.f19794e = new gzl((float) dimensionPixelSize, (float) dimensionPixelSize2);
        this.f19793d.f19835a.add(this.f19790a);
        this.f19793d.f19835a.add(this.f19791b);
        this.f19798i = true;
        this.f19799j = this.f19795f;
    }

    /* renamed from: f */
    private final void m11868f() {
        gwz gwz = this.f19790a;
        gwz.f19784i = this.f19800k;
        gwz.f19785j = this.f19801l;
    }

    /* renamed from: a */
    public final void mo7491a() {
        getLocationInWindow(new int[2]);
        this.f19799j = this.f19795f;
        if (!this.f19798i) {
            m11868f();
        }
    }

    /* renamed from: b */
    public final boolean mo7494b() {
        return this.f19791b.mo7587a();
    }

    /* renamed from: c */
    public final boolean mo7495c() {
        return this.f19790a.mo7587a();
    }

    /* renamed from: a */
    private static Paint m11867a(Resources resources, int i) {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(resources.getColor(i));
        paint.setStyle(Style.STROKE);
        paint.setStrokeCap(Cap.ROUND);
        paint.setStrokeWidth(resources.getDimension(R.dimen.focus_circle_stroke));
        return paint;
    }

    protected final void onDraw(Canvas canvas) {
        if (this.f19798i) {
            this.f19798i = false;
            m11868f();
        }
        gzi gzi = this.f19793d;
        gzi.f19838d = true;
        gzi.f19837c = false;
        gzi.f19840f = SystemClock.uptimeMillis();
        if (gzi.f19839e <= 0) {
            gzi.f19839e = gzi.f19840f;
        }
        long j = gzi.f19840f;
        long j2 = j - gzi.f19839e;
        gzi.f19839e = j;
        for (gzh gzh : gzi.f19835a) {
            if (gzh.mo7587a()) {
                gzh.mo7586a(gzi.f19840f, j2, canvas);
            }
        }
        if (gzi.f19837c) {
            gzi.f19836b.invalidate();
        } else {
            gzi.f19839e = -1;
        }
        gzi.f19838d = false;
    }

    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f19800k = (i3 - i) / 2;
        this.f19801l = (i4 - i2) / 2;
    }

    /* renamed from: a */
    public final void mo7493a(float f, float f2) {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        int i = iArr[1];
        int i2 = (int) (f - ((float) iArr[0]));
        gwz gwz = this.f19790a;
        gwz.f19784i = i2;
        i = (int) (f2 - ((float) i));
        gwz.f19785j = i;
        gwz = this.f19791b;
        gwz.f19784i = i2;
        gwz.f19785j = i;
    }

    /* renamed from: a */
    public final void mo7492a(float f) {
        gzl gzl = this.f19794e;
        float f2 = gzl.f6224a;
        if (f2 < 0.0f) {
            f2 = Math.max(f2, Math.min(0.0f, f));
        } else {
            f2 = Math.max(0.0f, Math.min(f2, f));
        }
        float f3 = gzl.f6225b + (f2 * gzl.f6226c);
        long a = this.f19793d.mo13504a();
        gwz gwz = this.f19797h;
        if (gwz != null && f3 > 0.1f) {
            if (gwz.f19789n == C0252go.f5891bk && ((double) Math.abs(gwz.f19779d.f6219a - f3)) > 0.1d) {
                String str = gwz.f19776a;
                StringBuilder stringBuilder = new StringBuilder(70);
                stringBuilder.append("FOCUS STATE ENTER VIA setRadius(");
                stringBuilder.append(a);
                stringBuilder.append(", ");
                stringBuilder.append(f3);
                stringBuilder.append(")");
                bli.m896d(str, stringBuilder.toString());
                gwz.f19789n = C0252go.f5889bi;
                float f4 = gwz.f19782g;
                long j = gwz.f19787l;
                float f5 = gwz.f19783h;
                if (((float) j) + f5 > ((float) a)) {
                    a -= (long) (f4 * gzo.m3009a(gwz.f19781f, gwz.f19780e, ((float) (a - j)) / f5));
                }
                gwz.f19786k = a;
            }
            gwz.f19779d.f6219a = f3;
            this.f19799j = f3;
        }
    }

    /* renamed from: d */
    public final void mo7496d() {
        this.f19793d.invalidate();
        long a = this.f19793d.mo13504a();
        if (this.f19790a.mo7587a() && !this.f19790a.mo13485b()) {
            this.f19790a.mo13483a(a);
        }
        this.f19791b.mo13484a(a, 0.0f, this.f19799j);
        this.f19797h = this.f19791b;
    }

    /* renamed from: e */
    public final void mo7497e() {
        this.f19793d.invalidate();
        long a = this.f19793d.mo13504a();
        if (this.f19791b.mo7587a() && !this.f19791b.mo13485b()) {
            this.f19791b.mo13483a(a);
        }
        gwu gwu = this.f19790a;
        float f = this.f19799j;
        gwu.mo13484a(a, f, f);
        this.f19797h = this.f19790a;
    }
}
