package p000;

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: gwv */
public final class gwv implements ham {
    /* renamed from: a */
    public static final String f19748a = bli.m887a("FocusOverlayMgr");
    /* renamed from: b */
    public static final int f19749b = 4000;
    /* renamed from: c */
    public static final float f19750c = 0.2f;
    /* renamed from: d */
    public static final float f19751d = 0.3f;
    /* renamed from: A */
    private final String f19752A;
    /* renamed from: B */
    private final irs f19753B;
    /* renamed from: e */
    public int f19754e = 0;
    /* renamed from: f */
    public boolean f19755f;
    /* renamed from: g */
    public boolean f19756g;
    /* renamed from: h */
    public boolean f19757h;
    /* renamed from: i */
    public boolean f19758i;
    /* renamed from: j */
    public int f19759j;
    /* renamed from: k */
    public List f19760k;
    /* renamed from: l */
    public List f19761l;
    /* renamed from: m */
    public abc f19762m;
    /* renamed from: n */
    public final Handler f19763n;
    /* renamed from: o */
    public gww f19764o;
    /* renamed from: p */
    public boolean f19765p;
    /* renamed from: q */
    public final atb f19766q;
    /* renamed from: r */
    public final Rect f19767r = new Rect(0, 0, 0, 0);
    /* renamed from: s */
    public hin f19768s;
    /* renamed from: t */
    public long f19769t;
    /* renamed from: u */
    private hie f19770u;
    /* renamed from: v */
    private boolean f19771v;
    /* renamed from: w */
    private abc f19772w;
    /* renamed from: x */
    private final List f19773x;
    /* renamed from: y */
    private aaz f19774y;
    /* renamed from: z */
    private final gos f19775z;

    public gwv(gos gos, String str, List list, aaz aaz, gww gww, boolean z, Looper looper, atb atb, irs irs) {
        this.f19775z = gos;
        this.f19752A = str;
        this.f19773x = new ArrayList(list);
        this.f19764o = gww;
        this.f19766q = atb;
        this.f19753B = irs;
        this.f19763n = new gwx(this, looper);
        mo13478a(aaz);
        this.f19771v = z;
        mo13481c();
    }

    /* renamed from: a */
    public final void mo13477a(int i) {
        this.f19754e = i;
        this.f19764o.mo7484m();
        this.f19763n.removeMessages(0);
    }

    /* renamed from: a */
    public final void mo13476a() {
        bli.m896d(f19748a, "Cancel autofocus.");
        mo13482d();
        this.f19764o.mo7485n();
        this.f19754e = 0;
        this.f19763n.removeMessages(0);
    }

    /* renamed from: b */
    public final void mo13480b() {
        if (this.f19764o.mo7486o()) {
            this.f19754e = 0;
            this.f19763n.removeMessages(0);
        }
    }

    /* renamed from: a */
    public final Rect mo13475a(int i, int i2, int i3) {
        int i4 = i3 / 2;
        Rect rect = this.f19767r;
        int a = hjg.m3255a(i - i4, rect.left, rect.right - i3);
        Rect rect2 = this.f19767r;
        i4 = hjg.m3255a(i2 - i4, rect2.top, rect2.bottom - i3);
        RectF rectF = new RectF((float) a, (float) i4, (float) (a + i3), (float) (i4 + i3));
        hie hie = this.f19770u;
        RectF rectF2 = new RectF();
        hie.f6590a.mapRect(rectF2, rectF);
        return hjg.m3258a(rectF2);
    }

