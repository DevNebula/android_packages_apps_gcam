package p000;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: heo */
public final class heo {
    /* renamed from: a */
    public final iqp f6471a;
    /* renamed from: b */
    public final ipz f6472b;
    /* renamed from: c */
    private final iut f6473c;

    public heo(iut iut, iqp iqp, ipz ipz) {
        this.f6473c = iut;
        this.f6471a = iqp;
        this.f6472b = ipz;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof heo)) {
            return false;
        }
        heo heo = (heo) obj;
        if (kbf.m16778b(this.f6473c, heo.f6473c) && kbf.m16778b(this.f6472b, heo.f6472b) && kbf.m16778b(this.f6471a, heo.f6471a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f6473c, this.f6472b, this.f6471a});
    }

    public final String toString() {
        return jqk.m13351b("ViewfinderConfig").mo9703a("cameraFacing", this.f6473c).mo9703a("viewfinderAspectRatio", this.f6472b).mo9703a("viewfinderResolution", this.f6471a).toString();
    }
}
