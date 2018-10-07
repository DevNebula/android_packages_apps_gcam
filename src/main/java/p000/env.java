package p000;

import android.os.Bundle;

/* compiled from: PG */
/* renamed from: env */
final class env implements enw {
    /* renamed from: a */
    private final /* synthetic */ Bundle f17567a;

    env(enr enr, Bundle bundle) {
        this.f17567a = bundle;
    }

    /* renamed from: a */
    public final void mo6359a(eol eol) {
        if (eol instanceof eoi) {
            Bundle bundle = new Bundle();
            ((eoi) eol).mo6371a();
            this.f17567a.putBundle((String) jri.m13404b(enr.m1952b(eol)), bundle);
        }
    }
}
