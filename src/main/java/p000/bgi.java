package p000;

/* compiled from: PG */
/* renamed from: bgi */
final class bgi implements koj {
    /* renamed from: a */
    private final /* synthetic */ bgb f11289a;

    bgi(bgb bgb) {
        this.f11289a = bgb;
    }

    /* renamed from: a */
    private final kpk m7434a(Boolean bool) {
        kpk a;
        synchronized (this.f11289a.f22691d) {
            String valueOf;
            StringBuilder stringBuilder;
            if (this.f11289a.f22694g.equals(bgj.STOPPING_RECORD)) {
                this.f11289a.f22694g = bgj.CLOSED;
                long currentTimeMillis = System.currentTimeMillis();
                this.f11289a.f22692e.close();
                if (!bool.booleanValue()) {
                    if (this.f11289a.f22690c.length() <= 0) {
                        if (this.f11289a.f22690c != null) {
                            String str = bgb.f22688a;
                            valueOf = String.valueOf(this.f11289a.f22690c);
                            stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 23);
                            stringBuilder.append("Delete recording file: ");
                            stringBuilder.append(valueOf);
                            bli.m894c(str, stringBuilder.toString());
                            if (!this.f11289a.f22690c.delete()) {
                                str = bgb.f22688a;
                                valueOf = String.valueOf(this.f11289a.f22690c);
                                stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 33);
                                stringBuilder.append("Failed to delete recording file: ");
                                stringBuilder.append(valueOf);
                                bli.m891b(str, stringBuilder.toString());
                            }
                        }
                        a = kow.m13873a(this.f11289a.f22693f);
                    }
                }
                bgb bgb = this.f11289a;
                bgb.mo14563a(bgb.f22690c, currentTimeMillis);
                a = kow.m13873a(this.f11289a.f22693f);
            } else {
                valueOf = String.valueOf(this.f11289a.f22694g);
                stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 36);
                stringBuilder.append("CamcorderRecordingSessionImpl state=");
                stringBuilder.append(valueOf);
                a = kow.m13874a(new IllegalStateException(stringBuilder.toString()));
            }
        }
        return a;
    }
}
