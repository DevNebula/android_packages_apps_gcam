package p000;

/* compiled from: PG */
/* renamed from: djk */
final class djk implements kov {
    /* renamed from: a */
    private final /* synthetic */ dix f14118a;

    djk(dix dix) {
        this.f14118a = dix;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        synchronized (this.f14118a.f14097l) {
            String str = dix.f14082a;
            String valueOf = String.valueOf(th);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 61);
            stringBuilder.append("Failed when calling CamcorderRecordingSession#stopRecording: ");
            stringBuilder.append(valueOf);
            bli.m891b(str, stringBuilder.toString());
            this.f14118a.f14106u.mo7248a(null, hci.m11977a(), false);
            for (djm b : this.f14118a.f14101p) {
                b.mo5988b().mo15642a(th);
            }
            this.f14118a.f14101p.clear();
            dix dix = this.f14118a;
            dix.mo13038f();
            dix.mo13039g();
            if (this.f14118a.f14105t == djn.CLOSED) {
                return;
            }
            boolean z;
            if (this.f14118a.f14105t == djn.STOPPING_RECORDING) {
                z = true;
            } else {
                z = false;
            }
            jri.m13405b(z);
            this.f14118a.f14105t = djn.NO_RECORDING;
        }
    }

    /* renamed from: b_ */
    public final /* synthetic */ void mo10186b_(Object obj) {
        hku hku = (hku) obj;
        synchronized (this.f14118a.f14097l) {
            this.f14118a.mo13034b(hku);
            hkv hkv = this.f14118a.f14093h;
            hkv.f6681a.mo7472a(hip.VIDEO);
            hkv.f6681a.mo7473a(hkv.f6682b);
            if (this.f14118a.f14105t == djn.CLOSED) {
                return;
            }
            boolean z;
            if (this.f14118a.f14105t == djn.STOPPING_RECORDING) {
                z = true;
            } else {
                z = false;
            }
            jri.m13405b(z);
            this.f14118a.f14105t = djn.NO_RECORDING;
        }
    }
}
