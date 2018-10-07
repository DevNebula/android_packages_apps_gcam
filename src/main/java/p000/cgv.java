package p000;

/* renamed from: cgv */
final /* synthetic */ class cgv implements Runnable {
    /* renamed from: a */
    private final cgu f2144a;
    /* renamed from: b */
    private final int f2145b;

    cgv(cgu cgu, int i) {
        this.f2144a = cgu;
        this.f2145b = i;
    }

    public final void run() {
        cgu cgu = this.f2144a;
        int i = this.f2145b;
        try {
            cgu.f12468i = i;
            cgu.f12464e.mo8861b(iur.m4312a(String.valueOf(i)));
            C0619zs c0619zs = cgu.f12463d;
            C0619zs c0619zs2 = cgu.f12462c;
            aah aah = cgu.f12467h;
            boolean z;
            if (aah == null) {
                cgu.mo12498a(c0619zs2, i, cgu.f12461b, cgu);
            } else if (aah.mo22c() == i) {
                z = cgu.f12469j;
                bli.m896d(cgu.f12460a, "reconnecting to use the existing camera");
                aah aah2 = cgu.f12467h;
                try {
                    aah2.mo26g().mo82a(new aai(aah2, cgu.f12461b, cgu));
                } catch (RuntimeException e) {
                    aah2.mo8a().mo11592b().mo59a(e);
                }
                cgu.f12467h = null;
            } else {
                bli.m896d(cgu.f12460a, "different camera already opened, closing then reopening");
                z = cgu.f12469j;
                cgu.f12462c.mo11591a(false);
                cgu.mo12500c();
                cgu.mo12498a(c0619zs2, i, cgu.f12461b, cgu);
            }
            cgu.f12469j = false;
            cgu.f12466g = c0619zs2.mo11589a();
        } catch (InterruptedException e2) {
            cgu.f12461b.post(new cgw(cgu, i));
        }
    }
}
