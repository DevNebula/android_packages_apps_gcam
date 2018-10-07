package p000;

import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ick */
public abstract class ick extends huu {
    /* renamed from: a */
    private static final ThreadLocal f20858a = new icl();
    /* renamed from: b */
    private final icm f20859b;
    /* renamed from: c */
    private final WeakReference f20860c;
    /* renamed from: d */
    private final CountDownLatch f20861d;
    /* renamed from: e */
    private huy f20862e;
    /* renamed from: f */
    private final AtomicReference f20863f;
    /* renamed from: g */
    public final Object f20864g;
    /* renamed from: h */
    public final ArrayList f20865h;
    /* renamed from: i */
    private hux f20866i;
    /* renamed from: j */
    private volatile boolean f20867j;
    /* renamed from: k */
    private boolean f20868k;
    /* renamed from: l */
    private boolean f20869l;
    /* renamed from: m */
    private volatile hyb f20870m;
    /* renamed from: n */
    private boolean f20871n;

    @Deprecated
    ick() {
        this.f20864g = new Object();
        this.f20861d = new CountDownLatch(1);
        this.f20865h = new ArrayList();
        this.f20863f = new AtomicReference();
        this.f20871n = false;
        this.f20859b = new icm(Looper.getMainLooper());
        this.f20860c = new WeakReference(null);
    }

    @Deprecated
    protected ick(Looper looper) {
        this.f20864g = new Object();
        this.f20861d = new CountDownLatch(1);
        this.f20865h = new ArrayList();
        this.f20863f = new AtomicReference();
        this.f20871n = false;
        this.f20859b = new icm(looper);
        this.f20860c = new WeakReference(null);
    }

    protected ick(huq huq) {
        this.f20864g = new Object();
        this.f20861d = new CountDownLatch(1);
        this.f20865h = new ArrayList();
        this.f20863f = new AtomicReference();
        this.f20871n = false;
        this.f20859b = new icm(huq == null ? Looper.getMainLooper() : huq.mo8143d());
        this.f20860c = new WeakReference(huq);
    }

