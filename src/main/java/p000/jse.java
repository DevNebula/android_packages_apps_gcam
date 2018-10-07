package p000;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: jse */
final class jse implements izi {
    /* renamed from: a */
    private final /* synthetic */ jsb f21704a;

    jse(jsb jsb) {
        this.f21704a = jsb;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9217a(Object obj) {
        juh juh = new juh(this.f21704a.f21696a.mo13832c());
        List b = khb.m4945b();
        b.add(juh);
        List arrayList = new ArrayList();
        for (jir jir : this.f21704a.f21698c) {
            for (juh juh2 : jir.f8219a.mo9570a(b)) {
                arrayList.add(new jsp(jir.f8220b, juh2));
            }
        }
        return arrayList;
    }
}
