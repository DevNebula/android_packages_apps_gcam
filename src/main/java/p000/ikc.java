package p000;

/* compiled from: PG */
/* renamed from: ikc */
public final class ikc {
    /* renamed from: a */
    private long f7410a;
    /* renamed from: b */
    private final /* synthetic */ long f7411b = 66666666;

    /* renamed from: a */
    public final synchronized long mo8567a() {
        return Math.max(0, this.f7411b - (System.nanoTime() - this.f7410a));
    }

    /* renamed from: b */
    public final synchronized void mo8568b() {
        this.f7410a = System.nanoTime();
    }
}
