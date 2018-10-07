package p000;

/* compiled from: PG */
/* renamed from: gxd */
public final class gxd implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ int f6107a;
    /* renamed from: b */
    private final /* synthetic */ int f6108b;
    /* renamed from: c */
    private final /* synthetic */ gxc f6109c;

    public gxd(gxc gxc, int i, int i2) {
        this.f6109c = gxc;
        this.f6107a = i;
        this.f6108b = i2;
    }

    public final void run() {
        if (!this.f6109c.f6104b.mo7494b()) {
            String str = gxc.f6103a;
            int i = this.f6107a;
            int i2 = this.f6108b;
            StringBuilder stringBuilder = new StringBuilder(52);
            stringBuilder.append("Running showPassiveFocusAt(");
            stringBuilder.append(i);
            stringBuilder.append(", ");
            stringBuilder.append(i2);
            stringBuilder.append(")");
            bli.m896d(str, stringBuilder.toString());
            this.f6109c.f6104b.mo7497e();
            this.f6109c.f6104b.mo7493a((float) this.f6107a, (float) this.f6108b);
        }
    }
}
