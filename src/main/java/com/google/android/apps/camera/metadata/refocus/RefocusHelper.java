package com.google.android.apps.camera.metadata.refocus;

import android.app.ActivityManager;
import android.content.Context;
import p000.ije;

/* compiled from: PG */
public class RefocusHelper {
    public static final String TAG = "RefocusHelper";

    public static boolean hasRefocusCapture(Context context, ActivityManager activityManager) {
        if (!ije.m3836a(context.getContentResolver(), "camera:refocus_enabled", true) || isLowRamDevice(activityManager)) {
            return false;
        }
        return true;
    }

    public static boolean isLowRamDevice(ActivityManager activityManager) {
        try {
            return activityManager.isLowRamDevice();
        } catch (NoSuchMethodError e) {
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0021 A:{SYNTHETIC, Splitter: B:16:0x0021} */
    public static boolean isRgbz(android.content.Context r5, android.net.Uri r6) {
        /*
        r1 = 0;
        r0 = r5.getContentResolver();	 Catch:{ FileNotFoundException -> 0x009c, all -> 0x001b }
        r1 = r0.openInputStream(r6);	 Catch:{ FileNotFoundException -> 0x009c, all -> 0x001b }
        r0 = com.google.android.apps.camera.metadata.refocus.RgbzUtils.isRgbz(r1);	 Catch:{ FileNotFoundException -> 0x0013, all -> 0x0025 }
        if (r1 == 0) goto L_0x0012;
    L_0x000f:
        r1.close();	 Catch:{ IOException -> 0x002a }
    L_0x0012:
        return r0;
    L_0x0013:
        r0 = move-exception;
    L_0x0014:
        if (r1 == 0) goto L_0x0019;
    L_0x0016:
        r1.close();	 Catch:{ IOException -> 0x0050 }
    L_0x0019:
        r0 = 0;
        goto L_0x0012;
    L_0x001b:
        r0 = move-exception;
        r4 = r1;
        r1 = r0;
        r0 = r4;
    L_0x001f:
        if (r0 == 0) goto L_0x0024;
    L_0x0021:
        r0.close();	 Catch:{ IOException -> 0x0076 }
    L_0x0024:
        throw r1;
    L_0x0025:
        r0 = move-exception;
        r4 = r1;
        r1 = r0;
        r0 = r4;
        goto L_0x001f;
    L_0x002a:
        r1 = move-exception;
        r1 = java.lang.String.valueOf(r1);
        r2 = java.lang.String.valueOf(r1);
        r2 = r2.length();
        r3 = new java.lang.StringBuilder;
        r2 = r2 + 24;
        r3.<init>(r2);
        r2 = "Unable to close stream: ";
        r3.append(r2);
        r3.append(r1);
        r1 = "RefocusHelper";
        r2 = r3.toString();
        p000.bli.m898e(r1, r2);
        goto L_0x0012;
    L_0x0050:
        r0 = move-exception;
        r0 = java.lang.String.valueOf(r0);
        r1 = java.lang.String.valueOf(r0);
        r1 = r1.length();
        r2 = new java.lang.StringBuilder;
        r1 = r1 + 24;
        r2.<init>(r1);
        r1 = "Unable to close stream: ";
        r2.append(r1);
        r2.append(r0);
        r0 = "RefocusHelper";
        r1 = r2.toString();
        p000.bli.m898e(r0, r1);
        goto L_0x0019;
    L_0x0076:
        r0 = move-exception;
        r0 = java.lang.String.valueOf(r0);
        r2 = java.lang.String.valueOf(r0);
        r2 = r2.length();
        r3 = new java.lang.StringBuilder;
        r2 = r2 + 24;
        r3.<init>(r2);
        r2 = "Unable to close stream: ";
        r3.append(r2);
        r3.append(r0);
        r0 = "RefocusHelper";
        r2 = r3.toString();
        p000.bli.m898e(r0, r2);
        goto L_0x0024;
    L_0x009c:
        r0 = move-exception;
        goto L_0x0014;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.camera.metadata.refocus.RefocusHelper.isRgbz(android.content.Context, android.net.Uri):boolean");
    }
}
