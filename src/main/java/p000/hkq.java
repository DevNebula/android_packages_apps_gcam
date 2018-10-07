package p000;

/* compiled from: PG */
/* renamed from: hkq */
public final class hkq implements kov {
    /* renamed from: a */
    private final /* synthetic */ hkk f20185a;

    public hkq(hkk hkk) {
        this.f20185a = hkk;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        String str = hkk.f6656a;
        String valueOf = String.valueOf(th);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 36);
        stringBuilder.append("CamcorderSnapshot is not available: ");
        stringBuilder.append(valueOf);
        bli.m891b(str, stringBuilder.toString());
        this.f20185a.f6660e.mo7935d(true);
    }

    /* renamed from: b_ */
    public final /* synthetic */ void mo10186b_(Object obj) {
        bju bju = (bju) obj;
        String str = hkk.f6656a;
        String valueOf = String.valueOf(bju.f1242b);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 37);
        stringBuilder.append("CamcorderSnapshot is available: file=");
        stringBuilder.append(valueOf);
        bli.m888a(str, stringBuilder.toString());
        this.f20185a.f6661f.add(bju);
        this.f20185a.f6660e.mo7935d(true);
    }
}
