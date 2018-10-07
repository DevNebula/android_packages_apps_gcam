package p000;

import java.util.Arrays;

/* compiled from: PG */
/* renamed from: cwc */
public final class cwc {
    /* renamed from: a */
    public final iur f3020a;
    /* renamed from: b */
    public final iut f3021b;
    /* renamed from: c */
    public final iqp f3022c;
    /* renamed from: d */
    public final heo f3023d;
    /* renamed from: e */
    private final ipz f3024e;

    public cwc(iur iur, iut iut, ipz ipz, iqp iqp, heo heo) {
        this.f3020a = (iur) jri.m13404b((Object) iur);
        this.f3021b = (iut) jri.m13404b((Object) iut);
        this.f3024e = (ipz) jri.m13404b((Object) ipz);
        this.f3022c = (iqp) jri.m13404b((Object) iqp);
        this.f3023d = (heo) jri.m13404b((Object) heo);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof cwc)) {
            return false;
        }
        cwc cwc = (cwc) obj;
        if (kbf.m16778b(this.f3020a, cwc.f3020a) && kbf.m16778b(this.f3021b, cwc.f3021b) && kbf.m16778b(this.f3024e, cwc.f3024e) && kbf.m16778b(this.f3022c, cwc.f3022c) && kbf.m16778b(this.f3023d, cwc.f3023d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3020a, this.f3021b, this.f3024e, this.f3022c, this.f3023d});
    }

    public final String toString() {
        return jqk.m13351b("ActiveModuleConfig").mo9703a("cameraId", this.f3020a).mo9703a("cameraFacing", this.f3021b).mo9703a("aspectRatio", this.f3024e).mo9703a("captureResolution", this.f3022c).mo9703a("viewfinderConfig", this.f3023d).toString();
    }
}
