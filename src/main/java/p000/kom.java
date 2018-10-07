package p000;

import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: kom */
final class kom extends koc {
    /* renamed from: d */
    private List f25351d;
    /* renamed from: e */
    private final /* synthetic */ kol f25352e;

    private kom(kol kol, keh keh, boolean z) {
        List e;
        this.f25352e = kol;
        super(kol, keh, z);
        if (keh.isEmpty()) {
            e = ken.m13719e();
        } else {
            e = khb.m4923a(keh.size());
        }
        this.f25351d = e;
        for (int i = 0; i < keh.size(); i++) {
            this.f25351d.add(null);
        }
    }

    kom(kol kol, keh keh, boolean z, byte b) {
        this(kol, keh, z);
    }

    /* renamed from: a */
    final void mo14127a(boolean z, int i, Object obj) {
        boolean z2 = true;
        List list = this.f25351d;
        if (list != null) {
            list.set(i, kbg.m4803b(obj));
            return;
        }
        if (!(z || this.f25352e.isCancelled())) {
            z2 = false;
        }
        jri.m13406b(z2, (Object) "Future was done before all dependencies completed");
    }

    /* renamed from: b */
    final void mo14128b() {
        List<kbg> list = this.f25351d;
        if (list != null) {
            kol kol = this.f25352e;
            List a = khb.m4923a(list.size());
            for (kbg kbg : list) {
                Object c;
                if (kbg != null) {
                    c = kbg.mo9710c();
                } else {
                    c = null;
                }
                a.add(c);
            }
            kol.mo15641a((Object) Collections.unmodifiableList(a));
            return;
        }
        jri.m13405b(this.f25352e.isDone());
    }

    /* renamed from: d */
    final void mo14129d() {
        super.mo14129d();
        this.f25351d = null;
    }
}
