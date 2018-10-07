package p000;

/* compiled from: PG */
/* renamed from: cpe */
final class cpe implements kov {
    /* renamed from: a */
    public final /* synthetic */ iqb f13091a;
    /* renamed from: b */
    public final /* synthetic */ coy f13092b;
    /* renamed from: c */
    private final /* synthetic */ crb f13093c;

    cpe(coy coy, crb crb, iqb iqb) {
        this.f13092b = coy;
        this.f13093c = crb;
        this.f13091a = iqb;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        bli.m898e(coy.f13070a, "Filmstrip OnDemandLoader failed to load.");
    }

    /* renamed from: b_ */
    public final /* synthetic */ void mo10186b_(Object obj) {
        if (this.f13092b.f13073d.mo1827d()) {
            bli.m894c(coy.f13070a, "Activity is destroyed. Canceling load.");
            return;
        }
        coy coy;
        String str = coy.f13070a;
        int i = this.f13093c.f2788d.f2781c;
        StringBuilder stringBuilder = new StringBuilder(67);
        stringBuilder.append("resetPartialLoading onSuccess newFilmstripItemList size=");
        stringBuilder.append(i);
        bli.m896d(str, stringBuilder.toString());
        crb crb = this.f13093c;
        if (crb.f2788d.f2781c == 0) {
            this.f13092b.f13080k = -1;
        } else {
            err e = crb.mo5681a(0).mo5692e();
            this.f13092b.f13080k = cpy.m8716a(e);
            str = coy.f13070a;
            long j = this.f13092b.f13080k;
            StringBuilder stringBuilder2 = new StringBuilder(59);
            stringBuilder2.append("resetPartialLoading lastPhotoUtcTimeMs=");
            stringBuilder2.append(j);
            bli.m896d(str, stringBuilder2.toString());
        }
        this.f13092b.mo12890a(this.f13093c);
        this.f13092b.f13083n.set(false);
        for (int i2 = 0; i2 < 5; i2++) {
            crb crb2 = this.f13093c;
            if (i2 >= crb2.f2788d.f2781c) {
                break;
            }
            err e2 = crb2.mo5681a(i2).mo5692e();
            coy = this.f13092b;
            cqf cqf = coy.f13077h;
            cqf.m1454a(coy.f13072c, e2);
        }
        Object d = kpw.m18486d();
        kow.m13878a(d, new cpf(this), kpq.f8776a);
        coy = this.f13092b;
        new cph(coy, coy.f13080k, d).execute(new Void[0]);
    }
}
