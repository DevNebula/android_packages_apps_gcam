package p000;

import java.util.List;

/* compiled from: PG */
/* renamed from: dhl */
public final class dhl implements kwk {
    /* renamed from: a */
    private final kwk f13905a;
    /* renamed from: b */
    private final kwk f13906b;

    public dhl(kwk kwk, kwk kwk2) {
        this.f13905a = kwk;
        this.f13906b = kwk2;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        iur b;
        Object valueOf;
        kwk kwk = this.f13905a;
        bfk bfk = (bfk) kwk.mo10566a();
        fbn fbn = (fbn) this.f13906b.mo10566a();
        iur b2 = fbn.mo9091b(iut.BACK);
        if (b2 == null) {
            b = fbn.mo9091b(iut.FRONT);
        } else {
            b = b2;
        }
        if (b != null) {
            boolean z;
            boolean z2;
            bez bez = (bez) bfk.mo12367b(b).mo9706a();
            for (inc inc : inc.m3931b()) {
                if (bez.f1142b.containsKey(inc) && !((List) bez.f1142b.get(inc)).isEmpty()) {
                    z = true;
                    break;
                }
            }
            z = false;
            if (!z) {
                z2 = false;
            } else if (bez.mo1931a(inc.FPS_240).isEmpty()) {
                z2 = false;
            } else {
                z2 = true;
            }
            valueOf = Boolean.valueOf(z2);
        } else {
            valueOf = Boolean.valueOf(false);
        }
        return (Boolean) ktm.m14219a(valueOf, "Cannot return null from a non-@Nullable @Provides method");
    }
}
