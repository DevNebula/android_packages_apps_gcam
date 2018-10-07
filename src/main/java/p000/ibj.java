package p000;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* renamed from: ibj */
public class ibj {
    /* renamed from: a */
    public static final AtomicBoolean f7262a = new AtomicBoolean();
    /* renamed from: b */
    private static final Uri f7263b = Uri.parse("content://com.google.android.gsf.gservices");
    /* renamed from: c */
    private static final Uri f7264c = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    /* renamed from: d */
    private static HashMap f7265d;
    /* renamed from: e */
    private static Object f7266e;
    /* renamed from: f */
    private static boolean f7267f;
    /* renamed from: g */
    private static String[] f7268g = new String[0];

    static {
        Pattern.compile("^(1|true|t|on|yes|y)$", 2);
        Pattern.compile("^(0|false|f|off|no|n)$", 2);
    }

    /* renamed from: a */
    public static long m3665a(ContentResolver contentResolver, String str) {
        long j = 0;
        String b = ibj.m3669b(contentResolver, str);
        if (b == null) {
            return j;
        }
        try {
            return Long.parseLong(b);
        } catch (NumberFormatException e) {
            return j;
        }
    }

    /* renamed from: a */
    private static void m3666a(ContentResolver contentResolver) {
        if (f7265d == null) {
            f7262a.set(false);
            f7265d = new HashMap();
            f7266e = new Object();
            f7267f = false;
            contentResolver.registerContentObserver(f7263b, true, new ibk());
        } else if (f7262a.getAndSet(false)) {
            f7265d.clear();
            f7266e = new Object();
            f7267f = false;
        }
    }

    /* renamed from: a */
    private static void m3668a(Object obj, String str, String str2) {
        synchronized (ibj.class) {
            if (obj == f7266e) {
                f7265d.put(str, str2);
            }
        }
    }

