package p000;

import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* renamed from: fxr */
public final class fxr implements fyt, iqo {
    /* renamed from: a */
    public final imn f18880a;
    /* renamed from: b */
    public final Object f18881b = new ReentrantLock(true);
    /* renamed from: c */
    public final LinkedList f18882c;
    /* renamed from: d */
    public final iml f18883d;
    /* renamed from: e */
    public int f18884e;
    /* renamed from: f */
    private final int f18885f;
    /* renamed from: g */
    private boolean f18886g;

    public fxr(int i) {
        this.f18885f = i;
        this.f18884e = i;
        this.f18882c = new LinkedList();
        this.f18886g = false;
        this.f18883d = new iml(Integer.valueOf(i));
        this.f18880a = new imn(this.f18883d);
    }

    /* renamed from: a */
    public final bbi mo6947a(int i) {
        int i2 = this.f18885f;
        if (i > i2 || i < 0) {
            StringBuilder stringBuilder = new StringBuilder(50);
            stringBuilder.append("tickets out of range [0, ");
            stringBuilder.append(i2);
            stringBuilder.append("]: ");
            stringBuilder.append(i);
            return aqe.m606a(new fys(new IndexOutOfBoundsException(stringBuilder.toString())));
        }
        fxt fxt;
        synchronized (this.f18881b) {
            fxt = new fxt(this, i);
            this.f18882c.add(fxt);
        }
        mo13303e();
        return new fxu(fxt, fxt.f5036b);
    }

    /* renamed from: a */
    public final iqo mo6948a() {
        return this.f18880a.mo15009a();
    }

    /* JADX WARNING: Missing block: B:16:0x0040, code:
            r3 = r2.size();
            r0 = 0;
     */
    /* JADX WARNING: Missing block: B:17:0x0045, code:
            if (r0 >= r3) goto L_0x0054;
     */
    /* JADX WARNING: Missing block: B:18:0x0047, code:
            r1 = r0 + 1;
            ((p000.fxt) r2.get(r0)).mo6940a();
            r0 = r1;
     */
    /* JADX WARNING: Missing block: B:19:0x0054, code:
            r6.f18883d.f24639a.mo15007a();
     */
    /* JADX WARNING: Missing block: B:22:?, code:
            return;
     */
    public final void close() {
        /*
        r6 = this;
        r2 = new java.util.ArrayList;
        r2.<init>();
        r1 = r6.f18881b;
        monitor-enter(r1);
        r0 = r6.f18886g;	 Catch:{ all -> 0x0030 }
        if (r0 == 0) goto L_0x000e;
    L_0x000c:
        monitor-exit(r1);	 Catch:{ all -> 0x0030 }
    L_0x000d:
        return;
    L_0x000e:
        r0 = 1;
        r6.f18886g = r0;	 Catch:{ all -> 0x0030 }
        r0 = r6.f18882c;	 Catch:{ all -> 0x0030 }
        r3 = r0.iterator();	 Catch:{ all -> 0x0030 }
    L_0x0017:
        r0 = r3.hasNext();	 Catch:{ all -> 0x0030 }
        if (r0 == 0) goto L_0x0033;
    L_0x001d:
        r0 = r3.next();	 Catch:{ all -> 0x0030 }
        r0 = (p000.fxt) r0;	 Catch:{ all -> 0x0030 }
        r4 = new fys;	 Catch:{ all -> 0x0030 }
        r5 = "FiniteTicketPool closing.";
        r4.<init>(r5);	 Catch:{ all -> 0x0030 }
        r0.f5037c = r4;	 Catch:{ all -> 0x0030 }
        r2.add(r0);	 Catch:{ all -> 0x0030 }
        goto L_0x0017;
    L_0x0030:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0030 }
        throw r0;
    L_0x0033:
        r0 = r6.f18883d;	 Catch:{ all -> 0x0030 }
        r3 = r6.mo13302b();	 Catch:{ all -> 0x0030 }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ all -> 0x0030 }
        r0.f24640b = r3;	 Catch:{ all -> 0x0030 }
        monitor-exit(r1);	 Catch:{ all -> 0x0030 }
        r3 = r2.size();
        r0 = 0;
    L_0x0045:
        if (r0 >= r3) goto L_0x0054;
    L_0x0047:
        r1 = r0 + 1;
        r0 = r2.get(r0);
        r0 = (p000.fxt) r0;
        r0.mo6940a();
        r0 = r1;
        goto L_0x0045;
    L_0x0054:
        r0 = r6.f18883d;
        r0 = r0.f24639a;
        r0.m2973a();
        goto L_0x000d;
        */
        throw new UnsupportedOperationException("Method not decompiled: fxr.close():void");
    }

