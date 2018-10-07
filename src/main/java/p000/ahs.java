package p000;

import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: PG */
/* renamed from: ahs */
final class ahs {
    /* renamed from: a */
    public final Queue f468a = new ArrayDeque();

    ahs() {
    }

    /* renamed from: a */
    final ahr mo302a() {
        ahr ahr;
        synchronized (this.f468a) {
            ahr = (ahr) this.f468a.poll();
        }
        if (ahr == null) {
            return new ahr();
        }
        return ahr;
    }
}
