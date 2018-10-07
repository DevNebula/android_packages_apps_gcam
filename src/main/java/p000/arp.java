package p000;

/* compiled from: PG */
/* renamed from: arp */
public final class arp {
    /* renamed from: a */
    private Class f949a;
    /* renamed from: b */
    private Class f950b;
    /* renamed from: c */
    private Class f951c;

    public arp(Class cls, Class cls2) {
        mo1759a(cls, cls2, null);
    }

    public arp(Class cls, Class cls2, Class cls3) {
        mo1759a(cls, cls2, cls3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        arp arp = (arp) obj;
        if (!this.f949a.equals(arp.f949a)) {
            return false;
        }
        if (!this.f950b.equals(arp.f950b)) {
            return false;
        }
        if (arq.m683b(this.f951c, arp.f951c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = ((this.f949a.hashCode() * 31) + this.f950b.hashCode()) * 31;
        Class cls = this.f951c;
        if (cls != null) {
            hashCode = cls.hashCode();
        } else {
            hashCode = 0;
        }
        return hashCode + hashCode2;
    }

    /* renamed from: a */
    public final void mo1759a(Class cls, Class cls2, Class cls3) {
        this.f949a = cls;
        this.f950b = cls2;
        this.f951c = cls3;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f949a);
        String valueOf2 = String.valueOf(this.f950b);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 30) + String.valueOf(valueOf2).length());
        stringBuilder.append("MultiClassKey{first=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", second=");
        stringBuilder.append(valueOf2);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
