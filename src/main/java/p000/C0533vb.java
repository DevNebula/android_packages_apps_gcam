package p000;

/* compiled from: PG */
/* renamed from: vb */
public final class C0533vb {
    /* renamed from: a */
    public int f9903a = 0;
    /* renamed from: b */
    public int f9904b = 0;
    /* renamed from: c */
    public int f9905c = kvl.UNSET_ENUM_VALUE;
    /* renamed from: d */
    public int f9906d = kvl.UNSET_ENUM_VALUE;
    /* renamed from: e */
    public int f9907e = 0;
    /* renamed from: f */
    public int f9908f = 0;
    /* renamed from: g */
    public boolean f9909g = false;
    /* renamed from: h */
    public boolean f9910h = false;

    /* renamed from: a */
    public final void mo11380a(int i, int i2) {
        this.f9905c = i;
        this.f9906d = i2;
        this.f9910h = true;
        if (this.f9909g) {
            if (i2 != kvl.UNSET_ENUM_VALUE) {
                this.f9903a = i2;
            }
            if (i != kvl.UNSET_ENUM_VALUE) {
                this.f9904b = i;
                return;
            }
            return;
        }
        if (i != kvl.UNSET_ENUM_VALUE) {
            this.f9903a = i;
        }
        if (i2 != kvl.UNSET_ENUM_VALUE) {
            this.f9904b = i2;
        }
    }
}