    /* renamed from: b */
    final int mo13302b() {
        if (this.f18886g || !this.f18882c.isEmpty()) {
            return 0;
        }
        return this.f18884e;
    }

    /* renamed from: c */
    public final ilp mo6949c() {
        return this.f18880a;
    }

    /* renamed from: d */
    public final fyr mo6950d() {
        Object obj = null;
        synchronized (this.f18881b) {
            if (!this.f18886g && this.f18882c.isEmpty()) {
                int i = this.f18884e;
                if (i > 0) {
                    this.f18884e = i - 1;
                    this.f18883d.f24640b = Integer.valueOf(mo13302b());
                    obj = 1;
                }
            }
        }
        this.f18883d.f24639a.m2973a();
        return obj != null ? new fxs(this) : null;
    }

    /* JADX WARNING: Missing block: B:12:0x0030, code:
            r6.f18883d.f24639a.mo15007a();
     */
    /* JADX WARNING: Missing block: B:13:0x0037, code:
            if (r0 == null) goto L_0x003e;
     */
    /* JADX WARNING: Missing block: B:14:0x0039, code:
            r0.mo6940a();
     */
    /* JADX WARNING: Missing block: B:30:?, code:
            return true;
     */
    /* JADX WARNING: Missing block: B:31:?, code:
            return false;
     */
    /* renamed from: e */
    final boolean mo13303e() {
        /*
        r6 = this;
        r1 = 0;
        r3 = r6.f18881b;
        monitor-enter(r3);
        r0 = r6.f18882c;	 Catch:{ all -> 0x0066 }
        r0 = r0.peekFirst();	 Catch:{ all -> 0x0066 }
        r0 = (p000.fxt) r0;	 Catch:{ all -> 0x0066 }
        if (r0 != 0) goto L_0x0011;
    L_0x000e:
        monitor-exit(r3);	 Catch:{ all -> 0x0066 }
        r0 = r1;
    L_0x0010:
        return r0;
    L_0x0011:
        r2 = r6.f18886g;	 Catch:{ all -> 0x0066 }
        if (r2 == 0) goto L_0x0040;
    L_0x0015:
        r2 = new fys;	 Catch:{ all -> 0x0066 }
        r4 = "FiniteTicketPool is closed.";
        r2.<init>(r4);	 Catch:{ all -> 0x0066 }
        r0.f5037c = r2;	 Catch:{ all -> 0x0066 }
        r2 = r6.f18882c;	 Catch:{ all -> 0x0066 }
        r2.removeFirst();	 Catch:{ all -> 0x0066 }
    L_0x0023:
        r2 = r6.f18883d;	 Catch:{ all -> 0x0066 }
        r4 = r6.mo13302b();	 Catch:{ all -> 0x0066 }
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ all -> 0x0066 }
        r2.f24640b = r4;	 Catch:{ all -> 0x0066 }
        monitor-exit(r3);	 Catch:{ all -> 0x0066 }
        r2 = r6.f18883d;
        r2 = r2.f24639a;
        r2.m2973a();
        if (r0 == 0) goto L_0x003e;
    L_0x0039:
        r0.mo6940a();
        r0 = 1;
        goto L_0x0010;
    L_0x003e:
        r0 = r1;
        goto L_0x0010;
    L_0x0040:
        r2 = r6.f18884e;	 Catch:{ all -> 0x0066 }
        r4 = r0.f5035a;	 Catch:{ all -> 0x0066 }
        if (r2 < r4) goto L_0x0069;
    L_0x0046:
        r2 = r2 - r4;
        r6.f18884e = r2;	 Catch:{ all -> 0x0066 }
        r4 = new bbo;	 Catch:{ all -> 0x0066 }
        r4.<init>();	 Catch:{ all -> 0x0066 }
        r2 = r1;
    L_0x004f:
        r5 = r0.f5035a;	 Catch:{ all -> 0x0066 }
        if (r2 >= r5) goto L_0x005e;
    L_0x0053:
        r5 = new fxs;	 Catch:{ all -> 0x0066 }
        r5.<init>(r6);	 Catch:{ all -> 0x0066 }
        r4.add(r5);	 Catch:{ all -> 0x0066 }
        r2 = r2 + 1;
        goto L_0x004f;
    L_0x005e:
        r0.f5038d = r4;	 Catch:{ all -> 0x0066 }
        r2 = r6.f18882c;	 Catch:{ all -> 0x0066 }
        r2.removeFirst();	 Catch:{ all -> 0x0066 }
        goto L_0x0023;
    L_0x0066:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0066 }
        throw r0;
    L_0x0069:
        r0 = 0;
        goto L_0x0023;
        */
        throw new UnsupportedOperationException("Method not decompiled: fxr.e():boolean");
    }
}
