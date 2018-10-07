package p000;

import com.google.android.gms.location.internal.zzq;

/* renamed from: iev */
public final class iev extends ieq {
    /* renamed from: a */
    private final /* synthetic */ ien f26712a;

    public iev(huq huq, ien ien) {
        this.f26712a = ien;
        super(huq, (byte) 0);
    }

    /* renamed from: a */
    protected final /* synthetic */ void mo14985a(hul hul) {
        iff iff = (iff) hul;
        Object obj = this.f26712a;
        String simpleName = ien.class.getSimpleName();
        htl.m3489b(obj, (Object) "Listener must not be null");
        htl.m3489b((Object) simpleName, (Object) "Listener type must not be null");
        htl.m3461a(simpleName, (Object) "Listener type must not be empty");
        Object iei = new iei(obj, simpleName);
        iex iey = new iey(this);
        ifb ifb = iff.f26713m;
        ifb.f7347a.f7351a.mo8199o();
        htl.m3489b(iei, (Object) "Invalid null listener key");
        synchronized (ifb.f7348b) {
            ifn ifn = (ifn) ifb.f7348b.remove(iei);
            if (ifn != null) {
                ifn.mo13645a();
                ((ifa) ifb.f7347a.f7351a.mo8200p()).mo8417a(zzq.m15387a(ifn, iey));
            }
        }
    }
}
