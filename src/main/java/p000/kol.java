package p000;

import java.util.Iterator;

/* compiled from: PG */
/* renamed from: kol */
public final class kol extends kob {
    kol() {
    }

    public kol(keh keh, boolean z) {
        this();
        Runnable kom = new kom(this, keh, z, (byte) 0);
        this.f26776f = kom;
        if (kom.f21937a.isEmpty()) {
            kom.mo14128b();
        } else if (kom.f21938b) {
            Iterator c = kom.f21937a.iterator();
            int i = 0;
            while (c.hasNext()) {
                kpk kpk = (kpk) c.next();
                int i2 = i + 1;
                kpk.mo10200a(new kod(kom, i, kpk), kpq.f8776a);
                i = i2;
            }
        } else {
            Iterator c2 = kom.f21937a.iterator();
            while (c2.hasNext()) {
                ((kpk) c2.next()).mo10200a(kom, kpq.f8776a);
            }
        }
    }
}
