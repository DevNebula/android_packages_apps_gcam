package p000;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: jis */
public final class jis extends jjb {
    /* renamed from: a */
    protected final Comparator mo9469a() {
        return new jit(super.mo9469a());
    }

    public final String toString() {
        Map hashMap = new HashMap();
        for (jip jip : mo9471b()) {
            String str = jip.f21537a;
            Integer num = (Integer) hashMap.get(str);
            if (num == null) {
                hashMap.put(str, Integer.valueOf(1));
            } else {
                hashMap.put(str, Integer.valueOf(num.intValue() + 1));
            }
        }
        kbc c = new kaz(",").mo9696c("=");
        String valueOf = String.valueOf("(ArtifactStack) artifacts are ");
        String valueOf2 = String.valueOf(c.mo9700a(new StringBuilder(), hashMap.entrySet().iterator()).toString());
        if (valueOf2.length() == 0) {
            return new String(valueOf);
        }
        return valueOf.concat(valueOf2);
    }
}
