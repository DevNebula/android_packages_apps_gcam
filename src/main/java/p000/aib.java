package p000;

/* compiled from: PG */
/* renamed from: aib */
public final class aib {
    /* renamed from: a */
    private final arn f485a = new arn(1000);
    /* renamed from: b */
    private final C0300iw f486b = ars.m685a(10, new aic());

    /* renamed from: b */
    private final String m298b(adl adl) {
        aid aid = (aid) aqe.m610a((aid) this.f486b.mo9113a(), "Argument must not be null");
        try {
            adl.mo172a(aid.f10319a);
            String a = arq.m675a(aid.f10319a.digest());
            return a;
        } finally {
            this.f486b.mo9114a(aid);
        }
    }

    /* renamed from: a */
    public final String mo311a(adl adl) {
        String str;
        synchronized (this.f485a) {
            str = (String) this.f485a.mo1750b(adl);
        }
        if (str == null) {
            str = m298b(adl);
        }
        synchronized (this.f485a) {
            this.f485a.mo1751b(adl, str);
        }
        return str;
    }
}
