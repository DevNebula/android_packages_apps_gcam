package p000;

import android.util.Log;

/* compiled from: PG */
/* renamed from: bor */
public final class bor implements kwk {
    /* renamed from: a */
    private final kwk f11670a;
    /* renamed from: b */
    private final kwk f11671b;
    /* renamed from: c */
    private final kwk f11672c;
    /* renamed from: d */
    private final kwk f11673d;
    /* renamed from: e */
    private final kwk f11674e;

    public bor(boq boq, kwk kwk, kwk kwk2, kwk kwk3, kwk kwk4, kwk kwk5) {
        this.f11670a = kwk;
        this.f11671b = kwk2;
        this.f11672c = kwk3;
        this.f11673d = kwk4;
        this.f11674e = kwk5;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        kwk kwk = this.f11670a;
        kwk kwk2 = this.f11671b;
        kwk kwk3 = this.f11672c;
        kwk kwk4 = this.f11673d;
        kwk kwk5 = this.f11674e;
        kwc.m14272a(kwk);
        bos bos = (bos) kwk2.mo10566a();
        hjf hjf = (hjf) kwk3.mo10566a();
        kwk4.mo10566a();
        aws aws = (aws) kwk5.mo10566a();
        hjf.mo7907e();
        Log.i("ElmyraModule", "Using noop implemetation.");
        aws.mo1824a().mo8557a(bos);
        return (bou) ktm.m14219a(bos, "Cannot return null from a non-@Nullable @Provides method");
    }
}
