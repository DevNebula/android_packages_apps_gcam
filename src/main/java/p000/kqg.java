package p000;

/* compiled from: PG */
/* renamed from: kqg */
public final class kqg {
    /* renamed from: a */
    public static final kqh f8786a;

    /* JADX WARNING: Removed duplicated region for block: B:21:? A:{SYNTHETIC, RETURN} */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0017  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0017  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A:{SYNTHETIC, RETURN} */
    static {
        /*
        r0 = p000.kqg.m5104a();	 Catch:{ all -> 0x0068 }
        if (r0 == 0) goto L_0x001b;
    L_0x0006:
        r1 = r0.intValue();	 Catch:{ all -> 0x002b }
        r2 = 19;
        if (r1 < r2) goto L_0x001b;
    L_0x000e:
        r1 = new kqm;	 Catch:{ all -> 0x002b }
        r1.<init>();	 Catch:{ all -> 0x002b }
    L_0x0013:
        f8786a = r1;
        if (r0 == 0) goto L_0x001a;
    L_0x0017:
        r0.intValue();
    L_0x001a:
        return;
    L_0x001b:
        r1 = "com.google.devtools.build.android.desugar.runtime.twr_disable_mimic";
        r1 = java.lang.Boolean.getBoolean(r1);	 Catch:{ all -> 0x002b }
        r1 = r1 ^ 1;
        if (r1 == 0) goto L_0x0062;
    L_0x0025:
        r1 = new kqk;	 Catch:{ all -> 0x002b }
        r1.<init>();	 Catch:{ all -> 0x002b }
        goto L_0x0013;
    L_0x002b:
        r1 = move-exception;
    L_0x002c:
        r2 = java.lang.System.err;
        r3 = p000.kql.class;
        r3 = r3.getName();
        r4 = java.lang.String.valueOf(r3);
        r4 = r4.length();
        r5 = new java.lang.StringBuilder;
        r4 = r4 + 132;
        r5.<init>(r4);
        r4 = "An error has occured when initializing the try-with-resources desuguring strategy. The default strategy ";
        r5.append(r4);
        r5.append(r3);
        r3 = "will be used. The error is: ";
        r5.append(r3);
        r3 = r5.toString();
        r2.println(r3);
        r2 = java.lang.System.err;
        r1.printStackTrace(r2);
        r1 = new kql;
        r1.<init>();
        goto L_0x0013;
    L_0x0062:
        r1 = new kql;	 Catch:{ all -> 0x002b }
        r1.<init>();	 Catch:{ all -> 0x002b }
        goto L_0x0013;
    L_0x0068:
        r1 = move-exception;
        r0 = 0;
        goto L_0x002c;
        */
        throw new UnsupportedOperationException("Method not decompiled: kqg.<clinit>():void");
    }

    /* renamed from: a */
    public static void m5105a(Throwable th, Throwable th2) {
        f8786a.mo10211a(th, th2);
    }

    /* renamed from: a */
    private static Integer m5104a() {
        try {
            return (Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Exception e) {
            System.err.println("Failed to retrieve value from android.os.Build$VERSION.SDK_INT due to the following exception.");
            e.printStackTrace(System.err);
            return null;
        }
    }
}
