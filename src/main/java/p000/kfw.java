package p000;

/* compiled from: PG */
/* renamed from: kfw */
abstract class kfw implements kfu {
    kfw() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof kfu)) {
            return false;
        }
        kfu kfu = (kfu) obj;
        if (mo9953a() == kfu.mo9953a() && kbf.m16778b(mo9987a(), kfu.mo9987a())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object b = mo9987a();
        return (b != null ? b.hashCode() : 0) ^ mo9953a();
    }

    public String toString() {
        String valueOf = String.valueOf(mo9987a());
        int a = mo9953a();
        if (a == 1) {
            return valueOf;
        }
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 14);
        stringBuilder.append(valueOf);
        stringBuilder.append(" x ");
        stringBuilder.append(a);
        return stringBuilder.toString();
    }
}
