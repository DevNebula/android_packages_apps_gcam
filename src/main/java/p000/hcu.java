package p000;

/* renamed from: hcu */
final /* synthetic */ class hcu implements Runnable {
    /* renamed from: a */
    private final hcx f6364a;
    /* renamed from: b */
    private final hcn f6365b;

    hcu(hcx hcx, hcn hcn, hcz hcz) {
        this.f6364a = hcx;
        this.f6365b = hcn;
    }

    /* JADX WARNING: Missing block: B:38:?, code:
            return;
     */
    public final void run() {
        /*
        r9 = this;
        r1 = 0;
        r2 = r9.f6364a;
        r3 = r9.f6365b;
        r4 = r2.f19927t;
        monitor-enter(r4);
        r0 = r2.f19926s;	 Catch:{ all -> 0x00dc }
        if (r0 == 0) goto L_0x000e;
    L_0x000c:
        monitor-exit(r4);	 Catch:{ all -> 0x00dc }
    L_0x000d:
        return;
    L_0x000e:
        r0 = r2.f19912e;	 Catch:{ all -> 0x00dc }
        r5 = r0.iterator();	 Catch:{ all -> 0x00dc }
    L_0x0014:
        r0 = r5.hasNext();	 Catch:{ all -> 0x00dc }
        if (r0 == 0) goto L_0x00e4;
    L_0x001a:
        r0 = r5.next();	 Catch:{ all -> 0x00dc }
        r0 = (p000.kbn) r0;	 Catch:{ all -> 0x00dc }
        r0 = r0.mo9715b();	 Catch:{ all -> 0x00dc }
        r0 = (java.lang.Boolean) r0;	 Catch:{ all -> 0x00dc }
        r0 = r0.booleanValue();	 Catch:{ all -> 0x00dc }
        if (r0 != 0) goto L_0x0014;
    L_0x002c:
        r0 = r1;
    L_0x002d:
        if (r0 == 0) goto L_0x000c;
    L_0x002f:
        r0 = new android.graphics.Rect;	 Catch:{ all -> 0x00dc }
        r0.<init>();	 Catch:{ all -> 0x00dc }
        r1 = r2.f19915h;	 Catch:{ all -> 0x00dc }
        r1.getGlobalVisibleRect(r0);	 Catch:{ all -> 0x00dc }
        r1 = r3.f6351a;	 Catch:{ all -> 0x00dc }
        r1.f6390j = r0;	 Catch:{ all -> 0x00dc }
        r0 = r1.f6393m;	 Catch:{ all -> 0x00dc }
        if (r0 != 0) goto L_0x00a8;
    L_0x0041:
        r0 = r1.f6397q;	 Catch:{ all -> 0x00dc }
        if (r0 == 0) goto L_0x004a;
    L_0x0045:
        r0 = r1.f6396p;	 Catch:{ all -> 0x00dc }
        r1.startAnimation(r0);	 Catch:{ all -> 0x00dc }
    L_0x004a:
        r0 = r1.f6385e;	 Catch:{ all -> 0x00dc }
        r3 = r1.f6389i;	 Catch:{ all -> 0x00dc }
        if (r0 == 0) goto L_0x00a8;
    L_0x0050:
        if (r3 == 0) goto L_0x00a8;
    L_0x0052:
        r5 = 0;
        r0.setClippingEnabled(r5);	 Catch:{ all -> 0x00dc }
        r5 = new android.transition.Fade;	 Catch:{ all -> 0x00dc }
        r5.<init>();	 Catch:{ all -> 0x00dc }
        r6 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        r5.setDuration(r6);	 Catch:{ all -> 0x00dc }
        r6 = new ks;	 Catch:{ all -> 0x00dc }
        r6.<init>();	 Catch:{ all -> 0x00dc }
        r5.setInterpolator(r6);	 Catch:{ all -> 0x00dc }
        r6 = 0;
        r5.setStartDelay(r6);	 Catch:{ all -> 0x00dc }
        r0.setEnterTransition(r5);	 Catch:{ all -> 0x00dc }
        r6 = new android.graphics.drawable.BitmapDrawable;	 Catch:{ all -> 0x00dc }
        r7 = r3.getResources();	 Catch:{ all -> 0x00dc }
        r8 = "";
        r6.<init>(r7, r8);	 Catch:{ all -> 0x00dc }
        r0.setBackgroundDrawable(r6);	 Catch:{ all -> 0x00dc }
        r6 = r1.f6386f;	 Catch:{ all -> 0x00dc }
        r0.setOutsideTouchable(r6);	 Catch:{ all -> 0x00dc }
        r6 = new hdh;	 Catch:{ all -> 0x00dc }
        r6.<init>(r1);	 Catch:{ all -> 0x00dc }
        r0.setOnDismissListener(r6);	 Catch:{ all -> 0x00dc }
        r6 = new java.lang.ref.WeakReference;	 Catch:{ all -> 0x00dc }
        r0 = r3.getContext();	 Catch:{ all -> 0x00dc }
        r0 = (android.app.Activity) r0;	 Catch:{ all -> 0x00dc }
        r6.<init>(r0);	 Catch:{ all -> 0x00dc }
        r0 = new hdi;	 Catch:{ all -> 0x00dc }
        r0.<init>(r1, r6);	 Catch:{ all -> 0x00dc }
        r3.post(r0);	 Catch:{ all -> 0x00dc }
        r0 = new hdj;	 Catch:{ all -> 0x00dc }
        r0.<init>(r1, r6, r5);	 Catch:{ all -> 0x00dc }
        r6 = 0;
        r3.postDelayed(r0, r6);	 Catch:{ all -> 0x00dc }
    L_0x00a8:
        r0 = r2.f19913f;	 Catch:{ all -> 0x00dc }
        r0.incrementAndGet();	 Catch:{ all -> 0x00dc }
        r0 = r2.f19925r;	 Catch:{ all -> 0x00dc }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x00dc }
        if (r0 != 0) goto L_0x00be;
    L_0x00b5:
        r0 = r2.f19928u;	 Catch:{ all -> 0x00dc }
        r0 = r0.f6353a;	 Catch:{ all -> 0x00dc }
        r1 = r2.f19925r;	 Catch:{ all -> 0x00dc }
        r0.mo7307b(r1);	 Catch:{ all -> 0x00dc }
    L_0x00be:
        r0 = r2.f19910c;	 Catch:{ all -> 0x00dc }
        r3 = r0.iterator();	 Catch:{ all -> 0x00dc }
    L_0x00c4:
        r0 = r3.hasNext();	 Catch:{ all -> 0x00dc }
        if (r0 == 0) goto L_0x00df;
    L_0x00ca:
        r0 = r3.next();	 Catch:{ all -> 0x00dc }
        r0 = (android.util.Pair) r0;	 Catch:{ all -> 0x00dc }
        r1 = r0.second;	 Catch:{ all -> 0x00dc }
        r1 = (java.util.concurrent.Executor) r1;	 Catch:{ all -> 0x00dc }
        r0 = r0.first;	 Catch:{ all -> 0x00dc }
        r0 = (java.lang.Runnable) r0;	 Catch:{ all -> 0x00dc }
        r1.execute(r0);	 Catch:{ all -> 0x00dc }
        goto L_0x00c4;
    L_0x00dc:
        r0 = move-exception;
        monitor-exit(r4);	 Catch:{ all -> 0x00dc }
        throw r0;
    L_0x00df:
        r0 = r2.f19920m;	 Catch:{ all -> 0x00dc }
        monitor-exit(r4);	 Catch:{ all -> 0x00dc }
        goto L_0x000d;
    L_0x00e4:
        r0 = 1;
        goto L_0x002d;
        */
        throw new UnsupportedOperationException("Method not decompiled: hcu.run():void");
    }
}
