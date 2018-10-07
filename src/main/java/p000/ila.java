package p000;

/* compiled from: PG */
/* renamed from: ila */
public final class ila implements ikv {
    /* renamed from: a */
    private final ird f21037a;

    public ila(ird ird) {
        this.f21037a = ird;
    }

    /* renamed from: a */
    public final void mo8595a(iqo iqo) {
        if (iqo instanceof ikz) {
            try {
                this.f21037a.mo8856a(((ikz) iqo).mo8597t_());
                iqo.close();
            } finally {
                this.f21037a.mo8857b();
            }
        } else {
            iqo.close();
        }
    }

    /* renamed from: a */
    public final void mo8596a(Iterable iterable, String str) {
        try {
            this.f21037a.mo8856a(str);
            for (iqo a : iterable) {
                mo8595a(a);
            }
        } finally {
            this.f21037a.mo8857b();
        }
    }
}
