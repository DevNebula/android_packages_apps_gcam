package p000;

/* renamed from: jhd */
final /* synthetic */ class jhd implements Runnable {
    /* renamed from: a */
    private final jgz f8197a;

    jhd(jgz jgz) {
        this.f8197a = jgz;
    }

    /* JADX WARNING: Failed to extract finally block: empty outs */
    public final void run() {
        /*
        r4 = this;
        r2 = r4.f8197a;
        r0 = r2.f21483f;
        r0 = p000.kow.m13881c(r0);
        r0 = (android.media.MediaMuxer) r0;
        r1 = r2.f21484g;	 Catch:{ all -> 0x007c }
        r1 = r1.isDone();	 Catch:{ all -> 0x007c }
        if (r1 == 0) goto L_0x003e;
    L_0x0012:
        r1 = r2.f21484g;	 Catch:{ all -> 0x007c }
        r1 = r1.isCancelled();	 Catch:{ all -> 0x007c }
        if (r1 != 0) goto L_0x003e;
    L_0x001a:
        r1 = r2.f21484g;	 Catch:{ all -> 0x007c }
        r1 = p000.kow.m13879b(r1);	 Catch:{ all -> 0x007c }
        r1 = (java.lang.Boolean) r1;	 Catch:{ all -> 0x007c }
        r1 = r1.booleanValue();	 Catch:{ all -> 0x007c }
        if (r1 == 0) goto L_0x003e;
    L_0x0028:
        r0.stop();	 Catch:{ all -> 0x007c }
    L_0x002b:
        r0.release();	 Catch:{ all -> 0x0095 }
        r0 = r2.f21485h;
        r0 = r0.isDone();
        if (r0 != 0) goto L_0x003d;
    L_0x0036:
        r0 = r2.f21485h;
        r1 = p000.jgz.class;
        r0.mo15641a(r1);
    L_0x003d:
        return;
    L_0x003e:
        r1 = "MuxerImpl";
        r3 = "Output cancelled since no data written to at least one track.";
        android.util.Log.w(r1, r3);	 Catch:{ all -> 0x007c }
        r1 = r2.f21485h;	 Catch:{ all -> 0x007c }
        r3 = 0;
        r1.cancel(r3);	 Catch:{ all -> 0x007c }
        r1 = r2.f21479b;	 Catch:{ all -> 0x007c }
        r1 = r1.isDone();	 Catch:{ all -> 0x007c }
        if (r1 == 0) goto L_0x002b;
    L_0x0053:
        r1 = r2.f21479b;	 Catch:{ all -> 0x007c }
        r1 = r1.isCancelled();	 Catch:{ all -> 0x007c }
        if (r1 != 0) goto L_0x002b;
    L_0x005b:
        r1 = r2.f21479b;	 Catch:{ all -> 0x007c }
        r1 = p000.kow.m13881c(r1);	 Catch:{ all -> 0x007c }
        r1 = (p000.jgw) r1;	 Catch:{ all -> 0x007c }
        r3 = r1.f8182a;	 Catch:{ all -> 0x007c }
        r3 = r3.mo9709b();	 Catch:{ all -> 0x007c }
        if (r3 == 0) goto L_0x002b;
    L_0x006b:
        r3 = new java.io.File;	 Catch:{ all -> 0x007c }
        r1 = r1.f8182a;	 Catch:{ all -> 0x007c }
        r1 = r1.mo9706a();	 Catch:{ all -> 0x007c }
        r1 = (java.lang.String) r1;	 Catch:{ all -> 0x007c }
        r3.<init>(r1);	 Catch:{ all -> 0x007c }
        r3.delete();	 Catch:{ all -> 0x007c }
        goto L_0x002b;
    L_0x007c:
        r1 = move-exception;
        r3 = r2.f21485h;	 Catch:{ all -> 0x00ab }
        r3.mo15642a(r1);	 Catch:{ all -> 0x00ab }
        r0.release();	 Catch:{ all -> 0x00bf }
        r0 = r2.f21485h;
        r0 = r0.isDone();
        if (r0 != 0) goto L_0x003d;
    L_0x008d:
        r0 = r2.f21485h;
        r1 = p000.jgz.class;
        r0.mo15641a(r1);
        goto L_0x003d;
    L_0x0095:
        r0 = move-exception;
        r1 = r2.f21485h;	 Catch:{ all -> 0x00d6 }
        r1.mo15642a(r0);	 Catch:{ all -> 0x00d6 }
        r0 = r2.f21485h;
        r0 = r0.isDone();
        if (r0 != 0) goto L_0x003d;
    L_0x00a3:
        r0 = r2.f21485h;
        r1 = p000.jgz.class;
        r0.mo15641a(r1);
        goto L_0x003d;
    L_0x00ab:
        r1 = move-exception;
        r0.release();	 Catch:{ all -> 0x00e7 }
        r0 = r2.f21485h;
        r0 = r0.isDone();
        if (r0 != 0) goto L_0x00be;
    L_0x00b7:
        r0 = r2.f21485h;
        r2 = p000.jgz.class;
        r0.mo15641a(r2);
    L_0x00be:
        throw r1;
    L_0x00bf:
        r0 = move-exception;
        r1 = r2.f21485h;	 Catch:{ all -> 0x00fd }
        r1.mo15642a(r0);	 Catch:{ all -> 0x00fd }
        r0 = r2.f21485h;
        r0 = r0.isDone();
        if (r0 != 0) goto L_0x003d;
    L_0x00cd:
        r0 = r2.f21485h;
        r1 = p000.jgz.class;
        r0.mo15641a(r1);
        goto L_0x003d;
    L_0x00d6:
        r0 = move-exception;
        r1 = r2.f21485h;
        r1 = r1.isDone();
        if (r1 != 0) goto L_0x00e6;
    L_0x00df:
        r1 = r2.f21485h;
        r2 = p000.jgz.class;
        r1.mo15641a(r2);
    L_0x00e6:
        throw r0;
    L_0x00e7:
        r0 = move-exception;
        r3 = r2.f21485h;	 Catch:{ all -> 0x010e }
        r3.mo15642a(r0);	 Catch:{ all -> 0x010e }
        r0 = r2.f21485h;
        r0 = r0.isDone();
        if (r0 != 0) goto L_0x00be;
    L_0x00f5:
        r0 = r2.f21485h;
        r2 = p000.jgz.class;
        r0.mo15641a(r2);
        goto L_0x00be;
    L_0x00fd:
        r0 = move-exception;
        r1 = r2.f21485h;
        r1 = r1.isDone();
        if (r1 != 0) goto L_0x010d;
    L_0x0106:
        r1 = r2.f21485h;
        r2 = p000.jgz.class;
        r1.mo15641a(r2);
    L_0x010d:
        throw r0;
    L_0x010e:
        r0 = move-exception;
        r1 = r2.f21485h;
        r1 = r1.isDone();
        if (r1 != 0) goto L_0x011e;
    L_0x0117:
        r1 = r2.f21485h;
        r2 = p000.jgz.class;
        r1.mo15641a(r2);
    L_0x011e:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: jhd.run():void");
    }
}
