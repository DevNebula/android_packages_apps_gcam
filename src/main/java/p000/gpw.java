package p000;

import android.media.SoundPool.OnLoadCompleteListener;

/* compiled from: PG */
/* renamed from: gpw */
final class gpw implements OnLoadCompleteListener {
    /* renamed from: a */
    private final /* synthetic */ gpv f5985a;

    gpw(gpv gpv) {
        this.f5985a = gpv;
    }

    /* JADX WARNING: Missing block: B:8:0x0036, code:
            if (r10 != 0) goto L_0x0043;
     */
    /* JADX WARNING: Missing block: B:9:0x0038, code:
            r0 = true;
     */
    /* JADX WARNING: Missing block: B:10:0x0039, code:
            r2.f5992c.mo15641a(java.lang.Boolean.valueOf(r0));
     */
    /* JADX WARNING: Missing block: B:11:0x0043, code:
            r0 = false;
     */
    /* JADX WARNING: Missing block: B:20:?, code:
            return;
     */
    public final void onLoadComplete(android.media.SoundPool r8, int r9, int r10) {
        /*
        r7 = this;
        r0 = r7.f5985a;
        r1 = r0.f19467b;
        monitor-enter(r1);
        r0 = r7.f5985a;	 Catch:{ all -> 0x0045 }
        r2 = r0.f19468c;	 Catch:{ all -> 0x0045 }
        if (r2 == 0) goto L_0x000d;
    L_0x000b:
        monitor-exit(r1);	 Catch:{ all -> 0x0045 }
    L_0x000c:
        return;
    L_0x000d:
        r2 = r0.mo13395e(r9);	 Catch:{ all -> 0x0045 }
        r0 = p000.gpv.f19466a;	 Catch:{ all -> 0x0045 }
        r3 = r2.f5990a;	 Catch:{ all -> 0x0045 }
        r4 = r2.f5991b;	 Catch:{ all -> 0x0045 }
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0045 }
        r6 = 58;
        r5.<init>(r6);	 Catch:{ all -> 0x0045 }
        r6 = "Finished Loading Sound: ";
        r5.append(r6);	 Catch:{ all -> 0x0045 }
        r5.append(r3);	 Catch:{ all -> 0x0045 }
        r3 = ", sampleId: ";
        r5.append(r3);	 Catch:{ all -> 0x0045 }
        r5.append(r4);	 Catch:{ all -> 0x0045 }
        r3 = r5.toString();	 Catch:{ all -> 0x0045 }
        p000.bli.m888a(r0, r3);	 Catch:{ all -> 0x0045 }
        monitor-exit(r1);	 Catch:{ all -> 0x0045 }
        if (r10 != 0) goto L_0x0043;
    L_0x0038:
        r0 = 1;
    L_0x0039:
        r1 = r2.f5992c;
        r0 = java.lang.Boolean.valueOf(r0);
        r1.mo15641a(r0);
        goto L_0x000c;
    L_0x0043:
        r0 = 0;
        goto L_0x0039;
    L_0x0045:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0045 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: gpw.onLoadComplete(android.media.SoundPool, int, int):void");
    }
}
