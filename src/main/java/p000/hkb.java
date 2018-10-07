package p000;

import android.content.Context;
import android.os.UserManager;

/* compiled from: PG */
/* renamed from: hkb */
public final class hkb implements kwk {
    /* renamed from: a */
    private final kwk f20178a;

    public hkb(hka hka, kwk kwk) {
        this.f20178a = kwk;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        return Boolean.valueOf(((UserManager) ((Context) this.f20178a.mo10566a()).getSystemService("user")).isDemoUser());
    }
}
