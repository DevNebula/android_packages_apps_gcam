package p000;

import java.util.Iterator;
import java.util.Set;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: kob */
class kob extends knt {
    /* renamed from: e */
    public static final Logger f26775e = Logger.getLogger(kob.class.getName());
    /* renamed from: f */
    public koc f26776f;

    kob() {
    }

    /* renamed from: a */
    static boolean m18481a(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    /* renamed from: a */
    protected final void mo15639a() {
        super.mo15639a();
        koc koc = this.f26776f;
        if (koc != null) {
            int i;
            this.f26776f = null;
            keh keh = koc.f21937a;
            boolean c = mo15645c();
            if (c) {
                koc.m13859c();
            }
            boolean isCancelled = isCancelled();
            if (keh != null) {
                i = 1;
            } else {
                i = 0;
            }
            if ((i & isCancelled) != 0) {
                Iterator c2 = keh.iterator();
                while (c2.hasNext()) {
                    ((kpk) c2.next()).cancel(c);
                }
            }
        }
    }

    /* renamed from: b */
    protected final String mo15643b() {
        koc koc = this.f26776f;
        if (koc == null) {
            return null;
        }
        keh keh = koc.f21937a;
        if (keh == null) {
            return null;
        }
        String valueOf = String.valueOf(keh);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 10);
        stringBuilder.append("futures=[");
        stringBuilder.append(valueOf);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
