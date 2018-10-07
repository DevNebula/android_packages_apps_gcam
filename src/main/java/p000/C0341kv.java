package p000;

import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;

/* compiled from: PG */
/* renamed from: kv */
public abstract class C0341kv implements OnTouchListener {
    /* renamed from: q */
    private static final int f8984q = ViewConfiguration.getTapTimeout();
    /* renamed from: a */
    public final C0342kw f8985a = new C0342kw();
    /* renamed from: b */
    public final View f8986b;
    /* renamed from: c */
    public boolean f8987c;
    /* renamed from: d */
    public boolean f8988d;
    /* renamed from: e */
    public boolean f8989e;
    /* renamed from: f */
    private final Interpolator f8990f = new AccelerateInterpolator();
    /* renamed from: g */
    private Runnable f8991g;
    /* renamed from: h */
    private float[] f8992h = new float[]{0.0f, 0.0f};
    /* renamed from: i */
    private float[] f8993i = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
    /* renamed from: j */
    private int f8994j;
    /* renamed from: k */
    private int f8995k;
    /* renamed from: l */
    private float[] f8996l = new float[]{0.0f, 0.0f};
    /* renamed from: m */
    private float[] f8997m = new float[]{0.0f, 0.0f};
    /* renamed from: n */
    private float[] f8998n = new float[]{Float.MAX_VALUE, Float.MAX_VALUE};
    /* renamed from: o */
    private boolean f8999o;
    /* renamed from: p */
    private boolean f9000p;

    /* renamed from: a */
    public abstract boolean mo10446a();

    /* renamed from: a */
    public abstract boolean mo10447a(int i);

    /* renamed from: b */
    public abstract void mo10448b(int i);

