package p000;

import android.os.AsyncTask;

/* renamed from: hzl */
final class hzl extends AsyncTask {
    /* renamed from: a */
    public final /* synthetic */ huq f7210a;
    /* renamed from: b */
    public final /* synthetic */ hzn f7211b;

    hzl(huq huq, hzn hzn) {
        this.f7210a = huq;
        this.f7211b = hzn;
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        if (this.f7210a.mo8132a().mo14631b()) {
            this.f7211b.mo8288b().mo8151a(new hzm(this));
        } else {
            this.f7211b.mo8287a();
            this.f7210a.mo8142c();
        }
        return null;
    }
}
