package p000;

import android.annotation.TargetApi;
import android.hardware.camera2.CaptureResult;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: frk */
public final class frk implements fre, iqo {
    /* renamed from: a */
    public final Object f18703a;
    /* renamed from: b */
    public final int f18704b;
    /* renamed from: c */
    public final int f18705c;
    /* renamed from: d */
    public final fij f18706d;
    /* renamed from: e */
    public final fne f18707e;
    /* renamed from: f */
    public final fjl f18708f;
    /* renamed from: g */
    public final img f18709g;
    /* renamed from: h */
    public final iqz f18710h;
    /* renamed from: i */
    public final ird f18711i;
    /* renamed from: j */
    public final Deque f18712j;
    /* renamed from: k */
    public final Deque f18713k;
    /* renamed from: l */
    public final List f18714l;
    /* renamed from: m */
    public boolean f18715m = false;
    /* renamed from: n */
    public boolean f18716n = false;
    /* renamed from: o */
    public boolean f18717o;
    /* renamed from: p */
    private final int f18718p;
    /* renamed from: q */
    private final img f18719q;
    /* renamed from: r */
    private final fro f18720r;
    /* renamed from: s */
    private final frr f18721s;
    /* renamed from: t */
    private final Executor f18722t;
    /* renamed from: u */
    private final Executor f18723u;
    /* renamed from: v */
    private final ScheduledExecutorService f18724v;
    /* renamed from: w */
    private final ikb f18725w;

