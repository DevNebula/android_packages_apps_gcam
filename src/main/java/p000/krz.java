package p000;

/* compiled from: PG */
/* renamed from: krz */
public class krz extends kqp {
    /* renamed from: a */
    public final kry f26608a;
    /* renamed from: b */
    public kry f26609b;
    /* renamed from: c */
    public boolean f26610c;

    public krz() {
        this(hqi.f26678c);
    }

    public krz(byte b) {
        this(hqk.f26682c);
    }

    public krz(kry kry) {
        this.f26608a = kry;
        this.f26609b = (kry) kry.mo15667a(C0252go.f5879bY, null);
        this.f26610c = false;
    }

    public krz(char c) {
        this(hqm.f26686c);
    }

    /* renamed from: b */
    public final kry mo14191c() {
        boolean z;
        Object e = mo14192g();
        boolean booleanValue = Boolean.TRUE.booleanValue();
        byte byteValue = ((Byte) e.mo15667a(C0252go.f5876bV, null)).byteValue();
        if (byteValue == (byte) 1) {
            z = true;
        } else if (byteValue == (byte) 0) {
            z = false;
        } else {
            boolean c = kto.f8910a.mo10315a(e).mo10367c(e);
            if (booleanValue) {
                Object obj;
                if (c) {
                    obj = e;
                } else {
                    obj = null;
                }
                e.mo15667a(C0252go.f5877bW, obj);
                z = c;
            } else {
                z = c;
            }
        }
        if (z) {
            return e;
        }
        throw new jdh();
    }

    /* renamed from: e */
    public kry mo14192g() {
        if (this.f26610c) {
            return this.f26609b;
        }
        Object obj = this.f26609b;
        kto.f8910a.mo10315a(obj).mo10368d(obj);
        this.f26610c = true;
        return this.f26609b;
    }

    /* renamed from: i */
    private final krz m18207i() {
        krz krz = (krz) this.f26608a.mo15667a(C0252go.f5880bZ, null);
        krz.mo15158a(mo14192g());
        return krz;
    }

    /* renamed from: h */
    public void mo15674h() {
        if (this.f26610c) {
            kry kry = (kry) this.f26609b.mo15667a(C0252go.f5879bY, null);
            krz.m18206a(kry, this.f26609b);
            this.f26609b = kry;
            this.f26610c = false;
        }
    }

    /* renamed from: d */
    public final /* synthetic */ kte mo10312d() {
        return this.f26608a;
    }

    /* renamed from: f */
    public final boolean mo10313f() {
        return kry.m18196a(this.f26609b);
    }

    /* renamed from: a */
    public final krz mo15158a(kry kry) {
        mo15674h();
        krz.m18206a(this.f26609b, kry);
        return this;
    }

    /* renamed from: a */
    private static void m18206a(kry kry, kry kry2) {
        kto.f8910a.mo10315a((Object) kry).mo10366b(kry, kry2);
    }
}
