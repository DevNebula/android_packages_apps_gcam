package p000;

/* compiled from: PG */
/* renamed from: fpe */
final class fpe implements kov {
    /* renamed from: a */
    private final /* synthetic */ kpw f18562a;
    /* renamed from: b */
    private final /* synthetic */ fpa f18563b;

    fpe(fpa fpa, kpw kpw) {
        this.f18563b = fpa;
        this.f18562a = kpw;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        synchronized (this.f18563b.f18550b) {
            fpa fpa = this.f18563b;
            fpa.f18552d--;
        }
        String str = fpa.f18549a;
        String valueOf = String.valueOf(this.f18563b.f18554f);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 30);
        stringBuilder.append("Secondary image saver ");
        stringBuilder.append(valueOf);
        stringBuilder.append(" failed!");
        bli.m892b(str, stringBuilder.toString(), th);
        this.f18562a.mo15642a(th);
        this.f18563b.f18551c.m2973a();
    }

    /* renamed from: b_ */
    public final void mo10186b_(Object obj) {
        bli.m894c(fpa.f18549a, "secondary onSuccess");
        this.f18563b.mo13268a(obj, this.f18562a);
    }
}
