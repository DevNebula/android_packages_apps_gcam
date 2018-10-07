package p000;

import android.os.Handler;
import android.os.Looper;
import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: aet */
public final class aet {
    /* renamed from: a */
    public final Handler f355a = new Handler(Looper.getMainLooper(), new aeu(this));
    /* renamed from: b */
    public final Map f356b = new HashMap();
    /* renamed from: c */
    public agf f357c;
    /* renamed from: d */
    public ReferenceQueue f358d;
    /* renamed from: e */
    public volatile boolean f359e;
    /* renamed from: f */
    public volatile aew f360f;
    /* renamed from: g */
    private final boolean f361g;
    /* renamed from: h */
    private Thread f362h;

    aet(boolean z) {
        this.f361g = z;
    }

    /* renamed from: a */
    public final void mo208a(adl adl, age age) {
        if (this.f358d == null) {
            this.f358d = new ReferenceQueue();
            this.f362h = new Thread(new aev(this), "glide-active-resources");
            this.f362h.start();
        }
        aex aex = (aex) this.f356b.put(adl, new aex(adl, age, this.f358d, this.f361g));
        if (aex != null) {
            aex.mo212a();
        }
    }

    /* renamed from: a */
    public final void mo209a(aex aex) {
        arq.m678a();
        this.f356b.remove(aex.f365a);
        if (aex.f366b) {
            agn agn = aex.f367c;
            if (agn != null) {
                age age = new age(agn, true, false);
                age.mo11635a(aex.f365a, this.f357c);
                this.f357c.mo246a(aex.f365a, age);
            }
        }
    }
}
