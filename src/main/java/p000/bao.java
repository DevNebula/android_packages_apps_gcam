package p000;

import java.lang.Thread.UncaughtExceptionHandler;

/* compiled from: PG */
/* renamed from: bao */
public final class bao extends bas {
    /* renamed from: a */
    private final kwk f11126a;
    /* renamed from: b */
    private final irs f11127b;

    public bao(kwk kwk, UncaughtExceptionHandler uncaughtExceptionHandler, irs irs) {
        super(uncaughtExceptionHandler);
        this.f11126a = kwk;
        this.f11127b = irs;
    }

    /* renamed from: a */
    protected final void mo1884a(Throwable th) {
        grk grk = (grk) this.f11126a.mo10566a();
        int i = grk == null ? 0 : grk.f6017b.size() > 0 ? ((epq) grk.f6017b.getLast()).f4275b : 0;
        this.f11127b.mo8906b(i);
    }
}
