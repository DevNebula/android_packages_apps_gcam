package p000;

/* compiled from: PG */
/* renamed from: gfc */
final class gfc implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ iwz f5371a;
    /* renamed from: b */
    private final /* synthetic */ gfa f5372b;

    gfc(gfa gfa, iwz iwz) {
        this.f5372b = gfa;
        this.f5371a = iwz;
    }

    public final void run() {
        this.f5371a.close();
        gfa gfa = this.f5372b;
        gfa.f19126e++;
        int i = gfa.f19125d;
        int i2 = gfa.f19126e;
        StringBuilder stringBuilder = new StringBuilder(88);
        stringBuilder.append("Release of image occurred.  Good fun. Total Images Open/Closed = ");
        stringBuilder.append(i);
        stringBuilder.append("/");
        stringBuilder.append(i2);
        bli.m896d(gfa.f19121a, stringBuilder.toString());
    }
}
