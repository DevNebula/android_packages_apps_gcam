package p000;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: jnu */
final class jnu implements jnp {
    /* renamed from: a */
    private final /* synthetic */ String[] f21645a;

    jnu(String[] strArr) {
        this.f21645a = strArr;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9526a(jms jms) {
        List arrayList = new ArrayList();
        for (String str : this.f21645a) {
            if (!str.equals("Video_VFR")) {
                arrayList.add((jir) jms.mo9518a(jir.class, str));
            }
        }
        return (jir[]) arrayList.toArray(new jir[arrayList.size()]);
    }
}
