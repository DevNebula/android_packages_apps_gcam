package p000;

/* compiled from: PG */
/* renamed from: kgg */
public final class kgg extends kee {
    /* renamed from: a */
    public static final kgg f24922a = new kgg();
    /* renamed from: b */
    private final transient int[] f24923b;
    /* renamed from: c */
    private final transient Object[] f24924c;
    /* renamed from: d */
    private final transient int f24925d;
    /* renamed from: e */
    private final transient int f24926e;
    /* renamed from: f */
    private final transient kgg f24927f;

    private kgg() {
        this.f24923b = null;
        this.f24924c = new Object[0];
        this.f24925d = 0;
        this.f24926e = 0;
        this.f24927f = this;
    }

    private kgg(int[] iArr, Object[] objArr, int i, kgg kgg) {
        this.f24923b = iArr;
        this.f24924c = objArr;
        this.f24925d = 1;
        this.f24926e = i;
        this.f24927f = kgg;
    }

    public kgg(Object[] objArr, int i) {
        int b;
        this.f24924c = objArr;
        this.f24926e = i;
        this.f24925d = 0;
        if (i >= 2) {
            b = keu.m13736b(i);
        } else {
            b = 0;
        }
        this.f24923b = kgi.m13759a(objArr, i, b, 0);
        this.f24927f = new kgg(kgi.m13759a(objArr, i, b, 1), objArr, i, this);
    }

    /* renamed from: f */
    final keu mo9859f() {
        return new kgj(this, this.f24924c, this.f24925d, this.f24926e);
    }

    /* renamed from: g */
    final keu mo9860g() {
        return new kgl(this, new kgm(this.f24924c, this.f24925d, this.f24926e));
    }

    public final Object get(Object obj) {
        return kgi.m13757a(this.f24923b, this.f24924c, this.f24926e, this.f24925d, obj);
    }

    /* renamed from: a */
    public final /* synthetic */ kcx mo9757a() {
        return this.f24927f;
    }

    /* renamed from: c */
    public final kee mo13986c() {
        return this.f24927f;
    }

    /* renamed from: i */
    final boolean mo9865i() {
        return false;
    }

    public final int size() {
        return this.f24926e;
    }
}
