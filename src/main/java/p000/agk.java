package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* renamed from: agk */
public final class agk {
    /* renamed from: a */
    private final C0300iw f440a;
    /* renamed from: b */
    private final List f441b;
    /* renamed from: c */
    private final String f442c;

    public agk(Class cls, Class cls2, Class cls3, List list, C0300iw c0300iw) {
        this.f440a = c0300iw;
        this.f441b = (List) aqe.m612a((Collection) list);
        String simpleName = cls.getSimpleName();
        String simpleName2 = cls2.getSimpleName();
        String simpleName3 = cls3.getSimpleName();
        int length = String.valueOf(simpleName).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 21) + String.valueOf(simpleName2).length()) + String.valueOf(simpleName3).length());
        stringBuilder.append("Failed LoadPath{");
        stringBuilder.append(simpleName);
        stringBuilder.append("->");
        stringBuilder.append(simpleName2);
        stringBuilder.append("->");
        stringBuilder.append(simpleName3);
        stringBuilder.append("}");
        this.f442c = stringBuilder.toString();
    }

    /* renamed from: a */
    public final agn mo260a(ady ady, adp adp, int i, int i2, afl afl) {
        List list = (List) aqe.m610a((List) this.f440a.mo9113a(), "Argument must not be null");
        try {
            agn a = m242a(ady, adp, i, i2, afl, list);
            return a;
        } finally {
            this.f440a.mo9114a(list);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00f0 A:{Catch:{ agg -> 0x0098 }} */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0169 A:{LOOP_END, Catch:{ agg -> 0x0098 }, LOOP:0: B:1:0x000c->B:43:0x0169} */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a1 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x018f A:{RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a3  */
    /* renamed from: a */
    private final p000.agn m242a(p000.ady r21, p000.adp r22, int r23, int r24, p000.afl r25, java.util.List r26) {
        /*
        r20 = this;
        r0 = r20;
        r4 = r0.f441b;
        r18 = r4.size();
        r14 = 0;
        r4 = 0;
        r17 = r4;
    L_0x000c:
        r0 = r17;
        r1 = r18;
        if (r0 >= r1) goto L_0x018c;
    L_0x0012:
        r0 = r20;
        r4 = r0.f441b;
        r0 = r17;
        r4 = r4.get(r0);
        r13 = r4;
        r13 = (p000.afk) r13;
        r0 = r21;
        r1 = r23;
        r2 = r24;
        r3 = r22;
        r5 = r13.mo233a(r0, r1, r2, r3);	 Catch:{ agg -> 0x0098 }
        r0 = r25;
        r0 = r0.f411b;	 Catch:{ agg -> 0x0098 }
        r19 = r0;
        r0 = r25;
        r7 = r0.f410a;	 Catch:{ agg -> 0x0098 }
        r4 = r5.mo262b();	 Catch:{ agg -> 0x0098 }
        r11 = r4.getClass();	 Catch:{ agg -> 0x0098 }
        r4 = p000.adf.RESOURCE_DISK_CACHE;	 Catch:{ agg -> 0x0098 }
        if (r7 == r4) goto L_0x0187;
    L_0x0041:
        r0 = r19;
        r4 = r0.f10182a;	 Catch:{ agg -> 0x0098 }
        r10 = r4.mo221b(r11);	 Catch:{ agg -> 0x0098 }
        r0 = r19;
        r4 = r0.f10186e;	 Catch:{ agg -> 0x0098 }
        r0 = r19;
        r6 = r0.f10190i;	 Catch:{ agg -> 0x0098 }
        r0 = r19;
        r8 = r0.f10191j;	 Catch:{ agg -> 0x0098 }
        r4 = r10.mo11620a(r4, r5, r6, r8);	 Catch:{ agg -> 0x0098 }
        r16 = r4;
    L_0x005b:
        r0 = r16;
        r4 = r5.equals(r0);	 Catch:{ agg -> 0x0098 }
        if (r4 != 0) goto L_0x0066;
    L_0x0063:
        r5.mo265e();	 Catch:{ agg -> 0x0098 }
    L_0x0066:
        r0 = r19;
        r4 = r0.f10182a;	 Catch:{ agg -> 0x0098 }
        r4 = r4.f370c;	 Catch:{ agg -> 0x0098 }
        r4 = r4.f211d;	 Catch:{ agg -> 0x0098 }
        r4 = r4.f227b;	 Catch:{ agg -> 0x0098 }
        r5 = r16.mo263c();	 Catch:{ agg -> 0x0098 }
        r4 = r4.mo1674a(r5);	 Catch:{ agg -> 0x0098 }
        if (r4 == 0) goto L_0x0181;
    L_0x007a:
        r0 = r19;
        r4 = r0.f10182a;	 Catch:{ agg -> 0x0098 }
        r4 = r4.f370c;	 Catch:{ agg -> 0x0098 }
        r4 = r4.f211d;	 Catch:{ agg -> 0x0098 }
        r4 = r4.f227b;	 Catch:{ agg -> 0x0098 }
        r5 = r16.mo263c();	 Catch:{ agg -> 0x0098 }
        r4 = r4.mo1674a(r5);	 Catch:{ agg -> 0x0098 }
        if (r4 != 0) goto L_0x00b4;
    L_0x008e:
        r4 = new aci;	 Catch:{ agg -> 0x0098 }
        r5 = r16.mo263c();	 Catch:{ agg -> 0x0098 }
        r4.<init>(r5);	 Catch:{ agg -> 0x0098 }
        throw r4;	 Catch:{ agg -> 0x0098 }
    L_0x0098:
        r4 = move-exception;
        r0 = r26;
        r0.add(r4);
        r4 = r14;
    L_0x009f:
        if (r4 == 0) goto L_0x0169;
    L_0x00a1:
        if (r4 != 0) goto L_0x018f;
    L_0x00a3:
        r4 = new agg;
        r0 = r20;
        r5 = r0.f442c;
        r6 = new java.util.ArrayList;
        r0 = r26;
        r6.<init>(r0);
        r4.<init>(r5, r6);
        throw r4;
    L_0x00b4:
        r0 = r19;
        r5 = r0.f10193l;	 Catch:{ agg -> 0x0098 }
        r5 = r4.mo11619a(r5);	 Catch:{ agg -> 0x0098 }
        r15 = r4;
    L_0x00bd:
        r0 = r19;
        r4 = r0.f10182a;	 Catch:{ agg -> 0x0098 }
        r0 = r19;
        r8 = r0.f10198q;	 Catch:{ agg -> 0x0098 }
        r9 = r4.mo222b();	 Catch:{ agg -> 0x0098 }
        r12 = r9.size();	 Catch:{ agg -> 0x0098 }
        r4 = 0;
        r6 = r4;
    L_0x00cf:
        if (r6 >= r12) goto L_0x017e;
    L_0x00d1:
        r4 = r9.get(r6);	 Catch:{ agg -> 0x0098 }
        r4 = (p000.aka) r4;	 Catch:{ agg -> 0x0098 }
        r4 = r4.f506a;	 Catch:{ agg -> 0x0098 }
        r4 = r4.equals(r8);	 Catch:{ agg -> 0x0098 }
        if (r4 != 0) goto L_0x00e3;
    L_0x00df:
        r4 = r6 + 1;
        r6 = r4;
        goto L_0x00cf;
    L_0x00e3:
        r4 = 1;
    L_0x00e4:
        r0 = r19;
        r6 = r0.f10192k;	 Catch:{ agg -> 0x0098 }
        r4 = r4 ^ 1;
        r4 = r6.mo237a(r4, r7, r5);	 Catch:{ agg -> 0x0098 }
        if (r4 == 0) goto L_0x015d;
    L_0x00f0:
        if (r15 != 0) goto L_0x0100;
    L_0x00f2:
        r4 = new aci;	 Catch:{ agg -> 0x0098 }
        r5 = r16.mo262b();	 Catch:{ agg -> 0x0098 }
        r5 = r5.getClass();	 Catch:{ agg -> 0x0098 }
        r4.<init>(r5);	 Catch:{ agg -> 0x0098 }
        throw r4;	 Catch:{ agg -> 0x0098 }
    L_0x0100:
        r4 = r5.ordinal();	 Catch:{ agg -> 0x0098 }
        switch(r4) {
            case 0: goto L_0x0170;
            case 1: goto L_0x012c;
            default: goto L_0x0107;
        };	 Catch:{ agg -> 0x0098 }
    L_0x0107:
        r4 = new java.lang.IllegalArgumentException;	 Catch:{ agg -> 0x0098 }
        r5 = java.lang.String.valueOf(r5);	 Catch:{ agg -> 0x0098 }
        r6 = java.lang.String.valueOf(r5);	 Catch:{ agg -> 0x0098 }
        r6 = r6.length();	 Catch:{ agg -> 0x0098 }
        r7 = new java.lang.StringBuilder;	 Catch:{ agg -> 0x0098 }
        r6 = r6 + 18;
        r7.<init>(r6);	 Catch:{ agg -> 0x0098 }
        r6 = "Unknown strategy: ";
        r7.append(r6);	 Catch:{ agg -> 0x0098 }
        r7.append(r5);	 Catch:{ agg -> 0x0098 }
        r5 = r7.toString();	 Catch:{ agg -> 0x0098 }
        r4.<init>(r5);	 Catch:{ agg -> 0x0098 }
        throw r4;	 Catch:{ agg -> 0x0098 }
    L_0x012c:
        r4 = new agp;	 Catch:{ agg -> 0x0098 }
        r0 = r19;
        r5 = r0.f10182a;	 Catch:{ agg -> 0x0098 }
        r5 = r5.f370c;	 Catch:{ agg -> 0x0098 }
        r5 = r5.f210c;	 Catch:{ agg -> 0x0098 }
        r0 = r19;
        r6 = r0.f10198q;	 Catch:{ agg -> 0x0098 }
        r0 = r19;
        r7 = r0.f10187f;	 Catch:{ agg -> 0x0098 }
        r0 = r19;
        r8 = r0.f10190i;	 Catch:{ agg -> 0x0098 }
        r0 = r19;
        r9 = r0.f10191j;	 Catch:{ agg -> 0x0098 }
        r0 = r19;
        r12 = r0.f10193l;	 Catch:{ agg -> 0x0098 }
        r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12);	 Catch:{ agg -> 0x0098 }
    L_0x014d:
        r16 = p000.agl.m6468a(r16);	 Catch:{ agg -> 0x0098 }
        r0 = r19;
        r5 = r0.f10184c;	 Catch:{ agg -> 0x0098 }
        r5.f386a = r4;	 Catch:{ agg -> 0x0098 }
        r5.f387b = r15;	 Catch:{ agg -> 0x0098 }
        r0 = r16;
        r5.f388c = r0;	 Catch:{ agg -> 0x0098 }
    L_0x015d:
        r4 = r13.f405a;	 Catch:{ agg -> 0x0098 }
        r0 = r16;
        r1 = r22;
        r4 = r4.mo1636a(r0, r1);	 Catch:{ agg -> 0x0098 }
        goto L_0x009f;
    L_0x0169:
        r5 = r17 + 1;
        r17 = r5;
        r14 = r4;
        goto L_0x000c;
    L_0x0170:
        r4 = new aez;	 Catch:{ agg -> 0x0098 }
        r0 = r19;
        r5 = r0.f10198q;	 Catch:{ agg -> 0x0098 }
        r0 = r19;
        r6 = r0.f10187f;	 Catch:{ agg -> 0x0098 }
        r4.<init>(r5, r6);	 Catch:{ agg -> 0x0098 }
        goto L_0x014d;
    L_0x017e:
        r4 = 0;
        goto L_0x00e4;
    L_0x0181:
        r5 = p000.adh.NONE;	 Catch:{ agg -> 0x0098 }
        r4 = 0;
        r15 = r4;
        goto L_0x00bd;
    L_0x0187:
        r10 = 0;
        r16 = r5;
        goto L_0x005b;
    L_0x018c:
        r4 = r14;
        goto L_0x00a1;
    L_0x018f:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: agk.a(ady, adp, int, int, afl, java.util.List):agn");
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f441b.toArray());
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(arrays).length() + 22);
        stringBuilder.append("LoadPath{decodePaths=");
        stringBuilder.append(arrays);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
