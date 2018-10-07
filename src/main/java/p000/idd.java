package p000;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.lang.ref.WeakReference;

/* renamed from: idd */
final class idd implements hvs {
    /* renamed from: a */
    public final boolean f20944a;
    /* renamed from: b */
    private final WeakReference f20945b;
    /* renamed from: c */
    private final huh f20946c;

    public idd(idb idb, huh huh, boolean z) {
        this.f20945b = new WeakReference(idb);
        this.f20946c = huh;
        this.f20944a = z;
    }

    /* renamed from: a */
    public final void mo8208a(ConnectionResult connectionResult) {
        boolean z = false;
        idb idb = (idb) this.f20945b.get();
        if (idb != null) {
            if (Looper.myLooper() == idb.f20923a.f24610m.f20959c) {
                z = true;
            }
            htl.m3479a(z, (Object) "onReportServiceBinding must be called on the GoogleApiClient handler thread");
            idb.f20924b.lock();
            try {
                if (idb.mo13633b(0)) {
                    if (!connectionResult.mo14631b()) {
                        idb.mo13632b(connectionResult, this.f20946c, this.f20944a);
                    }
                    if (idb.mo13634d()) {
                        idb.mo13635e();
                    }
                    idb.f20924b.unlock();
                    return;
                }
                idb.f20924b.unlock();
            } catch (Throwable th) {
                idb.f20924b.unlock();
            }
        }
    }
}
