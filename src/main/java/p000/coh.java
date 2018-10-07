package p000;

import android.annotation.TargetApi;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executor;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: coh */
final class coh {
    /* renamed from: a */
    public final Executor f2414a;
    /* renamed from: b */
    public final izi f2415b = new coi();
    /* renamed from: c */
    private final UUID f2416c;
    /* renamed from: d */
    private final List f2417d;
    /* renamed from: e */
    private final dpu f2418e;
    /* renamed from: f */
    private final cny f2419f;

    coh(List list, UUID uuid, dpu dpu, Executor executor, cny cny) {
        this.f2417d = list;
        this.f2418e = dpu;
        this.f2416c = uuid;
        this.f2414a = executor;
        this.f2419f = cny;
    }

    /* JADX WARNING: Missing block: B:17:0x004c, code:
            if (r8 != null) goto L_0x004e;
     */
    /* JADX WARNING: Missing block: B:19:?, code:
            r8.close();
     */
    /* renamed from: a */
    final java.util.List mo2415a(p000.jrg r15, p000.ipz r16, int r17) {
        /*
        r14 = this;
        r9 = new java.util.ArrayList;
        r2 = r15.mo13836f();
        r9.<init>(r2);
        r2 = r15.mo13835e();
        r10 = r2.iterator();
    L_0x0011:
        r2 = r10.hasNext();
        if (r2 == 0) goto L_0x0118;
    L_0x0017:
        r2 = r10.next();
        r2 = (java.lang.Long) r2;
        r2 = r2.longValue();
        r2 = r15.mo13827a(r2);	 Catch:{ jra -> 0x0052 }
        r2 = p000.jli.m13202c(r2);	 Catch:{ jra -> 0x0052 }
        r0 = r2;
        r0 = (p000.kah) r0;	 Catch:{ jra -> 0x0052 }
        r8 = r0;
        r2 = r8.mo9674e();	 Catch:{ all -> 0x0049 }
        r2 = (p000.ckn) r2;	 Catch:{ all -> 0x0049 }
        r2 = r2.f12655b;	 Catch:{ all -> 0x0049 }
        if (r2 == 0) goto L_0x0081;
    L_0x0037:
        r2 = r8.mo9674e();	 Catch:{ all -> 0x0049 }
        r2 = (p000.ckn) r2;	 Catch:{ all -> 0x0049 }
        r3 = r2.f12655b;	 Catch:{ all -> 0x0049 }
        if (r3 != 0) goto L_0x0054;
    L_0x0041:
        r2 = new java.lang.NullPointerException;	 Catch:{ all -> 0x0049 }
        r3 = "Attempting to get disk image, which is in memory!";
        r2.<init>(r3);	 Catch:{ all -> 0x0049 }
        throw r2;	 Catch:{ all -> 0x0049 }
    L_0x0049:
        r2 = move-exception;
        throw r2;	 Catch:{ all -> 0x004b }
    L_0x004b:
        r3 = move-exception;
        if (r8 == 0) goto L_0x0051;
    L_0x004e:
        r8.close();	 Catch:{ all -> 0x0112 }
    L_0x0051:
        throw r3;	 Catch:{ jra -> 0x0052 }
    L_0x0052:
        r2 = move-exception;
        goto L_0x0011;
    L_0x0054:
        r2 = r3.f2180b;	 Catch:{ all -> 0x0049 }
        r2 = p000.kow.m13881c(r2);	 Catch:{ all -> 0x0049 }
        r2 = (java.io.File) r2;	 Catch:{ all -> 0x0049 }
        r2 = p000.cny.m1233a(r2);	 Catch:{ all -> 0x0049 }
        r4 = r3.f2179a;	 Catch:{ all -> 0x0049 }
        r3 = new cok;	 Catch:{ all -> 0x0049 }
        r6 = new kab;	 Catch:{ all -> 0x0049 }
        r2 = p000.jqk.m13349b(r2);	 Catch:{ all -> 0x0049 }
        r6.<init>(r2);	 Catch:{ all -> 0x0049 }
        r2 = p000.jqk.m13341a(r6);	 Catch:{ all -> 0x0049 }
        r3.<init>(r2, r4);	 Catch:{ all -> 0x0049 }
        r2 = p000.jli.m13199b(r3);	 Catch:{ all -> 0x0049 }
    L_0x0078:
        r9.add(r2);	 Catch:{ all -> 0x0049 }
        if (r8 == 0) goto L_0x0011;
    L_0x007d:
        r8.close();	 Catch:{ jra -> 0x0052 }
        goto L_0x0011;
    L_0x0081:
        r2 = r8.mo9673d();	 Catch:{ all -> 0x0049 }
        r2 = (p000.ckn) r2;	 Catch:{ all -> 0x0049 }
        r3 = r2.f12654a;	 Catch:{ all -> 0x0049 }
        if (r3 != 0) goto L_0x0093;
    L_0x008b:
        r2 = new java.lang.NullPointerException;	 Catch:{ all -> 0x0049 }
        r3 = "Attempting to get memory image, which is on disk!";
        r2.<init>(r3);	 Catch:{ all -> 0x0049 }
        throw r2;	 Catch:{ all -> 0x0049 }
    L_0x0093:
        r2 = r3.mo13740b();	 Catch:{ all -> 0x0049 }
        r0 = r16;
        r4 = r0.mo8748a(r2);	 Catch:{ all -> 0x0049 }
        r6 = r3.mo13744f();	 Catch:{ all -> 0x0049 }
        r2 = r14.f2417d;	 Catch:{ all -> 0x0049 }
        r11 = r2.iterator();	 Catch:{ all -> 0x0049 }
    L_0x00a7:
        r2 = r11.hasNext();	 Catch:{ all -> 0x0049 }
        if (r2 != 0) goto L_0x00cb;
    L_0x00ad:
        r2 = new java.util.NoSuchElementException;	 Catch:{ all -> 0x0049 }
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0049 }
        r4 = 56;
        r3.<init>(r4);	 Catch:{ all -> 0x0049 }
        r4 = "StackFrame for timestamp ";
        r3.append(r4);	 Catch:{ all -> 0x0049 }
        r3.append(r6);	 Catch:{ all -> 0x0049 }
        r4 = " not found.";
        r3.append(r4);	 Catch:{ all -> 0x0049 }
        r3 = r3.toString();	 Catch:{ all -> 0x0049 }
        r2.<init>(r3);	 Catch:{ all -> 0x0049 }
        throw r2;	 Catch:{ all -> 0x0049 }
    L_0x00cb:
        r2 = r11.next();	 Catch:{ all -> 0x0049 }
        r0 = r2;
        r0 = (p000.coq) r0;	 Catch:{ all -> 0x0049 }
        r5 = r0;
        r12 = r5.f2724a;	 Catch:{ all -> 0x0049 }
        r2 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1));
        if (r2 != 0) goto L_0x00a7;
    L_0x00d9:
        r11 = new bdb;	 Catch:{ all -> 0x0049 }
        r2 = r14.f2416c;	 Catch:{ all -> 0x0049 }
        r6 = r5.f2728e;	 Catch:{ all -> 0x0049 }
        r11.<init>(r2, r6);	 Catch:{ all -> 0x0049 }
        r2 = r14.f2418e;	 Catch:{ all -> 0x0049 }
        r6 = r5.f2726c;	 Catch:{ all -> 0x0049 }
        r7 = new coj;	 Catch:{ all -> 0x0049 }
        r12 = r5.f2731h;	 Catch:{ all -> 0x0049 }
        r5 = r5.f2730g;	 Catch:{ all -> 0x0049 }
        r13 = r14.f2419f;	 Catch:{ all -> 0x0049 }
        r7.<init>(r12, r11, r5, r13);	 Catch:{ all -> 0x0049 }
        r5 = r17;
        r2 = r2.mo6042a(r3, r4, r5, r6, r7);	 Catch:{ all -> 0x0049 }
        r2 = p000.jli.m13191a(r2);	 Catch:{ all -> 0x0049 }
        r4 = r3.mo13744f();	 Catch:{ all -> 0x0049 }
        r3 = r14.f2414a;	 Catch:{ all -> 0x0049 }
        p000.jri.m13404b(r2);	 Catch:{ all -> 0x0049 }
        p000.jri.m13404b(r3);	 Catch:{ all -> 0x0049 }
        r6 = new col;	 Catch:{ all -> 0x0049 }
        r6.<init>(r4);	 Catch:{ all -> 0x0049 }
        r2 = r2.mo9275a(r3, r6);	 Catch:{ all -> 0x0049 }
        goto L_0x0078;
    L_0x0112:
        r4 = move-exception;
        p000.kqg.m5105a(r2, r4);	 Catch:{ jra -> 0x0052 }
        goto L_0x0051;
    L_0x0118:
        return r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: coh.a(jrg, ipz, int):java.util.List");
    }
}
