package p000;

import android.os.AsyncTask;

/* compiled from: PG */
/* renamed from: dxe */
final class dxe extends AsyncTask {
    /* renamed from: a */
    private final /* synthetic */ dxd f3540a;

    dxe(dxd dxd) {
        this.f3540a = dxd;
    }

    /* JADX WARNING: Missing block: B:24:0x00d8, code:
            if (r3 != null) goto L_0x00da;
     */
    /* JADX WARNING: Missing block: B:26:?, code:
            r3.close();
     */
    /* JADX WARNING: Missing block: B:37:0x01d6, code:
            r2 = move-exception;
     */
    /* JADX WARNING: Missing block: B:38:0x01d7, code:
            p000.kqg.m5105a(r0, r2);
     */
    protected final /* synthetic */ java.lang.Object doInBackground(java.lang.Object[] r15) {
        /*
        r14 = this;
        r2 = 0;
        r0 = r14.f3540a;
        r13 = r0.f16926a;
        r0 = r13.f23268g;
        if (r0 == 0) goto L_0x00a7;
    L_0x0009:
        r0 = r0.hasDepthmap();
        if (r0 == 0) goto L_0x00a7;
    L_0x000f:
        r0 = r13.f23267f;
        r0 = r0.f20903n;
        if (r0 == 0) goto L_0x00a7;
    L_0x0015:
        r0 = r13.f23267f;
        r8 = r0.f20902m;
        r9 = new com.google.android.apps.refocus.processing.FaceDetector;
        r0 = r13.getApplicationContext();
        r1 = r13.f23273l;
        r9.<init>(r0, r1);
        r0 = r13.f23270i;
        if (r0 != 0) goto L_0x00de;
    L_0x0028:
        r0 = r13.getIntent();
        r1 = r0.getData();
        r7 = r1.getLastPathSegment();
        r0 = r13.getContentResolver();
        r3 = r2;
        r4 = r2;
        r5 = r2;
        r3 = r0.query(r1, r2, r3, r4, r5);
        r3.moveToFirst();	 Catch:{ all -> 0x00d5 }
        r0 = "_display_name";
        r0 = r3.getColumnIndex(r0);	 Catch:{ all -> 0x00d5 }
        r4 = r3.getColumnCount();	 Catch:{ all -> 0x00d5 }
        if (r4 <= r0) goto L_0x00af;
    L_0x004e:
        r7 = r3.getString(r0);	 Catch:{ all -> 0x00d5 }
    L_0x0052:
        if (r3 == 0) goto L_0x0057;
    L_0x0054:
        r3.close();
    L_0x0057:
        r0 = com.google.android.apps.camera.legacy.app.refocus.ViewerActivity.f23265d;
        r3 = java.lang.String.valueOf(r1);
        r4 = java.lang.String.valueOf(r3);
        r4 = r4.length();
        r5 = java.lang.String.valueOf(r7);
        r5 = r5.length();
        r6 = new java.lang.StringBuilder;
        r4 = r4 + 31;
        r4 = r4 + r5;
        r6.<init>(r4);
        r4 = "create task with uri ";
        r6.append(r4);
        r6.append(r3);
        r3 = " and name ";
        r6.append(r3);
        r6.append(r7);
        r3 = r6.toString();
        p000.bli.m888a(r0, r3);
        r3 = new com.google.android.apps.refocus.processing.RenderingTask;
        r6 = r13.f23268g;
        r0 = r13.getApplicationContext();
        r10 = r0.getContentResolver();
        r11 = r13.f23272k;
        r12 = r13.f23271j;
        r4 = r1;
        r5 = r8;
        r8 = r2;
        r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12);
        r0 = r13.f23274m;
        r0.mo7094a(r3);
    L_0x00a7:
        r0 = com.google.android.apps.camera.legacy.app.refocus.ViewerActivity.f23265d;
        r1 = "reprocess the data";
        p000.bli.m888a(r0, r1);
        return r2;
    L_0x00af:
        r0 = com.google.android.apps.camera.legacy.app.refocus.ViewerActivity.f23265d;	 Catch:{ all -> 0x00d5 }
        r4 = java.lang.String.valueOf(r1);	 Catch:{ all -> 0x00d5 }
        r5 = java.lang.String.valueOf(r4);	 Catch:{ all -> 0x00d5 }
        r5 = r5.length();	 Catch:{ all -> 0x00d5 }
        r5 = r5 + 35;
        r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x00d5 }
        r6.<init>(r5);	 Catch:{ all -> 0x00d5 }
        r5 = "Fail to query the display name for ";
        r6.append(r5);	 Catch:{ all -> 0x00d5 }
        r6.append(r4);	 Catch:{ all -> 0x00d5 }
        r4 = r6.toString();	 Catch:{ all -> 0x00d5 }
        p000.bli.m891b(r0, r4);	 Catch:{ all -> 0x00d5 }
        goto L_0x0052;
    L_0x00d5:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x00d7 }
    L_0x00d7:
        r1 = move-exception;
        if (r3 == 0) goto L_0x00dd;
    L_0x00da:
        r3.close();	 Catch:{ all -> 0x01d6 }
    L_0x00dd:
        throw r1;
    L_0x00de:
        r4 = java.lang.System.currentTimeMillis();
        r0 = r13.f23277p;
        r1 = r0.mo7437a(r4);
        r0 = r13.f23277p;
        r3 = p000.ixx.JPEG;
        r3 = r0.mo7436a(r1, r3);
        r0 = r13.f23278q;
        r0 = r0.mo10566a();
        r0 = (p000.eqj) r0;
        r6 = r3.getAbsolutePath();
        r0.f4308a = r6;
        r0 = r0.mo6501a(r4);
        r0 = r0.mo6500a();
        r6 = com.google.android.apps.camera.legacy.app.refocus.ViewerActivity.f23265d;
        r3 = java.lang.String.valueOf(r3);
        r7 = java.lang.String.valueOf(r3);
        r7 = r7.length();
        r10 = new java.lang.StringBuilder;
        r7 = r7 + 61;
        r10.<init>(r7);
        r7 = "insertProcessingImg: filePath=";
        r10.append(r7);
        r10.append(r3);
        r3 = " takenTime=";
        r10.append(r3);
        r10.append(r4);
        r3 = r10.toString();
        p000.bli.m888a(r6, r3);
        r3 = r13.f23276o;
        r4 = r13.f23275n;
        r0 = r0.f4295a;
        r4 = r3.insert(r4, r0);
        p000.jri.m13404b(r4);
        r0 = com.google.android.apps.camera.legacy.app.refocus.ViewerActivity.f23265d;
        r3 = java.lang.String.valueOf(r4);
        r5 = java.lang.String.valueOf(r3);
        r5 = r5.length();
        r6 = java.lang.String.valueOf(r1);
        r6 = r6.length();
        r7 = new java.lang.StringBuilder;
        r5 = r5 + 31;
        r5 = r5 + r6;
        r7.<init>(r5);
        r5 = "create task with uri ";
        r7.append(r5);
        r7.append(r3);
        r3 = " and name ";
        r7.append(r3);
        r7.append(r1);
        r3 = r7.toString();
        p000.bli.m888a(r0, r3);
        r3 = new com.google.android.apps.refocus.processing.RenderingTask;
        r6 = r13.f23268g;
        r0 = java.lang.String.valueOf(r1);
        r1 = p000.ixx.JPEG;
        r1 = r1.f7912j;
        r1 = java.lang.String.valueOf(r1);
        r5 = r1.length();
        if (r5 != 0) goto L_0x01d1;
    L_0x018a:
        r7 = new java.lang.String;
        r7.<init>(r0);
    L_0x018f:
        r0 = r13.getApplicationContext();
        r10 = r0.getContentResolver();
        r11 = r13.f23272k;
        r12 = r13.f23271j;
        r5 = r8;
        r8 = r2;
        r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12);
        r0 = p000.kpw.m18486d();
        r1 = new dxg;
        r1.<init>(r13, r4, r0, r3);
        r3.addFinishedCallback(r1);
        r1 = r13.f23274m;
        r1.mo7094a(r3);
        r1 = r13.f23280s;
        r3 = new dxc;
        r3.<init>(r13);
        r1.post(r3);
        r0 = r0.get();	 Catch:{ ExecutionException -> 0x01c7, InterruptedException -> 0x01dc }
        r0 = (android.content.Intent) r0;	 Catch:{ ExecutionException -> 0x01c7, InterruptedException -> 0x01dc }
        r1 = -1;
        r13.setResult(r1, r0);	 Catch:{ ExecutionException -> 0x01c7, InterruptedException -> 0x01dc }
        goto L_0x00a7;
    L_0x01c7:
        r0 = move-exception;
    L_0x01c8:
        r0 = com.google.android.apps.camera.legacy.app.refocus.ViewerActivity.f23265d;
        r1 = "Exit before the task is finished";
        p000.bli.m898e(r0, r1);
        goto L_0x00a7;
    L_0x01d1:
        r7 = r0.concat(r1);
        goto L_0x018f;
    L_0x01d6:
        r2 = move-exception;
        p000.kqg.m5105a(r0, r2);
        goto L_0x00dd;
    L_0x01dc:
        r0 = move-exception;
        goto L_0x01c8;
        */
        throw new UnsupportedOperationException("Method not decompiled: dxe.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        this.f3540a.f16926a.finish();
    }
}
