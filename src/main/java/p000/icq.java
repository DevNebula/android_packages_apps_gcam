package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;

/* renamed from: icq */
final class icq implements ied {
    /* renamed from: a */
    public final idr f20875a;
    /* renamed from: b */
    public final idr f20876b;
    /* renamed from: c */
    public Bundle f20877c;
    /* renamed from: d */
    public ConnectionResult f20878d = null;
    /* renamed from: e */
    public ConnectionResult f20879e = null;
    /* renamed from: f */
    public boolean f20880f = false;
    /* renamed from: g */
    public final Lock f20881g;
    /* renamed from: h */
    private final Context f20882h;
    /* renamed from: i */
    private final idn f20883i;
    /* renamed from: j */
    private final Map f20884j;
    /* renamed from: k */
    private final Set f20885k = Collections.newSetFromMap(new WeakHashMap());
    /* renamed from: l */
    private final huo f20886l;
    /* renamed from: m */
    private int f20887m = 0;

    icq(Context context, idn idn, Lock lock, Looper looper, huc huc, Map map, Map map2, hvx hvx, huk huk, ArrayList arrayList, ArrayList arrayList2, Map map3, Map map4) {
        this.f20882h = context;
        this.f20883i = idn;
        this.f20881g = lock;
        this.f20886l = null;
        this.f20875a = new idr(context, this.f20883i, lock, looper, huc, map2, null, map4, null, arrayList2, new icr(this));
        this.f20876b = new idr(context, this.f20883i, lock, looper, huc, map, hvx, map3, huk, arrayList, new ics(this));
        Map c0691ih = new C0691ih();
        for (hum put : map2.keySet()) {
            c0691ih.put(put, this.f20875a);
        }
        for (hum put2 : map.keySet()) {
            c0691ih.put(put2, this.f20876b);
        }
        this.f20884j = Collections.unmodifiableMap(c0691ih);
    }

    /* renamed from: a */
    private final void m12315a(ConnectionResult connectionResult) {
        switch (this.f20887m) {
            case 1:
                break;
            case 2:
                this.f20883i.mo8403a(connectionResult);
                break;
            default:
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                break;
        }
        m12320e();
        this.f20887m = 0;
    }

    /* renamed from: b */
    private static boolean m12318b(ConnectionResult connectionResult) {
        return connectionResult != null && connectionResult.mo14631b();
    }

    /* renamed from: e */
    private final void m12320e() {
        for (hzr a : this.f20885k) {
            a.mo8291a();
        }
        this.f20885k.clear();
    }

    /* renamed from: a */
    public final ConnectionResult mo8394a() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a */
    public final void mo8396a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("authClient").println(":");
        this.f20876b.mo8396a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append(str).append("anonClient").println(":");
        this.f20875a.mo8396a(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    /* renamed from: c */
    public final void mo8399c() {
        this.f20879e = null;
        this.f20878d = null;
        this.f20887m = 0;
        this.f20875a.mo8399c();
        this.f20876b.mo8399c();
        m12320e();
    }

    /* renamed from: b */
    public final void mo8398b() {
        this.f20887m = 2;
        this.f20880f = false;
        this.f20879e = null;
        this.f20878d = null;
        this.f20875a.mo8398b();
        this.f20876b.mo8398b();
    }

    /* renamed from: d */
    public final boolean mo8400d() {
        boolean z = true;
        this.f20881g.lock();
        try {
            if (!this.f20875a.mo8400d()) {
                z = false;
            } else if (!(this.f20876b.mo8400d() || m12321f() || this.f20887m == 1)) {
                z = false;
            }
            this.f20881g.unlock();
            return z;
        } catch (Throwable th) {
            this.f20881g.unlock();
        }
    }

    /* renamed from: a */
    public final ich mo8395a(ich ich) {
        if (!m12319c(ich)) {
            return this.f20875a.mo8395a(ich);
        }
        if (!m12321f()) {
            return this.f20876b.mo8395a(ich);
        }
        ich.mo14986b(new Status(4, null, null));
        return ich;
    }

    /* renamed from: a */
    static /* synthetic */ void m12317a(icq icq, int i, boolean z) {
        icq.f20883i.mo8401a(i, z);
        icq.f20879e = null;
        icq.f20878d = null;
    }

    /* renamed from: b */
    public final ich mo8397b(ich ich) {
        if (!m12319c(ich)) {
            return this.f20875a.mo8397b(ich);
        }
        if (!m12321f()) {
            return this.f20876b.mo8397b(ich);
        }
        ich.mo14986b(new Status(4, null, null));
        return ich;
    }

    /* renamed from: c */
    private final boolean m12319c(ich ich) {
        hum hum = ich.f24595e;
        htl.m3493b(this.f20884j.containsKey(hum), (Object) "GoogleApiClient is not configured to use the API required for this call.");
        return ((idr) this.f20884j.get(hum)).equals(this.f20876b);
    }

    /* renamed from: f */
    private final boolean m12321f() {
        ConnectionResult connectionResult = this.f20879e;
        return connectionResult != null && connectionResult.f23349b == 4;
    }
}
