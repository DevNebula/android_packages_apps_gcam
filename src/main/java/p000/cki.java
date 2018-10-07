package p000;

import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: cki */
final class cki implements kov {
    /* renamed from: a */
    private final /* synthetic */ ckh f12653a;

    /* renamed from: a */
    private static /* synthetic */ void m8391a(Throwable th, OutputStream outputStream) {
        if (th != null) {
            try {
                outputStream.close();
                return;
            } catch (Throwable th2) {
                kqg.m5105a(th, th2);
                return;
            }
        }
        outputStream.close();
    }

    cki(ckh ckh) {
        this.f12653a = ckh;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        try {
            this.f12653a.f2284b.mo15642a(th);
        } finally {
            this.f12653a.f2283a.close();
        }
    }

    /* JADX WARNING: Missing block: B:38:?, code:
            p000.cki.m8391a(r0, r2);
     */
    /* JADX WARNING: Missing block: B:45:?, code:
            p000.cki.m8391a(r0, r3);
     */
    /* renamed from: b_ */
    public final /* synthetic */ void mo10186b_(java.lang.Object r6) {
        /*
        r5 = this;
        r6 = (p000.foz) r6;
        p000.jri.m13404b(r6);	 Catch:{ Exception -> 0x006d }
        r0 = r5.f12653a;	 Catch:{ Exception -> 0x006d }
        r1 = r0.f2283a;	 Catch:{ Exception -> 0x006d }
        r2 = r1.mo13744f();	 Catch:{ Exception -> 0x006d }
        r1 = new java.io.File;	 Catch:{ Exception -> 0x006d }
        r0 = r0.f2285c;	 Catch:{ Exception -> 0x006d }
        r0 = p000.kow.m13881c(r0);	 Catch:{ Exception -> 0x006d }
        r0 = (java.io.File) r0;	 Catch:{ Exception -> 0x006d }
        r2 = p000.jxr.m4736a(r2);	 Catch:{ Exception -> 0x006d }
        r1.<init>(r0, r2);	 Catch:{ Exception -> 0x006d }
        r0 = r5.f12653a;	 Catch:{ Exception -> 0x006d }
        r0 = r0.f2283a;	 Catch:{ Exception -> 0x006d }
        r0.close();	 Catch:{ Exception -> 0x006d }
        r2 = new java.io.BufferedOutputStream;	 Catch:{ IOException -> 0x009c }
        r0 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x009c }
        r0.<init>(r1);	 Catch:{ IOException -> 0x009c }
        r2.<init>(r0);	 Catch:{ IOException -> 0x009c }
        r0 = r6.f4884d;	 Catch:{ all -> 0x00a3 }
        r3 = r0.mo12670a(r2);	 Catch:{ all -> 0x00a3 }
        r0 = r6.f4882b;	 Catch:{ all -> 0x00aa }
        r4 = r5.f12653a;	 Catch:{ all -> 0x00aa }
        r4 = r4.f2286d;	 Catch:{ all -> 0x00aa }
        p000.bdf.m826b(r0, r3, r4);	 Catch:{ all -> 0x00aa }
        r0 = 0;
        p000.cki.m8391a(r0, r3);	 Catch:{ all -> 0x00a3 }
        r0 = 0;
        p000.cki.m8391a(r0, r2);	 Catch:{ IOException -> 0x009c }
        r0 = r5.f12653a;	 Catch:{ Exception -> 0x006d }
        r0 = r0.f2284b;	 Catch:{ Exception -> 0x006d }
        r0.mo15641a(r1);	 Catch:{ Exception -> 0x006d }
        r0 = r5.f12653a;
        r0 = r0.f2283a;
        r0.close();
        r0 = r5.f12653a;
        r0 = r0.f2284b;
        r0 = r0.isDone();
        if (r0 != 0) goto L_0x006c;
    L_0x005e:
        r0 = r5.f12653a;
        r0 = r0.f2284b;
        r1 = new java.lang.RuntimeException;
        r2 = "Unable to encode jpeg: Unknown error";
        r1.<init>(r2);
        r0.mo15642a(r1);
    L_0x006c:
        return;
    L_0x006d:
        r0 = move-exception;
        r1 = r5.f12653a;	 Catch:{ all -> 0x007b }
        r1 = r1.f2284b;	 Catch:{ all -> 0x007b }
        r1.mo15642a(r0);	 Catch:{ all -> 0x007b }
        r1 = new java.lang.RuntimeException;	 Catch:{ all -> 0x007b }
        r1.<init>(r0);	 Catch:{ all -> 0x007b }
        throw r1;	 Catch:{ all -> 0x007b }
    L_0x007b:
        r0 = move-exception;
        r1 = r5.f12653a;
        r1 = r1.f2283a;
        r1.close();
        r1 = r5.f12653a;
        r1 = r1.f2284b;
        r1 = r1.isDone();
        if (r1 != 0) goto L_0x009b;
    L_0x008d:
        r1 = r5.f12653a;
        r1 = r1.f2284b;
        r2 = new java.lang.RuntimeException;
        r3 = "Unable to encode jpeg: Unknown error";
        r2.<init>(r3);
        r1.mo15642a(r2);
    L_0x009b:
        throw r0;
    L_0x009c:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;	 Catch:{ Exception -> 0x006d }
        r1.<init>(r0);	 Catch:{ Exception -> 0x006d }
        throw r1;	 Catch:{ Exception -> 0x006d }
    L_0x00a3:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00a5 }
    L_0x00a5:
        r1 = move-exception;
        p000.cki.m8391a(r0, r2);	 Catch:{ IOException -> 0x009c }
        throw r1;	 Catch:{ IOException -> 0x009c }
    L_0x00aa:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00ac }
    L_0x00ac:
        r1 = move-exception;
        p000.cki.m8391a(r0, r3);	 Catch:{ all -> 0x00a3 }
        throw r1;	 Catch:{ all -> 0x00a3 }
        */
        throw new UnsupportedOperationException("Method not decompiled: cki.b_(java.lang.Object):void");
    }
}
