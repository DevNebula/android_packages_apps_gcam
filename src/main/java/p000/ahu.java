package p000;

import android.util.Log;
import java.io.File;

/* compiled from: PG */
/* renamed from: ahu */
public final class ahu implements ahm {
    /* renamed from: a */
    private final aib f10313a;
    /* renamed from: b */
    private final File f10314b;
    /* renamed from: c */
    private final long f10315c;
    /* renamed from: d */
    private final ahq f10316d = new ahq();
    /* renamed from: e */
    private acr f10317e;

    @Deprecated
    public ahu(File file, long j) {
        this.f10314b = file;
        this.f10315c = j;
        this.f10313a = new aib();
    }

    /* renamed from: a */
    public final File mo299a(adl adl) {
        String a = this.f10313a.mo311a(adl);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            String valueOf = String.valueOf(adl);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(a).length() + 29) + String.valueOf(valueOf).length());
            stringBuilder.append("Get: Obtained: ");
            stringBuilder.append(a);
            stringBuilder.append(" for for Key: ");
            stringBuilder.append(valueOf);
            Log.v("DiskLruCacheWrapper", stringBuilder.toString());
        }
        try {
            acw b = m6532a().mo138b(a);
            if (b != null) {
                return b.f282a[0];
            }
            return null;
        } catch (Throwable e) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e);
            return null;
        }
    }

    /* renamed from: a */
    private final synchronized acr m6532a() {
        if (this.f10317e == null) {
            this.f10317e = acr.m125a(this.f10314b, this.f10315c);
        }
        return this.f10317e;
    }

    /* renamed from: a */
    public final void mo300a(adl adl, aho aho) {
        ahr ahr;
        String a = this.f10313a.mo311a(adl);
        ahq ahq = this.f10316d;
        synchronized (ahq) {
            ahr = (ahr) ahq.f464a.get(a);
            if (ahr == null) {
                ahr = ahq.f465b.mo302a();
                ahq.f464a.put(a, ahr);
            }
            ahr.f467b++;
        }
        ahr.f466a.lock();
        acu a2;
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                String valueOf = String.valueOf(adl);
                StringBuilder stringBuilder = new StringBuilder((String.valueOf(a).length() + 29) + String.valueOf(valueOf).length());
                stringBuilder.append("Put: Obtained: ");
                stringBuilder.append(a);
                stringBuilder.append(" for for Key: ");
                stringBuilder.append(valueOf);
                Log.v("DiskLruCacheWrapper", stringBuilder.toString());
            }
            acr a3 = m6532a();
            if (a3.mo138b(a) == null) {
                a2 = a3.mo135a(a);
                if (a2 == null) {
                    String str = "Had two simultaneous puts for: ";
                    String valueOf2 = String.valueOf(a);
                    if (valueOf2.length() == 0) {
                        valueOf2 = new String(str);
                    } else {
                        valueOf2 = str.concat(valueOf2);
                    }
                    throw new IllegalStateException(valueOf2);
                }
                if (aho.f461a.mo168a(aho.f462b, a2.mo148d(), aho.f463c)) {
                    a2.mo147c();
                }
                a2.mo146b();
                this.f10316d.mo301a(a);
                return;
            }
            this.f10316d.mo301a(a);
        } catch (Throwable e) {
            if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
            }
        } catch (Throwable th) {
            this.f10316d.mo301a(a);
        }
    }
}
