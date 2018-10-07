package p000;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: ica */
abstract class ica extends ibz {
    /* renamed from: a */
    public final ifw f20856a;

    public ica(ifw ifw) {
        this.f20856a = ifw;
    }

    /* renamed from: a */
    public void mo8348a(Status status) {
        this.f20856a.mo8432a(new bpm(status));
    }

    /* renamed from: a */
    public void mo8349a(icx icx, boolean z) {
    }

    /* renamed from: a */
    public final void mo8350a(ief ief) {
        try {
            mo13617b(ief);
        } catch (RemoteException e) {
            mo8348a(ibz.m3718a(e));
            throw e;
        } catch (RemoteException e2) {
            mo8348a(ibz.m3718a(e2));
        }
    }

    /* renamed from: b */
    protected abstract void mo13617b(ief ief);
}
