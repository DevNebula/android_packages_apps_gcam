package p000;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import java.util.Collections;

/* renamed from: idm */
public final class idm implements idq {
    /* renamed from: a */
    private final idr f20957a;

    public idm(idr idr) {
        this.f20957a = idr;
    }

    /* renamed from: a */
    public final ich mo8374a(ich ich) {
        this.f20957a.f24610m.f20960d.add(ich);
        return ich;
    }

    /* renamed from: a */
    public final void mo8375a() {
        for (huo c : this.f20957a.f24603f.values()) {
            c.mo13576c();
        }
        this.f20957a.f24610m.f20962f = Collections.emptySet();
    }

    /* renamed from: a */
    public final void mo8376a(int i) {
    }

    /* renamed from: a */
    public final void mo8377a(Bundle bundle) {
    }

    /* renamed from: a */
    public final void mo8378a(ConnectionResult connectionResult, huh huh, boolean z) {
    }

    /* renamed from: b */
    public final ich mo8379b(ich ich) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    /* renamed from: c */
    public final boolean mo8381c() {
        return true;
    }

    /* renamed from: b */
    public final void mo8380b() {
        idr idr = this.f20957a;
        idr.f24598a.lock();
        try {
            idr.f24608k = new idb(idr, idr.f24605h, idr.f24606i, idr.f24601d, idr.f24607j, idr.f24598a, idr.f24600c);
            idr.f24608k.mo8375a();
            idr.f24599b.signalAll();
        } finally {
            idr.f24598a.unlock();
        }
    }
}
