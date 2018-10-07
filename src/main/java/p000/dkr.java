package p000;

import com.google.android.apps.camera.bottombar.BottomBarController;
import com.google.android.apps.camera.bottombar.BottomBarListener;

/* compiled from: PG */
/* renamed from: dkr */
final class dkr extends BottomBarListener {
    /* renamed from: a */
    private final /* synthetic */ BottomBarController f23975a;
    /* renamed from: b */
    private final /* synthetic */ hcd f23976b;
    /* renamed from: c */
    private final /* synthetic */ dkp f23977c;

    dkr(dkp dkp, BottomBarController bottomBarController, hcd hcd) {
        this.f23977c = dkp;
        this.f23975a = bottomBarController;
        this.f23976b = hcd;
    }

    public final void onCameraSwitch(int i) {
        synchronized (this.f23977c.f26052j) {
            if (this.f23977c.f26055m == dii.CAMCORDER_OPENED) {
                dhz dhz = this.f23977c;
                synchronized (dhz.f26052j) {
                    boolean z;
                    if (dhz.f26056n != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    jri.m13395a(z);
                    dhz.f26056n.close();
                    dhz.f26056n = null;
                    dhz.mo15506a(dhz.f26053k);
                }
                return;
            }
            String str = dkp.f26624c;
            String valueOf = String.valueOf(this.f23977c.f26055m);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 34);
            stringBuilder.append("Do nothing onCameraSwitch. mState=");
            stringBuilder.append(valueOf);
            bli.m898e(str, stringBuilder.toString());
        }
    }

