package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: fie */
final class fie implements fip {
    /* renamed from: a */
    public final int f18308a = 120;
    /* renamed from: b */
    public final iqz f18309b;
    /* renamed from: c */
    public final Object f18310c = new Object();
    /* renamed from: d */
    public int f18311d;
    /* renamed from: e */
    public int f18312e = 0;
    /* renamed from: f */
    public int f18313f = 0;
    /* renamed from: g */
    private final int f18314g = 6;
    /* renamed from: h */
    private final ird f18315h;
    /* renamed from: i */
    private final fip f18316i;
    /* renamed from: j */
    private fim f18317j;

    fie(ira ira, ird ird, fip fip) {
        this.f18309b = ira.mo8854a("RepeatingFRP");
        this.f18316i = fip;
        this.f18315h = ird;
    }

    /* JADX WARNING: Missing block: B:12:0x0020, code:
            r4.f18315h.mo8857b();
            r4.f18315h.mo8857b();
     */
    /* JADX WARNING: Missing block: B:30:?, code:
            return;
     */
    /* renamed from: a */
    final void mo13244a() {
        /*
        r4 = this;
        r0 = r4.f18315h;
        r1 = "Rrp#sendNextRequest";
        r0.mo8856a(r1);
        r0 = r4.f18315h;
        r1 = "Rrp#lock";
        r0.mo8856a(r1);
        r1 = r4.f18310c;	 Catch:{ all -> 0x006c }
        monitor-enter(r1);	 Catch:{ all -> 0x006c }
        r0 = r4.f18312e;	 Catch:{ all -> 0x0078 }
        if (r0 <= 0) goto L_0x001f;
    L_0x0015:
        r2 = r4.f18317j;	 Catch:{ all -> 0x0078 }
        if (r2 == 0) goto L_0x001f;
    L_0x0019:
        r2 = r4.f18313f;	 Catch:{ all -> 0x0078 }
        r3 = r4.f18314g;	 Catch:{ all -> 0x0078 }
        if (r2 < r3) goto L_0x002b;
    L_0x001f:
        monitor-exit(r1);	 Catch:{ all -> 0x0078 }
        r0 = r4.f18315h;
        r0.mo8857b();
        r0 = r4.f18315h;
        r0.mo8857b();
    L_0x002a:
        return;
    L_0x002b:
        r0 = r0 + -1;
        r4.f18312e = r0;	 Catch:{ all -> 0x0078 }
        r0 = r2 + 1;
        r4.f18313f = r0;	 Catch:{ all -> 0x0078 }
        r0 = r4.f18315h;	 Catch:{ all -> 0x0078 }
        r2 = "Rrp#build";
        r0.mo8858b(r2);	 Catch:{ all -> 0x0078 }
        r0 = new fio;	 Catch:{ all -> 0x0078 }
        r2 = r4.f18317j;	 Catch:{ all -> 0x0078 }
        r0.<init>(r2);	 Catch:{ all -> 0x0078 }
        r2 = new fig;	 Catch:{ all -> 0x0078 }
        r2.<init>(r4);	 Catch:{ all -> 0x0078 }
        r0 = r0.mo6813a(r2);	 Catch:{ all -> 0x0078 }
        r0 = r0.mo6807a();	 Catch:{ all -> 0x0078 }
        monitor-exit(r1);	 Catch:{ all -> 0x0078 }
        r1 = r4.f18315h;	 Catch:{ all -> 0x006c }
        r2 = "Rrp#submit";
        r1.mo8858b(r2);	 Catch:{ all -> 0x006c }
        r1 = r4.f18316i;	 Catch:{ all -> 0x006c }
        r0 = java.util.Collections.singletonList(r0);	 Catch:{ all -> 0x006c }
        r2 = p000.fiv.NON_REPEATING;	 Catch:{ all -> 0x006c }
        r1.mo6816a(r0, r2);	 Catch:{ all -> 0x006c }
        r0 = r4.f18315h;
        r0.mo8857b();
        r0 = r4.f18315h;
        r0.mo8857b();
        goto L_0x002a;
    L_0x006c:
        r0 = move-exception;
        r1 = r4.f18315h;
        r1.mo8857b();
        r1 = r4.f18315h;
        r1.mo8857b();
        throw r0;
    L_0x0078:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0078 }
        throw r0;	 Catch:{ all -> 0x006c }
        */
        throw new UnsupportedOperationException("Method not decompiled: fie.a():void");
    }

    /* renamed from: a */
    public final void mo6816a(List list, fiv fiv) {
        for (int i = 0; i < 8; i++) {
            mo13244a();
        }
        if (!list.isEmpty()) {
            fim a;
            if (fiv.equals(fiv.NON_REPEATING)) {
                List arrayList = new ArrayList(list.size());
                synchronized (this.f18310c) {
                    for (fim a2 : list) {
                        if (a2.f4799e.mo9709b()) {
                            arrayList.add(a2);
                        } else {
                            this.f18312e--;
                            arrayList.add(new fio(a2).mo6813a(new fih(this)).mo6807a());
                        }
                    }
                }
                this.f18316i.mo6816a(arrayList, fiv.NON_REPEATING);
            } else if (list.size() > 1) {
                throw new UnsupportedOperationException("Repeating bursts are not supported");
            } else {
                synchronized (this.f18310c) {
                    this.f18317j = (fim) list.get(0);
                    a2 = new fio(this.f18317j).mo6813a(new fif(this)).mo6807a();
                }
                this.f18316i.mo6816a(Collections.singletonList(a2), fiv.REPEATING);
            }
        }
    }
}
