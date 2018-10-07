package p000;

import android.annotation.TargetApi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: fli */
final class fli implements fyl, iqo {
    /* renamed from: a */
    public final fyt f18390a;
    /* renamed from: b */
    public final bbh f18391b;
    /* renamed from: c */
    public final int f18392c;
    /* renamed from: d */
    public final iml f18393d;
    /* renamed from: e */
    public final imn f18394e;
    /* renamed from: f */
    public final Object f18395f;
    /* renamed from: g */
    public final List f18396g;
    /* renamed from: h */
    public final LinkedHashMap f18397h;
    /* renamed from: i */
    public boolean f18398i = false;

    fli(fyt fyt, bbh bbh, int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13395a(z);
        this.f18390a = fyt;
        this.f18391b = bbh;
        this.f18392c = i;
        this.f18395f = new Object();
        this.f18396g = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.f18396g.add(new fll());
        }
        this.f18397h = new LinkedHashMap();
        this.f18393d = new iml(Integer.valueOf(0));
        this.f18394e = new imn(ilq.m3889b(this.f18393d));
    }

    /* JADX WARNING: Missing block: B:8:0x002a, code:
            r5.f18393d.f24639a.m2973a();
            r3 = r2.size();
     */
    /* JADX WARNING: Missing block: B:9:0x0035, code:
            if (r0 >= r3) goto L_0x000e;
     */
    /* JADX WARNING: Missing block: B:10:0x0037, code:
            r1 = r0 + 1;
            ((p000.flj) r2.get(r0)).mo6848a();
            r0 = r1;
     */
    /* JADX WARNING: Missing block: B:20:?, code:
            return;
     */
    public final void close() {
        /*
        r5 = this;
        r0 = 0;
        r2 = new java.util.ArrayList;
        r2.<init>();
        r1 = r5.f18395f;
        monitor-enter(r1);
        r3 = r5.f18398i;	 Catch:{ all -> 0x0044 }
        if (r3 == 0) goto L_0x000f;
    L_0x000d:
        monitor-exit(r1);	 Catch:{ all -> 0x0044 }
    L_0x000e:
        return;
    L_0x000f:
        r3 = 1;
        r5.f18398i = r3;	 Catch:{ all -> 0x0044 }
        r3 = r5.f18397h;	 Catch:{ all -> 0x0044 }
        r3 = r3.values();	 Catch:{ all -> 0x0044 }
        r2.addAll(r3);	 Catch:{ all -> 0x0044 }
        r3 = r5.f18397h;	 Catch:{ all -> 0x0044 }
        r3.clear();	 Catch:{ all -> 0x0044 }
        r3 = r5.f18393d;	 Catch:{ all -> 0x0044 }
        r4 = 0;
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ all -> 0x0044 }
        r3.f24640b = r4;	 Catch:{ all -> 0x0044 }
        monitor-exit(r1);	 Catch:{ all -> 0x0044 }
        r1 = r5.f18393d;
        r1 = r1.f24639a;
        r1.m2973a();
        r3 = r2.size();
    L_0x0035:
        if (r0 >= r3) goto L_0x000e;
    L_0x0037:
        r1 = r0 + 1;
        r0 = r2.get(r0);
        r0 = (p000.flj) r0;
        r0.mo6848a();
        r0 = r1;
        goto L_0x0035;
    L_0x0044:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0044 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: fli.close():void");
    }

    /* renamed from: e */
    public final boolean mo6944e() {
        synchronized (this.f18395f) {
            if (this.f18397h.isEmpty()) {
                return false;
            }
            Collection hashSet = new HashSet();
            for (flj flj : this.f18397h.values()) {
                hashSet.add(flj.f4840b);
            }
            flj flj2 = (flj) jri.m13404b((flj) this.f18397h.remove((fhq) Collections.min(hashSet)));
            this.f18393d.f24640b = Integer.valueOf(this.f18397h.size());
            flj2.mo6848a();
            this.f18393d.f24639a.m2973a();
            return true;
        }
    }

    /* renamed from: f */
    public final ilp mo6945f() {
        return this.f18394e;
    }

    /* renamed from: a */
    public final fjw mo13262a(int i) {
        boolean z;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13395a(z);
        if (i >= this.f18392c) {
            z2 = false;
        }
        jri.m13395a(z2);
        return new flk(this, i);
    }

    /* renamed from: a */
    final boolean mo13263a(fhq fhq) {
        synchronized (this.f18395f) {
            for (fll fll : this.f18396g) {
                if (fll.f4844a.contains(fhq)) {
                    return true;
                }
            }
            return false;
        }
    }
}
