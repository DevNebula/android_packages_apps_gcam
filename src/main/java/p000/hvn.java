package p000;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: hvn */
abstract class hvn extends hvr {
    /* renamed from: c */
    private final int f20816c;
    /* renamed from: d */
    private final Bundle f20817d;
    /* renamed from: e */
    private final /* synthetic */ hvm f20818e;

    protected hvn(hvm hvm, int i, Bundle bundle) {
        this.f20818e = hvm;
        super(hvm, Boolean.valueOf(true));
        this.f20816c = i;
        this.f20817d = bundle;
    }

    /* renamed from: a */
    protected final void mo8204a() {
    }

    /* renamed from: a */
    protected abstract void mo13582a(ConnectionResult connectionResult);

    /* renamed from: b */
    protected abstract boolean mo13583b();
}
