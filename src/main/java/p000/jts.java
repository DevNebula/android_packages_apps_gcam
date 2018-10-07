package p000;

import java.util.Iterator;

/* compiled from: PG */
/* renamed from: jts */
public final class jts extends jtq {
    /* renamed from: d */
    private final float f24804d = ((float) (Math.sqrt(2.0d) * 7.0E9d));

    public jts(jvx jvx) {
        super(jvx);
        jri.m13395a(true);
    }

    /* renamed from: a */
    public final jzf mo9554a(long j) {
        float f;
        synchronized (this.f21740c) {
            Iterator it = this.f21738a.iterator();
            float f2 = 0.0f;
            while (true) {
                f = f2;
                if (it.hasNext()) {
                    f2 = ((float) (((Long) it.next()).longValue() - j)) / this.f24804d;
                    f2 = (float) (Math.exp((double) (f2 * (-f2))) + ((double) f));
                }
            }
        }
        return new jzc(f);
    }
}
