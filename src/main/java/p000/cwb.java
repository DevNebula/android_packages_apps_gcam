package p000;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;

/* compiled from: PG */
/* renamed from: cwb */
public final class cwb implements cvy {
    /* renamed from: a */
    private final EnumMap f13321a = new EnumMap(hhx.class);
    /* renamed from: b */
    private hhx f13322b = hhx.UNINITIALIZED;

    static {
        bli.m887a("ModuleManagerImpl");
    }

    public cwb(Iterable iterable) {
        for (cvz cvz : iterable) {
            if (cvz == null) {
                throw new NullPointerException("Registering a null ModuleAgent.");
            }
            Enum enumR = cvz.mo5870b().f3017a;
            if (hhx.UNINITIALIZED.equals(enumR)) {
                throw new IllegalArgumentException("ModuleManager: The ApplicationMode can not be UNINITIALIZED");
            } else if (this.f13321a.get(enumR) != null) {
                String valueOf = String.valueOf(enumR);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 42);
                stringBuilder.append("ModuleManager: Mode ");
                stringBuilder.append(valueOf);
                stringBuilder.append(" is registered already");
                throw new IllegalArgumentException(stringBuilder.toString());
            } else {
                this.f13321a.put(enumR, cvz);
            }
        }
    }

    /* renamed from: a */
    public final cvz mo5866a(hhx hhx) {
        cvz cvz = (cvz) this.f13321a.get(hhx);
        if (cvz == null) {
            return (cvz) this.f13321a.get(this.f13322b);
        }
        return cvz;
    }

    /* renamed from: a */
    public final List mo5867a() {
        return new ArrayList(this.f13321a.values());
    }

    /* renamed from: b */
    public final boolean mo5868b(hhx hhx) {
        if (this.f13321a.get(hhx) == null) {
            return false;
        }
        this.f13322b = hhx;
        return true;
    }
}
