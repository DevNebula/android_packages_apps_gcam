package p000;

import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* renamed from: jjp */
public final class jjp extends jjq {
    /* renamed from: c */
    private final jxm f24754c;
    /* renamed from: d */
    private final ByteBuffer f24755d;

    public jjp(String str, jxm jxm, ByteBuffer byteBuffer) {
        super(str, 5);
        jri.m13404b((Object) jxm);
        jri.m13404b((Object) byteBuffer);
        this.f24754c = jxm;
        this.f24755d = byteBuffer;
    }

    /* renamed from: a */
    public final jaq mo9461a(juh juh, Executor executor) {
        boolean z;
        jri.m13404b((Object) juh);
        if (juh.mo9565d() > 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13396a(z, (Object) "Cannot create all smiles photo from an empty stack!");
        Map hashMap = new HashMap();
        jzp jzp = (jzp) this.f24754c.mo9599a(juh.mo9561a()).mo9589a(jxa.f8411b);
        Iterator it = juh.iterator();
        while (true) {
            jzp jzp2 = jzp;
            if (it.hasNext()) {
                long longValue = ((Long) it.next()).longValue();
                jxa a = this.f24754c.mo9599a(longValue);
                jzp = (jzp) a.mo9589a(jxa.f8411b);
                if (jzp2.equals(jzp)) {
                    hashMap.put(Long.valueOf(longValue), (List) a.mo9589a(jxa.f8412c));
                } else {
                    throw new IllegalStateException("Expected metadata image size to be consistent.");
                }
            }
            return jli.m13199b(new jjg(this.f21555a, this.f21556b, juh.mo9564c(), hashMap, jzp2, this.f24755d));
        }
    }
}
