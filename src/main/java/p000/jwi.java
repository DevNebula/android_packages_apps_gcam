package p000;

import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* renamed from: jwi */
public final class jwi implements jwa {
    /* renamed from: a */
    private final Set f24887a = new HashSet();
    /* renamed from: b */
    private final jtv f24888b;

    public jwi(jtv jtv) {
        this.f24888b = jtv;
    }

    /* renamed from: e */
    private final synchronized HashSet m16756e() {
        return new HashSet(this.f24887a);
    }

    /* renamed from: a */
    public final synchronized void mo9575a(long j) {
        this.f24887a.remove(Long.valueOf(j));
        this.f24888b.mo9556b(j);
    }

    /* renamed from: b */
    public final synchronized void mo9576b(long j) {
        this.f24887a.add(Long.valueOf(j));
        this.f24888b.mo9557c(j);
    }

    /* renamed from: b */
    public final synchronized kbg mo13880b() {
        return kau.f21835a;
    }

    /* renamed from: c */
    public final synchronized void mo13881c() {
        this.f24887a.clear();
        this.f24888b.mo9555a();
    }

    /* renamed from: d */
    public final synchronized long mo13882d() {
        long j;
        if (this.f24887a.isEmpty()) {
            throw new IllegalStateException("Summary is empty!");
        }
        float f = Float.MAX_VALUE;
        j = -1;
        for (Long longValue : this.f24887a) {
            long longValue2 = longValue.longValue();
            float a = this.f24888b.mo9554a(longValue2).mo9629a();
            if (a >= f) {
                longValue2 = j;
            }
            if (a >= f) {
                a = f;
            }
            j = longValue2;
            f = a;
        }
        return j;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f24888b);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 27);
        stringBuilder.append("ScoredFrameDropper[scorer=");
        stringBuilder.append(valueOf);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
