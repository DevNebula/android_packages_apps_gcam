package p000;

/* compiled from: PG */
/* renamed from: hpm */
class hpm extends hpe {
    /* renamed from: a */
    private final /* synthetic */ hpf f26489a;

    hpm(hpf hpf) {
        this.f26489a = hpf;
    }

    /* renamed from: a */
    public final void mo7343a() {
        boolean z;
        if (this.f26489a.f26485t != 0.0f) {
            z = true;
        } else {
            z = false;
        }
        jri.m13396a(z, (Object) "max zoom value hasn't been initialized properly");
        if (this.f26489a.f26486u != 0.0f) {
            z = true;
        } else {
            z = false;
        }
        jri.m13396a(z, (Object) "min zoom value hasn't been initialized properly");
        hpf hpf = this.f26489a;
        float f = hpf.f26486u;
        f *= (float) Math.sqrt((double) (hpf.f26485t / f));
        float floatValue = ((Float) this.f26489a.f26476k.mo13673b()).floatValue();
        hpf hpf2 = this.f26489a;
        float f2 = hpf2.f26486u;
        if (floatValue != f2) {
            f = f2;
        }
        if (f == f2) {
            hpf2.f26468a.mo8878a(9);
        } else {
            hpf2.f26468a.mo8878a(8);
        }
        this.f26489a.f26482q.setFloatValues(new float[]{((Float) hpf.f26476k.mo13673b()).floatValue(), f});
        this.f26489a.f26482q.start();
    }

    /* renamed from: b */
    public final void mo7344b() {
        this.f26489a.f26482q.cancel();
    }

    /* renamed from: e */
    public void mo13438e() {
        this.f26489a.f26479n.reverse();
    }

    /* renamed from: aj */
    public void mo14943aj() {
    }
}
