package p000;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: hvw */
public final class hvw extends hvn {
    /* renamed from: c */
    private final /* synthetic */ hvm f24520c;

    public hvw(hvm hvm, int i) {
        this.f24520c = hvm;
        super(hvm, i, null);
    }

    /* renamed from: a */
    protected final void mo13582a(ConnectionResult connectionResult) {
        this.f24520c.f7088g.mo8208a(connectionResult);
        this.f24520c.mo8181a(connectionResult);
    }

    /* renamed from: b */
    protected final boolean mo13583b() {
        this.f24520c.f7088g.mo8208a(ConnectionResult.f23348a);
        return true;
    }
}
