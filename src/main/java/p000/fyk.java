package p000;

import android.annotation.TargetApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: fyk */
public final class fyk implements fyt {
    /* renamed from: a */
    public final Object f18901a = new Object();
    /* renamed from: b */
    public final LinkedHashSet f18902b = new LinkedHashSet();
    /* renamed from: c */
    public final iml f18903c = new iml(Collections.emptyList());
    /* renamed from: d */
    public int f18904d;
    /* renamed from: e */
    private final fyt f18905e;
    /* renamed from: f */
    private final imn f18906f = new imn(ilq.m3901f(Arrays.asList(new ilp[]{ilq.m3875a(ilq.m3872a(ilq.m3875a(this.f18903c, new fyn())), fym.f18907a), this.f18905e.mo6949c()})));

    /* renamed from: a */
    private static /* synthetic */ void m11091a(Throwable th, iqo iqo) {
        if (th != null) {
            try {
                iqo.close();
                return;
            } catch (Throwable th2) {
                kqg.m5105a(th, th2);
                return;
            }
        }
        iqo.close();
    }

    public fyk(fyt fyt) {
        this.f18905e = fyt;
    }

    /* JADX WARNING: Missing block: B:18:0x0035, code:
            p000.fyk.m11091a(r0, r1);
     */
    /* renamed from: a */
    public final p000.bbi mo6947a(int r6) {
        /*
        r5 = this;
        r4 = 0;
        r1 = r5.mo6948a();
        r0 = r5.f18905e;	 Catch:{ all -> 0x0032 }
        r0 = r0.mo6947a(r6);	 Catch:{ all -> 0x0032 }
        r2 = r0.mo12350b();	 Catch:{ all -> 0x0032 }
        if (r2 != 0) goto L_0x002e;
    L_0x0011:
        r2 = r5.f18901a;	 Catch:{ all -> 0x0032 }
        monitor-enter(r2);	 Catch:{ all -> 0x0032 }
        r3 = r5.f18904d;	 Catch:{ all -> 0x0039 }
        r3 = r3 + 1;
        r5.f18904d = r3;	 Catch:{ all -> 0x0039 }
        monitor-exit(r2);	 Catch:{ all -> 0x0039 }
        r2 = new fyo;	 Catch:{ all -> 0x0032 }
        r2.<init>(r5);	 Catch:{ all -> 0x0032 }
        r3 = p000.khx.m5000a();	 Catch:{ all -> 0x0032 }
        r0.mo12349a(r2, r3);	 Catch:{ all -> 0x0032 }
        r5.mo13312b();	 Catch:{ all -> 0x0032 }
        p000.fyk.m11091a(r4, r1);
    L_0x002d:
        return r0;
    L_0x002e:
        p000.fyk.m11091a(r4, r1);
        goto L_0x002d;
    L_0x0032:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0034 }
    L_0x0034:
        r2 = move-exception;
        p000.fyk.m11091a(r0, r1);
        throw r2;
    L_0x0039:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0039 }
        throw r0;	 Catch:{ all -> 0x0032 }
        */
        throw new UnsupportedOperationException("Method not decompiled: fyk.a(int):bbi");
    }

    /* renamed from: a */
    public final iqo mo13311a(fyl fyl) {
        synchronized (this.f18901a) {
            jri.m13405b(this.f18902b.contains(fyl) ^ 1);
            this.f18902b.add(fyl);
            this.f18903c.f24640b = new ArrayList(this.f18902b);
        }
        this.f18903c.f24639a.m2973a();
        iqt fyp = new fyp(this);
        iqo a = ilq.m3881a(fyl.mo6945f(), fyp);
        fyl.mo6945f().mo13673b();
        fyp.mo8826a();
        iqo bbo = new bbo();
        bbo.add(new fyq(this, fyl));
        bbo.add(a);
        return bbo;
    }

    /* renamed from: a */
    public final iqo mo6948a() {
        iqo a = this.f18905e.mo6948a();
        iqo a2 = this.f18906f.mo15009a();
        iqo bbo = new bbo();
        bbo.add(a);
        bbo.add(a2);
        return bbo;
    }

