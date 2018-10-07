package p000;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: cno */
public final class cno {
    /* renamed from: a */
    public cnp f2398a;
    /* renamed from: b */
    public final List f2399b = new ArrayList();

    /* renamed from: a */
    public final boolean mo2408a(Uri uri) {
        return this.f2399b.contains(uri);
    }

    /* renamed from: a */
    public final boolean mo2407a() {
        return this.f2399b.size() > 0;
    }

    /* renamed from: b */
    public final void mo2409b(Uri uri) {
        cnp cnp;
        if (mo2408a(uri)) {
            if (this.f2399b.remove(uri)) {
                cnp = this.f2398a;
                if (cnp != null) {
                    this.f2399b.size();
                    cnp.f2400a.mo12532b();
                }
            }
        } else if (!this.f2399b.contains(uri)) {
            this.f2399b.add(uri);
            cnp = this.f2398a;
            if (cnp != null) {
                this.f2399b.size();
                cnp.f2400a.mo12532b();
            }
        }
    }
}
