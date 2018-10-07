package p000;

/* compiled from: PG */
/* renamed from: irg */
public final class irg implements iri {
    /* renamed from: a */
    public final kpw f21215a = kpw.m18486d();
    /* renamed from: b */
    private final ikb f21216b = new ikb();
    /* renamed from: c */
    private final iur f21217c;

    public irg(iur iur) {
        this.f21217c = iur;
    }

    public irg(iur iur, iqo iqo) {
        this.f21217c = iur;
        this.f21216b.mo8557a(iqo);
    }

    /* renamed from: a */
    public final void mo8871a() {
        if (!this.f21215a.isDone()) {
            knk knk = this.f21215a;
            String valueOf = String.valueOf(this.f21217c);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 31);
            stringBuilder.append("Camera device ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" has been closed.");
            knk.mo15642a(new isr(stringBuilder.toString()));
        }
        this.f21216b.close();
    }

    /* renamed from: b */
    public final void mo8874b() {
        if (!this.f21215a.isDone()) {
            knk knk = this.f21215a;
            String valueOf = String.valueOf(this.f21217c);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 37);
            stringBuilder.append("Camera device ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" has been disconnected.");
            knk.mo15642a(new isr(stringBuilder.toString()));
        }
        this.f21216b.close();
    }

    /* renamed from: a */
    public final void mo8872a(int i) {
        if (!this.f21215a.isDone()) {
            knk knk = this.f21215a;
            String valueOf = String.valueOf(this.f21217c);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 45);
            stringBuilder.append("Camera device ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" encountered error: ");
            stringBuilder.append(i);
            knk.mo15642a(new isr(stringBuilder.toString()));
        }
        this.f21216b.close();
    }

    /* renamed from: a */
    public final void mo8873a(iwl iwl) {
        this.f21215a.mo15641a((Object) iwl);
    }
}
