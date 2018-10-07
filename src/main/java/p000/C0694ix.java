package p000;

/* compiled from: PG */
/* renamed from: ix */
public class C0694ix implements C0300iw {
    /* renamed from: a */
    private final Object[] f21337a;
    /* renamed from: b */
    private int f21338b;

    public C0694ix(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f21337a = new Object[i];
    }

    /* renamed from: a */
    public Object mo9113a() {
        int i = this.f21338b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f21337a;
        Object obj = objArr[i2];
        objArr[i2] = null;
        this.f21338b = i2;
        return obj;
    }

    /* renamed from: a */
    public boolean mo9114a(Object obj) {
        int i;
        boolean z;
        int i2 = 0;
        while (true) {
            i = this.f21338b;
            if (i2 < i) {
                if (this.f21337a[i2] == obj) {
                    z = true;
                    break;
                }
                i2++;
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            throw new IllegalStateException("Already in the pool!");
        }
        Object[] objArr = this.f21337a;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = obj;
        this.f21338b = i + 1;
        return true;
    }
}
