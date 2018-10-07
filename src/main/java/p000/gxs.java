package p000;

/* compiled from: PG */
/* renamed from: gxs */
public final class gxs extends gxy {
    /* renamed from: a */
    private final gxw f19815a;
    /* renamed from: b */
    private final gxv f19816b;
    /* renamed from: c */
    private final gyh f19817c;

    public gxs(gxw gxw, gxv gxv, gyh gyh) {
        if (gxw == null) {
            throw new NullPointerException("Null constraints");
        }
        this.f19815a = gxw;
        if (gxv == null) {
            throw new NullPointerException("Null boxes");
        }
        this.f19816b = gxv;
        this.f19817c = gyh;
    }

    /* renamed from: a */
    public final gxv mo7529a() {
        return this.f19816b;
    }

    /* renamed from: b */
    public final gxw mo7530b() {
        return this.f19815a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gxy)) {
            return false;
        }
        gxy gxy = (gxy) obj;
        if (this.f19815a.equals(gxy.mo7530b()) && this.f19816b.equals(gxy.mo7529a())) {
            gyh gyh = this.f19817c;
            if (gyh != null) {
                if (gyh.equals(gxy.mo7531c())) {
                    return true;
                }
            } else if (gxy.mo7531c() == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (((this.f19815a.hashCode() ^ 1000003) * 1000003) ^ this.f19816b.hashCode()) * 1000003;
        gyh gyh = this.f19817c;
        if (gyh != null) {
            hashCode = gyh.hashCode();
        } else {
            hashCode = 0;
        }
        return hashCode ^ hashCode2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f19815a);
        String valueOf2 = String.valueOf(this.f19816b);
        String valueOf3 = String.valueOf(this.f19817c);
        int length = String.valueOf(valueOf).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 57) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length());
        stringBuilder.append("CameraLayoutHolder{constraints=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", boxes=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", viewfinderSpec=");
        stringBuilder.append(valueOf3);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* renamed from: c */
    public final gyh mo7531c() {
        return this.f19817c;
    }
}
