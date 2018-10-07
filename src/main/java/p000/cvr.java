package p000;

import android.content.Context;
import com.google.android.apps.camera.metadata.refocus.RefocusHelper;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: cvr */
public final class cvr implements kwk {
    /* renamed from: a */
    private final kwk f13304a;
    /* renamed from: b */
    private final kwk f13305b;
    /* renamed from: c */
    private final kwk f13306c;
    /* renamed from: d */
    private final kwk f13307d;
    /* renamed from: e */
    private final kwk f13308e;
    /* renamed from: f */
    private final kwk f13309f;
    /* renamed from: g */
    private final kwk f13310g;
    /* renamed from: h */
    private final kwk f13311h;
    /* renamed from: i */
    private final kwk f13312i;
    /* renamed from: j */
    private final kwk f13313j;
    /* renamed from: k */
    private final kwk f13314k;
    /* renamed from: l */
    private final kwk f13315l;
    /* renamed from: m */
    private final kwk f13316m;

    public cvr(kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5, kwk kwk6, kwk kwk7, kwk kwk8, kwk kwk9, kwk kwk10, kwk kwk11, kwk kwk12, kwk kwk13) {
        this.f13304a = kwk;
        this.f13305b = kwk2;
        this.f13306c = kwk3;
        this.f13307d = kwk4;
        this.f13308e = kwk5;
        this.f13309f = kwk6;
        this.f13310g = kwk7;
        this.f13311h = kwk8;
        this.f13312i = kwk9;
        this.f13313j = kwk10;
        this.f13314k = kwk11;
        this.f13315l = kwk12;
        this.f13316m = kwk13;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f13304a;
        kwk kwk2 = this.f13305b;
        kwk kwk3 = this.f13306c;
        kwk kwk4 = this.f13307d;
        kwk kwk5 = this.f13308e;
        kwk kwk6 = this.f13309f;
        kwk kwk7 = this.f13310g;
        kwk kwk8 = this.f13311h;
        kwk kwk9 = this.f13312i;
        kwk kwk10 = this.f13313j;
        kwk kwk11 = this.f13314k;
        kwk kwk12 = this.f13315l;
        Context context = (Context) kwk.mo10566a();
        cvz cvz = (cvz) kwk2.mo10566a();
        cvz cvz2 = (cvz) kwk3.mo10566a();
        cvz cvz3 = (cvz) kwk4.mo10566a();
        cvz cvz4 = (cvz) kwk5.mo10566a();
        kbg kbg = (kbg) kwk10.mo10566a();
        fbn fbn = (fbn) kwk11.mo10566a();
        cbu cbu = (cbu) kwk12.mo10566a();
        ird ird = (ird) this.f13316m.mo10566a();
        ird.mo8856a("ModuleManager#provide");
        Iterable arrayList = new ArrayList();
        arrayList.add(cvz);
        arrayList.add(cvz2);
        arrayList.add(cvz3);
        arrayList.add(cvz4);
        ird.mo8856a("ModuleManager#lightcycle");
        if (erz.m2145a(context, cbu.mo2251b(), cbu.mo2250a())) {
            arrayList.add((cvz) kwk6.mo10566a());
            arrayList.add((cvz) kwk7.mo10566a());
        }
        ird.mo8857b();
        ird.mo8856a("ModuleManager#refocus");
        if (RefocusHelper.hasRefocusCapture(context, cbu.mo2250a())) {
            arrayList.add((cvz) kwk8.mo10566a());
        }
        ird.mo8857b();
        ird.mo8856a("ModuleManager#hfr-video");
        if (fbn.mo9095d()) {
            arrayList.add((cvz) kwk9.mo10566a());
        }
        ird.mo8857b();
        ird.mo8856a("ModuleManager#gouda");
        if (kbg.mo9709b()) {
            arrayList.add((cvz) kbg.mo9706a());
        }
        ird.mo8857b();
        cvy cwb = new cwb(arrayList);
        cwb.mo5868b(cvz.mo5870b().f3017a);
        ird.mo8857b();
        return (cvy) ktm.m14219a(cwb, "Cannot return null from a non-@Nullable @Provides method");
    }
}
