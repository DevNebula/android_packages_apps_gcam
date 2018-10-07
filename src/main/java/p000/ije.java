package p000;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;

/* compiled from: PG */
/* renamed from: ije */
public class ije {
    /* renamed from: a */
    public static final AtomicBoolean f7388a = new AtomicBoolean();
    /* renamed from: b */
    private static final Uri f7389b = Uri.parse("content://com.google.android.gsf.gservices");
    /* renamed from: c */
    private static final Uri f7390c = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    /* renamed from: d */
    private static final Pattern f7391d = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    /* renamed from: e */
    private static final Pattern f7392e = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    /* renamed from: f */
    private static HashMap f7393f;
    /* renamed from: g */
    private static final HashMap f7394g = new HashMap();
    /* renamed from: h */
    private static final HashMap f7395h = new HashMap();
    /* renamed from: i */
    private static final HashMap f7396i = new HashMap();
    /* renamed from: j */
    private static final HashMap f7397j = new HashMap();
    /* renamed from: k */
    private static Object f7398k;
    /* renamed from: l */
    private static boolean f7399l;
    /* renamed from: m */
    private static String[] f7400m = new String[0];

    /* renamed from: a */
    private static void m3833a(ContentResolver contentResolver) {
        if (f7393f == null) {
            f7388a.set(false);
            f7393f = new HashMap();
            f7398k = new Object();
            f7399l = false;
            contentResolver.registerContentObserver(f7389b, true, new ijf());
        } else if (f7388a.getAndSet(false)) {
            f7393f.clear();
            f7394g.clear();
            f7395h.clear();
            f7396i.clear();
            f7397j.clear();
            f7398k = new Object();
            f7399l = false;
        }
    }

    /* renamed from: a */
    public static boolean m3836a(ContentResolver contentResolver, String str, boolean z) {
        Object b = ije.m3837b(contentResolver);
        Object obj = (Boolean) ije.m3830a(f7394g, str, Boolean.valueOf(z));
        if (obj != null) {
            return obj.booleanValue();
        }
        Object a = ije.m3831a(contentResolver, str, null);
        if (!(a == null || a.equals(""))) {
            if (f7391d.matcher(a).matches()) {
                obj = Boolean.valueOf(true);
                z = true;
            } else if (f7392e.matcher(a).matches()) {
                obj = Boolean.valueOf(false);
                z = false;
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("attempt to read gservices key ");
                stringBuilder.append(str);
                stringBuilder.append(" (value \"");
                stringBuilder.append(a);
                stringBuilder.append("\") as boolean");
                Log.w("Gservices", stringBuilder.toString());
            }
        }
        ije.m3835a(b, f7394g, str, obj);
        return z;
    }

    /* renamed from: a */
    public static float m3828a(ContentResolver contentResolver, String str, float f) {
        Object b = ije.m3837b(contentResolver);
        Object obj = (Float) ije.m3830a(f7397j, str, Float.valueOf(f));
        if (obj != null) {
            return obj.floatValue();
        }
        String a = ije.m3831a(contentResolver, str, null);
        if (a != null) {
            try {
                float parseFloat = Float.parseFloat(a);
                obj = Float.valueOf(parseFloat);
                f = parseFloat;
            } catch (NumberFormatException e) {
            }
        }
        ije.m3835a(b, f7397j, str, obj);
        return f;
    }

    /* renamed from: a */
    public static int m3829a(ContentResolver contentResolver, String str, int i) {
        Object b = ije.m3837b(contentResolver);
        Object obj = (Integer) ije.m3830a(f7395h, str, Integer.valueOf(i));
        if (obj != null) {
            return obj.intValue();
        }
        String a = ije.m3831a(contentResolver, str, null);
        if (a != null) {
            try {
                int parseInt = Integer.parseInt(a);
                obj = Integer.valueOf(parseInt);
                i = parseInt;
            } catch (NumberFormatException e) {
            }
        }
        ije.m3835a(b, f7395h, str, obj);
        return i;
    }

    /* renamed from: a */
    public static String m3831a(ContentResolver contentResolver, String str, String str2) {
        synchronized (ije.class) {
            ije.m3833a(contentResolver);
            Object obj = f7398k;
            String str3;
            if (f7393f.containsKey(str)) {
                str3 = (String) f7393f.get(str);
                if (str3 != null) {
                    str2 = str3;
                }
            } else {
                String[] strArr = f7400m;
                int length = strArr.length;
                int i = 0;
                while (i < length) {
                    if (str.startsWith(strArr[i])) {
                        if (!f7399l || f7393f.isEmpty()) {
                            f7393f.putAll(ije.m3832a(contentResolver, f7400m));
                            f7399l = true;
                            if (f7393f.containsKey(str)) {
                                str3 = (String) f7393f.get(str);
                                if (str3 != null) {
                                    str2 = str3;
                                }
                            }
                        }
                    } else {
                        i++;
                    }
                }
                Cursor query = contentResolver.query(f7389b, null, null, new String[]{str}, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            str3 = query.getString(1);
                            if (str3 != null && str3.equals(str2)) {
                                str3 = str2;
                            }
                            ije.m3834a(obj, str, str3);
                            if (str3 != null) {
                                str2 = str3;
                            }
                            if (query != null) {
                                query.close();
                            }
                        } else {
                            ije.m3834a(obj, str, null);
                            if (query != null) {
                                query.close();
                            }
                        }
                    } catch (Throwable th) {
                        if (query != null) {
                            query.close();
                        }
                    }
                } else if (query != null) {
                    query.close();
                }
            }
        }
        return str2;
    }

    /* renamed from: a */
    private static Map m3832a(ContentResolver contentResolver, String... strArr) {
        Cursor query = contentResolver.query(f7390c, null, null, strArr, null);
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

    /* JADX WARNING: Missing block: B:14:?, code:
            return r0;
     */
    /* renamed from: a */
    private static java.lang.Object m3830a(java.util.HashMap r2, java.lang.String r3, java.lang.Object r4) {
        /*
        r1 = p000.ije.class;
        monitor-enter(r1);
        r0 = r2.containsKey(r3);	 Catch:{ all -> 0x0015 }
        if (r0 == 0) goto L_0x0012;
    L_0x0009:
        r0 = r2.get(r3);	 Catch:{ all -> 0x0015 }
        if (r0 != 0) goto L_0x0010;
    L_0x000f:
        r0 = r4;
    L_0x0010:
        monitor-exit(r1);	 Catch:{ all -> 0x0015 }
    L_0x0011:
        return r0;
    L_0x0012:
        monitor-exit(r1);	 Catch:{ all -> 0x0015 }
        r0 = 0;
        goto L_0x0011;
    L_0x0015:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0015 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: ije.a(java.util.HashMap, java.lang.String, java.lang.Object):java.lang.Object");
    }

    /* renamed from: b */
    private static Object m3837b(ContentResolver contentResolver) {
        Object obj;
        synchronized (ije.class) {
            ije.m3833a(contentResolver);
            obj = f7398k;
        }
        return obj;
    }

    /* renamed from: a */
    private static void m3834a(Object obj, String str, String str2) {
        synchronized (ije.class) {
            if (obj == f7398k) {
                f7393f.put(str, str2);
            }
        }
    }

    /* renamed from: a */
    private static void m3835a(Object obj, HashMap hashMap, String str, Object obj2) {
        synchronized (ije.class) {
            if (obj == f7398k) {
                hashMap.put(str, obj2);
                f7393f.remove(str);
            }
        }
    }
}
