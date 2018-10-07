package p000;

/* compiled from: PG */
/* renamed from: ksa */
public final class ksa extends krz implements ktg {
    public ksa() {
        this(hqg.f26751c);
    }

    private ksa(ksb ksb) {
        super((kry) ksb);
    }

    public ksa(byte b) {
        this(hqp.f26756c);
    }

    /* renamed from: i */
    private final ksb m18428i() {
        if (this.f26610c) {
            return (ksb) this.f26609b;
        }
        ((ksb) this.f26609b).f26750g.mo10273d();
        return (ksb) super.mo14192g();
    }

    /* renamed from: h */
    public final void mo15674h() {
        if (this.f26610c) {
            super.mo15674h();
            ((ksb) this.f26609b).f26750g = ((ksb) this.f26609b).f26750g.clone();
        }
    }

    /* renamed from: a */
    public final ksa mo15746a(int i) {
        mo15674h();
        hqg hqg = (hqg) this.f26609b;
        hqg.f26753a |= 1;
        hqg.f26754b = i;
        return this;
    }

    /* renamed from: a */
    public final ksa mo15747a(krl krl, Object obj) {
        krl a = kry.m18191a(krl);
        if (a.f8805a != this.f26608a) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
        mo15674h();
        krr krr = ((ksb) this.f26609b).f26750g;
        if (krr.f8819b) {
            krr a2 = krr.clone();
            ((ksb) this.f26609b).f26750g = a2;
            krr = a2;
        }
        krs krs = a.f8808d;
        if (a.f8808d.f8823c.f8982d == gcb.f5298j) {
            obj = Integer.valueOf(((kse) obj).mo10277a());
        }
        krr.mo10269b(krs, obj);
        return this;
    }
}
