package p000;

/* compiled from: PG */
/* renamed from: fum */
final class fum implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ fub f4957a;
    /* renamed from: b */
    private final /* synthetic */ ful f4958b;

    fum(ful ful, fub fub) {
        this.f4958b = ful;
        this.f4957a = fub;
    }

    /* JADX WARNING: Missing block: B:57:?, code:
            p000.ful.m10974a(r0, r1);
     */
    /* JADX WARNING: Missing block: B:64:?, code:
            p000.ful.m10975a(r0, r6);
     */
    /* JADX WARNING: Missing block: B:74:?, code:
            p000.ful.m10974a(r0, r10);
     */
    public final void run() {
        /*
        r14 = this;
        r13 = 28;
        r2 = 0;
        r3 = r14.f4958b;
        r4 = r14.f4957a;
        r5 = new java.util.ArrayList;
        r0 = r4.f4947e;
        r0 = java.util.Collections.unmodifiableSet(r0);
        r5.<init>(r0);
        java.util.Collections.sort(r5);
        r0 = r3.f18795b;	 Catch:{ IOException -> 0x0213 }
        r1 = r4.f4943a;	 Catch:{ IOException -> 0x0213 }
        r6 = "txt";
        r1 = r0.mo6905a(r1, r6);	 Catch:{ IOException -> 0x0213 }
        r6 = new java.io.PrintStream;	 Catch:{ all -> 0x021a }
        r6.<init>(r1);	 Catch:{ all -> 0x021a }
        r0 = r4.f4949g;	 Catch:{ all -> 0x0221 }
        r0 = r0.mo9709b();	 Catch:{ all -> 0x0221 }
        if (r0 == 0) goto L_0x004e;
    L_0x002c:
        r0 = r4.f4949g;	 Catch:{ all -> 0x0221 }
        r0 = r0.mo9706a();	 Catch:{ all -> 0x0221 }
        r0 = r5.indexOf(r0);	 Catch:{ all -> 0x0221 }
        r0 = r0 + 1;
        r7 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0221 }
        r8 = 24;
        r7.<init>(r8);	 Catch:{ all -> 0x0221 }
        r8 = "base image = ";
        r7.append(r8);	 Catch:{ all -> 0x0221 }
        r7.append(r0);	 Catch:{ all -> 0x0221 }
        r0 = r7.toString();	 Catch:{ all -> 0x0221 }
        r6.println(r0);	 Catch:{ all -> 0x0221 }
    L_0x004e:
        r7 = "npf parameters = ";
        r0 = r4.f4948f;	 Catch:{ all -> 0x0221 }
        r8 = "none";
        r0 = r0.mo9707a(r8);	 Catch:{ all -> 0x0221 }
        r0 = (java.lang.String) r0;	 Catch:{ all -> 0x0221 }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x0221 }
        r8 = r0.length();	 Catch:{ all -> 0x0221 }
        if (r8 != 0) goto L_0x020d;
    L_0x0064:
        r0 = new java.lang.String;	 Catch:{ all -> 0x0221 }
        r0.<init>(r7);	 Catch:{ all -> 0x0221 }
    L_0x0069:
        r6.println(r0);	 Catch:{ all -> 0x0221 }
        r0 = 0;
        p000.ful.m10975a(r0, r6);	 Catch:{ all -> 0x021a }
        r0 = 0;
        p000.ful.m10974a(r0, r1);	 Catch:{ IOException -> 0x0213 }
        r1 = r2;
    L_0x0075:
        r0 = r4.f4950h;
        r0 = r0.size();
        if (r1 >= r0) goto L_0x00bb;
    L_0x007d:
        r0 = r4.f4950h;
        r0 = r0.get(r1);
        r0 = (byte[]) r0;
        r0 = p000.kbg.m4804c(r0);
        r6 = r4.f4943a;
        r7 = java.lang.String.valueOf(r6);
        r7 = r7.length();
        r8 = new java.lang.StringBuilder;
        r7 = r7 + 22;
        r8.<init>(r7);
        r8.append(r6);
        r6 = "_reprocess_";
        r8.append(r6);
        r6 = r1 + 1;
        r8.append(r6);
        r6 = r8.toString();
        r7 = "yuv";
        r3.mo13280a(r0, r6, r7);
        r0 = r3.f18796c;
        r6 = "Saved YUV reprocessing input";
        r0.mo2027a(r6, r2);
        r0 = r1 + 1;
        r1 = r0;
        goto L_0x0075;
    L_0x00bb:
        r1 = r2;
    L_0x00bc:
        r0 = r4.f4951i;
        r0 = java.util.Collections.unmodifiableList(r0);
        r0 = r0.size();
        if (r1 >= r0) goto L_0x0104;
    L_0x00c8:
        r0 = r3.f18794a;
        r6 = "Waiting for reprocessing metadata...";
        r0.mo8837e(r6);
        r0 = r4.f4951i;
        r0 = java.util.Collections.unmodifiableList(r0);
        r0 = r0.get(r1);
        r0 = (p000.kpk) r0;
        r6 = r4.f4943a;
        r7 = java.lang.String.valueOf(r6);
        r7 = r7.length();
        r8 = new java.lang.StringBuilder;
        r7 = r7 + 22;
        r8.<init>(r7);
        r8.append(r6);
        r6 = "_reprocess_";
        r8.append(r6);
        r6 = r1 + 1;
        r8.append(r6);
        r6 = r8.toString();
        r3.mo13281a(r0, r6);
        r0 = r1 + 1;
        r1 = r0;
        goto L_0x00bc;
    L_0x0104:
        r1 = r2;
    L_0x0105:
        r0 = r5.size();
        if (r1 >= r0) goto L_0x0236;
    L_0x010b:
        r0 = r5.get(r1);
        r0 = (java.lang.Long) r0;
        r6 = r0.longValue();
        r0 = r4.f4943a;
        r8 = r1 + 1;
        r9 = java.lang.String.valueOf(r0);
        r9 = r9.length();
        r10 = new java.lang.StringBuilder;
        r9 = r9 + 12;
        r10.<init>(r9);
        r10.append(r0);
        r0 = "_";
        r10.append(r0);
        r10.append(r8);
        r9 = r10.toString();
        r0 = r4.f4944b;
        r0 = java.util.Collections.unmodifiableMap(r0);
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x018e;
    L_0x0143:
        r0 = r4.f4944b;
        r0 = java.util.Collections.unmodifiableMap(r0);
        r10 = java.lang.Long.valueOf(r6);
        r0 = r0.containsKey(r10);
        p000.jri.m13405b(r0);
        r0 = r4.f4944b;
        r0 = java.util.Collections.unmodifiableMap(r0);
        r0 = r0.get(r10);
        r0 = (byte[]) r0;
        r0 = p000.jri.m13404b(r0);
        r0 = (byte[]) r0;
        r10 = r3.f18795b;	 Catch:{ IOException -> 0x0228 }
        r11 = "yuv";
        r10 = r10.mo6905a(r9, r11);	 Catch:{ IOException -> 0x0228 }
        r10.write(r0);	 Catch:{ all -> 0x022f }
        r0 = r3.f18796c;	 Catch:{ all -> 0x022f }
        r11 = new java.lang.StringBuilder;	 Catch:{ all -> 0x022f }
        r12 = 28;
        r11.<init>(r12);	 Catch:{ all -> 0x022f }
        r12 = "Saved Yuv image: ";
        r11.append(r12);	 Catch:{ all -> 0x022f }
        r11.append(r8);	 Catch:{ all -> 0x022f }
        r11 = r11.toString();	 Catch:{ all -> 0x022f }
        r12 = 0;
        r0.mo2027a(r11, r12);	 Catch:{ all -> 0x022f }
        r0 = 0;
        p000.ful.m10974a(r0, r10);	 Catch:{ IOException -> 0x0228 }
    L_0x018e:
        r0 = r4.f4945c;
        r0 = java.util.Collections.unmodifiableMap(r0);
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x01d6;
    L_0x019a:
        r0 = r4.f4945c;
        r0 = java.util.Collections.unmodifiableMap(r0);
        r10 = java.lang.Long.valueOf(r6);
        r0 = r0.containsKey(r10);
        p000.jri.m13405b(r0);
        r0 = r4.f4945c;
        r0 = java.util.Collections.unmodifiableMap(r0);
        r0 = r0.get(r10);
        r0 = (byte[]) r0;
        r0 = p000.kbg.m4803b(r0);
        r10 = "raw";
        r3.mo13280a(r0, r9, r10);
        r0 = r3.f18796c;
        r10 = new java.lang.StringBuilder;
        r10.<init>(r13);
        r11 = "Saved Raw image: ";
        r10.append(r11);
        r10.append(r8);
        r8 = r10.toString();
        r0.mo2027a(r8, r2);
    L_0x01d6:
        r0 = r4.f4946d;
        r0 = java.util.Collections.unmodifiableMap(r0);
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x0208;
    L_0x01e2:
        r0 = r4.f4946d;
        r0 = java.util.Collections.unmodifiableMap(r0);
        r6 = java.lang.Long.valueOf(r6);
        r0 = r0.containsKey(r6);
        p000.jri.m13405b(r0);
        r0 = r4.f4946d;
        r0 = java.util.Collections.unmodifiableMap(r0);
        r0 = r0.get(r6);
        r0 = (p000.kpk) r0;
        r0 = p000.jri.m13404b(r0);
        r0 = (p000.kpk) r0;
        r3.mo13281a(r0, r9);
    L_0x0208:
        r0 = r1 + 1;
        r1 = r0;
        goto L_0x0105;
    L_0x020d:
        r0 = r7.concat(r0);	 Catch:{ all -> 0x0221 }
        goto L_0x0069;
    L_0x0213:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;
        r1.<init>(r0);
        throw r1;
    L_0x021a:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x021c }
    L_0x021c:
        r2 = move-exception;
        p000.ful.m10974a(r0, r1);	 Catch:{ IOException -> 0x0213 }
        throw r2;	 Catch:{ IOException -> 0x0213 }
    L_0x0221:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0223 }
    L_0x0223:
        r2 = move-exception;
        p000.ful.m10975a(r0, r6);	 Catch:{ all -> 0x021a }
        throw r2;	 Catch:{ all -> 0x021a }
    L_0x0228:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;
        r1.<init>(r0);
        throw r1;
    L_0x022f:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x0231 }
    L_0x0231:
        r1 = move-exception;
        p000.ful.m10974a(r0, r10);	 Catch:{ IOException -> 0x0228 }
        throw r1;	 Catch:{ IOException -> 0x0228 }
    L_0x0236:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: fum.run():void");
    }
}
