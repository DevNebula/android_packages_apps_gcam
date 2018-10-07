package p000;

/* compiled from: PG */
/* renamed from: deh */
public final class deh extends dbx {
    /* renamed from: c */
    private static final String f23857c = bli.m887a("StateSavePic");
    /* renamed from: d */
    private final byte[] f23858d;

    public deh(dbx dbx, byte[] bArr) {
        super((bug) dbx);
        this.f23858d = bArr;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00d7 A:{SYNTHETIC, Splitter: B:23:0x00d7} */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00d7 A:{SYNTHETIC, Splitter: B:23:0x00d7} */
    /* renamed from: e */
    public final p000.dbx mo2150b() {
        /*
        r6 = this;
        r2 = 0;
        r1 = p000.kau.f21835a;
        r0 = r6.mo2152d();
        r0 = (p000.dbu) r0;
        r0 = r0.mo12975E();
        r3 = r0.getExtras();
        if (r3 == 0) goto L_0x0025;
    L_0x0013:
        r0 = "output";
        r0 = r3.getParcelable(r0);
        r0 = (android.net.Uri) r0;
        r0 = p000.kbg.m4804c(r0);
        r1 = "crop";
        r3.getString(r1);
        r1 = r0;
    L_0x0025:
        r0 = r1.mo9709b();
        if (r0 == 0) goto L_0x0083;
    L_0x002b:
        r0 = r6.mo2152d();	 Catch:{ IOException -> 0x0156, all -> 0x00d2 }
        r0 = (p000.dbu) r0;	 Catch:{ IOException -> 0x0156, all -> 0x00d2 }
        r0 = r0.mo12996c();	 Catch:{ IOException -> 0x0156, all -> 0x00d2 }
        r3 = r0.getContentResolver();	 Catch:{ IOException -> 0x0156, all -> 0x00d2 }
        r0 = r1.mo9706a();	 Catch:{ IOException -> 0x0156, all -> 0x00d2 }
        r0 = (android.net.Uri) r0;	 Catch:{ IOException -> 0x0156, all -> 0x00d2 }
        r2 = r3.openOutputStream(r0);	 Catch:{ IOException -> 0x0156, all -> 0x00d2 }
        r0 = r6.f23858d;	 Catch:{ IOException -> 0x00a0, all -> 0x00db }
        r2.write(r0);	 Catch:{ IOException -> 0x00a0, all -> 0x00db }
        r2.close();	 Catch:{ IOException -> 0x00a0, all -> 0x00db }
        r0 = f23857c;	 Catch:{ IOException -> 0x00a0, all -> 0x00db }
        r3 = java.lang.String.valueOf(r1);	 Catch:{ IOException -> 0x00a0, all -> 0x00db }
        r4 = java.lang.String.valueOf(r3);	 Catch:{ IOException -> 0x00a0, all -> 0x00db }
        r4 = r4.length();	 Catch:{ IOException -> 0x00a0, all -> 0x00db }
        r4 = r4 + 21;
        r5 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x00a0, all -> 0x00db }
        r5.<init>(r4);	 Catch:{ IOException -> 0x00a0, all -> 0x00db }
        r4 = "saved result to URI: ";
        r5.append(r4);	 Catch:{ IOException -> 0x00a0, all -> 0x00db }
        r5.append(r3);	 Catch:{ IOException -> 0x00a0, all -> 0x00db }
        r3 = r5.toString();	 Catch:{ IOException -> 0x00a0, all -> 0x00db }
        p000.bli.m896d(r0, r3);	 Catch:{ IOException -> 0x00a0, all -> 0x00db }
        r0 = new dcf;	 Catch:{ IOException -> 0x00a0, all -> 0x00db }
        r3 = new android.content.Intent;	 Catch:{ IOException -> 0x00a0, all -> 0x00db }
        r3.<init>();	 Catch:{ IOException -> 0x00a0, all -> 0x00db }
        r3 = p000.kbg.m4804c(r3);	 Catch:{ IOException -> 0x00a0, all -> 0x00db }
        r0.<init>(r6, r3);	 Catch:{ IOException -> 0x00a0, all -> 0x00db }
        if (r2 == 0) goto L_0x0082;
    L_0x007f:
        r2.close();	 Catch:{ IOException -> 0x00df }
    L_0x0082:
        return r0;
    L_0x0083:
        r0 = r6.f23858d;
        r1 = p000.hjg.m3256a(r0);
        r0 = new dcf;
        r2 = new android.content.Intent;
        r3 = "inline-data";
        r2.<init>(r3);
        r3 = "data";
        r1 = r2.putExtra(r3, r1);
        r1 = p000.kbg.m4804c(r1);
        r0.<init>(r6, r1);
        goto L_0x0082;
    L_0x00a0:
        r0 = move-exception;
    L_0x00a1:
        r3 = f23857c;	 Catch:{ all -> 0x0106 }
        r1 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x0106 }
        r4 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x0106 }
        r4 = r4.length();	 Catch:{ all -> 0x0106 }
        r4 = r4 + 38;
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0106 }
        r5.<init>(r4);	 Catch:{ all -> 0x0106 }
        r4 = "exception while saving result to URI: ";
        r5.append(r4);	 Catch:{ all -> 0x0106 }
        r5.append(r1);	 Catch:{ all -> 0x0106 }
        r1 = r5.toString();	 Catch:{ all -> 0x0106 }
        p000.bli.m892b(r3, r1, r0);	 Catch:{ all -> 0x0106 }
        if (r2 == 0) goto L_0x00ca;
    L_0x00c7:
        r2.close();	 Catch:{ IOException -> 0x010a }
    L_0x00ca:
        r0 = new dcf;
        r1 = p000.kau.f21835a;
        r0.<init>(r6, r1);
        goto L_0x0082;
    L_0x00d2:
        r0 = move-exception;
        r1 = r0;
        r0 = r2;
    L_0x00d5:
        if (r0 == 0) goto L_0x00da;
    L_0x00d7:
        r0.close();	 Catch:{ IOException -> 0x0130 }
    L_0x00da:
        throw r1;
    L_0x00db:
        r0 = move-exception;
        r1 = r0;
        r0 = r2;
        goto L_0x00d5;
    L_0x00df:
        r1 = move-exception;
        r2 = f23857c;
        r1 = java.lang.String.valueOf(r1);
        r3 = java.lang.String.valueOf(r1);
        r3 = r3.length();
        r4 = new java.lang.StringBuilder;
        r3 = r3 + 23;
        r4.<init>(r3);
        r3 = "Failed to close stream.";
        r4.append(r3);
        r4.append(r1);
        r1 = r4.toString();
        p000.bli.m891b(r2, r1);
        goto L_0x0082;
    L_0x0106:
        r0 = move-exception;
        r1 = r0;
        r0 = r2;
        goto L_0x00d5;
    L_0x010a:
        r0 = move-exception;
        r1 = f23857c;
        r0 = java.lang.String.valueOf(r0);
        r2 = java.lang.String.valueOf(r0);
        r2 = r2.length();
        r3 = new java.lang.StringBuilder;
        r2 = r2 + 23;
        r3.<init>(r2);
        r2 = "Failed to close stream.";
        r3.append(r2);
        r3.append(r0);
        r0 = r3.toString();
        p000.bli.m891b(r1, r0);
        goto L_0x00ca;
    L_0x0130:
        r0 = move-exception;
        r2 = f23857c;
        r0 = java.lang.String.valueOf(r0);
        r3 = java.lang.String.valueOf(r0);
        r3 = r3.length();
        r4 = new java.lang.StringBuilder;
        r3 = r3 + 23;
        r4.<init>(r3);
        r3 = "Failed to close stream.";
        r4.append(r3);
        r4.append(r0);
        r0 = r4.toString();
        p000.bli.m891b(r2, r0);
        goto L_0x00da;
    L_0x0156:
        r0 = move-exception;
        goto L_0x00a1;
        */
        throw new UnsupportedOperationException("Method not decompiled: deh.e():dbx");
    }
}
