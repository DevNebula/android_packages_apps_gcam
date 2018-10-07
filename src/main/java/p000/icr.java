package p000;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: icr */
final class icr implements iee {
    /* renamed from: a */
    private final /* synthetic */ icq f20888a;

    icr(icq icq) {
        this.f20888a = icq;
    }

    /* renamed from: a */
    public final void mo8403a(ConnectionResult connectionResult) {
        this.f20888a.f20881g.lock();
        try {
            icq icq = this.f20888a;
            icq.f20878d = connectionResult;
            icq.m12316a(icq);
        } finally {
            this.f20888a.f20881g.unlock();
        }
    }

    /* renamed from: a */
    public final void mo8401a(int i, boolean z) {
        this.f20888a.f20881g.lock();
        try {
            icq icq = this.f20888a;
            if (!icq.f20880f) {
                ConnectionResult connectionResult = icq.f20879e;
                if (connectionResult != null) {
                    if (connectionResult.mo14631b()) {
                        icq = this.f20888a;
                        icq.f20880f = true;
                        icq.f20876b.mo8148a(i);
                        this.f20888a.f20881g.unlock();
                        return;
                    }
                }
            }
            icq = this.f20888a;
            icq.f20880f = false;
            icq.m12317a(icq, i, z);
        } finally {
            this.f20888a.f20881g.unlock();
        }
    }

    /* renamed from: a */
    public final void mo8402a(Bundle bundle) {
        this.f20888a.f20881g.lock();
        try {
            icq icq = this.f20888a;
            Bundle bundle2 = icq.f20877c;
            if (bundle2 == null) {
                icq.f20877c = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            this.f20888a.f20878d = ConnectionResult.f23348a;
            icq.m12316a(this.f20888a);
        } finally {
            this.f20888a.f20881g.unlock();
        }
    }
}
