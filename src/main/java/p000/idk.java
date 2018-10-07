package p000;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: idk */
final class idk implements hus, hut {
    /* renamed from: a */
    private final /* synthetic */ idb f20956a;

    idk(idb idb) {
        this.f20956a = idb;
    }

    /* renamed from: a */
    public final void mo8148a(int i) {
    }

    /* renamed from: a */
    public final void mo8149a(Bundle bundle) {
        idb idb = this.f20956a;
        idb.f20926d.mo14963a(new idi(idb));
    }

    /* renamed from: a */
    public final void mo8150a(ConnectionResult connectionResult) {
        this.f20956a.f20924b.lock();
        try {
            if (this.f20956a.mo13630a(connectionResult)) {
                this.f20956a.mo13636f();
                this.f20956a.mo13635e();
            } else {
                this.f20956a.mo13631b(connectionResult);
            }
            this.f20956a.f20924b.unlock();
        } catch (Throwable th) {
            this.f20956a.f20924b.unlock();
        }
    }
}
