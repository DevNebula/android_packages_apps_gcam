package p000;

import android.content.Context;

/* compiled from: PG */
/* renamed from: blc */
public final class blc {
    /* renamed from: a */
    public final Context f1289a;

    static {
        bli.m887a("IconLoader");
    }

    public blc(Context context) {
        this.f1289a = context;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x002e A:{SYNTHETIC, Splitter: B:17:0x002e} */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0033 A:{SYNTHETIC, Splitter: B:20:0x0033} */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004d A:{SYNTHETIC, Splitter: B:29:0x004d} */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0052 A:{SYNTHETIC, Splitter: B:32:0x0052} */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002e A:{SYNTHETIC, Splitter: B:17:0x002e} */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0033 A:{SYNTHETIC, Splitter: B:20:0x0033} */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x004d A:{SYNTHETIC, Splitter: B:29:0x004d} */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0052 A:{SYNTHETIC, Splitter: B:32:0x0052} */
    /* renamed from: a */
    public static android.os.ParcelFileDescriptor m885a(android.graphics.Bitmap r7, android.graphics.Bitmap.CompressFormat r8) {
        /*
        r2 = 0;
        r0 = android.os.ParcelFileDescriptor.createPipe();	 Catch:{ IOException -> 0x002a, all -> 0x0048 }
        r1 = 0;
        r4 = r0[r1];	 Catch:{ IOException -> 0x002a, all -> 0x0048 }
        r1 = 1;
        r3 = r0[r1];	 Catch:{ IOException -> 0x002a, all -> 0x0048 }
        r1 = new java.io.BufferedOutputStream;	 Catch:{ IOException -> 0x0076, all -> 0x0056 }
        r0 = new java.io.FileOutputStream;	 Catch:{ IOException -> 0x0076, all -> 0x0056 }
        r5 = r3.getFileDescriptor();	 Catch:{ IOException -> 0x0076, all -> 0x0056 }
        r0.<init>(r5);	 Catch:{ IOException -> 0x0076, all -> 0x0056 }
        r1.<init>(r0);	 Catch:{ IOException -> 0x0076, all -> 0x0056 }
        r0 = 100;
        r7.compress(r8, r0, r1);	 Catch:{ IOException -> 0x005b, all -> 0x005e }
        r1.close();	 Catch:{ IOException -> 0x005b, all -> 0x005e }
        if (r3 == 0) goto L_0x0026;
    L_0x0023:
        r3.close();	 Catch:{ IOException -> 0x006a }
    L_0x0026:
        r1.close();	 Catch:{ IOException -> 0x006c }
    L_0x0029:
        return r4;
    L_0x002a:
        r0 = move-exception;
        r3 = r2;
    L_0x002c:
        if (r3 == 0) goto L_0x0031;
    L_0x002e:
        r3.close();	 Catch:{ IOException -> 0x006e }
    L_0x0031:
        if (r2 == 0) goto L_0x0036;
    L_0x0033:
        r2.close();	 Catch:{ IOException -> 0x0070 }
    L_0x0036:
        r0 = p000.jri.m13404b(r0);
        r0 = (java.io.IOException) r0;
        r0 = r0.getMessage();
        if (r0 == 0) goto L_0x0064;
    L_0x0042:
        r1 = new java.io.FileNotFoundException;
        r1.<init>(r0);
        throw r1;
    L_0x0048:
        r0 = move-exception;
        r1 = r0;
        r0 = r2;
    L_0x004b:
        if (r2 == 0) goto L_0x0050;
    L_0x004d:
        r2.close();	 Catch:{ IOException -> 0x0072 }
    L_0x0050:
        if (r0 == 0) goto L_0x0055;
    L_0x0052:
        r0.close();	 Catch:{ IOException -> 0x0074 }
    L_0x0055:
        throw r1;
    L_0x0056:
        r0 = move-exception;
        r1 = r0;
        r0 = r2;
        r2 = r3;
        goto L_0x004b;
    L_0x005b:
        r0 = move-exception;
        r2 = r1;
        goto L_0x002c;
    L_0x005e:
        r0 = move-exception;
        r2 = r3;
        r6 = r1;
        r1 = r0;
        r0 = r6;
        goto L_0x004b;
    L_0x0064:
        r0 = new java.io.FileNotFoundException;
        r0.<init>();
        throw r0;
    L_0x006a:
        r0 = move-exception;
        goto L_0x0026;
    L_0x006c:
        r0 = move-exception;
        goto L_0x0029;
    L_0x006e:
        r0 = move-exception;
        goto L_0x0031;
    L_0x0070:
        r0 = move-exception;
        goto L_0x0036;
    L_0x0072:
        r2 = move-exception;
        goto L_0x0050;
    L_0x0074:
        r0 = move-exception;
        goto L_0x0055;
    L_0x0076:
        r0 = move-exception;
        goto L_0x002c;
        */
        throw new UnsupportedOperationException("Method not decompiled: blc.a(android.graphics.Bitmap, android.graphics.Bitmap$CompressFormat):android.os.ParcelFileDescriptor");
    }
}
