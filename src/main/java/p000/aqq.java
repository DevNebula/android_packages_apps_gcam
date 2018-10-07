package p000;

/* compiled from: PG */
/* renamed from: aqq */
public abstract class aqq extends aql {
    /* renamed from: a */
    private final int f25493a;
    /* renamed from: b */
    private final int f25494b;

    public aqq() {
        this(kvl.UNSET_ENUM_VALUE, kvl.UNSET_ENUM_VALUE);
    }

    public aqq(int i, int i2) {
        this.f25493a = i;
        this.f25494b = i2;
    }

    /* renamed from: a */
    public final void mo12306a(aqr aqr) {
        if (arq.m682b(this.f25493a, this.f25494b)) {
            aqr.mo1717a(this.f25493a, this.f25494b);
            return;
        }
        int i = this.f25493a;
        int i2 = this.f25494b;
        StringBuilder stringBuilder = new StringBuilder(176);
        stringBuilder.append("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ");
        stringBuilder.append(i);
        stringBuilder.append(" and height: ");
        stringBuilder.append(i2);
        stringBuilder.append(", either provide dimensions in the constructor or call override()");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: b */
    public final void mo12309b(aqr aqr) {
    }
}
