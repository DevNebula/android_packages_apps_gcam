package p000;

/* compiled from: PG */
/* renamed from: imx */
public final class imx {
    /* renamed from: a */
    private Boolean f7464a;
    /* renamed from: b */
    private Boolean f7465b;
    /* renamed from: c */
    private Boolean f7466c;
    /* renamed from: d */
    private Boolean f7467d;
    /* renamed from: e */
    private Boolean f7468e;
    /* renamed from: f */
    private Boolean f7469f;
    /* renamed from: g */
    private Boolean f7470g;

    imx(byte b) {
        this();
    }

    /* renamed from: a */
    public final imw mo8616a() {
        String str = "";
        if (this.f7464a == null) {
            str = String.valueOf(str).concat(" sessionShouldUseAeTargetFps");
        }
        if (this.f7465b == null) {
            str = String.valueOf(str).concat(" shouldContinuousAutoFocusOnDuringRecording");
        }
        if (this.f7466c == null) {
            str = String.valueOf(str).concat(" shouldUnlockAfAeWithSceneChange");
        }
        if (this.f7467d == null) {
            str = String.valueOf(str).concat(" shouldDetectFace");
        }
        if (this.f7468e == null) {
            str = String.valueOf(str).concat(" shouldVideoStabilizationOn");
        }
        if (this.f7469f == null) {
            str = String.valueOf(str).concat(" useOpticalStabilization");
        }
        if (this.f7470g == null) {
            str = String.valueOf(str).concat(" useGoogLlv");
        }
        if (str.isEmpty()) {
            return new imv(this.f7464a.booleanValue(), this.f7465b.booleanValue(), this.f7466c.booleanValue(), this.f7467d.booleanValue(), this.f7468e.booleanValue(), this.f7469f.booleanValue(), this.f7470g.booleanValue());
        }
        str = String.valueOf(str);
        String str2 = "Missing required properties:";
        if (str.length() == 0) {
            str = new String(str2);
        } else {
            str = str2.concat(str);
        }
        throw new IllegalStateException(str);
    }

    /* renamed from: a */
    public final imx mo8617a(boolean z) {
        this.f7464a = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: b */
    public final imx mo8618b(boolean z) {
        this.f7465b = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: c */
    public final imx mo8619c(boolean z) {
        this.f7467d = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: d */
    public final imx mo8620d(boolean z) {
        this.f7466c = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: e */
    public final imx mo8621e(boolean z) {
        this.f7468e = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: f */
    public final imx mo8622f(boolean z) {
        this.f7470g = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: g */
    public final imx mo8623g(boolean z) {
        this.f7469f = Boolean.valueOf(z);
        return this;
    }
}
