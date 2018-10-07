package p000;

/* compiled from: PG */
/* renamed from: bfz */
final class bfz implements koj {
    /* renamed from: a */
    private final /* synthetic */ bft f11276a;

    bfz(bft bft) {
        this.f11276a = bft;
    }

    /* renamed from: a */
    private final kpk m7418a(Boolean bool) {
        kpk a;
        synchronized (this.f11276a.f22668g) {
            String valueOf;
            StringBuilder stringBuilder;
            if (this.f11276a.f22671j.equals(bga.STOPPING_RECORD)) {
                this.f11276a.f22671j = bga.CLOSED;
                hke hke = this.f11276a.f22667f;
                long currentTimeMillis = System.currentTimeMillis();
                this.f11276a.f22669h.close();
                if (!bool.booleanValue()) {
                    if (this.f11276a.f22665d.length() <= 0) {
                        String str = bft.f22658a;
                        valueOf = String.valueOf(this.f11276a.f22665d);
                        stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 23);
                        stringBuilder.append("Delete recording file: ");
                        stringBuilder.append(valueOf);
                        bli.m894c(str, stringBuilder.toString());
                        if (!this.f11276a.f22665d.delete()) {
                            str = bft.f22658a;
                            valueOf = String.valueOf(this.f11276a.f22665d);
                            stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 33);
                            stringBuilder.append("Failed to delete recording file: ");
                            stringBuilder.append(valueOf);
                            bli.m891b(str, stringBuilder.toString());
                        }
                        a = kow.m13873a(this.f11276a.f22670i);
                    }
                }
                bft bft = this.f11276a;
                bft.mo14562a(bft.f22665d, currentTimeMillis);
                a = kow.m13873a(this.f11276a.f22670i);
            } else {
                valueOf = String.valueOf(this.f11276a.f22671j);
                stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 36);
                stringBuilder.append("CamcorderRecordingSessionImpl state=");
                stringBuilder.append(valueOf);
                a = kow.m13874a(new IllegalStateException(stringBuilder.toString()));
            }
        }
        return a;
    }
}
