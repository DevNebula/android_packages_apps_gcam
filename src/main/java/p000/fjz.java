package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/* compiled from: PG */
/* renamed from: fjz */
public final class fjz implements fjv, iqo {
    /* renamed from: a */
    public final ixb f18340a;
    /* renamed from: b */
    public final iqz f18341b;
    /* renamed from: c */
    public final Object f18342c = new Object();
    /* renamed from: d */
    public final Queue f18343d = new LinkedList();
    /* renamed from: e */
    public final fki f18344e = new fki();
    /* renamed from: f */
    public boolean f18345f = true;
    /* renamed from: g */
    private final Set f18346g = new HashSet();
    /* renamed from: h */
    private iwz f18347h;
    /* renamed from: i */
    private fhq f18348i;
    /* renamed from: j */
    private boolean f18349j = false;

    public fjz(ixb ixb, ira ira) {
        this.f18340a = ixb;
        this.f18341b = ira.mo8854a("ImageDistributor");
    }

    /* renamed from: a */
    public final fiw mo6837a(fjw fjw) {
        synchronized (this.f18342c) {
            if (this.f18349j) {
                fiw b = fds.m10425b();
                return b;
            }
            fki fki = new fki();
            fke fke = new fke(fki, fjw);
            synchronized (this.f18342c) {
                this.f18346g.add(fke);
            }
            return new fka(this, fki);
        }
    }

    public final void close() {
        iwz iwz;
        synchronized (this.f18342c) {
            this.f18349j = true;
            iwz = this.f18347h;
            if (iwz != null) {
                this.f18347h = null;
            } else {
                iwz = null;
            }
            this.f18346g.clear();
        }
        if (iwz != null) {
            iwz.close();
        }
    }

