package p000;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: ics */
final class ics implements iee {
    /* renamed from: a */
    private final /* synthetic */ icq f20889a;

    ics(icq icq) {
        this.f20889a = icq;
    }

    /* renamed from: a */
    public final void mo8403a(ConnectionResult connectionResult) {
        this.f20889a.f20881g.lock();
        try {
            icq icq = this.f20889a;
            icq.f20879e = connectionResult;
            icq.m12316a(icq);
        } finally {
            this.f20889a.f20881g.unlock();
        }
    }

    /* renamed from: a */
    public final void mo8401a(int i, boolean z) {
        this.f20889a.f20881g.lock();
        try {
            icq icq = this.f20889a;
            if (icq.f20880f) {
                icq.f20880f = false;
                icq.m12317a(icq, i, z);
                this.f20889a.f20881g.unlock();
                return;
            }
            icq.f20880f = true;
            icq.f20875a.mo8148a(i);
        } finally {
            this.f20889a.f20881g.unlock();
        }
    }

    /* renamed from: a */
    public final void mo8402a(Bundle bundle) {
        this.f20889a.f20881g.lock();
        try {
            this.f20889a.f20879e = ConnectionResult.f23348a;
            icq.m12316a(this.f20889a);
        } finally {
            this.f20889a.f20881g.unlock();
        }
    }
}
