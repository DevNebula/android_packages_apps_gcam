package p000;

import android.net.Uri;
import android.os.AsyncTask;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: cfs */
final class cfs extends AsyncTask {
    /* renamed from: a */
    private final /* synthetic */ List f2107a;
    /* renamed from: b */
    private final /* synthetic */ cre f2108b;
    /* renamed from: c */
    private final /* synthetic */ Uri f2109c;
    /* renamed from: d */
    private final /* synthetic */ cfr f2110d;

    cfs(cfr cfr, List list, cre cre, Uri uri) {
        this.f2110d = cfr;
        this.f2107a = list;
        this.f2108b = cre;
        this.f2109c = uri;
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        List arrayList = new ArrayList(this.f2107a.size());
        for (Uri a : this.f2107a) {
            arrayList.add(new cot(this.f2110d.f12332a.f23062J.mo12891a(a)));
        }
        if (arrayList.isEmpty()) {
            bli.m891b(cfk.f23052a, "onSessionDone called with an empty burst");
            return null;
        }
        cov a2 = cov.m8616a(arrayList);
        gev b = this.f2110d.f12332a.f23102aX;
        cfk cfk = this.f2110d.f12332a;
        return new cou(b, cfk.f23169d, cfk.f23171f, cfk.f23058F, a2, cfk.f23179n);
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        err err = (cou) obj;
        if (err != null) {
            if (this.f2108b != cre.f2792c && this.f2110d.f12332a.f23065M.mo5751k() && this.f2110d.f12332a.f23056D.mo5758a(this.f2108b.mo5692e())) {
                err.f23663a = this.f2110d.f12332a.f23179n.mo7412c(this.f2109c);
            }
            this.f2110d.mo12497a(this.f2108b, err);
        }
    }
}
