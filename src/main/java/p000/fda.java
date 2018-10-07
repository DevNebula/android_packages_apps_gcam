package p000;

/* compiled from: PG */
/* renamed from: fda */
final class fda extends fbx {
    /* renamed from: a */
    private final gie f18138a;
    /* renamed from: b */
    private final gif f18139b;

    fda(gie gie, gif gif) {
        this.f18138a = gie;
        this.f18139b = gif;
    }

    /* renamed from: a */
    final gie mo6732a() {
        return this.f18138a;
    }

    /* renamed from: b */
    final gif mo6733b() {
        return this.f18139b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fbx)) {
            return false;
        }
        fbx fbx = (fbx) obj;
        if (this.f18138a.equals(fbx.mo6732a()) && this.f18139b.equals(fbx.mo6733b())) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f18138a.hashCode() ^ 1000003) * 1000003) ^ this.f18139b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f18138a);
        String valueOf2 = String.valueOf(this.f18139b);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 26) + String.valueOf(valueOf2).length());
        stringBuilder.append("AeState{aeMode=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", aeState=");
        stringBuilder.append(valueOf2);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
