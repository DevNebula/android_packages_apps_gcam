package p000;

import android.os.Looper;
import com.google.android.gms.location.LocationRequest;

/* compiled from: PG */
/* renamed from: eou */
final class eou implements kov {
    /* renamed from: a */
    private final /* synthetic */ eot f17577a;

    eou(eot eot) {
        this.f17577a = eot;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        String str = eos.f17568a;
        String valueOf = String.valueOf(th.getMessage());
        String str2 = "fail to connect to GoogleApiClient: ";
        if (valueOf.length() == 0) {
            valueOf = new String(str2);
        } else {
            valueOf = str2.concat(valueOf);
        }
        bli.m898e(str, valueOf);
        this.f17577a.f4223b.mo13166d();
        this.f17577a.f4222a.mo15641a(Boolean.valueOf(false));
    }

    /* renamed from: b_ */
    public final /* synthetic */ void mo10186b_(Object obj) {
        hjk hjk = (hjk) obj;
        bli.m888a(eos.f17568a, "onConnected.");
        eos eos = this.f17577a.f4223b;
        eos.f17572c = hjk;
        if (eos.f17574e) {
            bli.m894c(eos.f17568a, "Start location updates.");
            if (eos.f17572c != null) {
                LocationRequest locationRequest = new LocationRequest();
                long j = (long) eos.f17569g;
                LocationRequest.m15384a(j);
                locationRequest.f23522b = j;
                if (!locationRequest.f23524d) {
                    locationRequest.f23523c = (long) (((double) locationRequest.f23522b) / 6.0d);
                }
                LocationRequest.m15383a();
                locationRequest.f23521a = 100;
                try {
                    huq huq = eos.f17572c.f6637a.f20167a;
                    htl.m3489b(Looper.myLooper(), (Object) "Calling thread must be a prepared Looper thread.");
                    huq.mo8138b(new ieu(huq, locationRequest, eos));
                    eos.f17575f = true;
                } catch (Throwable e) {
                    bli.m899e(eos.f17568a, "requestLocationUpdates failed!", e);
                }
            }
            this.f17577a.f4222a.mo15641a(Boolean.valueOf(true));
            return;
        }
        eos.mo13166d();
        this.f17577a.f4222a.mo15641a(Boolean.valueOf(false));
    }
}
