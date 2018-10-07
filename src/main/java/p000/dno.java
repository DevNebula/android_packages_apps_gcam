package p000;

import android.content.Intent;
import android.net.Uri;

/* compiled from: PG */
/* renamed from: dno */
final class dno implements dob {
    /* renamed from: a */
    private final /* synthetic */ dnl f24033a;

    dno(dnl dnl) {
        this.f24033a = dnl;
    }

    /* renamed from: a */
    public final /* synthetic */ bug mo2146a(Object obj) {
        bug bug = this.f24033a;
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setFlags(1);
        intent.setDataAndType((Uri) bug.f24030e.mo9706a(), bug.f24029d.mo1943b().f7911i);
        try {
            ((doa) bug.mo2152d()).f14232K.mo12476b(intent);
        } catch (Throwable e) {
            bli.m892b(dnl.f24028c, "Couldn't view video", e);
        }
        return null;
    }
}
