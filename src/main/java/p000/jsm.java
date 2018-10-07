package p000;

import android.util.Log;

/* compiled from: PG */
/* renamed from: jsm */
final class jsm implements jzt {
    /* renamed from: a */
    private final /* synthetic */ jsl f21711a;

    jsm(jsl jsl) {
        this.f21711a = jsl;
    }

    /* renamed from: a */
    public final void mo9668a(Exception exception) {
        Log.d("FeatureExtractionPipeline", "onError");
        this.f21711a.mo13846a();
        this.f21711a.f21708b.mo13777a(jar.m4449a(exception));
    }

    /* renamed from: a */
    public final void mo9667a() {
        Log.d("FeatureExtractionPipeline", "Started");
    }

    /* renamed from: b */
    public final void mo9669b() {
        Log.d("FeatureExtractionPipeline", "onStopped");
        this.f21711a.mo13846a();
        jsl jsl = this.f21711a;
        jsl.f21708b.mo13778a(jsl.f21707a);
    }
}
