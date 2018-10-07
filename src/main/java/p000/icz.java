package p000;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

/* renamed from: icz */
public final class icz implements idq {
    /* renamed from: a */
    public final idr f20918a;
    /* renamed from: b */
    private boolean f20919b = false;

    public icz(idr idr) {
        this.f20918a = idr;
    }

    /* renamed from: a */
    public final ich mo8374a(ich ich) {
        return mo8379b(ich);
    }

    /* renamed from: a */
    public final void mo8375a() {
    }

    /* renamed from: a */
    public final void mo8376a(int i) {
        this.f20918a.mo14988a(null);
        this.f20918a.f24611n.mo8401a(i, false);
    }

    /* renamed from: a */
    public final void mo8377a(Bundle bundle) {
    }

    /* renamed from: a */
    public final void mo8378a(ConnectionResult connectionResult, huh huh, boolean z) {
    }

    /* renamed from: b */
    public final void mo8380b() {
    }

    /* renamed from: c */
    public final boolean mo8381c() {
        idn idn = this.f20918a.f24610m;
        idn.f20958b.lock();
        idn.f20958b.unlock();
        this.f20918a.mo14988a(null);
        return true;
    }

    /* renamed from: b */
    public final ich mo8379b(ich ich) {
        try {
            this.f20918a.f24610m.f20963g.mo8293a(ich);
            idn idn = this.f20918a.f24610m;
            hul hul = (huo) idn.f20961e.get(ich.f24595e);
            htl.m3489b((Object) hul, (Object) "Appropriate Api was not requested.");
            if (hul.mo13577d() || !this.f20918a.f24604g.containsKey(ich.f24595e)) {
                if (hul instanceof hvl) {
                    hul = hvl.m17926i();
                }
                ich.mo14987b(hul);
                return ich;
            }
            ich.mo14986b(new Status(17));
            return ich;
        } catch (DeadObjectException e) {
            this.f20918a.mo14989a(new ida(this, this));
        }
    }
}
