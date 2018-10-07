package p000;

import java.io.InputStream;

/* compiled from: PG */
/* renamed from: amz */
public final class amz implements adq {
    /* renamed from: a */
    private final amm f10405a;
    /* renamed from: b */
    private final agu f10406b;

    public amz(amm amm, agu agu) {
        this.f10405a = amm;
        this.f10406b = agu;
    }

    /* renamed from: a */
    private final agn m6727a(InputStream inputStream, int i, int i2, adp adp) {
        Object obj;
        if (inputStream instanceof amw) {
            inputStream = (amw) inputStream;
            obj = null;
        } else {
            int obj2 = 1;
            inputStream = new amw(inputStream, this.f10406b);
        }
        InputStream a = arl.m652a(inputStream);
        try {
            agn a2 = this.f10405a.mo370a(new aro(a), i, i2, adp, new ana(inputStream, a));
            return a2;
        } finally {
            a.mo1734a();
            if (obj2 != null) {
                inputStream.mo376b();
            }
        }
    }
}
