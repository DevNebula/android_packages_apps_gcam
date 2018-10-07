package p000;

import java.util.UUID;

/* compiled from: PG */
/* renamed from: fqu */
public final class fqu implements fuw {
    /* renamed from: a */
    public static final String f18662a = bli.m887a("RawModeImageSaver");
    /* renamed from: b */
    public final hju f18663b;
    /* renamed from: c */
    public final ixv f18664c;

    public fqu(hju hju, ixv ixv) {
        this.f18663b = hju;
        this.f18664c = ixv;
    }

    /* renamed from: a */
    public final fux mo6915a(fwa fwa) {
        bli.m888a(f18662a, "Created new RAW session in acquireSession()");
        return new fqv(this, fwa.f4982b, UUID.randomUUID());
    }

    /* renamed from: a */
    public final ilp mo6916a() {
        return ilq.m3876a(Boolean.valueOf(true));
    }

    /* renamed from: b */
    public final fuy mo6918b() {
        return fuy.m2452a();
    }

    /* renamed from: c */
    public final fqv mo6917b(fwa fwa) {
        bli.m888a(f18662a, "Created new RAW session in tryAcquireSession()");
        return new fqv(this, fwa.f4982b, UUID.randomUUID());
    }
}
