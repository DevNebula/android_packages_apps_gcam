package p000;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: ich */
public abstract class ich extends ick implements ici {
    /* renamed from: e */
    public final hum f24595e;
    /* renamed from: f */
    public final huh f24596f;

    public ich(huh huh, huq huq) {
        super((huq) htl.m3489b((Object) huq, (Object) "GoogleApiClient must not be null"));
        this.f24595e = huh.mo8131b();
        this.f24596f = huh;
    }

    @Deprecated
    protected ich(hum hum, huq huq) {
        super((huq) htl.m3489b((Object) huq, (Object) "GoogleApiClient must not be null"));
        this.f24595e = (hum) htl.m3488b((Object) hum);
        this.f24596f = null;
    }

    /* renamed from: a */
    private final void m16340a(RemoteException remoteException) {
        mo14986b(new Status(8, remoteException.getLocalizedMessage(), null));
    }

    /* renamed from: a */
    public abstract void mo14985a(hul hul);

    /* renamed from: b */
    public final void mo14986b(Status status) {
        htl.m3493b(status.mo14640b() ^ 1, (Object) "Failed result must not be success");
        mo8364a(mo13619a(status));
    }

    /* renamed from: b */
    public final void mo14987b(hul hul) {
        try {
            mo14985a(hul);
        } catch (RemoteException e) {
            m16340a(e);
            throw e;
        } catch (RemoteException e2) {
            m16340a(e2);
        }
    }
}