    /* renamed from: a */
    final kpk mo13255a(iwz iwz, fhq fhq) {
        int i = 0;
        ArrayList arrayList = new ArrayList();
        synchronized (this.f18342c) {
            for (fke fke : this.f18346g) {
                if (fke.f4826a.mo13258a(fhq)) {
                    arrayList.add(fke.f4827b);
                }
            }
        }
        if (arrayList.isEmpty()) {
            iwz.close();
            return kow.m13873a(Boolean.valueOf(false));
        }
        iwz iuz = new iuz(iwz, arrayList.size());
        Iterable arrayList2 = new ArrayList();
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            arrayList2.add(((fjw) obj).mo6838a(fkp.m17666a(new iva(iuz))));
        }
        return kow.m13872a(arrayList2);
    }

    /* JADX WARNING: Missing block: B:56:0x009e, code:
            r2 = r10.f18342c;
     */
    /* JADX WARNING: Missing block: B:57:0x00a0, code:
            monitor-enter(r2);
     */
    /* JADX WARNING: Missing block: B:59:?, code:
            r3 = r10.f18344e.mo13259b(r5);
            r10.f18347h = null;
            r10.f18348i = null;
     */
    /* JADX WARNING: Missing block: B:60:0x00ad, code:
            monitor-exit(r2);
     */
    /* JADX WARNING: Missing block: B:62:0x00b2, code:
            if (r3.size() != 0) goto L_0x00c4;
     */
    /* JADX WARNING: Missing block: B:63:0x00b4, code:
            r0 = mo13255a(r4, r5);
     */
    /* JADX WARNING: Missing block: B:64:0x00b8, code:
            p000.kow.m13878a(r0, new p000.fkb(r10), p000.kpq.f8776a);
     */
    /* JADX WARNING: Missing block: B:65:0x00c4, code:
            r0 = p000.kow.m13873a(java.lang.Boolean.valueOf(true));
            r2 = r3.iterator();
     */
    /* JADX WARNING: Missing block: B:66:0x00d1, code:
            r1 = r0;
     */
    /* JADX WARNING: Missing block: B:67:0x00d5, code:
            if (r2.hasNext() == false) goto L_0x00ea;
     */
    /* JADX WARNING: Missing block: B:68:0x00d7, code:
            r0 = p000.kny.m18476a(r1, new p000.fkc(r10, (p000.fhq) r2.next()), p000.kpq.f8776a);
     */
    /* JADX WARNING: Missing block: B:69:0x00ea, code:
            r0 = p000.kny.m18476a(r1, new p000.fkd(r10, r4, r5), p000.kpq.f8776a);
     */
    /* JADX WARNING: Missing block: B:92:?, code:
            return;
     */
    /* renamed from: a */
    public final void mo13256a() {
        /*
        r10 = this;
        r2 = 0;
        r1 = 1;
        r3 = r10.f18342c;
        monitor-enter(r3);
        r0 = r10.f18349j;	 Catch:{ all -> 0x0011 }
        if (r0 == 0) goto L_0x000b;
    L_0x0009:
        monitor-exit(r3);	 Catch:{ all -> 0x0011 }
    L_0x000a:
        return;
    L_0x000b:
        r0 = r10.f18345f;	 Catch:{ all -> 0x0011 }
        if (r0 != 0) goto L_0x0014;
    L_0x000f:
        monitor-exit(r3);	 Catch:{ all -> 0x0011 }
        goto L_0x000a;
    L_0x0011:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x0011 }
        throw r0;
    L_0x0014:
        r4 = r10.f18342c;	 Catch:{ all -> 0x0011 }
        monitor-enter(r4);	 Catch:{ all -> 0x0011 }
        r5 = new java.util.ArrayList;	 Catch:{ all -> 0x003a }
        r5.<init>();	 Catch:{ all -> 0x003a }
        r0 = r10.f18346g;	 Catch:{ all -> 0x003a }
        r6 = r0.iterator();	 Catch:{ all -> 0x003a }
    L_0x0022:
        r0 = r6.hasNext();	 Catch:{ all -> 0x003a }
        if (r0 == 0) goto L_0x003d;
    L_0x0028:
        r0 = r6.next();	 Catch:{ all -> 0x003a }
        r0 = (p000.fke) r0;	 Catch:{ all -> 0x003a }
        r7 = r0.f4827b;	 Catch:{ all -> 0x003a }
        r7 = r7.mo6839a();	 Catch:{ all -> 0x003a }
        if (r7 == 0) goto L_0x0022;
    L_0x0036:
        r5.add(r0);	 Catch:{ all -> 0x003a }
        goto L_0x0022;
    L_0x003a:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x003a }
        throw r0;	 Catch:{ all -> 0x0011 }
    L_0x003d:
        r0 = r10.f18346g;	 Catch:{ all -> 0x003a }
        r0.removeAll(r5);	 Catch:{ all -> 0x003a }
        monitor-exit(r4);	 Catch:{ all -> 0x003a }
        r0 = r10.f18348i;	 Catch:{ all -> 0x0011 }
        if (r0 == 0) goto L_0x010d;
    L_0x0047:
        r0 = r10.f18347h;	 Catch:{ all -> 0x0011 }
        if (r0 != 0) goto L_0x010a;
    L_0x004b:
        r0 = r2;
    L_0x004c:
        p000.jri.m13405b(r0);	 Catch:{ all -> 0x0011 }
        r0 = r10.f18347h;	 Catch:{ all -> 0x0011 }
        if (r0 != 0) goto L_0x005b;
    L_0x0053:
        r0 = r10.f18340a;	 Catch:{ all -> 0x0011 }
        r0 = r0.mo13748b();	 Catch:{ all -> 0x0011 }
        r10.f18347h = r0;	 Catch:{ all -> 0x0011 }
    L_0x005b:
        r4 = r10.f18347h;	 Catch:{ all -> 0x0011 }
        if (r4 != 0) goto L_0x0061;
    L_0x005f:
        monitor-exit(r3);	 Catch:{ all -> 0x0011 }
        goto L_0x000a;
    L_0x0061:
        r0 = r10.f18348i;	 Catch:{ all -> 0x0011 }
        if (r0 != 0) goto L_0x0075;
    L_0x0065:
        r6 = r4.mo13744f();	 Catch:{ all -> 0x0011 }
        r0 = r10.f18344e;	 Catch:{ all -> 0x0011 }
        r5 = java.lang.Long.valueOf(r6);	 Catch:{ all -> 0x0011 }
        r0 = r0.mo13257a(r5);	 Catch:{ all -> 0x0011 }
        r10.f18348i = r0;	 Catch:{ all -> 0x0011 }
    L_0x0075:
        r5 = r10.f18348i;	 Catch:{ all -> 0x0011 }
        if (r5 != 0) goto L_0x007b;
    L_0x0079:
        monitor-exit(r3);	 Catch:{ all -> 0x0011 }
        goto L_0x000a;
    L_0x007b:
        r0 = r10.f18343d;	 Catch:{ all -> 0x0011 }
        r0 = r0.peek();	 Catch:{ all -> 0x0011 }
        r0 = (p000.fhq) r0;	 Catch:{ all -> 0x0011 }
    L_0x0083:
        if (r0 != 0) goto L_0x00f8;
    L_0x0085:
        if (r0 != 0) goto L_0x0089;
    L_0x0087:
        monitor-exit(r3);	 Catch:{ all -> 0x0011 }
        goto L_0x000a;
    L_0x0089:
        r6 = r10.f18344e;	 Catch:{ all -> 0x0011 }
        r6.mo13258a(r5);	 Catch:{ all -> 0x0011 }
        r6 = r0.f4792b;	 Catch:{ all -> 0x0011 }
        r8 = r5.f4792b;	 Catch:{ all -> 0x0011 }
        r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r0 < 0) goto L_0x00f6;
    L_0x0096:
        r0 = r1;
    L_0x0097:
        p000.jri.m13405b(r0);	 Catch:{ all -> 0x0011 }
        r0 = 0;
        r10.f18345f = r0;	 Catch:{ all -> 0x0011 }
        monitor-exit(r3);	 Catch:{ all -> 0x0011 }
        r2 = r10.f18342c;
        monitor-enter(r2);
        r0 = r10.f18344e;	 Catch:{ all -> 0x0110 }
        r3 = r0.mo13259b(r5);	 Catch:{ all -> 0x0110 }
        r0 = 0;
        r10.f18347h = r0;	 Catch:{ all -> 0x0110 }
        r0 = 0;
        r10.f18348i = r0;	 Catch:{ all -> 0x0110 }
        monitor-exit(r2);	 Catch:{ all -> 0x0110 }
        r0 = r3.size();
        if (r0 != 0) goto L_0x00c4;
    L_0x00b4:
        r0 = r10.mo13255a(r4, r5);
    L_0x00b8:
        r1 = new fkb;
        r1.<init>(r10);
        r2 = p000.kpq.f8776a;
        p000.kow.m13878a(r0, r1, r2);
        goto L_0x000a;
    L_0x00c4:
        r0 = java.lang.Boolean.valueOf(r1);
        r0 = p000.kow.m13873a(r0);
        r2 = r3.iterator();
        r1 = r0;
    L_0x00d1:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x00ea;
    L_0x00d7:
        r0 = r2.next();
        r0 = (p000.fhq) r0;
        r3 = new fkc;
        r3.<init>(r10, r0);
        r0 = p000.kpq.f8776a;
        r0 = p000.kny.m18476a(r1, r3, r0);
        r1 = r0;
        goto L_0x00d1;
    L_0x00ea:
        r0 = new fkd;
        r0.<init>(r10, r4, r5);
        r2 = p000.kpq.f8776a;
        r0 = p000.kny.m18476a(r1, r0, r2);
        goto L_0x00b8;
    L_0x00f6:
        r0 = r2;
        goto L_0x0097;
    L_0x00f8:
        r6 = r0.f4792b;	 Catch:{ all -> 0x0011 }
        r8 = r5.f4792b;	 Catch:{ all -> 0x0011 }
        r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1));
        if (r6 >= 0) goto L_0x0085;
    L_0x0100:
        r0 = r10.f18343d;	 Catch:{ all -> 0x0011 }
        r0 = r0.poll();	 Catch:{ all -> 0x0011 }
        r0 = (p000.fhq) r0;	 Catch:{ all -> 0x0011 }
        goto L_0x0083;
    L_0x010a:
        r0 = r1;
        goto L_0x004c;
    L_0x010d:
        r0 = r1;
        goto L_0x004c;
    L_0x0110:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x0110 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: fjz.a():void");
    }
}
