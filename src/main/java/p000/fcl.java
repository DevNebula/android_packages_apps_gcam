package p000;

/* compiled from: PG */
/* renamed from: fcl */
public final class fcl {
    /* renamed from: a */
    public final gig f4699a;
    /* renamed from: b */
    public final gih f4700b;
    /* renamed from: c */
    public final float f4701c;
    /* renamed from: d */
    public final boolean f4702d;
    /* renamed from: e */
    public final kbg f4703e;

    public fcl(gig gig, gih gih, float f, boolean z, kbg kbg) {
        this.f4699a = gig;
        this.f4700b = gih;
        this.f4701c = f;
        this.f4702d = z;
        this.f4703e = kbg;
    }

    public final boolean equals(Object obj) {
        boolean z = false;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fcl)) {
            return false;
        }
        fcl fcl = (fcl) obj;
        boolean z2 = this.f4699a == fcl.f4699a ? this.f4700b == fcl.f4700b ? this.f4701c == fcl.f4701c ? this.f4702d == fcl.f4702d : false : false : false;
        if (!this.f4703e.mo9709b()) {
            z = z2;
        } else if (!fcl.f4703e.mo9709b()) {
            z = z2;
        } else if (z2 && ((fcj) this.f4703e.mo9706a()).equals(fcl.f4703e.mo9706a())) {
            return true;
        }
        return z;
    }

    public final int hashCode() {
        return ((((((this.f4699a.f5471e + 527) * 31) + this.f4700b.f5481i) * 31) + Float.floatToIntBits(this.f4701c)) * 31) + this.f4702d;
    }

    /* renamed from: a */
    public static fcl m2302a() {
        return new fcl(gig.OFF, gih.INACTIVE, 0.0f, false, kau.f21835a);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f4699a);
        String valueOf2 = String.valueOf(this.f4700b);
        float f = this.f4701c;
        boolean z = this.f4702d;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 97) + String.valueOf(valueOf2).length());
        stringBuilder.append("{controlAfMode=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", controlAfState=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", lensFocusDistance=");
        stringBuilder.append(f);
        stringBuilder.append(", isSceneChangeDetected=");
        stringBuilder.append(z);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
