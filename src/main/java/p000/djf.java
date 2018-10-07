package p000;

/* compiled from: PG */
/* renamed from: djf */
final class djf implements kov {
    /* renamed from: a */
    private final /* synthetic */ dix f14114a;

    djf(dix dix) {
        this.f14114a = dix;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
    }

    /* renamed from: b_ */
    public final /* synthetic */ void mo10186b_(Object obj) {
        bgl bgl;
        boolean z;
        hku hku = (hku) obj;
        if (hku.f6679a.isEmpty()) {
            bgl = null;
        } else {
            bgl = (bgl) hku.f6679a.get(0);
        }
        if (bgl == null) {
            z = false;
        } else {
            if (bgl.f1161a.length() >= 3700000000L) {
                z = true;
            } else {
                z = false;
            }
            String str = dix.f14082a;
            long length = bgl.f1161a.length();
            StringBuilder stringBuilder = new StringBuilder(58);
            stringBuilder.append("Video file size onMaxFileSizeReached: ");
            stringBuilder.append(length);
            bli.m894c(str, stringBuilder.toString());
        }
        if (z) {
            hkv hkv = this.f14114a.f14093h;
            hkv.f6687g.mo13122c(false);
            hkv.f6688h = hkv.f6683c.mo7442b(hkv.mo7927a());
            hkv.mo7934d();
            return;
        }
        this.f14114a.f14093h.mo7931b(false);
    }
}