    /* JADX WARNING: Missing block: B:25:0x004e, code:
            if (f7265d.isEmpty() != false) goto L_0x0028;
     */
    /* renamed from: b */
    public static java.lang.String m3669b(android.content.ContentResolver r9, java.lang.String r10) {
        /*
        r8 = 1;
        r3 = 0;
        r2 = 0;
        r1 = p000.ibj.class;
        monitor-enter(r1);
        p000.ibj.m3666a(r9);	 Catch:{ all -> 0x0045 }
        r6 = f7266e;	 Catch:{ all -> 0x0045 }
        r0 = f7265d;	 Catch:{ all -> 0x0045 }
        r0 = r0.containsKey(r10);	 Catch:{ all -> 0x0045 }
        if (r0 != 0) goto L_0x008d;
    L_0x0013:
        r4 = f7268g;	 Catch:{ all -> 0x0045 }
        r5 = r4.length;	 Catch:{ all -> 0x0045 }
        r0 = r3;
    L_0x0017:
        if (r0 >= r5) goto L_0x0051;
    L_0x0019:
        r7 = r4[r0];	 Catch:{ all -> 0x0045 }
        r7 = r10.startsWith(r7);	 Catch:{ all -> 0x0045 }
        if (r7 != 0) goto L_0x0024;
    L_0x0021:
        r0 = r0 + 1;
        goto L_0x0017;
    L_0x0024:
        r0 = f7267f;	 Catch:{ all -> 0x0045 }
        if (r0 != 0) goto L_0x0048;
    L_0x0028:
        r0 = f7268g;	 Catch:{ all -> 0x0045 }
        p000.ibj.m3671c(r9, r0);	 Catch:{ all -> 0x0045 }
        r0 = f7265d;	 Catch:{ all -> 0x0045 }
        r0 = r0.containsKey(r10);	 Catch:{ all -> 0x0045 }
        if (r0 == 0) goto L_0x0043;
    L_0x0035:
        r0 = f7265d;	 Catch:{ all -> 0x0045 }
        r0 = r0.get(r10);	 Catch:{ all -> 0x0045 }
        r0 = (java.lang.String) r0;	 Catch:{ all -> 0x0045 }
        if (r0 != 0) goto L_0x0041;
    L_0x003f:
        monitor-exit(r1);	 Catch:{ all -> 0x0045 }
    L_0x0040:
        return r2;
    L_0x0041:
        r2 = r0;
        goto L_0x003f;
    L_0x0043:
        monitor-exit(r1);	 Catch:{ all -> 0x0045 }
        goto L_0x0040;
    L_0x0045:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0045 }
        throw r0;
    L_0x0048:
        r0 = f7265d;	 Catch:{ all -> 0x0045 }
        r0 = r0.isEmpty();	 Catch:{ all -> 0x0045 }
        if (r0 == 0) goto L_0x0043;
    L_0x0050:
        goto L_0x0028;
    L_0x0051:
        monitor-exit(r1);	 Catch:{ all -> 0x0045 }
        r1 = f7263b;
        r4 = new java.lang.String[r8];
        r4[r3] = r10;
        r0 = r9;
        r3 = r2;
        r5 = r2;
        r1 = r0.query(r1, r2, r3, r4, r5);
        if (r1 == 0) goto L_0x0083;
    L_0x0061:
        r0 = r1.moveToFirst();	 Catch:{ all -> 0x009b }
        if (r0 == 0) goto L_0x0083;
    L_0x0067:
        r0 = 1;
        r0 = r1.getString(r0);	 Catch:{ all -> 0x009b }
        if (r0 == 0) goto L_0x0076;
    L_0x006e:
        r3 = 0;
        r3 = r0.equals(r3);	 Catch:{ all -> 0x009b }
        if (r3 == 0) goto L_0x0076;
    L_0x0075:
        r0 = r2;
    L_0x0076:
        p000.ibj.m3668a(r6, r10, r0);	 Catch:{ all -> 0x009b }
        if (r0 != 0) goto L_0x0081;
    L_0x007b:
        if (r1 == 0) goto L_0x0040;
    L_0x007d:
        r1.close();
        goto L_0x0040;
    L_0x0081:
        r2 = r0;
        goto L_0x007b;
    L_0x0083:
        r0 = 0;
        p000.ibj.m3668a(r6, r10, r0);	 Catch:{ all -> 0x009b }
        if (r1 == 0) goto L_0x0040;
    L_0x0089:
        r1.close();
        goto L_0x0040;
    L_0x008d:
        r0 = f7265d;	 Catch:{ all -> 0x0045 }
        r0 = r0.get(r10);	 Catch:{ all -> 0x0045 }
        r0 = (java.lang.String) r0;	 Catch:{ all -> 0x0045 }
        if (r0 != 0) goto L_0x0099;
    L_0x0097:
        monitor-exit(r1);	 Catch:{ all -> 0x0045 }
        goto L_0x0040;
    L_0x0099:
        r2 = r0;
        goto L_0x0097;
    L_0x009b:
        r0 = move-exception;
        if (r1 == 0) goto L_0x00a1;
    L_0x009e:
        r1.close();
    L_0x00a1:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: ibj.b(android.content.ContentResolver, java.lang.String):java.lang.String");
    }

    /* renamed from: b */
    private static Map m3670b(ContentResolver contentResolver, String... strArr) {
        Cursor query = contentResolver.query(f7264c, null, null, strArr, null);
        Map treeMap = new TreeMap();
        if (query != null) {
            while (query.moveToNext()) {
                try {
                    treeMap.put(query.getString(0), query.getString(1));
                } finally {
                    query.close();
                }
            }
        }
        return treeMap;
    }

    /* renamed from: c */
    private static void m3671c(ContentResolver contentResolver, String[] strArr) {
        f7265d.putAll(ibj.m3670b(contentResolver, strArr));
        f7267f = true;
    }

    /* renamed from: a */
    public static void m3667a(ContentResolver contentResolver, String... strArr) {
        if (r1 != 0) {
            synchronized (ibj.class) {
                String[] strArr2;
                ibj.m3666a(contentResolver);
                HashSet hashSet = new HashSet((((f7268g.length + r1) << 2) / 3) + 1);
                hashSet.addAll(Arrays.asList(f7268g));
                ArrayList arrayList = new ArrayList();
                for (Object obj : strArr) {
                    if (hashSet.add(obj)) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.isEmpty()) {
                    strArr2 = new String[0];
                } else {
                    f7268g = (String[]) hashSet.toArray(new String[hashSet.size()]);
                    strArr2 = (String[]) arrayList.toArray(new String[arrayList.size()]);
                }
                if (!f7267f || f7265d.isEmpty()) {
                    ibj.m3671c(contentResolver, f7268g);
                } else if (strArr2.length != 0) {
                    ibj.m3671c(contentResolver, strArr2);
                }
            }
        }
    }
}
