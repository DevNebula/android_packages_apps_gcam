package p000;

/* compiled from: PG */
/* renamed from: ezl */
public final class ezl implements iqo {
    /* renamed from: a */
    public final evn f18071a;

    public ezl(evn evn) {
        this.f18071a = evn;
    }

    /* renamed from: a */
    public final void mo13203a() {
        this.f18071a.f4508d.cancel(false);
        this.f18071a.f4510f.cancel(false);
        this.f18071a.f4509e.cancel(false);
    }

    public final void close() {
    }

    /* renamed from: b */
    public final boolean mo13205b() {
        if (this.f18071a.f4508d.isDone() && this.f18071a.f4509e.isDone() && this.f18071a.f4511g) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo13204a(ezl ezl) {
        if (ezl.f18071a.f4507c <= this.f18071a.f4507c) {
            return false;
        }
        if (!ezl.f18071a.f4508d.isDone() || this.f18071a.f4508d.isDone()) {
            return false;
        }
        return true;
    }
}
