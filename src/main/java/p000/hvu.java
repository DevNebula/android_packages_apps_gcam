package p000;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: hvu */
public final class hvu implements hvs {
    /* renamed from: a */
    private final /* synthetic */ hvm f20819a;

    public hvu(hvm hvm) {
        this.f20819a = hvm;
    }

    /* renamed from: a */
    public final void mo8208a(ConnectionResult connectionResult) {
        if (connectionResult.mo14631b()) {
            hvm hvm = this.f20819a;
            hvm.mo8184a(null, hvm.mo8201q());
            return;
        }
        hvp hvp = this.f20819a.f7091j;
        if (hvp != null) {
            hvp.mo8202a(connectionResult);
        }
    }
}
