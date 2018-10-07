package p000;

/* compiled from: PG */
/* renamed from: kns */
final class kns extends knl {
    kns() {
    }

    /* renamed from: a */
    final boolean mo10172a(knk knk, knp knp, knp knp2) {
        synchronized (knk) {
            if (knk.listeners != knp) {
                return false;
            }
            knk.listeners = knp2;
            return true;
        }
    }

    /* renamed from: a */
    final boolean mo10171a(knk knk, Object obj, Object obj2) {
        synchronized (knk) {
            if (knk.value != obj) {
                return false;
            }
            knk.value = obj2;
            return true;
        }
    }

    /* renamed from: a */
    final boolean mo10173a(knk knk, knw knw, knw knw2) {
        synchronized (knk) {
            if (knk.waiters != knw) {
                return false;
            }
            knk.waiters = knw2;
            return true;
        }
    }

    /* renamed from: a */
    final void mo10170a(knw knw, knw knw2) {
        knw.next = knw2;
    }

    /* renamed from: a */
    final void mo10169a(knw knw, Thread thread) {
        knw.thread = thread;
    }
}