    /* renamed from: a */
    public final abc mo13474a(abc abc) {
        if (this.f19774y == null) {
            bli.m896d(f19748a, "no capabilities, returning default AUTO focus mode");
            return abc.AUTO;
        }
        String d;
        String valueOf;
        abc b;
        StringBuilder stringBuilder;
        if (!this.f19756g || this.f19760k == null) {
            d = this.f19775z.mo7301d(this.f19752A, "pref_camera_focusmode_key");
            String str = f19748a;
            valueOf = String.valueOf(d);
            String str2 = "stored focus setting for camera: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            bli.m896d(str, valueOf);
            if (d != null) {
                abe abe = this.f19774y.f69w;
                b = abe.m47b(d);
            } else {
                b = null;
            }
            this.f19772w = b;
            valueOf = f19748a;
            d = String.valueOf(this.f19772w);
            stringBuilder = new StringBuilder(String.valueOf(d).length() + 34);
            stringBuilder.append("focus mode resolved from setting: ");
            stringBuilder.append(d);
            bli.m896d(valueOf, stringBuilder.toString());
            if (this.f19772w == null) {
                for (abc b2 : this.f19773x) {
                    if (this.f19774y.mo48a(b2)) {
                        this.f19772w = b2;
                        d = f19748a;
                        valueOf = String.valueOf(b2);
                        stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 47);
                        stringBuilder.append("selected supported focus mode from default list");
                        stringBuilder.append(valueOf);
                        bli.m896d(d, stringBuilder.toString());
                        break;
                    }
                }
            }
        } else {
            bli.m896d(f19748a, "in tap to focus, returning AUTO focus mode");
            this.f19772w = abc.AUTO;
        }
        b2 = this.f19772w;
        if (b2 == null || !this.f19774y.mo48a(b2)) {
            if (this.f19774y.mo48a(abc.AUTO)) {
                bli.m896d(f19748a, "no supported focus mode, falling back to AUTO");
                this.f19772w = abc.AUTO;
            } else {
                valueOf = f19748a;
                d = String.valueOf(abc);
                stringBuilder = new StringBuilder(String.valueOf(d).length() + 50);
                stringBuilder.append("no supported focus mode, falling back to current: ");
                stringBuilder.append(d);
                bli.m896d(valueOf, stringBuilder.toString());
                this.f19772w = abc;
            }
        }
        return this.f19772w;
    }

    /* renamed from: b */
    public static boolean m11850b(abc abc) {
        return (abc == abc.INFINITY || abc == abc.FIXED || abc == abc.EXTENDED_DOF) ? false : true;
    }

    /* renamed from: a */
    public final void mo13479a(boolean z) {
        int i = this.f19754e;
        if (i == 2) {
            if (z) {
                this.f19754e = 3;
            } else {
                this.f19754e = 4;
            }
            mo13480b();
        } else if (i == 1) {
            if (z) {
                this.f19754e = 3;
            } else {
                this.f19754e = 4;
            }
            if (this.f19760k != null) {
                this.f19763n.sendEmptyMessageDelayed(0, (long) f19749b);
            }
        }
    }

    /* renamed from: a */
    public final void mo7598a(RectF rectF) {
        Rect a = hjg.m3258a(rectF);
        if (!this.f19767r.equals(a)) {
            this.f19767r.set(a);
            mo13481c();
            this.f19755f = true;
        }
    }

    /* renamed from: c */
    public final void mo13481c() {
        if (this.f19767r.width() <= 0 || this.f19767r.height() <= 0) {
            bli.m898e(f19748a, "The coordinate transformer could not be built because the preview rectdid not have a width and height");
        } else {
            this.f19770u = new hie(this.f19771v, this.f19759j, hjg.m3259a(this.f19767r));
        }
    }

    /* renamed from: d */
    public final void mo13482d() {
        if (this.f19755f) {
            this.f19760k = null;
            this.f19761l = null;
            this.f19764o.mo7487s();
            hin hin = this.f19768s;
            if (hin != null) {
                this.f19753B.mo8893a(hin, Float.valueOf(((float) (System.currentTimeMillis() - this.f19769t)) * 0.001f), false);
                this.f19768s = null;
            }
        }
    }

    /* renamed from: a */
    public final void mo13478a(aaz aaz) {
        if (aaz != null) {
            this.f19774y = aaz;
            this.f19756g = this.f19774y.mo46a(aba.FOCUS_AREA);
            this.f19757h = this.f19774y.mo46a(aba.METERING_AREA);
            if (this.f19774y.mo46a(aba.AUTO_EXPOSURE_LOCK) || this.f19774y.mo46a(aba.AUTO_WHITE_BALANCE_LOCK)) {
            }
        }
    }
}