    /* JADX WARNING: Missing block: B:18:?, code:
            return;
     */
    public final void onPauseButtonClicked() {
        /*
        r5 = this;
        r0 = r5.f23977c;
        r1 = r0.f26052j;
        monitor-enter(r1);
        r0 = r5.f23977c;	 Catch:{ all -> 0x005e }
        r0 = r0.f26055m;	 Catch:{ all -> 0x005e }
        r2 = p000.dii.CAMCORDER_OPENED;	 Catch:{ all -> 0x005e }
        if (r0 != r2) goto L_0x0034;
    L_0x000d:
        r0 = r5.f23977c;	 Catch:{ all -> 0x005e }
        r0 = r0.f26056n;	 Catch:{ all -> 0x005e }
        if (r0 == 0) goto L_0x0032;
    L_0x0013:
        r0 = 1;
    L_0x0014:
        p000.jri.m13405b(r0);	 Catch:{ all -> 0x005e }
        r0 = r5.f23977c;	 Catch:{ all -> 0x005e }
        r0 = r0.f26056n;	 Catch:{ all -> 0x005e }
        r0 = r0.mo13027a();	 Catch:{ all -> 0x005e }
        if (r0 == 0) goto L_0x0030;
    L_0x0021:
        r0 = r5.f23975a;	 Catch:{ all -> 0x005e }
        r0.pauseRecording();	 Catch:{ all -> 0x005e }
        r0 = r5.f23976b;	 Catch:{ all -> 0x005e }
        r0 = r0.f6321a;	 Catch:{ all -> 0x005e }
        r2 = 1061997773; // 0x3f4ccccd float:0.8 double:5.246966156E-315;
        r0.animateToScale(r2);	 Catch:{ all -> 0x005e }
    L_0x0030:
        monitor-exit(r1);	 Catch:{ all -> 0x005e }
    L_0x0031:
        return;
    L_0x0032:
        r0 = 0;
        goto L_0x0014;
    L_0x0034:
        r0 = p000.dkp.f26624c;	 Catch:{ all -> 0x005e }
        r2 = r5.f23977c;	 Catch:{ all -> 0x005e }
        r2 = r2.f26055m;	 Catch:{ all -> 0x005e }
        r2 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x005e }
        r3 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x005e }
        r3 = r3.length();	 Catch:{ all -> 0x005e }
        r3 = r3 + 40;
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x005e }
        r4.<init>(r3);	 Catch:{ all -> 0x005e }
        r3 = "Do nothing onPauseButtonClicked. mState=";
        r4.append(r3);	 Catch:{ all -> 0x005e }
        r4.append(r2);	 Catch:{ all -> 0x005e }
        r2 = r4.toString();	 Catch:{ all -> 0x005e }
        p000.bli.m898e(r0, r2);	 Catch:{ all -> 0x005e }
        monitor-exit(r1);	 Catch:{ all -> 0x005e }
        goto L_0x0031;
    L_0x005e:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x005e }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: dkr.onPauseButtonClicked():void");
    }

    /* JADX WARNING: Missing block: B:18:?, code:
            return;
     */
    public final void onResumeButtonClicked() {
        /*
        r5 = this;
        r0 = r5.f23977c;
        r1 = r0.f26052j;
        monitor-enter(r1);
        r0 = r5.f23977c;	 Catch:{ all -> 0x005d }
        r0 = r0.f26055m;	 Catch:{ all -> 0x005d }
        r2 = p000.dii.CAMCORDER_OPENED;	 Catch:{ all -> 0x005d }
        if (r0 != r2) goto L_0x0033;
    L_0x000d:
        r0 = r5.f23977c;	 Catch:{ all -> 0x005d }
        r0 = r0.f26056n;	 Catch:{ all -> 0x005d }
        if (r0 == 0) goto L_0x0031;
    L_0x0013:
        r0 = 1;
    L_0x0014:
        p000.jri.m13405b(r0);	 Catch:{ all -> 0x005d }
        r0 = r5.f23977c;	 Catch:{ all -> 0x005d }
        r0 = r0.f26056n;	 Catch:{ all -> 0x005d }
        r0 = r0.mo13029b();	 Catch:{ all -> 0x005d }
        if (r0 == 0) goto L_0x002f;
    L_0x0021:
        r0 = r5.f23975a;	 Catch:{ all -> 0x005d }
        r0.resumeRecording();	 Catch:{ all -> 0x005d }
        r0 = r5.f23976b;	 Catch:{ all -> 0x005d }
        r0 = r0.f6321a;	 Catch:{ all -> 0x005d }
        r2 = 1065353216; // 0x3f800000 float:1.0 double:5.263544247E-315;
        r0.animateToScale(r2);	 Catch:{ all -> 0x005d }
    L_0x002f:
        monitor-exit(r1);	 Catch:{ all -> 0x005d }
    L_0x0030:
        return;
    L_0x0031:
        r0 = 0;
        goto L_0x0014;
    L_0x0033:
        r0 = p000.dkp.f26624c;	 Catch:{ all -> 0x005d }
        r2 = r5.f23977c;	 Catch:{ all -> 0x005d }
        r2 = r2.f26055m;	 Catch:{ all -> 0x005d }
        r2 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x005d }
        r3 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x005d }
        r3 = r3.length();	 Catch:{ all -> 0x005d }
        r3 = r3 + 41;
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x005d }
        r4.<init>(r3);	 Catch:{ all -> 0x005d }
        r3 = "Do nothing onResumeButtonClicked. mState=";
        r4.append(r3);	 Catch:{ all -> 0x005d }
        r4.append(r2);	 Catch:{ all -> 0x005d }
        r2 = r4.toString();	 Catch:{ all -> 0x005d }
        p000.bli.m898e(r0, r2);	 Catch:{ all -> 0x005d }
        monitor-exit(r1);	 Catch:{ all -> 0x005d }
        goto L_0x0030;
    L_0x005d:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x005d }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: dkr.onResumeButtonClicked():void");
    }

    public final void onSnapshotButtonClicked() {
        synchronized (this.f23977c.f26052j) {
            if (this.f23977c.f26055m == dii.CAMCORDER_OPENED) {
                boolean z;
                if (this.f23977c.f26056n != null) {
                    z = true;
                } else {
                    z = false;
                }
                jri.m13405b(z);
                this.f23977c.f26056n.mo13031d();
                return;
            }
            String str = dkp.f26624c;
            String valueOf = String.valueOf(this.f23977c.f26055m);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 43);
            stringBuilder.append("Do nothing onSnapshotButtonClicked. mState=");
            stringBuilder.append(valueOf);
            bli.m898e(str, stringBuilder.toString());
        }
    }

    public final void onThumbnailButtonClicked() {
        synchronized (this.f23977c.f26052j) {
            dkp dkp = this.f23977c;
            if (dkp.f26056n != null) {
                dkp.f26056n.mo13032e();
            }
        }
    }
}
