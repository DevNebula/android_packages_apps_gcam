package p000;

/* compiled from: PG */
/* renamed from: fpd */
final class fpd implements kov {
    /* renamed from: a */
    private final /* synthetic */ kpw f18559a;
    /* renamed from: b */
    private final /* synthetic */ Object f18560b;
    /* renamed from: c */
    private final /* synthetic */ fpa f18561c;

    fpd(fpa fpa, kpw kpw, Object obj) {
        this.f18561c = fpa;
        this.f18559a = kpw;
        this.f18560b = obj;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        String str = fpa.f18549a;
        String valueOf = String.valueOf(this.f18561c.f18553e);
        String valueOf2 = String.valueOf(this.f18561c.f18554f);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(valueOf).length() + 56) + String.valueOf(valueOf2).length());
        stringBuilder.append("Primary image saver ");
        stringBuilder.append(valueOf);
        stringBuilder.append(" failed, falling back to secondary: ");
        stringBuilder.append(valueOf2);
        bli.m899e(str, stringBuilder.toString(), th);
        this.f18561c.mo13269b(this.f18560b, this.f18559a);
    }

    /* renamed from: b_ */
    public final void mo10186b_(Object obj) {
        this.f18561c.mo13268a(obj, this.f18559a);
    }
}
