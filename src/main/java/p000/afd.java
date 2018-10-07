package p000;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: afd */
public final class afd implements afb, ary, Comparable, Runnable {
    /* renamed from: A */
    private Object f10178A;
    /* renamed from: B */
    private adf f10179B;
    /* renamed from: C */
    private adw f10180C;
    /* renamed from: D */
    private volatile boolean f10181D;
    /* renamed from: a */
    public final afc f10182a = new afc();
    /* renamed from: b */
    public final afg f10183b;
    /* renamed from: c */
    public final aff f10184c = new aff();
    /* renamed from: d */
    public final afh f10185d = new afh();
    /* renamed from: e */
    public ace f10186e;
    /* renamed from: f */
    public adl f10187f;
    /* renamed from: g */
    public acg f10188g;
    /* renamed from: h */
    public agc f10189h;
    /* renamed from: i */
    public int f10190i;
    /* renamed from: j */
    public int f10191j;
    /* renamed from: k */
    public afm f10192k;
    /* renamed from: l */
    public adp f10193l;
    /* renamed from: m */
    public afe f10194m;
    /* renamed from: n */
    public int f10195n;
    /* renamed from: o */
    public afi f10196o;
    /* renamed from: p */
    public boolean f10197p;
    /* renamed from: q */
    public adl f10198q;
    /* renamed from: r */
    public volatile afa f10199r;
    /* renamed from: s */
    public volatile boolean f10200s;
    /* renamed from: t */
    private final List f10201t = new ArrayList();
    /* renamed from: u */
    private final asa f10202u = asa.m692a();
    /* renamed from: v */
    private final C0300iw f10203v;
    /* renamed from: w */
    private afj f10204w;
    /* renamed from: x */
    private long f10205x;
    /* renamed from: y */
    private Thread f10206y;
    /* renamed from: z */
    private adl f10207z;

    afd(afg afg, C0300iw c0300iw) {
        this.f10183b = afg;
        this.f10203v = c0300iw;
    }

    public final /* synthetic */ int compareTo(Object obj) {
        afd afd = (afd) obj;
        int ordinal = this.f10188g.ordinal() - afd.f10188g.ordinal();
        if (ordinal == 0) {
            return this.f10195n - afd.f10195n;
        }
        return ordinal;
    }

