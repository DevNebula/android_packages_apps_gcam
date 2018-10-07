package p000;

/* compiled from: PG */
/* renamed from: djh */
final class djh implements kov {
    /* renamed from: a */
    private final /* synthetic */ djg f14115a;

    djh(djg djg) {
        this.f14115a = djg;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        synchronized (this.f14115a.f3302a.f14097l) {
            if (this.f14115a.f3302a.f14105t == djn.NO_RECORDING) {
                return;
            }
            bli.m892b(dix.f14082a, "Failed to startRecording: ", th);
            this.f14115a.f3302a.f14093h.mo7933c(true);
            dix dix = this.f14115a.f3302a;
            dix.mo13038f();
            dix.mo13039g();
            this.f14115a.f3302a.f14105t = djn.NO_RECORDING;
        }
    }

    /* renamed from: b_ */
    public final /* synthetic */ void mo10186b_(Object obj) {
        bfr bfr = (bfr) obj;
        synchronized (this.f14115a.f3302a.f14097l) {
            if (this.f14115a.f3302a.f14105t != djn.CLOSED) {
                dix dix = this.f14115a.f3302a;
                hks hks = dix.f14103r;
                dix.f14102q = new hkk((ikd) hks.m3286a((ikd) hks.f6675a.mo10566a(), 1), (hke) hks.m3286a((hke) hks.f6676b.mo10566a(), 2), (gpn) hks.m3286a((gpn) hks.f6677c.mo10566a(), 3), (gtx) hks.m3286a((gtx) hks.f6678d.mo10566a(), 4), (bfr) hks.m3286a(bfr, 5), (hkv) hks.m3286a(dix.f14093h, 6), (gxz) hks.m3286a(dix.f14084B, 7), (hkw) hks.m3286a(this.f14115a.f3302a.f14099n, 8));
                this.f14115a.f3302a.f14105t = djn.RECORDING;
                this.f14115a.f3302a.f14093h.f6687g.mo13122c(true);
                return;
            }
            bli.m894c(dix.f14082a, "this object has been closed during STARTING_RECORDING");
            dix dix2 = this.f14115a.f3302a;
            dix2.mo13038f();
            dix2.mo13039g();
        }
    }
}
