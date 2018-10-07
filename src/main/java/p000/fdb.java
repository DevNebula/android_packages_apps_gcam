package p000;

/* compiled from: PG */
/* renamed from: fdb */
final class fdb extends fce {
    /* renamed from: a */
    private final fbx f18140a;
    /* renamed from: b */
    private final fbx f18141b;

    fdb(fbx fbx, fbx fbx2) {
        if (fbx == null) {
            throw new NullPointerException("Null prevState");
        }
        this.f18140a = fbx;
        if (fbx2 == null) {
            throw new NullPointerException("Null curState");
        }
        this.f18141b = fbx2;
    }

    /* renamed from: a */
    public final fbx mo6741a() {
        return this.f18141b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fce)) {
            return false;
        }
        fce fce = (fce) obj;
        if (this.f18140a.equals(fce.mo6742b()) && this.f18141b.equals(fce.mo6741a())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f18140a.hashCode() ^ 1000003) * 1000003) ^ this.f18141b.hashCode();
    }

    /* renamed from: b */
    public final fbx mo6742b() {
        return this.f18140a;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f18140a);
        String valueOf2 = String.valueOf(this.f18141b);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 40) + String.valueOf(valueOf2).length());
        stringBuilder.append("AeStateTransition{prevState=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", curState=");
        stringBuilder.append(valueOf2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
