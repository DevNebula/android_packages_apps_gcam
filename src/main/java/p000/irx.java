package p000;

import android.annotation.TargetApi;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: irx */
public class irx implements iqo, iri {
    /* renamed from: a */
    private final Object f21242a = new Object();
    /* renamed from: b */
    private final Set f21243b = new HashSet();
    /* renamed from: c */
    private int f21244c = C0252go.f5864bJ;
    /* renamed from: d */
    private isd f21245d;
    /* renamed from: e */
    private iwl f21246e;
    /* renamed from: f */
    private boolean f21247f = false;
    /* renamed from: g */
    private final Queue f21248g = new LinkedList();
    /* renamed from: h */
    private boolean f21249h;

    /* renamed from: a */
    public final void mo13706a(iri iri) {
        isd isd;
        synchronized (this.f21242a) {
            if (!(this.f21244c == C0252go.f5866bL || this.f21244c == C0252go.f5867bM || this.f21244c == C0252go.f5868bN)) {
                this.f21243b.add(iri);
            }
            isd = this.f21245d;
        }
        if (isd != null) {
            isd.mo8938a(iri);
        }
    }

    public void close() {
        mo8871a();
    }

    /* JADX WARNING: Missing block: B:10:0x001b, code:
            r4 = r7.f21242a;
     */
    /* JADX WARNING: Missing block: B:11:0x001d, code:
            monitor-enter(r4);
     */
    /* JADX WARNING: Missing block: B:14:0x0024, code:
            if (r7.f21248g.size() <= 0) goto L_0x0050;
     */
    /* JADX WARNING: Missing block: B:15:0x0026, code:
            r2 = (p000.isd) r7.f21248g.remove();
            r7.f21245d = r2;
            r5 = p000.ken.m13713a(r7.f21243b);
     */
    /* JADX WARNING: Missing block: B:16:0x0038, code:
            monitor-exit(r4);
     */
    /* JADX WARNING: Missing block: B:17:0x0039, code:
            r6 = r5.size();
            r1 = 0;
     */
    /* JADX WARNING: Missing block: B:18:0x003e, code:
            if (r1 >= r6) goto L_0x004d;
     */
    /* JADX WARNING: Missing block: B:19:0x0040, code:
            r4 = r1 + 1;
            r2.mo8938a((p000.iri) r5.get(r1));
            r1 = r4;
     */
    /* JADX WARNING: Missing block: B:20:0x004d, code:
            if (r2 != null) goto L_0x001b;
     */
    /* JADX WARNING: Missing block: B:23:0x0052, code:
            if (r7.f21249h == false) goto L_0x0059;
     */
    /* JADX WARNING: Missing block: B:24:0x0054, code:
            r7.f21243b.clear();
     */
    /* JADX WARNING: Missing block: B:25:0x0059, code:
            r7.f21247f = false;
     */
    /* JADX WARNING: Missing block: B:26:0x005c, code:
            monitor-exit(r4);
     */
    /* JADX WARNING: Missing block: B:39:?, code:
            return;
     */
    /* JADX WARNING: Missing block: B:40:?, code:
            return;
     */
    /* JADX WARNING: Missing block: B:41:?, code:
            return;
     */
    /* renamed from: a */
    private final void m12673a(boolean r8) {
        /*
        r7 = this;
        r3 = 0;
        r2 = r7.f21242a;
        monitor-enter(r2);
        r1 = r7.f21249h;	 Catch:{ all -> 0x0061 }
        r1 = r1 | r8;
        r7.f21249h = r1;	 Catch:{ all -> 0x0061 }
        r1 = r7.f21247f;	 Catch:{ all -> 0x0061 }
        if (r1 != 0) goto L_0x0015;
    L_0x000d:
        r1 = r7.f21248g;	 Catch:{ all -> 0x0061 }
        r1 = r1.size();	 Catch:{ all -> 0x0061 }
        if (r1 != 0) goto L_0x0017;
    L_0x0015:
        monitor-exit(r2);	 Catch:{ all -> 0x0061 }
    L_0x0016:
        return;
    L_0x0017:
        r1 = 1;
        r7.f21247f = r1;	 Catch:{ all -> 0x0061 }
        monitor-exit(r2);	 Catch:{ all -> 0x0061 }
    L_0x001b:
        r4 = r7.f21242a;
        monitor-enter(r4);
        r1 = r7.f21248g;	 Catch:{ all -> 0x005e }
        r1 = r1.size();	 Catch:{ all -> 0x005e }
        if (r1 <= 0) goto L_0x0050;
    L_0x0026:
        r1 = r7.f21248g;	 Catch:{ all -> 0x005e }
        r1 = r1.remove();	 Catch:{ all -> 0x005e }
        r0 = r1;
        r0 = (p000.isd) r0;	 Catch:{ all -> 0x005e }
        r2 = r0;
        r7.f21245d = r2;	 Catch:{ all -> 0x005e }
        r1 = r7.f21243b;	 Catch:{ all -> 0x005e }
        r5 = p000.ken.m13713a(r1);	 Catch:{ all -> 0x005e }
        monitor-exit(r4);	 Catch:{ all -> 0x005e }
        r6 = r5.size();
        r1 = r3;
    L_0x003e:
        if (r1 >= r6) goto L_0x004d;
    L_0x0040:
        r4 = r1 + 1;
        r1 = r5.get(r1);
        r1 = (p000.iri) r1;
        r2.mo8938a(r1);
        r1 = r4;
        goto L_0x003e;
    L_0x004d:
        if (r2 != 0) goto L_0x001b;
    L_0x004f:
        goto L_0x0016;
    L_0x0050:
        r1 = r7.f21249h;	 Catch:{ all -> 0x005e }
        if (r1 == 0) goto L_0x0059;
    L_0x0054:
        r1 = r7.f21243b;	 Catch:{ all -> 0x005e }
        r1.clear();	 Catch:{ all -> 0x005e }
    L_0x0059:
        r1 = 0;
        r7.f21247f = r1;	 Catch:{ all -> 0x005e }
        monitor-exit(r4);	 Catch:{ all -> 0x005e }
        goto L_0x0016;
    L_0x005e:
        r1 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x005e }
        throw r1;
    L_0x0061:
        r1 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0061 }
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: irx.a(boolean):void");
    }

    /* renamed from: a */
    public final void mo8871a() {
        boolean z;
        iqo iqo;
        synchronized (this.f21242a) {
            if (this.f21244c == C0252go.f5864bJ || this.f21244c == C0252go.f5865bK) {
                this.f21244c = C0252go.f5868bN;
                this.f21248g.add(new irz());
                z = true;
            } else {
                z = false;
            }
            iqo = this.f21246e;
            if (iqo != null) {
                this.f21246e = null;
            } else {
                iqo = null;
            }
        }
        if (z) {
            m12673a(true);
        }
        if (iqo != null) {
            iqo.close();
        }
    }

    /* renamed from: b */
    public final void mo8874b() {
        boolean z;
        synchronized (this.f21242a) {
            if (this.f21244c == C0252go.f5864bJ || this.f21244c == C0252go.f5865bK) {
                this.f21244c = C0252go.f5866bL;
                this.f21248g.add(new isa());
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            m12673a(true);
        }
        close();
    }

    /* renamed from: a */
    public final void mo8872a(int i) {
        boolean z;
        synchronized (this.f21242a) {
            if (this.f21244c == C0252go.f5864bJ || this.f21244c == C0252go.f5865bK) {
                this.f21244c = C0252go.f5867bM;
                this.f21248g.add(new isb(i));
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            m12673a(true);
        }
        close();
    }

    /* renamed from: a */
    public void mo8873a(iwl iwl) {
        boolean z;
        boolean z2 = true;
        synchronized (this.f21242a) {
            if (this.f21244c == C0252go.f5864bJ) {
                this.f21244c = C0252go.f5865bK;
                this.f21246e = new iry(iwl, this);
                this.f21248g.add(new isc(this.f21246e));
                z = false;
            } else {
                z = true;
                z2 = false;
            }
        }
        if (z2) {
            m12673a(false);
        }
        if (z) {
            if (iwl != null) {
                iwl.close();
            }
            close();
        }
    }

    /* renamed from: b */
    public final void mo13707b(iri iri) {
        synchronized (this.f21242a) {
            this.f21243b.remove(iri);
        }
    }
}
