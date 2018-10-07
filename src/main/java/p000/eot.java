package p000;

import android.os.AsyncTask;

/* compiled from: PG */
/* renamed from: eot */
final class eot extends AsyncTask {
    /* renamed from: a */
    public final /* synthetic */ kpw f4222a;
    /* renamed from: b */
    public final /* synthetic */ eos f4223b;
    /* renamed from: c */
    private final /* synthetic */ boolean f4224c;

    eot(eos eos, kpw kpw, boolean z) {
        this.f4223b = eos;
        this.f4222a = kpw;
        this.f4224c = z;
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return Boolean.valueOf(eos.m9943a(this.f4223b.f17573d));
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            eos eos = this.f4223b;
            boolean z = this.f4224c;
            eos.f17574e = z;
            if (z) {
                if (eos.f17572c != null) {
                    this.f4222a.mo15641a(Boolean.valueOf(true));
                }
                kow.m13878a(this.f4223b.f17571b.mo13541a(), new eou(this), kpq.f8776a);
                return;
            }
            eos.mo13166d();
            this.f4222a.mo15641a(Boolean.valueOf(false));
            return;
        }
        this.f4222a.mo15641a(Boolean.valueOf(false));
        bli.m898e(eos.f17568a, "Location services not enabled, ignoring location request");
    }
}
