package p000;

import android.annotation.TargetApi;
import android.graphics.PointF;
import android.media.MediaFormat;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.util.Log;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.Locale;
import java.util.UUID;

@TargetApi(26)
/* compiled from: PG */
/* renamed from: jcc */
public class jcc {
    /* renamed from: a */
    public static jiv[] f8054a;

    /* renamed from: a */
    public static void m4462a(String str, MediaFormat mediaFormat, MediaFormat mediaFormat2) {
        if (mediaFormat.containsKey(str)) {
            mediaFormat2.setInteger(str, mediaFormat.getInteger(str));
        }
    }

    /* renamed from: a */
    public static void m4463a(String str, String str2, Throwable th, Object... objArr) {
        jcc.m4460a(3, str, th, str2, objArr);
    }

    /* renamed from: a */
    private static void m4464a(String str, String str2, Object... objArr) {
        jcc.m4459a(6, str, str2, objArr);
    }

    /* renamed from: a */
    public static String m4454a(String str, String str2) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class, String.class}).invoke(null, new Object[]{str, str2});
        } catch (Throwable e) {
            Log.e("SystemProperties", "Exception while getting system property: ", e);
            return str2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c6 A:{Splitter: B:3:0x001a, ExcHandler: java.lang.Error (e java.lang.Error)} */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:20:0x008f, code:
            r0 = e;
     */
    /* JADX WARNING: Missing block: B:28:0x00c6, code:
            r0 = e;
     */
    /* renamed from: a */
    public static android.content.pm.PackageStats m4452a(android.content.Context r15) {
        /*
        r2 = 0;
        r14 = 0;
        p000.jqk.m13344a();
        r0 = android.os.storage.StorageManager.class;
        r0 = r15.getSystemService(r0);
        r0 = (android.os.storage.StorageManager) r0;
        if (r0 != 0) goto L_0x001a;
    L_0x000f:
        r0 = "PackageStatsO";
        r1 = "StorageManager is not available";
        r3 = new java.lang.Object[r14];
        p000.jcc.m4464a(r0, r1, r3);
        r0 = r2;
    L_0x0019:
        return r0;
    L_0x001a:
        r1 = android.app.usage.StorageStatsManager.class;
        r1 = r15.getSystemService(r1);	 Catch:{ RuntimeException -> 0x008f, Error -> 0x00c6 }
        r1 = (android.app.usage.StorageStatsManager) r1;	 Catch:{ RuntimeException -> 0x008f, Error -> 0x00c6 }
        r4 = r15.getPackageName();	 Catch:{ RuntimeException -> 0x008f, Error -> 0x00c6 }
        r3 = new android.content.pm.PackageStats;	 Catch:{ RuntimeException -> 0x008f, Error -> 0x00c6 }
        r3.<init>(r4);	 Catch:{ RuntimeException -> 0x008f, Error -> 0x00c6 }
        r0 = r0.getStorageVolumes();	 Catch:{ RuntimeException -> 0x008f, Error -> 0x00c6 }
        r5 = r0.iterator();	 Catch:{ RuntimeException -> 0x008f, Error -> 0x00c6 }
    L_0x0033:
        r0 = r5.hasNext();	 Catch:{ RuntimeException -> 0x008f, Error -> 0x00c6 }
        if (r0 == 0) goto L_0x00c1;
    L_0x0039:
        r0 = r5.next();	 Catch:{ RuntimeException -> 0x008f, Error -> 0x00c6 }
        r0 = (android.os.storage.StorageVolume) r0;	 Catch:{ RuntimeException -> 0x008f, Error -> 0x00c6 }
        r6 = r0.getState();	 Catch:{ RuntimeException -> 0x008f, Error -> 0x00c6 }
        r7 = "mounted";
        r6 = r6.equals(r7);	 Catch:{ RuntimeException -> 0x008f, Error -> 0x00c6 }
        if (r6 == 0) goto L_0x0033;
    L_0x004b:
        r0 = p000.jcc.m4456a(r0);	 Catch:{ RuntimeException -> 0x008f, Error -> 0x00c6 }
        if (r0 == 0) goto L_0x0033;
    L_0x0051:
        r6 = android.os.Process.myUserHandle();	 Catch:{ NameNotFoundException -> 0x0082, IOException -> 0x00bf, RuntimeException -> 0x00c4, Error -> 0x00c6 }
        r6 = r1.queryStatsForPackage(r0, r4, r6);	 Catch:{ NameNotFoundException -> 0x0082, IOException -> 0x00bf, RuntimeException -> 0x00c4, Error -> 0x00c6 }
        r7 = android.os.storage.StorageManager.UUID_DEFAULT;	 Catch:{ NameNotFoundException -> 0x0082, IOException -> 0x00bf, RuntimeException -> 0x00c4, Error -> 0x00c6 }
        r0 = r7.equals(r0);	 Catch:{ NameNotFoundException -> 0x0082, IOException -> 0x00bf, RuntimeException -> 0x00c4, Error -> 0x00c6 }
        if (r0 == 0) goto L_0x009d;
    L_0x0061:
        r8 = r3.codeSize;	 Catch:{ NameNotFoundException -> 0x0082, IOException -> 0x00bf, RuntimeException -> 0x00c4, Error -> 0x00c6 }
        r10 = r6.getAppBytes();	 Catch:{ NameNotFoundException -> 0x0082, IOException -> 0x00bf, RuntimeException -> 0x00c4, Error -> 0x00c6 }
        r8 = r8 + r10;
        r3.codeSize = r8;	 Catch:{ NameNotFoundException -> 0x0082, IOException -> 0x00bf, RuntimeException -> 0x00c4, Error -> 0x00c6 }
        r8 = r3.dataSize;	 Catch:{ NameNotFoundException -> 0x0082, IOException -> 0x00bf, RuntimeException -> 0x00c4, Error -> 0x00c6 }
        r10 = r6.getDataBytes();	 Catch:{ NameNotFoundException -> 0x0082, IOException -> 0x00bf, RuntimeException -> 0x00c4, Error -> 0x00c6 }
        r12 = r6.getCacheBytes();	 Catch:{ NameNotFoundException -> 0x0082, IOException -> 0x00bf, RuntimeException -> 0x00c4, Error -> 0x00c6 }
        r10 = r10 - r12;
        r8 = r8 + r10;
        r3.dataSize = r8;	 Catch:{ NameNotFoundException -> 0x0082, IOException -> 0x00bf, RuntimeException -> 0x00c4, Error -> 0x00c6 }
        r8 = r3.cacheSize;	 Catch:{ NameNotFoundException -> 0x0082, IOException -> 0x00bf, RuntimeException -> 0x00c4, Error -> 0x00c6 }
        r6 = r6.getCacheBytes();	 Catch:{ NameNotFoundException -> 0x0082, IOException -> 0x00bf, RuntimeException -> 0x00c4, Error -> 0x00c6 }
        r6 = r6 + r8;
        r3.cacheSize = r6;	 Catch:{ NameNotFoundException -> 0x0082, IOException -> 0x00bf, RuntimeException -> 0x00c4, Error -> 0x00c6 }
        goto L_0x0033;
    L_0x0082:
        r0 = move-exception;
    L_0x0083:
        r6 = "PackageStatsO";
        r7 = "queryStatsForPackage() call failed";
        r8 = 0;
        r8 = new java.lang.Object[r8];	 Catch:{ RuntimeException -> 0x008f, Error -> 0x00c6 }
        r9 = 6;
        p000.jcc.m4460a(r9, r6, r0, r7, r8);	 Catch:{ RuntimeException -> 0x008f, Error -> 0x00c6 }
        goto L_0x0033;
    L_0x008f:
        r0 = move-exception;
    L_0x0090:
        r1 = 5;
        r3 = "PackageStatsO";
        r4 = "StorageStatsManager is not available";
        r5 = new java.lang.Object[r14];
        p000.jcc.m4460a(r1, r3, r0, r4, r5);
        r0 = r2;
        goto L_0x0019;
    L_0x009d:
        r8 = r3.externalCodeSize;	 Catch:{ NameNotFoundException -> 0x0082, IOException -> 0x00bf, RuntimeException -> 0x00c4, Error -> 0x00c6 }
        r10 = r6.getAppBytes();	 Catch:{ NameNotFoundException -> 0x0082, IOException -> 0x00bf, RuntimeException -> 0x00c4, Error -> 0x00c6 }
        r8 = r8 + r10;
        r3.externalCodeSize = r8;	 Catch:{ NameNotFoundException -> 0x0082, IOException -> 0x00bf, RuntimeException -> 0x00c4, Error -> 0x00c6 }
        r8 = r3.externalDataSize;	 Catch:{ NameNotFoundException -> 0x0082, IOException -> 0x00bf, RuntimeException -> 0x00c4, Error -> 0x00c6 }
        r10 = r6.getDataBytes();	 Catch:{ NameNotFoundException -> 0x0082, IOException -> 0x00bf, RuntimeException -> 0x00c4, Error -> 0x00c6 }
        r12 = r6.getCacheBytes();	 Catch:{ NameNotFoundException -> 0x0082, IOException -> 0x00bf, RuntimeException -> 0x00c4, Error -> 0x00c6 }
        r10 = r10 - r12;
        r8 = r8 + r10;
        r3.externalDataSize = r8;	 Catch:{ NameNotFoundException -> 0x0082, IOException -> 0x00bf, RuntimeException -> 0x00c4, Error -> 0x00c6 }
        r8 = r3.externalCacheSize;	 Catch:{ NameNotFoundException -> 0x0082, IOException -> 0x00bf, RuntimeException -> 0x00c4, Error -> 0x00c6 }
        r6 = r6.getCacheBytes();	 Catch:{ NameNotFoundException -> 0x0082, IOException -> 0x00bf, RuntimeException -> 0x00c4, Error -> 0x00c6 }
        r6 = r6 + r8;
        r3.externalCacheSize = r6;	 Catch:{ NameNotFoundException -> 0x0082, IOException -> 0x00bf, RuntimeException -> 0x00c4, Error -> 0x00c6 }
        goto L_0x0033;
    L_0x00bf:
        r0 = move-exception;
        goto L_0x0083;
    L_0x00c1:
        r0 = r3;
        goto L_0x0019;
    L_0x00c4:
        r0 = move-exception;
        goto L_0x0083;
    L_0x00c6:
        r0 = move-exception;
        goto L_0x0090;
        */
        throw new UnsupportedOperationException("Method not decompiled: jcc.a(android.content.Context):android.content.pm.PackageStats");
    }

    /* renamed from: a */
    private static UUID m4456a(StorageVolume storageVolume) {
        String uuid = storageVolume.getUuid();
        try {
            jcc.m4459a(3, "PackageStatsO", "UUID for %s", uuid);
            return uuid != null ? UUID.fromString(uuid) : StorageManager.UUID_DEFAULT;
        } catch (IllegalArgumentException e) {
            jcc.m4464a("PackageStatsO", "Invalid UUID format: '%s'", uuid);
            return null;
        }
    }

    /* renamed from: a */
    public static void m4459a(int i, String str, String str2, Object... objArr) {
        if (Log.isLoggable(str, i)) {
            Log.println(i, str, jcc.m4455a(str2, objArr));
        }
    }

    /* renamed from: a */
    private static void m4460a(int i, String str, Throwable th, String str2, Object... objArr) {
        if (Log.isLoggable(str, i)) {
            switch (i) {
                case 2:
                    Log.v(str, jcc.m4455a(str2, objArr), th);
                    return;
                case 3:
                    Log.d(str, jcc.m4455a(str2, objArr), th);
                    return;
                case 4:
                    Log.i(str, jcc.m4455a(str2, objArr), th);
                    return;
                case 5:
                    Log.w(str, jcc.m4455a(str2, objArr), th);
                    return;
                case 6:
                    Log.e(str, jcc.m4455a(str2, objArr), th);
                    return;
                default:
                    jcc.m4459a(5, "PrimesLog", "unexpected priority: %d for log %s: %s", Integer.valueOf(i), str, jcc.m4455a(str2, objArr));
                    return;
            }
        }
    }

    /* renamed from: a */
    private static String m4455a(String str, Object... objArr) {
        return objArr.length != 0 ? String.format(Locale.US, str, objArr) : str;
    }

    /* renamed from: a */
    public static PointF m4453a(DataInputStream dataInputStream) {
        return new PointF(dataInputStream.readFloat(), dataInputStream.readFloat());
    }

    /* renamed from: a */
    public static jcf m4457a(jcf jcf, izu izu) {
        try {
            return jcf.mo9319a(izu);
        } catch (Throwable e) {
            throw new AssertionError("Resizable layout returns wrong type!", e);
        }
    }

    /* renamed from: a */
    public static jhs m4458a(ize ize) {
        return new jhq(ize);
    }

    /* renamed from: a */
    public static void m4461a(PointF pointF, DataOutputStream dataOutputStream) {
        dataOutputStream.writeFloat(pointF.x);
        dataOutputStream.writeFloat(pointF.y);
    }
}
