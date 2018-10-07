package p000;

import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: et */
final class C0675et implements C0224fc {
    /* renamed from: a */
    private final /* synthetic */ Object f17768a;
    /* renamed from: b */
    private final /* synthetic */ ArrayList f17769b;
    /* renamed from: c */
    private final /* synthetic */ Object f17770c;
    /* renamed from: d */
    private final /* synthetic */ ArrayList f17771d;
    /* renamed from: e */
    private final /* synthetic */ Object f17772e;
    /* renamed from: f */
    private final /* synthetic */ ArrayList f17773f;
    /* renamed from: g */
    private final /* synthetic */ C0673er f17774g;

    C0675et(C0673er c0673er, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
        this.f17774g = c0673er;
        this.f17768a = obj;
        this.f17769b = arrayList;
        this.f17770c = obj2;
        this.f17771d = arrayList2;
        this.f17772e = obj3;
        this.f17773f = arrayList3;
    }

    /* renamed from: a */
    public final void mo6738a(C0219ex c0219ex) {
    }

    /* renamed from: a */
    public final void mo6737a() {
    }

    /* renamed from: b */
    public final void mo6739b() {
    }

    /* renamed from: c */
    public final void mo6740c() {
        Object obj = this.f17768a;
        if (obj != null) {
            this.f17774g.replaceTargets(obj, this.f17769b, null);
        }
        obj = this.f17770c;
        if (obj != null) {
            this.f17774g.replaceTargets(obj, this.f17771d, null);
        }
        obj = this.f17772e;
        if (obj != null) {
            this.f17774g.replaceTargets(obj, this.f17773f, null);
        }
    }
}
