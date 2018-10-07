package p000;

import android.content.Context;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.location.internal.zzq;

/* renamed from: iff */
public final class iff extends ies {
    /* renamed from: m */
    public final ifb f26713m;

    public iff(Context context, Looper looper, hus hus, hut hut, String str, hvx hvx) {
        super(context, looper, hus, hut, str, hvx);
        this.f26713m = new ifb(context, this.f26512l);
    }

    /* renamed from: c */
    public final void mo8188c() {
        synchronized (this.f26713m) {
            if (mo8189d()) {
                try {
                    ifb ifb = this.f26713m;
                    try {
                        synchronized (ifb.f7348b) {
                            for (ifn ifn : ifb.f7348b.values()) {
                                if (ifn != null) {
                                    ((ifa) ifb.f7347a.f7351a.mo8200p()).mo8417a(zzq.m15387a(ifn, null));
                                }
                            }
                            ifb.f7348b.clear();
                        }
                        synchronized (ifb.f7349c) {
                            for (ifk ifk : ifb.f7349c.values()) {
                                if (ifk != null) {
                                    ((ifa) ifb.f7347a.f7351a.mo8200p()).mo8417a(new zzq(2, null, null, null, ifk.asBinder(), null));
                                }
                            }
                            ifb.f7349c.clear();
                        }
                    } catch (Throwable e) {
                        throw new IllegalStateException(e);
                    }
                } catch (Throwable e2) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e2);
                }
            }
            super.mo8188c();
        }
    }
}
