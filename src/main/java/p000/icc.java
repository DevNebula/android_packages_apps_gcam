package p000;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* renamed from: icc */
public final class icc extends ica {
    /* renamed from: b */
    private final iei f24594b;

    public icc(iei iei, ifw ifw) {
        super(ifw);
        this.f24594b = iei;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo8349a(icx icx, boolean z) {
    }

    /* renamed from: b */
    public final void mo13617b(ief ief) {
        hzq hzq = (hzq) ief.f24617d.remove(this.f24594b);
        if (hzq == null) {
            Log.wtf("UnregisterListenerTask", "Received call to unregister a listener without a matching registration call.", new Exception());
            this.f20856a.mo8432a(new bpm(Status.f23356b));
            return;
        }
        hzq.f7216b.mo12335i();
        throw new NoSuchMethodError();
    }
}
