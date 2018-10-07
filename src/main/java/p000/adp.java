package p000;

import java.security.MessageDigest;

/* compiled from: PG */
/* renamed from: adp */
public final class adp implements adl {
    /* renamed from: b */
    private final C0691ih f10144b = new arj();

    public final boolean equals(Object obj) {
        if (!(obj instanceof adp)) {
            return false;
        }
        return this.f10144b.equals(((adp) obj).f10144b);
    }

    /* renamed from: a */
    public final Object mo11616a(adm adm) {
        return this.f10144b.containsKey(adm) ? this.f10144b.get(adm) : adm.f336a;
    }

    public final int hashCode() {
        return this.f10144b.hashCode();
    }

    /* renamed from: a */
    public final void mo11617a(adp adp) {
        this.f10144b.mo9193a(adp.f10144b);
    }

    /* renamed from: a */
    public final adp mo11615a(adm adm, Object obj) {
        this.f10144b.put(adm, obj);
        return this;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f10144b);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 16);
        stringBuilder.append("Options{values=");
        stringBuilder.append(valueOf);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public final void mo172a(MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < this.f10144b.size()) {
                adm adm = (adm) this.f10144b.mo9195b(i2);
                Object d = this.f10144b.mo9200d(i2);
                ado ado = adm.f337b;
                if (adm.f339d == null) {
                    adm.f339d = adm.f338c.getBytes(adl.f334a);
                }
                ado.mo178a(adm.f339d, d, messageDigest);
                i = i2 + 1;
            } else {
                return;
            }
        }
    }
}
