package p000;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* renamed from: hco */
public final class hco {
    /* renamed from: a */
    public final goy f6353a;
    /* renamed from: b */
    public final Set f6354b = Collections.synchronizedSet(new HashSet());
    /* renamed from: c */
    private volatile gbv f6355c;

    public hco(goy goy, gbv gbv) {
        this.f6353a = goy;
        this.f6355c = gbv;
    }

    /* renamed from: a */
    public final hcy mo7723a(String str) {
        return new hcx(this, str);
    }
}
