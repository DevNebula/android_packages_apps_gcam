package p000;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* renamed from: iqx */
public final class iqx {
    /* renamed from: a */
    private final long f7705a = TimeUnit.NANOSECONDS.convert(3000, TimeUnit.MILLISECONDS);
    /* renamed from: b */
    private final iqz f7706b;
    /* renamed from: c */
    private final String f7707c;
    /* renamed from: d */
    private long f7708d;
    /* renamed from: e */
    private int f7709e;
    /* renamed from: f */
    private int f7710f;

    public iqx(iqz iqz, String str) {
        this.f7706b = iqz;
        this.f7707c = str;
    }

    /* renamed from: a */
    public final synchronized void mo8829a() {
        this.f7709e++;
        this.f7710f++;
        long nanoTime = System.nanoTime();
        long j = this.f7708d;
        nanoTime -= j;
        if (j == 0) {
            this.f7709e = 0;
            this.f7708d = System.nanoTime();
        } else if (nanoTime >= this.f7705a) {
            iqz iqz = this.f7706b;
            String str = this.f7707c;
            int i = this.f7709e;
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 37);
            stringBuilder.append(str);
            stringBuilder.append(" per second: ");
            stringBuilder.append(((double) i) / (((double) nanoTime) / 1.0E9d));
            iqz.mo8832b(stringBuilder.toString());
            this.f7709e = 0;
            this.f7708d = System.nanoTime();
        }
    }
}
