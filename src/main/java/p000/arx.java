package p000;

import android.util.Log;

/* compiled from: PG */
/* renamed from: arx */
final class arx implements C0300iw {
    /* renamed from: a */
    private final arw f10683a;
    /* renamed from: b */
    private final arz f10684b;
    /* renamed from: c */
    private final C0300iw f10685c;

    arx(C0300iw c0300iw, arw arw, arz arz) {
        this.f10685c = c0300iw;
        this.f10683a = arw;
        this.f10684b = arz;
    }

    /* renamed from: a */
    public final Object mo9113a() {
        Object a = this.f10685c.mo9113a();
        if (a == null) {
            a = this.f10683a.mo1763a();
            if (Log.isLoggable("FactoryPools", 2)) {
                String valueOf = String.valueOf(a.getClass());
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 12);
                stringBuilder.append("Created new ");
                stringBuilder.append(valueOf);
                Log.v("FactoryPools", stringBuilder.toString());
            }
        }
        if (a instanceof ary) {
            ((ary) a).mo1764a().mo1766a(false);
        }
        return a;
    }

    /* renamed from: a */
    public final boolean mo9114a(Object obj) {
        if (obj instanceof ary) {
            ((ary) obj).mo1764a().mo1766a(true);
        }
        this.f10684b.mo1765a(obj);
        return this.f10685c.mo9114a(obj);
    }
}
