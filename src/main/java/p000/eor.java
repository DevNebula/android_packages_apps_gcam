package p000;

import android.app.Application;

/* compiled from: PG */
/* renamed from: eor */
public class eor extends Application {
    /* renamed from: f */
    public final enf f4221f = new enf();

    public void onCreate() {
        enf enf = this.f4221f;
        enf.f17559b = enf.mo13163a(new eng());
        super.onCreate();
    }

    public void onTerminate() {
        enf enf = this.f4221f;
        enf.mo13165b(enf.f17559b);
        for (eol eol : enf.f17558a) {
            if (eol instanceof eno) {
                ((eno) eol).mo6353a();
            }
        }
        super.onTerminate();
    }
}
