package p000;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: ewi */
public final class ewi implements kwk {
    /* renamed from: a */
    private final kwk f17901a;
    /* renamed from: b */
    private final kwk f17902b;
    /* renamed from: c */
    private final kwk f17903c;
    /* renamed from: d */
    private final kwk f17904d;

    private ewi(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        this.f17901a = kwk;
        this.f17902b = kwk2;
        this.f17903c = kwk3;
        this.f17904d = kwk4;
    }

    /* renamed from: a */
    public static ewi m10176a(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4) {
        return new ewi(kwk, kwk2, kwk3, kwk4);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f17901a;
        kwk kwk2 = this.f17902b;
        evb evb = (evb) kwk.mo10566a();
        euj euj = (euj) kwk2.mo10566a();
        this.f17904d.mo10566a();
        List arrayList = new ArrayList();
        arrayList.add(evb);
        arrayList.add(euj);
        return (List) ktm.m14219a(arrayList, "Cannot return null from a non-@Nullable @Provides method");
    }
}
