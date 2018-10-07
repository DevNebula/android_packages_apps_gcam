package p000;

import com.google.android.gms.common.ConnectionResult;
import java.util.Collections;

/* renamed from: idz */
public final class idz implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ ConnectionResult f7331a;
    /* renamed from: b */
    private final /* synthetic */ hzu f7332b;

    public idz(hzu hzu, ConnectionResult connectionResult) {
        this.f7332b = hzu;
        this.f7331a = connectionResult;
    }

    public final void run() {
        if (this.f7331a.mo14631b()) {
            hzu hzu = this.f7332b;
            hzu.f20852e = true;
            if (hzu.f20848a.mo13579f()) {
                this.f7332b.mo13606a();
                return;
            } else {
                this.f7332b.f20848a.mo13574a(null, Collections.emptySet());
                return;
            }
        }
        ((ief) this.f7332b.f20853f.f7318g.get(this.f7332b.f20849b)).mo8150a(this.f7331a);
    }
}
