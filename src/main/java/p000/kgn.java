package p000;

/* compiled from: PG */
/* renamed from: kgn */
public final class kgn extends keu {
    /* renamed from: a */
    public static final kgn f24941a = new kgn(new Object[0], 0, null, 0, 0);
    /* renamed from: b */
    private final transient Object[] f24942b;
    /* renamed from: c */
    private final transient Object[] f24943c;
    /* renamed from: d */
    private final transient int f24944d;
    /* renamed from: e */
    private final transient int f24945e;
    /* renamed from: f */
    private final transient int f24946f;

    kgn(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f24942b = objArr;
        this.f24943c = objArr2;
        this.f24944d = i2;
        this.f24945e = i;
        this.f24946f = i3;
    }

    public final boolean contains(Object obj) {
        Object[] objArr = this.f24943c;
        if (obj == null || objArr == null) {
            return false;
        }
        int b = khb.m4943b(obj);
        while (true) {
            b &= this.f24944d;
            Object obj2 = objArr[b];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            b++;
        }
    }

    /* renamed from: a */
    final int mo9832a(Object[] objArr, int i) {
        System.arraycopy(this.f24942b, 0, objArr, i, this.f24946f);
        return this.f24946f + i;
    }

    /* renamed from: e */
    final ken mo14003e() {
        return ken.m13716b(this.f24942b, this.f24946f);
    }

    public final int hashCode() {
        return this.f24945e;
    }

    /* renamed from: d */
    final boolean mo14002d() {
        return true;
    }

    /* renamed from: b */
    final boolean mo9836b() {
        return false;
    }

    /* renamed from: c */
    public final khy iterator() {
        return mo9833a().listIterator(0);
    }

    public final int size() {
        return this.f24946f;
    }
}
