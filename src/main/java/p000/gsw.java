package p000;

/* compiled from: PG */
/* renamed from: gsw */
final class gsw implements koj {
    /* renamed from: a */
    private final /* synthetic */ Object f19565a;
    /* renamed from: b */
    private final /* synthetic */ gst f19566b;

    gsw(gst gst, Object obj) {
        this.f19566b = gst;
        this.f19565a = obj;
    }

    /* JADX WARNING: Missing block: B:21:?, code:
            r3.close();
     */
    /* renamed from: a */
    private final p000.kpk m11713a(p000.acr r7) {
        /*
        r6 = this;
        r0 = p000.gst.f6038a;	 Catch:{ IOException -> 0x00aa }
        r1 = r6.f19565a;	 Catch:{ IOException -> 0x00aa }
        r1 = java.lang.String.valueOf(r1);	 Catch:{ IOException -> 0x00aa }
        r2 = java.lang.String.valueOf(r1);	 Catch:{ IOException -> 0x00aa }
        r2 = r2.length();	 Catch:{ IOException -> 0x00aa }
        r2 = r2 + 10;
        r3 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x00aa }
        r3.<init>(r2);	 Catch:{ IOException -> 0x00aa }
        r2 = "updating: ";
        r3.append(r2);	 Catch:{ IOException -> 0x00aa }
        r3.append(r1);	 Catch:{ IOException -> 0x00aa }
        r1 = r3.toString();	 Catch:{ IOException -> 0x00aa }
        p000.bli.m896d(r0, r1);	 Catch:{ IOException -> 0x00aa }
        r0 = r6.f19566b;	 Catch:{ IOException -> 0x00aa }
        r0 = r0.f6039b;	 Catch:{ IOException -> 0x00aa }
        r1 = r7.mo135a(r0);	 Catch:{ IOException -> 0x00aa }
        if (r1 == 0) goto L_0x00b5;
    L_0x0030:
        r2 = r1.mo148d();	 Catch:{ all -> 0x00a5 }
        r0 = p000.gst.f6038a;	 Catch:{ all -> 0x00a5 }
        r3 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x00a5 }
        r4 = java.lang.String.valueOf(r3);	 Catch:{ all -> 0x00a5 }
        r4 = r4.length();	 Catch:{ all -> 0x00a5 }
        r4 = r4 + 15;
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00a5 }
        r5.<init>(r4);	 Catch:{ all -> 0x00a5 }
        r4 = "updating file: ";
        r5.append(r4);	 Catch:{ all -> 0x00a5 }
        r5.append(r3);	 Catch:{ all -> 0x00a5 }
        r3 = r5.toString();	 Catch:{ all -> 0x00a5 }
        p000.bli.m896d(r0, r3);	 Catch:{ all -> 0x00a5 }
        r0 = r6.f19566b;	 Catch:{ all -> 0x00a5 }
        r0 = r0.f6041d;	 Catch:{ all -> 0x00a5 }
        r0 = r6.f19565a;	 Catch:{ all -> 0x00a5 }
        r0 = (p000.gss) r0;	 Catch:{ all -> 0x00a5 }
        p000.jri.m13404b(r0);	 Catch:{ all -> 0x00a5 }
        p000.jri.m13404b(r2);	 Catch:{ all -> 0x00a5 }
        r3 = new java.io.FileOutputStream;	 Catch:{ all -> 0x00a5 }
        r3.<init>(r2);	 Catch:{ all -> 0x00a5 }
        r2 = r0.f6037b;	 Catch:{ all -> 0x009e }
        r2 = r2.f7692e;	 Catch:{ all -> 0x009e }
        r4 = r2 & 255;
        r3.write(r4);	 Catch:{ all -> 0x009e }
        r2 = r2 >> 8;
        r2 = r2 & 255;
        r3.write(r2);	 Catch:{ all -> 0x009e }
        r0 = r0.f6036a;	 Catch:{ all -> 0x009e }
        r2 = android.graphics.Bitmap.CompressFormat.JPEG;	 Catch:{ all -> 0x009e }
        r4 = 80;
        r0.compress(r2, r4, r3);	 Catch:{ all -> 0x009e }
        r3.close();	 Catch:{ all -> 0x00a5 }
        r1.mo147c();	 Catch:{ all -> 0x00a5 }
        r0 = r6.f19566b;	 Catch:{ all -> 0x00a5 }
        r2 = r0.f6043f;	 Catch:{ all -> 0x00a5 }
        monitor-enter(r2);	 Catch:{ all -> 0x00a5 }
        r0 = r6.f19566b;	 Catch:{ all -> 0x00bd }
        r3 = 0;
        r0.f6042e = r3;	 Catch:{ all -> 0x00bd }
        monitor-exit(r2);	 Catch:{ all -> 0x00bd }
        r1.mo146b();	 Catch:{ IOException -> 0x00aa }
    L_0x0098:
        r0 = 0;
        r0 = p000.kow.m13873a(r0);	 Catch:{ IOException -> 0x00aa }
    L_0x009d:
        return r0;
    L_0x009e:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00a0 }
    L_0x00a0:
        r2 = move-exception;
        r3.close();	 Catch:{ all -> 0x00b0 }
    L_0x00a4:
        throw r2;	 Catch:{ all -> 0x00a5 }
    L_0x00a5:
        r0 = move-exception;
        r1.mo146b();	 Catch:{ IOException -> 0x00aa }
        throw r0;	 Catch:{ IOException -> 0x00aa }
    L_0x00aa:
        r0 = move-exception;
        r0 = p000.kow.m13874a(r0);
        goto L_0x009d;
    L_0x00b0:
        r3 = move-exception;
        p000.kqg.m5105a(r0, r3);	 Catch:{ all -> 0x00a5 }
        goto L_0x00a4;
    L_0x00b5:
        r0 = p000.gst.f6038a;	 Catch:{ IOException -> 0x00aa }
        r1 = "null editor, potential concurrent edit";
        p000.bli.m896d(r0, r1);	 Catch:{ IOException -> 0x00aa }
        goto L_0x0098;
    L_0x00bd:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x00bd }
        throw r0;	 Catch:{ all -> 0x00a5 }
        */
        throw new UnsupportedOperationException("Method not decompiled: gsw.a(acr):kpk");
    }
}
