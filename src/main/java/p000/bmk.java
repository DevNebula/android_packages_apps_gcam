package p000;

/* compiled from: PG */
/* renamed from: bmk */
public final class bmk implements ire {
    /* renamed from: a */
    private static final String f11532a = bli.m887a("ActvCamDevTrckr");
    /* renamed from: b */
    private final Object f11533b = new Object();
    /* renamed from: c */
    private iur f11534c;
    /* renamed from: d */
    private iur f11535d;

    bmk() {
    }

    /* renamed from: a */
    public final iur mo8859a() {
        iur iur;
        synchronized (this.f11533b) {
            iur = this.f11534c;
            if (iur != null) {
            } else {
                String str = f11532a;
                String valueOf = String.valueOf(this.f11535d);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 36);
                stringBuilder.append("Returning previously active camera: ");
                stringBuilder.append(valueOf);
                bli.m896d(str, stringBuilder.toString());
                iur = this.f11535d;
            }
        }
        return iur;
    }

    @Deprecated
    /* renamed from: b */
    public static ire m7635b() {
        return bml.f1346a;
    }

    /* renamed from: a */
    public final void mo8860a(iur iur) {
        synchronized (this.f11533b) {
            iur iur2 = this.f11534c;
            if (iur2 != null && iur2.equals(iur)) {
                this.f11535d = this.f11534c;
                this.f11534c = null;
            }
        }
    }

    /* renamed from: b */
    public final void mo8861b(iur iur) {
        synchronized (this.f11533b) {
            iur iur2 = this.f11534c;
            if (!(iur2 == null || iur2.equals(iur))) {
                this.f11535d = this.f11534c;
            }
            String str = f11532a;
            String valueOf = String.valueOf(this.f11534c);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 24);
            stringBuilder.append("Tracking active camera: ");
            stringBuilder.append(valueOf);
            bli.m896d(str, stringBuilder.toString());
            this.f11534c = iur;
        }
    }
}