    /* JADX WARNING: Missing block: B:7:0x000a, code:
            r1 = r6.f18901a;
     */
    /* JADX WARNING: Missing block: B:8:0x000c, code:
            monitor-enter(r1);
     */
    /* JADX WARNING: Missing block: B:10:?, code:
            r2 = new java.util.ArrayList(r6.f18902b);
     */
    /* JADX WARNING: Missing block: B:11:0x0014, code:
            monitor-exit(r1);
     */
    /* JADX WARNING: Missing block: B:12:0x0015, code:
            r3 = r2.size();
            r0 = 0;
     */
    /* JADX WARNING: Missing block: B:13:0x001a, code:
            if (r0 >= r3) goto L_0x0008;
     */
    /* JADX WARNING: Missing block: B:14:0x001c, code:
            r1 = r0 + 1;
            r0 = (p000.fyl) r2.get(r0);
     */
    /* JADX WARNING: Missing block: B:16:0x0028, code:
            if (r0.mo6944e() == false) goto L_0x0038;
     */
    /* JADX WARNING: Missing block: B:17:0x002a, code:
            r4 = r6.f18901a;
     */
    /* JADX WARNING: Missing block: B:18:0x002c, code:
            monitor-enter(r4);
     */
    /* JADX WARNING: Missing block: B:21:0x002f, code:
            if (r6.f18904d != 0) goto L_0x0036;
     */
    /* JADX WARNING: Missing block: B:22:0x0031, code:
            monitor-exit(r4);
     */
    /* JADX WARNING: Missing block: B:27:?, code:
            monitor-exit(r4);
     */
    /* JADX WARNING: Missing block: B:29:0x0038, code:
            r0 = r1;
     */
    /* JADX WARNING: Missing block: B:49:?, code:
            return;
     */
    /* JADX WARNING: Missing block: B:50:?, code:
            return;
     */
    /* renamed from: b */
    final void mo13312b() {
        /*
        r6 = this;
        r1 = r6.f18901a;
        monitor-enter(r1);
        r0 = r6.f18904d;	 Catch:{ all -> 0x003a }
        if (r0 != 0) goto L_0x0009;
    L_0x0007:
        monitor-exit(r1);	 Catch:{ all -> 0x003a }
    L_0x0008:
        return;
    L_0x0009:
        monitor-exit(r1);	 Catch:{ all -> 0x003a }
        r1 = r6.f18901a;
        monitor-enter(r1);
        r2 = new java.util.ArrayList;	 Catch:{ all -> 0x003d }
        r0 = r6.f18902b;	 Catch:{ all -> 0x003d }
        r2.<init>(r0);	 Catch:{ all -> 0x003d }
        monitor-exit(r1);	 Catch:{ all -> 0x003d }
        r3 = r2.size();
        r0 = 0;
    L_0x001a:
        if (r0 >= r3) goto L_0x0008;
    L_0x001c:
        r1 = r0 + 1;
        r0 = r2.get(r0);
        r0 = (p000.fyl) r0;
    L_0x0024:
        r4 = r0.mo6944e();
        if (r4 == 0) goto L_0x0038;
    L_0x002a:
        r4 = r6.f18901a;
        monitor-enter(r4);
        r5 = r6.f18904d;	 Catch:{ all -> 0x0033 }
        if (r5 != 0) goto L_0x0036;
    L_0x0031:
        monitor-exit(r4);	 Catch:{ all -> 0x0033 }
        goto L_0x0008;
    L_0x0033:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x0033 }
        throw r0;
    L_0x0036:
        monitor-exit(r4);	 Catch:{ all -> 0x0033 }
        goto L_0x0024;
    L_0x0038:
        r0 = r1;
        goto L_0x001a;
    L_0x003a:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x003a }
        throw r0;
    L_0x003d:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x003d }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: fyk.b():void");
    }

    /* renamed from: c */
    public final ilp mo6949c() {
        return this.f18906f;
    }

    /* JADX WARNING: Missing block: B:20:0x0040, code:
            p000.fyk.m11091a(r0, r3);
     */
    /* renamed from: d */
    public final p000.fyr mo6950d() {
        /*
        r6 = this;
        r1 = 0;
        r0 = r6.f18905e;
        r0 = r0.mo6950d();
        if (r0 == 0) goto L_0x000a;
    L_0x0009:
        return r0;
    L_0x000a:
        r3 = r6.mo6948a();
        r2 = r6.f18901a;	 Catch:{ all -> 0x003d }
        monitor-enter(r2);	 Catch:{ all -> 0x003d }
        r4 = new java.util.ArrayList;	 Catch:{ all -> 0x0044 }
        r0 = r6.f18902b;	 Catch:{ all -> 0x0044 }
        r4.<init>(r0);	 Catch:{ all -> 0x0044 }
        monitor-exit(r2);	 Catch:{ all -> 0x0044 }
        r5 = r4.size();	 Catch:{ all -> 0x003d }
        r0 = 0;
        r2 = r0;
    L_0x001f:
        if (r2 >= r5) goto L_0x0038;
    L_0x0021:
        r0 = r4.get(r2);	 Catch:{ all -> 0x003d }
        r2 = r2 + 1;
        r0 = (p000.fyl) r0;	 Catch:{ all -> 0x003d }
        r0.mo6944e();	 Catch:{ all -> 0x003d }
        r0 = r6.f18905e;	 Catch:{ all -> 0x003d }
        r0 = r0.mo6950d();	 Catch:{ all -> 0x003d }
        if (r0 == 0) goto L_0x001f;
    L_0x0034:
        p000.fyk.m11091a(r1, r3);
        goto L_0x0009;
    L_0x0038:
        p000.fyk.m11091a(r1, r3);
        r0 = r1;
        goto L_0x0009;
    L_0x003d:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x003f }
    L_0x003f:
        r1 = move-exception;
        p000.fyk.m11091a(r0, r3);
        throw r1;
    L_0x0044:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0044 }
        throw r0;	 Catch:{ all -> 0x003d }
        */
        throw new UnsupportedOperationException("Method not decompiled: fyk.d():fyr");
    }
}