    /* renamed from: b */
    public static void m12297b(hux hux) {
        if (hux instanceof huw) {
            try {
                ((huw) hux).mo8153a();
            } catch (Throwable e) {
                String valueOf = String.valueOf(hux);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 18);
                stringBuilder.append("Unable to release ");
                stringBuilder.append(valueOf);
                Log.w("BasePendingResult", stringBuilder.toString(), e);
            }
        }
    }

    /* renamed from: e */
    private final hux m12299e() {
        hux hux;
        synchronized (this.f20864g) {
            htl.m3479a(this.f20867j ^ 1, (Object) "Result has already been consumed.");
            htl.m3479a(mo13623b(), (Object) "Result is not ready.");
            hux = this.f20866i;
            this.f20866i = null;
            this.f20862e = null;
            this.f20867j = true;
        }
        hzy hzy = (hzy) this.f20863f.getAndSet(null);
        if (hzy != null) {
            hzy.f7223a.f7221c.remove(this);
        }
        return hux;
    }

    /* renamed from: f */
    private final boolean m12300f() {
        boolean z;
        synchronized (this.f20864g) {
            z = this.f20868k;
        }
        return z;
    }

    /* renamed from: a */
    public abstract hux mo13619a(Status status);

    /* JADX WARNING: Missing block: B:14:?, code:
            return;
     */
    /* renamed from: a */
    public final void mo13620a() {
        /*
        r2 = this;
        r1 = r2.f20864g;
        monitor-enter(r1);
        r0 = r2.f20868k;	 Catch:{ all -> 0x0020 }
        if (r0 != 0) goto L_0x001e;
    L_0x0007:
        r0 = r2.f20867j;	 Catch:{ all -> 0x0020 }
        if (r0 != 0) goto L_0x001e;
    L_0x000b:
        r0 = r2.f20866i;	 Catch:{ all -> 0x0020 }
        p000.ick.m12297b(r0);	 Catch:{ all -> 0x0020 }
        r0 = 1;
        r2.f20868k = r0;	 Catch:{ all -> 0x0020 }
        r0 = com.google.android.gms.common.api.Status.f23358d;	 Catch:{ all -> 0x0020 }
        r0 = r2.mo13619a(r0);	 Catch:{ all -> 0x0020 }
        r2.m12298c(r0);	 Catch:{ all -> 0x0020 }
        monitor-exit(r1);	 Catch:{ all -> 0x0020 }
    L_0x001d:
        return;
    L_0x001e:
        monitor-exit(r1);	 Catch:{ all -> 0x0020 }
        goto L_0x001d;
    L_0x0020:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0020 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: ick.a():void");
    }

    /* renamed from: a */
    public final void mo8364a(hux hux) {
        synchronized (this.f20864g) {
            if (this.f20869l || this.f20868k) {
                ick.m12297b(hux);
                return;
            }
            mo13623b();
            htl.m3479a(mo13623b() ^ 1, (Object) "Results have already been set");
            htl.m3479a(this.f20867j ^ 1, (Object) "Result has already been consumed");
            m12298c(hux);
        }
    }

    /* JADX WARNING: Missing block: B:18:?, code:
            return;
     */
    /* renamed from: a */
    public final void mo8151a(p000.huy r4) {
        /*
        r3 = this;
        r1 = r3.f20864g;
        monitor-enter(r1);
        if (r4 == 0) goto L_0x0035;
    L_0x0005:
        r0 = r3.f20867j;	 Catch:{ all -> 0x0030 }
        r0 = r0 ^ 1;
        r2 = "Result has already been consumed.";
        p000.htl.m3479a(r0, r2);	 Catch:{ all -> 0x0030 }
        r0 = r3.f20870m;	 Catch:{ all -> 0x0030 }
        r0 = "Cannot set callbacks if then() has been called.";
        r2 = 1;
        p000.htl.m3479a(r2, r0);	 Catch:{ all -> 0x0030 }
        r0 = r3.m12300f();	 Catch:{ all -> 0x0030 }
        if (r0 != 0) goto L_0x0033;
    L_0x001c:
        r0 = r3.mo13623b();	 Catch:{ all -> 0x0030 }
        if (r0 == 0) goto L_0x002d;
    L_0x0022:
        r0 = r3.f20859b;	 Catch:{ all -> 0x0030 }
        r2 = r3.m12299e();	 Catch:{ all -> 0x0030 }
        r0.mo8366a(r4, r2);	 Catch:{ all -> 0x0030 }
    L_0x002b:
        monitor-exit(r1);	 Catch:{ all -> 0x0030 }
    L_0x002c:
        return;
    L_0x002d:
        r3.f20862e = r4;	 Catch:{ all -> 0x0030 }
        goto L_0x002b;
    L_0x0030:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0030 }
        throw r0;
    L_0x0033:
        monitor-exit(r1);	 Catch:{ all -> 0x0030 }
        goto L_0x002c;
    L_0x0035:
        r0 = 0;
        r3.f20862e = r0;	 Catch:{ all -> 0x0030 }
        monitor-exit(r1);	 Catch:{ all -> 0x0030 }
        goto L_0x002c;
        */
        throw new UnsupportedOperationException("Method not decompiled: ick.a(huy):void");
    }

    /* renamed from: a */
    public final void mo13622a(hzy hzy) {
        this.f20863f.set(hzy);
    }

    /* renamed from: b */
    public final boolean mo13623b() {
        return this.f20861d.getCount() == 0;
    }

    /* renamed from: c */
    public final void mo13624c(Status status) {
        synchronized (this.f20864g) {
            if (!mo13623b()) {
                mo8364a(mo13619a(status));
                this.f20869l = true;
            }
        }
    }

    /* renamed from: c */
    public final boolean mo13625c() {
        boolean f;
        synchronized (this.f20864g) {
            if (((huq) this.f20860c.get()) == null || !this.f20871n) {
                mo13620a();
            }
            f = m12300f();
        }
        return f;
    }

    /* renamed from: d */
    public final void mo13626d() {
        boolean z = !this.f20871n ? ((Boolean) f20858a.get()).booleanValue() : true;
        this.f20871n = z;
    }

    /* renamed from: c */
    private final void m12298c(hux hux) {
        this.f20866i = hux;
        this.f20861d.countDown();
        this.f20866i.mo8154a();
        if (this.f20868k) {
            this.f20862e = null;
        } else if (this.f20862e != null) {
            this.f20859b.removeMessages(2);
            this.f20859b.mo8366a(this.f20862e, m12299e());
        } else if (this.f20866i instanceof huw) {
            icn icn = new icn(this);
        }
        ArrayList arrayList = this.f20865h;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            ((huv) arrayList.get(i)).mo8152a();
            i = i2;
        }
        this.f20865h.clear();
    }
}
