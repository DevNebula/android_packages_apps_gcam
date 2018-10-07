package p000;

/* compiled from: PG */
/* renamed from: cqy */
public final class cqy {
    /* renamed from: a */
    public cqz f2779a = null;
    /* renamed from: b */
    public cqz f2780b = null;
    /* renamed from: c */
    public int f2781c = 0;

    /* renamed from: a */
    public final cra mo5672a(cra cra, Object obj) {
        cqz cqz = new cqz(this, obj);
        if (this.f2781c == 0) {
            this.f2779a = cqz;
            this.f2780b = cqz;
        } else if (cra == null) {
            cqy.m1458a(cqz, this.f2779a);
            this.f2779a = cqz;
        } else {
            boolean z;
            if (cra.mo5676d() == this) {
                z = true;
            } else {
                z = false;
            }
            jri.m13396a(z, (Object) "Node is not part of this list.");
            cqz cqz2 = (cqz) cra;
            cqz cqz3 = cqz2.f13171a;
            cqy.m1458a(cqz2, cqz);
            cqy.m1458a(cqz, cqz3);
            if (cra == this.f2780b) {
                this.f2780b = cqz;
            }
        }
        this.f2781c++;
        return cqz;
    }

    /* renamed from: a */
    public final cra mo5671a(int i) {
        boolean z = false;
        if (i >= 0 && i < this.f2781c) {
            z = true;
        }
        int i2 = this.f2781c;
        StringBuilder stringBuilder = new StringBuilder(61);
        stringBuilder.append("Index: ");
        stringBuilder.append(i);
        stringBuilder.append(" out of range for list of size: ");
        stringBuilder.append(i2);
        jri.m13396a(z, stringBuilder.toString());
        cra cra = this.f2779a;
        while (i > 0) {
            cra = cra.mo5677e();
            i--;
        }
        return cra;
    }

    /* renamed from: a */
    private static void m1458a(cqz cqz, cqz cqz2) {
        if (cqz != null) {
            cqz.f13171a = cqz2;
        }
        if (cqz2 != null) {
            cqz2.f13172b = cqz;
        }
    }
}
