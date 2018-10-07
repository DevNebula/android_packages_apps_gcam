package p000;

/* compiled from: PG */
/* renamed from: gxe */
public final class gxe implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ int f6110a;
    /* renamed from: b */
    private final /* synthetic */ int f6111b;
    /* renamed from: c */
    private final /* synthetic */ gxc f6112c;

    public gxe(gxc gxc, int i, int i2) {
        this.f6112c = gxc;
        this.f6110a = i;
        this.f6111b = i2;
    }

    public final void run() {
        String str = gxc.f6103a;
        int i = this.f6110a;
        int i2 = this.f6111b;
        StringBuilder stringBuilder = new StringBuilder(43);
        stringBuilder.append("showActiveFocusAt(");
        stringBuilder.append(i);
        stringBuilder.append(", ");
        stringBuilder.append(i2);
        stringBuilder.append(")");
        bli.m896d(str, stringBuilder.toString());
        this.f6112c.f6104b.mo7496d();
        this.f6112c.f6104b.mo7493a((float) this.f6110a, (float) this.f6111b);
    }
}
