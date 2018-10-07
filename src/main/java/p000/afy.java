package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: afy */
public final class afy implements afe, ary {
    /* renamed from: t */
    private static final afz f10218t = new afz();
    /* renamed from: u */
    private static final Handler f10219u = new Handler(Looper.getMainLooper(), new aga());
    /* renamed from: a */
    public final List f10220a;
    /* renamed from: b */
    public final asa f10221b;
    /* renamed from: c */
    public final C0300iw f10222c;
    /* renamed from: d */
    public final agb f10223d;
    /* renamed from: e */
    public final aie f10224e;
    /* renamed from: f */
    public adl f10225f;
    /* renamed from: g */
    public boolean f10226g;
    /* renamed from: h */
    public boolean f10227h;
    /* renamed from: i */
    public boolean f10228i;
    /* renamed from: j */
    public boolean f10229j;
    /* renamed from: k */
    public agn f10230k;
    /* renamed from: l */
    public adf f10231l;
    /* renamed from: m */
    public boolean f10232m;
    /* renamed from: n */
    public agg f10233n;
    /* renamed from: o */
    public boolean f10234o;
    /* renamed from: p */
    public List f10235p;
    /* renamed from: q */
    public age f10236q;
    /* renamed from: r */
    public afd f10237r;
    /* renamed from: s */
    public volatile boolean f10238s;
    /* renamed from: v */
    private final aie f10239v;
    /* renamed from: w */
    private final aie f10240w;
    /* renamed from: x */
    private final aie f10241x;

    afy(aie aie, aie aie2, aie aie3, aie aie4, agb agb, C0300iw c0300iw) {
        this(aie, aie2, aie3, aie4, agb, c0300iw, (byte) 0);
    }

    private afy(aie aie, aie aie2, aie aie3, aie aie4, agb agb, C0300iw c0300iw, byte b) {
        this.f10220a = new ArrayList(2);
        this.f10221b = asa.m692a();
        this.f10224e = aie;
        this.f10239v = aie2;
        this.f10240w = aie3;
        this.f10241x = aie4;
        this.f10223d = agb;
        this.f10222c = c0300iw;
    }

    /* renamed from: a */
    public final void mo11630a(aqh aqh) {
        arq.m678a();
        this.f10221b.mo1767b();
        if (this.f10232m) {
            aqh.mo1716a(this.f10236q, this.f10231l);
        } else if (this.f10234o) {
            aqh.mo1715a(this.f10233n);
        } else {
            this.f10220a.add(aqh);
        }
    }

    /* renamed from: b */
    public final aie mo11631b() {
        if (this.f10227h) {
            return this.f10240w;
        }
        if (this.f10228i) {
            return this.f10241x;
        }
        return this.f10239v;
    }

    /* renamed from: a */
    public final asa mo1764a() {
        return this.f10221b;
    }

    /* renamed from: b */
    final boolean mo11632b(aqh aqh) {
        List list = this.f10235p;
        return list != null && list.contains(aqh);
    }

    /* renamed from: a */
    public final void mo225a(agg agg) {
        this.f10233n = agg;
        f10219u.obtainMessage(2, this).sendToTarget();
    }

    /* renamed from: a */
    public final void mo226a(agn agn, adf adf) {
        this.f10230k = agn;
        this.f10231l = adf;
        f10219u.obtainMessage(1, this).sendToTarget();
    }

    /* renamed from: a */
    public final void mo224a(afd afd) {
        mo11631b().execute(afd);
    }
}
