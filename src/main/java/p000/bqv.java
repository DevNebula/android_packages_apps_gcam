package p000;

import android.annotation.TargetApi;
import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@TargetApi(24)
/* compiled from: PG */
/* renamed from: bqv */
public final class bqv implements bls, kwk {
    /* renamed from: a */
    private final Context f11706a;
    /* renamed from: b */
    private final iqz f11707b;
    /* renamed from: c */
    private final Map f11708c = new HashMap();
    /* renamed from: d */
    private File f11709d;

    public bqv(Context context, blx blx, iqz iqz) {
        this.f11706a = context;
        this.f11707b = iqz.mo8830a("ShotTracker");
    }

    /* renamed from: b */
    public final synchronized boolean mo2015b() {
        boolean z;
        int i = false;
        synchronized (this) {
            if (this.f11708c.isEmpty()) {
                File[] listFiles = m7768c().listFiles();
                if (listFiles != null) {
                    int length = listFiles.length;
                    if (length != 0) {
                        while (i < length) {
                            File file = listFiles[i];
                            iqz iqz = this.f11707b;
                            String valueOf = String.valueOf(file);
                            String a = bqv.m7765a(file);
                            StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 25) + String.valueOf(a).length());
                            stringBuilder.append("Failed to persist shot: ");
                            stringBuilder.append(valueOf);
                            stringBuilder.append("\n");
                            stringBuilder.append(a);
                            iqz.mo8834c(stringBuilder.toString());
                            jqk.m13347a(file.delete());
                            i++;
                        }
                        z = true;
                    }
                }
            }
        }
        return z;
    }

    /* renamed from: e */
    private final btf m7769e(String str) {
        if (this.f11708c.containsKey(str)) {
            btf f = m7770f(str);
            String valueOf = String.valueOf(str);
            String str2 = "create() on a shot that already exists: ";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            f.mo12425a(valueOf);
            return f;
        }
        btf btf = new btf(new File(m7768c(), str), str, this.f11707b);
        this.f11708c.put(str, btf);
        return btf;
    }

    /* renamed from: c */
    private final File m7768c() {
        boolean z = true;
        File file = this.f11709d;
        if (file != null) {
            return file;
        }
        File file2 = new File(this.f11706a.getExternalCacheDir(), "dbg-shot-tracker");
        if (!(file2.exists() || file2.mkdir())) {
            z = false;
        }
        jqk.m13347a(z);
        this.f11709d = file2;
        return this.f11709d;
    }

    /* renamed from: a */
    private static String m7765a(File file) {
        try {
            return bqv.m7767b(file);
        } catch (IOException e) {
            return "";
        }
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        throw new NoSuchMethodError();
    }

    /* renamed from: f */
    private final btf m7770f(String str) {
        if (this.f11708c.containsKey(str)) {
            return (btf) this.f11708c.get(str);
        }
        btf e = m7769e(str);
        String valueOf = String.valueOf(str);
        String str2 = "get() on a shot that does not exist: ";
        if (valueOf.length() == 0) {
            valueOf = new String(str2);
        } else {
            valueOf = str2.concat(valueOf);
        }
        e.mo12425a(valueOf);
        return e;
    }

    /* renamed from: a */
    public final synchronized void mo2013a(String str, String str2) {
        if (this.f11708c.containsKey(str)) {
            m7770f(str).mo12425a(str2);
        } else {
            this.f11707b.mo8838f(String.format(null, "Tried to log '%s' to nonexistent shot: %s.  Maybe it was already deleted", new Object[]{str2, str}));
        }
    }

    /* renamed from: a */
    public final synchronized void mo2012a(String str) {
        m7770f(str).mo12426b();
    }

    /* renamed from: b */
    public final synchronized void mo2014b(String str) {
        m7770f(str).mo12426b();
    }

    /* renamed from: c */
    public final synchronized void mo2016c(String str) {
        m7770f(str).mo12426b();
    }

    /* renamed from: d */
    public final synchronized void mo2017d(String str) {
        m7769e(str).mo12425a("#onShotStarted");
    }

    /* JADX WARNING: Missing block: B:13:0x002b, code:
            p000.bqv.m7766a(r0, r1);
     */
    /* renamed from: b */
    private static java.lang.String m7767b(java.io.File r8) {
        /*
        r1 = new java.io.FileReader;
        r1.<init>(r8);
        r2 = r8.length();	 Catch:{ all -> 0x0028 }
        r0 = (int) r2;	 Catch:{ all -> 0x0028 }
        r2 = new char[r0];	 Catch:{ all -> 0x0028 }
        r0 = r1.read(r2);	 Catch:{ all -> 0x0028 }
        r4 = (long) r0;	 Catch:{ all -> 0x0028 }
        r6 = r8.length();	 Catch:{ all -> 0x0028 }
        r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r0 != 0) goto L_0x0026;
    L_0x0019:
        r0 = 1;
    L_0x001a:
        p000.jqk.m13347a(r0);	 Catch:{ all -> 0x0028 }
        r0 = java.lang.String.valueOf(r2);	 Catch:{ all -> 0x0028 }
        r2 = 0;
        p000.bqv.m7766a(r2, r1);
        return r0;
    L_0x0026:
        r0 = 0;
        goto L_0x001a;
    L_0x0028:
        r0 = move-exception;
        throw r0;	 Catch:{ all -> 0x002a }
    L_0x002a:
        r2 = move-exception;
        p000.bqv.m7766a(r0, r1);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: bqv.b(java.io.File):java.lang.String");
    }
}
