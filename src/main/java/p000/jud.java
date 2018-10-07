package p000;

import java.util.TreeSet;

/* compiled from: PG */
/* renamed from: jud */
public final class jud implements jtv {
    /* renamed from: a */
    private final float f21758a;
    /* renamed from: b */
    private final float f21759b;
    /* renamed from: c */
    private final TreeSet f21760c;

    public jud() {
        this((byte) 0);
    }

    private jud(byte b) {
        this.f21760c = khb.m4965f();
        this.f21758a = 30.0f;
        this.f21759b = 1.99999996E11f / this.f21758a;
    }

    /* renamed from: a */
    public final jzf mo9554a(long j) {
        boolean z;
        int i;
        long longValue;
        long j2 = 0;
        if (this.f21760c.size() > 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13395a(z);
        TreeSet treeSet = this.f21760c;
        Long valueOf = Long.valueOf(j);
        Long l = (Long) treeSet.lower(valueOf);
        valueOf = (Long) this.f21760c.higher(valueOf);
        if (l != null) {
            i = 1;
            longValue = j - l.longValue();
        } else {
            i = 0;
            longValue = 0;
        }
        if (valueOf != null) {
            j2 = valueOf.longValue() - j;
            i++;
        }
        if (i == 0) {
            return new jzc(0.0f);
        }
        return new jzc(((float) ((longValue + j2) / ((long) i))) / this.f21759b);
    }

    /* renamed from: b */
    public final void mo9556b(long j) {
        this.f21760c.remove(Long.valueOf(j));
    }

    /* renamed from: c */
    public final void mo9557c(long j) {
        this.f21760c.add(Long.valueOf(j));
    }

    /* renamed from: a */
    public final void mo9555a() {
        this.f21760c.clear();
    }

    public final String toString() {
        float f = this.f21758a;
        StringBuilder stringBuilder = new StringBuilder(40);
        stringBuilder.append("TimestampGapScorer[rate=");
        stringBuilder.append(f);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
