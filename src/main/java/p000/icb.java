package p000;

import com.google.android.gms.common.api.Status;

/* renamed from: icb */
public final class icb extends ibz {
    /* renamed from: a */
    private final ich f20857a;

    public icb(ich ich) {
        this.f20857a = ich;
    }

    /* renamed from: a */
    public final void mo8348a(Status status) {
        this.f20857a.mo14986b(status);
    }

    /* renamed from: a */
    public final void mo8349a(icx icx, boolean z) {
        ick ick = this.f20857a;
        icx.f7303a.put(ick, Boolean.valueOf(z));
        huv huv = new huv(icx, ick);
        htl.m3493b(true, (Object) "Callback cannot be null.");
        synchronized (ick.f20864g) {
            if (ick.mo13623b()) {
                huv.mo8152a();
            } else {
                ick.f20865h.add(huv);
            }
        }
    }

    /* renamed from: a */
    public final void mo8350a(ief ief) {
        this.f20857a.mo14987b(ief.f24614a);
    }
}
