package p000;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

/* compiled from: PG */
/* renamed from: aes */
final class aes {
    /* renamed from: a */
    private static final aen f350a = new aen();
    /* renamed from: b */
    private final aer f351b;
    /* renamed from: c */
    private final agu f352c;
    /* renamed from: d */
    private final ContentResolver f353d;
    /* renamed from: e */
    private final List f354e;

    private aes(List list, aer aer, agu agu, ContentResolver contentResolver) {
        this.f351b = aer;
        this.f352c = agu;
        this.f353d = contentResolver;
        this.f354e = list;
    }

    aes(List list, aer aer, agu agu, ContentResolver contentResolver, byte b) {
        this(list, aer, agu, contentResolver);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0050 A:{SYNTHETIC, Splitter: B:20:0x0050} */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0050 A:{SYNTHETIC, Splitter: B:20:0x0050} */
    /* renamed from: a */
    final int mo206a(android.net.Uri r8) {
        /*
        r7 = this;
        r1 = 0;
        r0 = r7.f353d;	 Catch:{ IOException -> 0x0068, NullPointerException -> 0x0066, all -> 0x004a }
        r1 = r0.openInputStream(r8);	 Catch:{ IOException -> 0x0068, NullPointerException -> 0x0066, all -> 0x004a }
        r0 = r7.f354e;	 Catch:{ IOException -> 0x0064, NullPointerException -> 0x0015, all -> 0x0054 }
        r2 = r7.f352c;	 Catch:{ IOException -> 0x0064, NullPointerException -> 0x0015, all -> 0x0054 }
        r0 = p000.adk.m162a(r0, r1, r2);	 Catch:{ IOException -> 0x0064, NullPointerException -> 0x0015, all -> 0x0054 }
        if (r1 == 0) goto L_0x0014;
    L_0x0011:
        r1.close();	 Catch:{ IOException -> 0x005e }
    L_0x0014:
        return r0;
    L_0x0015:
        r0 = move-exception;
    L_0x0016:
        r2 = "ThumbStreamOpener";
        r3 = 3;
        r2 = android.util.Log.isLoggable(r2, r3);	 Catch:{ all -> 0x0059 }
        if (r2 == 0) goto L_0x0043;
    L_0x001f:
        r2 = "ThumbStreamOpener";
        r3 = java.lang.String.valueOf(r8);	 Catch:{ all -> 0x0059 }
        r4 = java.lang.String.valueOf(r3);	 Catch:{ all -> 0x0059 }
        r4 = r4.length();	 Catch:{ all -> 0x0059 }
        r4 = r4 + 20;
        r5 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0059 }
        r5.<init>(r4);	 Catch:{ all -> 0x0059 }
        r4 = "Failed to open uri: ";
        r5.append(r4);	 Catch:{ all -> 0x0059 }
        r5.append(r3);	 Catch:{ all -> 0x0059 }
        r3 = r5.toString();	 Catch:{ all -> 0x0059 }
        android.util.Log.d(r2, r3, r0);	 Catch:{ all -> 0x0059 }
    L_0x0043:
        if (r1 == 0) goto L_0x0048;
    L_0x0045:
        r1.close();	 Catch:{ IOException -> 0x0060 }
    L_0x0048:
        r0 = -1;
        goto L_0x0014;
    L_0x004a:
        r0 = move-exception;
        r6 = r1;
        r1 = r0;
        r0 = r6;
    L_0x004e:
        if (r0 == 0) goto L_0x0053;
    L_0x0050:
        r0.close();	 Catch:{ IOException -> 0x0062 }
    L_0x0053:
        throw r1;
    L_0x0054:
        r0 = move-exception;
        r6 = r1;
        r1 = r0;
        r0 = r6;
        goto L_0x004e;
    L_0x0059:
        r0 = move-exception;
        r6 = r1;
        r1 = r0;
        r0 = r6;
        goto L_0x004e;
    L_0x005e:
        r1 = move-exception;
        goto L_0x0014;
    L_0x0060:
        r0 = move-exception;
        goto L_0x0048;
    L_0x0062:
        r0 = move-exception;
        goto L_0x0053;
    L_0x0064:
        r0 = move-exception;
        goto L_0x0016;
    L_0x0066:
        r0 = move-exception;
        goto L_0x0016;
    L_0x0068:
        r0 = move-exception;
        goto L_0x0016;
        */
        throw new UnsupportedOperationException("Method not decompiled: aes.a(android.net.Uri):int");
    }

    /* renamed from: c */
    private final String m193c(Uri uri) {
        Cursor a = this.f351b.mo205a(uri);
        if (a != null) {
            try {
                if (a.moveToFirst()) {
                    String string = a.getString(0);
                    return string;
                }
            } finally {
                if (a != null) {
                    a.close();
                }
            }
        }
        if (a != null) {
            a.close();
        }
        return null;
    }

    /* renamed from: b */
    public final InputStream mo207b(Uri uri) {
        Object obj = null;
        Object c = m193c(uri);
        if (TextUtils.isEmpty(c)) {
            return null;
        }
        File file = new File(c);
        if (file.exists() && file.length() > 0) {
            obj = 1;
        }
        if (obj == null) {
            return null;
        }
        Uri fromFile = Uri.fromFile(file);
        try {
            return this.f353d.openInputStream(fromFile);
        } catch (Throwable e) {
            String valueOf = String.valueOf(uri);
            String valueOf2 = String.valueOf(fromFile);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 21) + String.valueOf(valueOf2).length());
            stringBuilder.append("NPE opening uri: ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" -> ");
            stringBuilder.append(valueOf2);
            throw ((FileNotFoundException) new FileNotFoundException(stringBuilder.toString()).initCause(e));
        }
    }
}
