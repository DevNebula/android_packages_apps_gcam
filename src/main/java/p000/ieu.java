package p000;

import android.os.Looper;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.internal.zzo;
import com.google.android.gms.location.internal.zzq;

/* renamed from: ieu */
public final class ieu extends ieq {
    /* renamed from: a */
    private final /* synthetic */ LocationRequest f26710a;
    /* renamed from: b */
    private final /* synthetic */ ien f26711b;

    public ieu(huq huq, LocationRequest locationRequest, ien ien) {
        this.f26710a = locationRequest;
        this.f26711b = ien;
        super(huq, (byte) 0);
    }

    /* renamed from: a */
    protected final /* synthetic */ void mo14985a(hul hul) {
        boolean z = true;
        iff iff = (iff) hul;
        iex iey = new iey(this);
        LocationRequest locationRequest = this.f26710a;
        ien ien = this.f26711b;
        if (Looper.myLooper() == null) {
            z = false;
        }
        htl.m3479a(z, (Object) "Can't create handler inside thread that has not called Looper.prepare()");
        ieg a = iek.m3768a(ien, Looper.myLooper(), ien.class.getSimpleName());
        synchronized (iff.f26713m) {
            ifb ifb = iff.f26713m;
            ifb.f7347a.f7351a.mo8199o();
            ifm a2 = ifb.mo8420a(a);
            ((ifa) ifb.f7347a.f7351a.mo8200p()).mo8417a(new zzq(1, new zzo(locationRequest, zzo.f23532a, null, false, false), a2.asBinder(), null, null, iey.asBinder()));
        }
    }
}