    public frk(fij fij, fne fne, fjl fjl, int i, int i2, int i3, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, iqz iqz, ird ird) {
        boolean z;
        this.f18706d = fij;
        this.f18707e = fne;
        this.f18708f = fjl;
        this.f18718p = i3;
        this.f18704b = i;
        this.f18705c = i2;
        this.f18722t = executor;
        this.f18723u = executor2;
        this.f18724v = scheduledExecutorService;
        this.f18711i = ird;
        this.f18710h = iqz.mo8830a("ReprocImgSvr");
        if (i2 >= i) {
            z = true;
        } else {
            z = false;
        }
        jri.m13396a(z, (Object) "maxImages");
        if (i3 >= i2) {
            z = true;
        } else {
            z = false;
        }
        jri.m13396a(z, (Object) "maxQueueSize");
        this.f18717o = false;
        this.f18703a = new Object();
        this.f18712j = new ArrayDeque(i3);
        this.f18713k = new ArrayDeque(i);
        this.f18714l = new ArrayList(i2);
        this.f18720r = new fro(this);
        this.f18721s = new frr(this);
        this.f18725w = new ikb();
        this.f18719q = new img(new frl(this, i));
        this.f18709g = new img(new frm(this));
        this.f18725w.mo8557a(fne.mo6862a().mo13672a(new frn(this), kpq.f8776a));
        this.f18710h.mo8836d(String.format("Created a ReprocessingImageSaver with %s / %s / %s.", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}));
    }

    public final void close() {
        synchronized (this.f18703a) {
            m10895a(this.f18712j);
        }
        mo13279d();
    }

    /* renamed from: a */
    private final void m10895a(Collection collection) {
        if (!this.f18717o) {
            this.f18717o = true;
            this.f18719q.m2973a();
        }
        for (frp a : collection) {
            a.mo6879a(new isr("ReprocessingImageSaver has been closed."));
        }
    }

    /* renamed from: a */
    final void mo13276a() {
        synchronized (this.f18703a) {
            Collection arrayList = new ArrayList();
            arrayList.addAll(this.f18712j);
            arrayList.addAll(this.f18713k);
            m10895a(arrayList);
        }
    }

    /* JADX WARNING: Missing block: B:12:0x004c, code:
            if (r0 == null) goto L_0x0038;
     */
    /* JADX WARNING: Missing block: B:14:0x0054, code:
            if (r0.mo6878a() == r8) goto L_0x0038;
     */
    /* JADX WARNING: Missing block: B:16:0x005c, code:
            if (r0.mo6878a() == r10) goto L_0x0038;
     */
    /* JADX WARNING: Missing block: B:30:?, code:
            return r0;
     */
    /* JADX WARNING: Missing block: B:31:?, code:
            return r0;
     */
    /* JADX WARNING: Missing block: B:32:?, code:
            return r0;
     */
    /* renamed from: a */
    final p000.frp mo13273a(long r8, long r10) {
        /*
        r7 = this;
        r1 = 0;
        r0 = r1;
    L_0x0002:
        if (r0 == 0) goto L_0x002b;
    L_0x0004:
        r2 = new isr;
        r4 = r0.mo6878a();
        r3 = new java.lang.StringBuilder;
        r6 = 91;
        r3.<init>(r6);
        r6 = "Reprocessing failed for image ";
        r3.append(r6);
        r3.append(r4);
        r4 = " because we received ";
        r3.append(r4);
        r3.append(r8);
        r3 = r3.toString();
        r2.<init>(r3);
        r0.mo6879a(r2);
    L_0x002b:
        r2 = r7.f18703a;
        monitor-enter(r2);
        r0 = r7.f18713k;	 Catch:{ all -> 0x005f }
        r0 = r0.size();	 Catch:{ all -> 0x005f }
        if (r0 != 0) goto L_0x0039;
    L_0x0036:
        monitor-exit(r2);	 Catch:{ all -> 0x005f }
        r0 = r1;
    L_0x0038:
        return r0;
    L_0x0039:
        r0 = r7.f18713k;	 Catch:{ all -> 0x005f }
        r0 = r0.removeFirst();	 Catch:{ all -> 0x005f }
        r0 = (p000.frp) r0;	 Catch:{ all -> 0x005f }
        r3 = r7.f18714l;	 Catch:{ all -> 0x005f }
        r3.add(r0);	 Catch:{ all -> 0x005f }
        r3 = r7.f18709g;	 Catch:{ all -> 0x005f }
        r3.m2973a();	 Catch:{ all -> 0x005f }
        monitor-exit(r2);	 Catch:{ all -> 0x005f }
        if (r0 == 0) goto L_0x0038;
    L_0x004e:
        r2 = r0.mo6878a();
        r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1));
        if (r2 == 0) goto L_0x0038;
    L_0x0056:
        r2 = r0.mo6878a();
        r2 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1));
        if (r2 == 0) goto L_0x0038;
    L_0x005e:
        goto L_0x0002;
    L_0x005f:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x005f }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: frk.a(long, long):frp");
    }

    /* renamed from: c */
    final /* synthetic */ Integer mo13278c() {
        Integer valueOf;
        synchronized (this.f18703a) {
            valueOf = Integer.valueOf(this.f18713k.size() + this.f18714l.size());
        }
        return valueOf;
    }

    /* renamed from: b */
    public final ilp mo6873b() {
        return this.f18719q;
    }

    /* renamed from: a */
    private final kpk m10894a(fri fri) {
        kpk a;
        synchronized (this.f18703a) {
            StringBuilder stringBuilder;
            if (this.f18717o || this.f18712j.size() >= this.f18718p) {
                int i = this.f18718p;
                stringBuilder = new StringBuilder(48);
                stringBuilder.append("Too many images have been enqueued (");
                stringBuilder.append(i);
                stringBuilder.append(")");
                a = kow.m13874a(new isr(stringBuilder.toString()));
            } else {
                frp frp = new frp(this, fri);
                this.f18712j.add(frp);
                iqz iqz = this.f18710h;
                long a2 = frp.mo6878a();
                stringBuilder = new StringBuilder(53);
                stringBuilder.append("Enqueued image ");
                stringBuilder.append(a2);
                stringBuilder.append(" for reprocessing.");
                iqz.mo8836d(stringBuilder.toString());
                mo13279d();
                a = frp.f4902c;
            }
        }
        return a;
    }

    /* renamed from: a */
    final iwp mo13274a(kpk kpk) {
        if (kpk.isDone()) {
            return (iwp) kow.m13879b(kpk);
        }
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        ScheduledExecutorService scheduledExecutorService = this.f18724v;
        kpk kpz = new kpz(kpk);
        Runnable kqa = new kqa(kpz);
        kpz.f26779f = scheduledExecutorService.schedule(kqa, 500, timeUnit);
        kpk.mo10200a(kqa, kpq.f8776a);
        return (iwp) kpz.get();
    }

    /* renamed from: b */
    final long mo13277b(kpk kpk) {
        iwp a;
        Long l = null;
        if (kpk != null) {
            try {
                a = mo13274a(kpk);
            } catch (ExecutionException e) {
                return -1;
            } catch (InterruptedException e2) {
                return -1;
            }
        }
        a = null;
        if (a != null) {
            l = (Long) a.mo13730a(CaptureResult.SENSOR_TIMESTAMP);
        }
        return l != null ? l.longValue() : -1;
    }

    /* renamed from: d */
    final void mo13279d() {
        synchronized (this.f18703a) {
            if (!this.f18715m) {
                this.f18715m = true;
                this.f18723u.execute(this.f18721s);
            }
            if (!this.f18716n) {
                this.f18716n = true;
                this.f18722t.execute(this.f18720r);
            }
        }
    }
}
