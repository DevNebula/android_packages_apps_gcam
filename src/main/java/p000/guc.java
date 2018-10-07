package p000;

import android.os.storage.StorageManager;

/* compiled from: PG */
/* renamed from: guc */
public final class guc implements kwk {
    /* renamed from: a */
    private final kwk f19607a;
    /* renamed from: b */
    private final kwk f19608b;

    private guc(kwk kwk, kwk kwk2) {
        this.f19607a = kwk;
        this.f19608b = kwk2;
    }

    /* renamed from: a */
    public static guc m11768a(kwk kwk, kwk kwk2) {
        return new guc(kwk, kwk2);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        return new gub((StorageManager) this.f19607a.mo10566a(), (ivx) this.f19608b.mo10566a());
    }
}