    /* renamed from: a */
    private final agn m6411a(adw adw, Object obj, adf adf) {
        agn agn = null;
        if (obj != null) {
            try {
                long a = arm.m655a();
                agn = m6412a(obj, adf, this.f10182a.mo218a(obj.getClass()));
                if (Log.isLoggable("DecodeJob", 2)) {
                    String valueOf = String.valueOf(agn);
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 15);
                    stringBuilder.append("Decoded result ");
                    stringBuilder.append(valueOf);
                    m6413a(stringBuilder.toString(), a, null);
                }
                adw.mo189c();
            } catch (Throwable th) {
                adw.mo189c();
            }
        } else {
            adw.mo189c();
        }
        return agn;
    }

    /* renamed from: d */
    private final void m6414d() {
        agn a;
        if (Log.isLoggable("DecodeJob", 2)) {
            long j = this.f10205x;
            String valueOf = String.valueOf(this.f10178A);
            String valueOf2 = String.valueOf(this.f10198q);
            String valueOf3 = String.valueOf(this.f10180C);
            int length = String.valueOf(valueOf).length();
            StringBuilder stringBuilder = new StringBuilder(((length + 30) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length());
            stringBuilder.append("data: ");
            stringBuilder.append(valueOf);
            stringBuilder.append(", cache key: ");
            stringBuilder.append(valueOf2);
            stringBuilder.append(", fetcher: ");
            stringBuilder.append(valueOf3);
            m6413a("Retrieved data", j, stringBuilder.toString());
        }
        try {
            a = m6411a(this.f10180C, this.f10178A, this.f10179B);
        } catch (agg e) {
            e.mo248a(this.f10207z, this.f10179B, null);
            this.f10201t.add(e);
            a = null;
        }
        if (a != null) {
            agl a2;
            adf adf = this.f10179B;
            if (a instanceof agi) {
                ((agi) a).mo257a();
            }
            if (this.f10184c.mo227a()) {
                a2 = agl.m6468a(a);
                a = a2;
            } else {
                a2 = null;
            }
            m6418h();
            this.f10194m.mo226a(a, adf);
            this.f10204w = afj.ENCODE;
            aff aff;
            try {
                if (this.f10184c.mo227a()) {
                    aff = this.f10184c;
                    this.f10183b.mo228a().mo300a(aff.f386a, new aho(aff.f387b, aff.f388c, this.f10193l));
                    aff.f388c.mo11638f();
                }
                if (a2 != null) {
                    a2.mo11638f();
                }
                if (this.f10185d.mo229a()) {
                    mo11627b();
                }
            } catch (Throwable th) {
                if (a2 != null) {
                    a2.mo11638f();
                }
            }
        } else {
            m6417g();
        }
    }

    /* renamed from: e */
    private final afa m6415e() {
        switch (this.f10204w.ordinal()) {
            case 1:
                return new ago(this.f10182a, this);
            case 2:
                return new aey(this.f10182a, this);
            case 3:
                return new ags(this.f10182a, this);
            case 5:
                return null;
            default:
                String valueOf = String.valueOf(this.f10204w);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 20);
                stringBuilder.append("Unrecognized stage: ");
                stringBuilder.append(valueOf);
                throw new IllegalStateException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public final afj mo11626a(afj afj) {
        switch (afj.ordinal()) {
            case 0:
                if (this.f10192k.mo238b()) {
                    return afj.RESOURCE_CACHE;
                }
                return mo11626a(afj.RESOURCE_CACHE);
            case 1:
                if (this.f10192k.mo235a()) {
                    return afj.DATA_CACHE;
                }
                return mo11626a(afj.DATA_CACHE);
            case 2:
                return !this.f10197p ? afj.SOURCE : afj.FINISHED;
            case 3:
            case 5:
                return afj.FINISHED;
            default:
                String valueOf = String.valueOf(afj);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 20);
                stringBuilder.append("Unrecognized stage: ");
                stringBuilder.append(valueOf);
                throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    /* renamed from: a */
    public final asa mo1764a() {
        return this.f10202u;
    }

    /* renamed from: a */
    private final void m6413a(String str, long j, String str2) {
        String valueOf;
        String str3;
        double a = arm.m654a(j);
        String valueOf2 = String.valueOf(this.f10189h);
        if (str2 != null) {
            valueOf = String.valueOf(str2);
            str3 = ", ";
            valueOf = valueOf.length() == 0 ? new String(str3) : str3.concat(valueOf);
        } else {
            valueOf = "";
        }
        str3 = Thread.currentThread().getName();
        int length = String.valueOf(str).length();
        StringBuilder stringBuilder = new StringBuilder((((length + 50) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf).length()) + String.valueOf(str3).length());
        stringBuilder.append(str);
        stringBuilder.append(" in ");
        stringBuilder.append(a);
        stringBuilder.append(", load key: ");
        stringBuilder.append(valueOf2);
        stringBuilder.append(valueOf);
        stringBuilder.append(", thread: ");
        stringBuilder.append(str3);
        Log.v("DecodeJob", stringBuilder.toString());
    }

    /* renamed from: f */
    private final void m6416f() {
        m6418h();
        this.f10194m.mo225a(new agg("Failed to load resource", new ArrayList(this.f10201t)));
        if (this.f10185d.mo230b()) {
            mo11627b();
        }
    }

    /* renamed from: a */
    public final void mo215a(adl adl, Exception exception, adw adw, adf adf) {
        adw.mo189c();
        agg agg = new agg("Fetching data failed", (Throwable) exception);
        agg.mo248a(adl, adf, adw.mo186a());
        this.f10201t.add(agg);
        if (Thread.currentThread() != this.f10206y) {
            this.f10196o = afi.SWITCH_TO_SOURCE_SERVICE;
            this.f10194m.mo224a(this);
            return;
        }
        m6417g();
    }

    /* renamed from: a */
    public final void mo216a(adl adl, Object obj, adw adw, adf adf, adl adl2) {
        this.f10198q = adl;
        this.f10178A = obj;
        this.f10180C = adw;
        this.f10179B = adf;
        this.f10207z = adl2;
        if (Thread.currentThread() != this.f10206y) {
            this.f10196o = afi.DECODE_DATA;
            this.f10194m.mo224a(this);
            return;
        }
        m6414d();
    }

    /* renamed from: b */
    final void mo11627b() {
        this.f10185d.mo232d();
        aff aff = this.f10184c;
        aff.f386a = null;
        aff.f387b = null;
        aff.f388c = null;
        afc afc = this.f10182a;
        afc.f370c = null;
        afc.f371d = null;
        afc.f381n = null;
        afc.f374g = null;
        afc.f378k = null;
        afc.f376i = null;
        afc.f382o = null;
        afc.f377j = null;
        afc.f383p = null;
        afc.f368a.clear();
        afc.f379l = false;
        afc.f369b.clear();
        afc.f380m = false;
        this.f10181D = false;
        this.f10186e = null;
        this.f10187f = null;
        this.f10193l = null;
        this.f10188g = null;
        this.f10189h = null;
        this.f10194m = null;
        this.f10204w = null;
        this.f10199r = null;
        this.f10206y = null;
        this.f10198q = null;
        this.f10178A = null;
        this.f10179B = null;
        this.f10180C = null;
        this.f10205x = 0;
        this.f10200s = false;
        this.f10201t.clear();
        this.f10203v.mo9114a(this);
    }

    /* renamed from: c */
    public final void mo217c() {
        this.f10196o = afi.SWITCH_TO_SOURCE_SERVICE;
        this.f10194m.mo224a(this);
    }

    /* JADX WARNING: Failed to extract finally block: empty outs */
    public final void run() {
        /*
        r7 = this;
        r1 = r7.f10180C;
        r0 = r7.f10200s;	 Catch:{ all -> 0x003f }
        if (r0 == 0) goto L_0x000f;
    L_0x0006:
        r7.m6416f();	 Catch:{ all -> 0x003f }
        if (r1 == 0) goto L_0x000e;
    L_0x000b:
        r1.mo189c();
    L_0x000e:
        return;
    L_0x000f:
        r0 = r7.f10196o;	 Catch:{ all -> 0x003f }
        r0 = r0.ordinal();	 Catch:{ all -> 0x003f }
        switch(r0) {
            case 0: goto L_0x00a1;
            case 1: goto L_0x009d;
            case 2: goto L_0x0093;
            default: goto L_0x0018;
        };	 Catch:{ all -> 0x003f }
    L_0x0018:
        r0 = new java.lang.IllegalStateException;	 Catch:{ all -> 0x003f }
        r2 = r7.f10196o;	 Catch:{ all -> 0x003f }
        r2 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x003f }
        r3 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x003f }
        r3 = r3.length();	 Catch:{ all -> 0x003f }
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x003f }
        r3 = r3 + 25;
        r4.<init>(r3);	 Catch:{ all -> 0x003f }
        r3 = "Unrecognized run reason: ";
        r4.append(r3);	 Catch:{ all -> 0x003f }
        r4.append(r2);	 Catch:{ all -> 0x003f }
        r2 = r4.toString();	 Catch:{ all -> 0x003f }
        r0.<init>(r2);	 Catch:{ all -> 0x003f }
        throw r0;	 Catch:{ all -> 0x003f }
    L_0x003f:
        r0 = move-exception;
        r2 = "DecodeJob";
        r3 = 3;
        r2 = android.util.Log.isLoggable(r2, r3);	 Catch:{ all -> 0x008c }
        if (r2 == 0) goto L_0x0079;
    L_0x0049:
        r2 = "DecodeJob";
        r3 = r7.f10200s;	 Catch:{ all -> 0x008c }
        r4 = r7.f10204w;	 Catch:{ all -> 0x008c }
        r4 = java.lang.String.valueOf(r4);	 Catch:{ all -> 0x008c }
        r5 = java.lang.String.valueOf(r4);	 Catch:{ all -> 0x008c }
        r5 = r5.length();	 Catch:{ all -> 0x008c }
        r5 = r5 + 57;
        r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x008c }
        r6.<init>(r5);	 Catch:{ all -> 0x008c }
        r5 = "DecodeJob threw unexpectedly, isCancelled: ";
        r6.append(r5);	 Catch:{ all -> 0x008c }
        r6.append(r3);	 Catch:{ all -> 0x008c }
        r3 = ", stage: ";
        r6.append(r3);	 Catch:{ all -> 0x008c }
        r6.append(r4);	 Catch:{ all -> 0x008c }
        r3 = r6.toString();	 Catch:{ all -> 0x008c }
        android.util.Log.d(r2, r3, r0);	 Catch:{ all -> 0x008c }
    L_0x0079:
        r2 = r7.f10204w;	 Catch:{ all -> 0x008c }
        r3 = p000.afj.ENCODE;	 Catch:{ all -> 0x008c }
        if (r2 == r3) goto L_0x0087;
    L_0x007f:
        r2 = r7.f10201t;	 Catch:{ all -> 0x008c }
        r2.add(r0);	 Catch:{ all -> 0x008c }
        r7.m6416f();	 Catch:{ all -> 0x008c }
    L_0x0087:
        r2 = r7.f10200s;	 Catch:{ all -> 0x008c }
        if (r2 != 0) goto L_0x00b3;
    L_0x008b:
        throw r0;	 Catch:{ all -> 0x008c }
    L_0x008c:
        r0 = move-exception;
        if (r1 == 0) goto L_0x0092;
    L_0x008f:
        r1.mo189c();
    L_0x0092:
        throw r0;
    L_0x0093:
        r7.m6414d();	 Catch:{ all -> 0x003f }
    L_0x0096:
        if (r1 == 0) goto L_0x000e;
    L_0x0098:
        r1.mo189c();
        goto L_0x000e;
    L_0x009d:
        r7.m6417g();	 Catch:{ all -> 0x003f }
        goto L_0x0096;
    L_0x00a1:
        r0 = p000.afj.INITIALIZE;	 Catch:{ all -> 0x003f }
        r0 = r7.mo11626a(r0);	 Catch:{ all -> 0x003f }
        r7.f10204w = r0;	 Catch:{ all -> 0x003f }
        r0 = r7.m6415e();	 Catch:{ all -> 0x003f }
        r7.f10199r = r0;	 Catch:{ all -> 0x003f }
        r7.m6417g();	 Catch:{ all -> 0x003f }
        goto L_0x0096;
    L_0x00b3:
        if (r1 == 0) goto L_0x000e;
    L_0x00b5:
        r1.mo189c();
        goto L_0x000e;
        */
        throw new UnsupportedOperationException("Method not decompiled: afd.run():void");
    }

    /* renamed from: g */
    private final void m6417g() {
        this.f10206y = Thread.currentThread();
        this.f10205x = arm.m655a();
        boolean z = false;
        while (!this.f10200s && this.f10199r != null) {
            z = this.f10199r.mo214b();
            if (z) {
                break;
            }
            this.f10204w = mo11626a(this.f10204w);
            this.f10199r = m6415e();
            if (this.f10204w == afj.SOURCE) {
                mo217c();
                return;
            }
        }
        if ((this.f10204w == afj.FINISHED || this.f10200s) && !r0) {
            m6416f();
        }
    }

    /* renamed from: a */
    private final agn m6412a(Object obj, adf adf, agk agk) {
        adp adp = this.f10193l;
        if (adp.mo11616a(amm.f529b) == null && (adf == adf.RESOURCE_DISK_CACHE || this.f10182a.f385r)) {
            adp = new adp();
            adp.mo11617a(this.f10193l);
            adp.mo11615a(amm.f529b, Boolean.valueOf(true));
        }
        ady a = this.f10186e.f211d.f228c.mo197a(obj);
        try {
            agn a2 = agk.mo260a(a, adp, this.f10190i, this.f10191j, new afl(this, adf));
            return a2;
        } finally {
            a.mo193a();
        }
    }

    /* renamed from: h */
    private final void m6418h() {
        this.f10202u.mo1767b();
        if (this.f10181D) {
            throw new IllegalStateException("Already notified");
        }
        this.f10181D = true;
    }
}
