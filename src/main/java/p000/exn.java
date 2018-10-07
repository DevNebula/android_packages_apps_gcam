package p000;

import android.os.Handler;

/* renamed from: exn */
public final /* synthetic */ class exn implements ijk {
    /* renamed from: a */
    private final kwk f17968a;
    /* renamed from: b */
    private final ird f17969b;
    /* renamed from: c */
    private final kwk f17970c;

    public exn(kwk kwk, ird ird, kwk kwk2) {
        this.f17968a = kwk;
        this.f17969b = ird;
        this.f17970c = kwk2;
    }

    /* renamed from: a */
    public final kpk mo8560a() {
        ((Handler) this.f17968a.mo10566a()).post(new exo(this.f17969b, this.f17970c));
        return kow.m13873a(Boolean.valueOf(true));
    }
}
