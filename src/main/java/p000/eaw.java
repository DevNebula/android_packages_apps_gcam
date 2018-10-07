package p000;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* renamed from: eaw */
final class eaw extends AsyncTask {
    /* renamed from: a */
    private final /* synthetic */ AtomicReference f3679a;
    /* renamed from: b */
    private final /* synthetic */ String f3680b;
    /* renamed from: c */
    private final /* synthetic */ long f3681c;
    /* renamed from: d */
    private final /* synthetic */ String f3682d;
    /* renamed from: e */
    private final /* synthetic */ eaq f3683e;

    eaw(eaq eaq, AtomicReference atomicReference, String str, long j, String str2) {
        this.f3683e = eaq;
        this.f3679a = atomicReference;
        this.f3680b = str;
        this.f3681c = j;
        this.f3682d = str2;
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.f3683e.mo13107a();
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        eay eay = (eay) obj;
        gkr gkr = (gkr) this.f3679a.get();
        InputStream byteArrayInputStream = new ByteArrayInputStream(eay.f3685a);
        int i = eay.f3686b;
        kpk a = gkr.mo7074a(byteArrayInputStream, new glz(iqp.m4101a(i, i), ixx.JPEG));
        this.f3683e.f17122g.dismiss();
        this.f3683e.dismiss();
        a.mo10200a(new eax(this.f3679a), new ikd());
    }

    protected final void onPreExecute() {
        this.f3679a.set(this.f3683e.f17118c.mo7187a(this.f3680b, this.f3681c, kau.f21835a));
        this.f3683e.f17117b.mo7199a((gkr) this.f3679a.get());
        ((gkr) this.f3679a.get()).mo13371a(iqp.m4101a(0, 0), glw.RENDER_PHOTO);
        eaq eaq = this.f3683e;
        eaq.f17122g = ProgressDialog.show(eaq.getActivity(), null, this.f3682d, true, false);
    }
}