    public C0341kv(View view) {
        this.f8986b = view;
        DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
        float f = displayMetrics.density;
        float f2 = displayMetrics.density;
        float[] fArr = this.f8998n;
        f = ((float) ((int) ((f * 1575.0f) + 0.5f))) / 1000.0f;
        fArr[0] = f;
        fArr[1] = f;
        float[] fArr2 = this.f8997m;
        f2 = ((float) ((int) ((f2 * 315.0f) + 0.5f))) / 1000.0f;
        fArr2[0] = f2;
        fArr2[1] = f2;
        this.f8994j = 1;
        float[] fArr3 = this.f8993i;
        fArr3[0] = Float.MAX_VALUE;
        fArr3[1] = Float.MAX_VALUE;
        fArr3 = this.f8992h;
        fArr3[0] = 0.2f;
        fArr3[1] = 0.2f;
        fArr3 = this.f8996l;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f8995k = f8984q;
        C0342kw c0342kw = this.f8985a;
        c0342kw.f9092a = 500;
        c0342kw.f9093b = 500;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0031  */
    /* renamed from: a */
    private final float m5426a(int r6, float r7, float r8, float r9) {
        /*
        r5 = this;
        r1 = 0;
        r0 = r5.f8992h;
        r0 = r0[r6];
        r0 = r0 * r8;
        r2 = r5.f8993i;
        r2 = r2[r6];
        r0 = p000.C0341kv.m5425a(r0, r1, r2);
        r2 = r5.m5424a(r7, r0);
        r3 = r8 - r7;
        r0 = r5.m5424a(r3, r0);
        r0 = r0 - r2;
        r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r2 >= 0) goto L_0x0052;
    L_0x001d:
        r2 = r5.f8990f;
        r0 = -r0;
        r0 = r2.getInterpolation(r0);
        r0 = -r0;
    L_0x0025:
        r2 = -1082130432; // 0xffffffffbf800000 float:-1.0 double:NaN;
        r3 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0 = p000.C0341kv.m5425a(r0, r2, r3);
    L_0x002d:
        r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r2 != 0) goto L_0x0033;
    L_0x0031:
        r0 = r1;
    L_0x0032:
        return r0;
    L_0x0033:
        r2 = r5.f8996l;
        r2 = r2[r6];
        r3 = r5.f8997m;
        r3 = r3[r6];
        r4 = r5.f8998n;
        r4 = r4[r6];
        r2 = r2 * r9;
        r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r1 <= 0) goto L_0x004a;
    L_0x0044:
        r0 = r0 * r2;
        r0 = p000.C0341kv.m5425a(r0, r3, r4);
        goto L_0x0032;
    L_0x004a:
        r0 = -r0;
        r0 = r0 * r2;
        r0 = p000.C0341kv.m5425a(r0, r3, r4);
        r0 = -r0;
        goto L_0x0032;
    L_0x0052:
        r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r2 <= 0) goto L_0x005d;
    L_0x0056:
        r2 = r5.f8990f;
        r0 = r2.getInterpolation(r0);
        goto L_0x0025;
    L_0x005d:
        r0 = r1;
        goto L_0x002d;
        */
        throw new UnsupportedOperationException("Method not decompiled: kv.a(int, float, float, float):float");
    }

    /* renamed from: a */
    static float m5425a(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        if (f < f2) {
            return f2;
        }
        return f;
    }

    /* renamed from: a */
    private final float m5424a(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.f8994j;
        switch (i) {
            case 0:
            case 1:
                if (f >= f2) {
                    return 0.0f;
                }
                if (f >= 0.0f) {
                    return 1.0f - (f / f2);
                }
                if (this.f8989e && i == 1) {
                    return 1.0f;
                }
                return 0.0f;
            case 2:
                if (f < 0.0f) {
                    return f / (-f2);
                }
                return 0.0f;
            default:
                return 0.0f;
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f9000p) {
            switch (motionEvent.getActionMasked()) {
                case 0:
                    this.f8988d = true;
                    this.f8999o = false;
                    break;
                case 1:
                case 3:
                    m5427c();
                    break;
                case 2:
                    break;
            }
            float a = m5426a(0, motionEvent.getX(), (float) view.getWidth(), (float) this.f8986b.getWidth());
            float a2 = m5426a(1, motionEvent.getY(), (float) view.getHeight(), (float) this.f8986b.getHeight());
            C0342kw c0342kw = this.f8985a;
            c0342kw.f9094c = a;
            c0342kw.f9095d = a2;
            if (!this.f8989e && mo10449b()) {
                if (this.f8991g == null) {
                    this.f8991g = new C0343kx(this);
                }
                this.f8989e = true;
                this.f8987c = true;
                if (!this.f8999o) {
                    int i = this.f8995k;
                    if (i > 0) {
                        C0315jm.m4616a(this.f8986b, this.f8991g, (long) i);
                        this.f8999o = true;
                    }
                }
                this.f8991g.run();
                this.f8999o = true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private final void m5427c() {
        int i = 0;
        if (this.f8987c) {
            this.f8989e = false;
            return;
        }
        C0342kw c0342kw = this.f8985a;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i2 = (int) (currentAnimationTimeMillis - c0342kw.f9096e);
        int i3 = c0342kw.f9093b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        c0342kw.f9101j = i;
        c0342kw.f9100i = c0342kw.mo10561a(currentAnimationTimeMillis);
        c0342kw.f9099h = currentAnimationTimeMillis;
    }

    /* renamed from: a */
    public final C0341kv mo10445a(boolean z) {
        if (this.f9000p && !z) {
            m5427c();
        }
        this.f9000p = z;
        return this;
    }

    /* renamed from: b */
    final boolean mo10449b() {
        C0342kw c0342kw = this.f8985a;
        float f = c0342kw.f9095d;
        int abs = (int) (f / Math.abs(f));
        float f2 = c0342kw.f9094c;
        int abs2 = (int) (f2 / Math.abs(f2));
        if (abs != 0 && mo10447a(abs)) {
            return true;
        }
        if (abs2 == 0) {
            return false;
        }
        mo10446a();
        return false;
    }
}
