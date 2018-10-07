package p000;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: idy */
final class idy implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ ConnectionResult f7329a;
    /* renamed from: b */
    private final /* synthetic */ ief f7330b;

    idy(ief ief, ConnectionResult connectionResult) {
        this.f7330b = ief;
        this.f7329a = connectionResult;
    }

    public final void run() {
        this.f7330b.mo8150a(this.f7329a);
    }
}
