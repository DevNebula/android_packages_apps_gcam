package p000;

import android.annotation.TargetApi;
import android.os.Handler;
import android.view.Surface;
import java.util.Timer;
import java.util.TimerTask;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: bjz */
public final class bjz implements bjw {
    /* renamed from: a */
    public static final String f22791a = bli.m887a("CdrSnapshotTaker");
    /* renamed from: b */
    public final Byte f22792b;
    /* renamed from: c */
    public final bhr f22793c;
    /* renamed from: d */
    public final gtf f22794d;
    /* renamed from: e */
    public final gsi f22795e;
    /* renamed from: f */
    public final ixb f22796f;
    /* renamed from: g */
    public final kbg f22797g;
    /* renamed from: h */
    public final ilp f22798h;
    /* renamed from: i */
    private final Handler f22799i;
    /* renamed from: j */
    private final ijx f22800j;
    /* renamed from: k */
    private final ilp f22801k;
    /* renamed from: l */
    private final ilp f22802l;
    /* renamed from: m */
    private final Timer f22803m;
    /* renamed from: n */
    private final Surface f22804n;
    /* renamed from: o */
    private int f22805o = C0252go.f5952x;
    /* renamed from: p */
    private boolean f22806p = false;
    /* renamed from: q */
    private final Object f22807q = new Object();

    bjz(gtf gtf, gsi gsi, Handler handler, ijx ijx, Byte b, bhr bhr, ixb ixb, kbg kbg, ilp ilp, ilp ilp2, ilp ilp3) {
        this.f22792b = (Byte) jri.m13404b((Object) b);
        this.f22793c = (bhr) jri.m13404b((Object) bhr);
        this.f22794d = (gtf) jri.m13404b((Object) gtf);
        this.f22795e = (gsi) jri.m13404b((Object) gsi);
        this.f22799i = (Handler) jri.m13404b((Object) handler);
        this.f22800j = (ijx) jri.m13404b((Object) ijx);
        this.f22796f = (ixb) jri.m13404b((Object) ixb);
        this.f22797g = (kbg) jri.m13404b((Object) kbg);
        this.f22801k = (ilp) jri.m13404b((Object) ilp);
        this.f22802l = (ilp) jri.m13404b((Object) ilp2);
        this.f22798h = (ilp) jri.m13404b((Object) ilp3);
        this.f22804n = this.f22796f.mo13753g();
        this.f22803m = new Timer();
    }

    public final void close() {
        synchronized (this.f22807q) {
            if (this.f22805o == C0252go.f5951w) {
            } else if (this.f22805o == C0252go.f5953y) {
                this.f22806p = true;
            } else {
                this.f22803m.cancel();
                this.f22796f.close();
                this.f22804n.release();
                this.f22805o = C0252go.f5951w;
                this.f22806p = false;
            }
        }
    }

    /* renamed from: a */
    public final Surface mo12387a() {
        return this.f22804n;
    }

    /* renamed from: a */
    public final bjv mo12388a(bhj bhj) {
        bjv bjv;
        synchronized (this.f22807q) {
            if (this.f22805o == C0252go.f5951w) {
                bjv = new bjv(new IllegalStateException("has been closed."));
            } else if (this.f22805o == C0252go.f5953y) {
                bjv = new bjv(new IllegalStateException("there is already a snapshot request in flight."));
            } else {
                boolean z;
                if (this.f22805o == C0252go.f5952x) {
                    z = true;
                } else {
                    z = false;
                }
                jri.m13405b(z);
                this.f22805o = C0252go.f5953y;
                long currentTimeMillis = System.currentTimeMillis();
                Float f = (Float) this.f22802l.mo13673b();
                Boolean bool = (Boolean) this.f22801k.mo13673b();
                kpk d = kpw.m18486d();
                TimerTask bka = new bka(this, d);
                this.f22803m.schedule(bka, 1000);
                this.f22796f.mo13747a(new bkb(this, bka, d), this.f22799i);
                kpk d2 = kpw.m18486d();
                kpk d3 = kpw.m18486d();
                this.f22800j.execute(new bkc(this, bhj, d3, d2, d));
                bjv = new bjv(iel.m3773a(d2, d, new bke(this, currentTimeMillis, bool, f)), d3);
            }
        }
        return bjv;
    }

    /* JADX WARNING: Missing block: B:14:?, code:
            return;
     */
    /* renamed from: b */
    final void mo14569b() {
        /*
        r3 = this;
        r1 = r3.f22807q;
        monitor-enter(r1);
        r0 = r3.f22805o;	 Catch:{ all -> 0x0018 }
        r2 = p000.C0252go.f5952x;	 Catch:{ all -> 0x0018 }
        if (r0 != r2) goto L_0x000b;
    L_0x0009:
        monitor-exit(r1);	 Catch:{ all -> 0x0018 }
    L_0x000a:
        return;
    L_0x000b:
        r0 = p000.C0252go.f5952x;	 Catch:{ all -> 0x0018 }
        r3.f22805o = r0;	 Catch:{ all -> 0x0018 }
        r0 = r3.f22806p;	 Catch:{ all -> 0x0018 }
        if (r0 == 0) goto L_0x0016;
    L_0x0013:
        r3.close();	 Catch:{ all -> 0x0018 }
    L_0x0016:
        monitor-exit(r1);	 Catch:{ all -> 0x0018 }
        goto L_0x000a;
    L_0x0018:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0018 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: bjz.b():void");
    }
}
