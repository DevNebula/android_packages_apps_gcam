package p000;

/* compiled from: PG */
/* renamed from: imv */
final class imv extends imw {
    /* renamed from: a */
    private final boolean f21070a;
    /* renamed from: b */
    private final boolean f21071b;
    /* renamed from: c */
    private final boolean f21072c;
    /* renamed from: d */
    private final boolean f21073d;
    /* renamed from: e */
    private final boolean f21074e;
    /* renamed from: f */
    private final boolean f21075f;
    /* renamed from: g */
    private final boolean f21076g;

    imv(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.f21070a = z;
        this.f21071b = z2;
        this.f21072c = z3;
        this.f21073d = z4;
        this.f21074e = z5;
        this.f21075f = z6;
        this.f21076g = z7;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof imw)) {
            return false;
        }
        imw imw = (imw) obj;
        if (this.f21070a == imw.mo8609a() && this.f21071b == imw.mo8610b() && this.f21072c == imw.mo8612d() && this.f21073d == imw.mo8611c() && this.f21074e == imw.mo8613e() && this.f21075f == imw.mo8615g() && this.f21076g == imw.mo8614f()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 1237;
        if (this.f21070a) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i3 = (i ^ 1000003) * 1000003;
        if (this.f21071b) {
            i = 1231;
        } else {
            i = 1237;
        }
        i3 = (i ^ i3) * 1000003;
        if (this.f21072c) {
            i = 1231;
        } else {
            i = 1237;
        }
        i3 = (i ^ i3) * 1000003;
        if (this.f21073d) {
            i = 1231;
        } else {
            i = 1237;
        }
        i3 = (i ^ i3) * 1000003;
        if (this.f21074e) {
            i = 1231;
        } else {
            i = 1237;
        }
        i3 = (i ^ i3) * 1000003;
        if (this.f21075f) {
            i = 1231;
        } else {
            i = 1237;
        }
        i = (i ^ i3) * 1000003;
        if (this.f21076g) {
            i2 = 1231;
        }
        return i ^ i2;
    }

    /* renamed from: a */
    public final boolean mo8609a() {
        return this.f21070a;
    }

    /* renamed from: b */
    public final boolean mo8610b() {
        return this.f21071b;
    }

    /* renamed from: c */
    public final boolean mo8611c() {
        return this.f21073d;
    }

    /* renamed from: d */
    public final boolean mo8612d() {
        return this.f21072c;
    }

    /* renamed from: e */
    public final boolean mo8613e() {
        return this.f21074e;
    }

    public final String toString() {
        boolean z = this.f21070a;
        boolean z2 = this.f21071b;
        boolean z3 = this.f21072c;
        boolean z4 = this.f21073d;
        boolean z5 = this.f21074e;
        boolean z6 = this.f21075f;
        boolean z7 = this.f21076g;
        StringBuilder stringBuilder = new StringBuilder(252);
        stringBuilder.append("CamcorderCameraConfig{sessionShouldUseAeTargetFps=");
        stringBuilder.append(z);
        stringBuilder.append(", shouldContinuousAutoFocusOnDuringRecording=");
        stringBuilder.append(z2);
        stringBuilder.append(", shouldUnlockAfAeWithSceneChange=");
        stringBuilder.append(z3);
        stringBuilder.append(", shouldDetectFace=");
        stringBuilder.append(z4);
        stringBuilder.append(", shouldVideoStabilizationOn=");
        stringBuilder.append(z5);
        stringBuilder.append(", useOpticalStabilization=");
        stringBuilder.append(z6);
        stringBuilder.append(", useGoogLlv=");
        stringBuilder.append(z7);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    /* renamed from: f */
    public final boolean mo8614f() {
        return this.f21076g;
    }

    /* renamed from: g */
    public final boolean mo8615g() {
        return this.f21075f;
    }
}
