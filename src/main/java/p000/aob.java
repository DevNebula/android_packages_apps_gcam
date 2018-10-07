package p000;

/* compiled from: PG */
/* renamed from: aob */
public final class aob extends anq implements agi {
    public aob(any any) {
        super(any);
    }

    /* renamed from: c */
    public final Class mo263c() {
        return any.class;
    }

    /* renamed from: d */
    public final int mo264d() {
        aod aod = ((any) this.f10604a).f10612a.f824a;
        return arq.m671a(aod.mo1628a().getWidth(), aod.mo1628a().getHeight(), aod.mo1628a().getConfig()) + aod.f826a.mo157c();
    }

    /* renamed from: a */
    public final void mo257a() {
        ((any) this.f10604a).mo12285b().prepareToDraw();
    }

    /* renamed from: e */
    public final void mo265e() {
        ((any) this.f10604a).stop();
        any any = (any) this.f10604a;
        any.f10613b = true;
        aod aod = any.f10612a.f824a;
        aod.f827b.clear();
        aod.mo1633d();
        aod.f829d = false;
        aqs aqs = aod.f830e;
        if (aqs != null) {
            aod.f828c.mo11611a(aqs);
            aod.f830e = null;
        }
        aqs = aod.f832g;
        if (aqs != null) {
            aod.f828c.mo11611a(aqs);
            aod.f832g = null;
        }
        aqs = aod.f834i;
        if (aqs != null) {
            aod.f828c.mo11611a(aqs);
            aod.f834i = null;
        }
        aod.f826a.mo156b();
        aod.f831f = true;
    }
}
