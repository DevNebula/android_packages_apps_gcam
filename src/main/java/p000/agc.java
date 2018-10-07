package p000;

import java.security.MessageDigest;
import java.util.Map;

/* compiled from: PG */
/* renamed from: agc */
public final class agc implements adl {
    /* renamed from: b */
    private final Object f10242b;
    /* renamed from: c */
    private final int f10243c;
    /* renamed from: d */
    private final int f10244d;
    /* renamed from: e */
    private final Class f10245e;
    /* renamed from: f */
    private final Class f10246f;
    /* renamed from: g */
    private final adl f10247g;
    /* renamed from: h */
    private final Map f10248h;
    /* renamed from: i */
    private final adp f10249i;
    /* renamed from: j */
    private int f10250j;

    public agc(Object obj, adl adl, int i, int i2, Map map, Class cls, Class cls2, adp adp) {
        this.f10242b = aqe.m610a(obj, "Argument must not be null");
        this.f10247g = (adl) aqe.m610a((Object) adl, "Signature must not be null");
        this.f10243c = i;
        this.f10244d = i2;
        this.f10248h = (Map) aqe.m610a((Object) map, "Argument must not be null");
        this.f10245e = (Class) aqe.m610a((Object) cls, "Resource class must not be null");
        this.f10246f = (Class) aqe.m610a((Object) cls2, "Transcode class must not be null");
        this.f10249i = (adp) aqe.m610a((Object) adp, "Argument must not be null");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof agc)) {
            return false;
        }
        agc agc = (agc) obj;
        if (this.f10242b.equals(agc.f10242b) && this.f10247g.equals(agc.f10247g) && this.f10244d == agc.f10244d && this.f10243c == agc.f10243c && this.f10248h.equals(agc.f10248h) && this.f10245e.equals(agc.f10245e) && this.f10246f.equals(agc.f10246f) && this.f10249i.equals(agc.f10249i)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (this.f10250j == 0) {
            this.f10250j = this.f10242b.hashCode();
            this.f10250j = (this.f10250j * 31) + this.f10247g.hashCode();
            this.f10250j = (this.f10250j * 31) + this.f10243c;
            this.f10250j = (this.f10250j * 31) + this.f10244d;
            this.f10250j = (this.f10250j * 31) + this.f10248h.hashCode();
            this.f10250j = (this.f10250j * 31) + this.f10245e.hashCode();
            this.f10250j = (this.f10250j * 31) + this.f10246f.hashCode();
            this.f10250j = (this.f10250j * 31) + this.f10249i.hashCode();
        }
        return this.f10250j;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f10242b);
        int i = this.f10243c;
        int i2 = this.f10244d;
        String valueOf2 = String.valueOf(this.f10245e);
        String valueOf3 = String.valueOf(this.f10246f);
        String valueOf4 = String.valueOf(this.f10247g);
        int i3 = this.f10250j;
        String valueOf5 = String.valueOf(this.f10248h);
        String valueOf6 = String.valueOf(this.f10249i);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(valueOf4).length();
        StringBuilder stringBuilder = new StringBuilder((((((length + 151) + length2) + length3) + length4) + String.valueOf(valueOf5).length()) + String.valueOf(valueOf6).length());
        stringBuilder.append("EngineKey{model=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", width=");
        stringBuilder.append(i);
        stringBuilder.append(", height=");
        stringBuilder.append(i2);
        stringBuilder.append(", resourceClass=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", transcodeClass=");
        stringBuilder.append(valueOf3);
        stringBuilder.append(", signature=");
        stringBuilder.append(valueOf4);
        stringBuilder.append(", hashCode=");
        stringBuilder.append(i3);
        stringBuilder.append(", transformations=");
        stringBuilder.append(valueOf5);
        stringBuilder.append(", options=");
        stringBuilder.append(valueOf6);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public final void mo172a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }
}
