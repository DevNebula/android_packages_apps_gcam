package p000;

import android.content.Context;
import android.location.Location;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ifb */
public final class ifb {
    /* renamed from: a */
    public final ifi f7347a;
    /* renamed from: b */
    public final Map f7348b = new HashMap();
    /* renamed from: c */
    public final Map f7349c = new HashMap();
    /* renamed from: d */
    private final Context f7350d;

    public ifb(Context context, ifi ifi) {
        this.f7350d = context;
        this.f7347a = ifi;
    }

    /* renamed from: a */
    public final Location mo8419a() {
        this.f7347a.f7351a.mo8199o();
        try {
            return ((ifa) this.f7347a.f7351a.mo8200p()).mo8416a(this.f7350d.getPackageName());
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    /* renamed from: a */
    final ifn mo8420a(ieg ieg) {
        ifn ifn;
        synchronized (this.f7348b) {
            ifn = (ifn) this.f7348b.get(ieg.f7337b);
            if (ifn == null) {
                ifn = new ifn(ieg);
            }
            this.f7348b.put(ieg.f7337b, ifn);
        }
        return ifn;
    }
}
