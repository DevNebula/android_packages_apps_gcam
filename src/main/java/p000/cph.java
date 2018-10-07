package p000;

import android.net.Uri;
import android.os.AsyncTask;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/* compiled from: PG */
/* renamed from: cph */
final class cph extends AsyncTask {
    /* renamed from: a */
    private final long f2740a;
    /* renamed from: b */
    private final kpw f2741b;
    /* renamed from: c */
    private final /* synthetic */ coy f2742c;

    public cph(coy coy, long j, kpw kpw) {
        this.f2742c = coy;
        this.f2740a = j;
        this.f2741b = kpw;
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        this.f2742c.f13081l.mo8856a("LoadNewFilmstripItemsTask.doInBackground");
        List arrayList = new ArrayList();
        if (!this.f2742c.f13083n.get()) {
            String str = coy.f13070a;
            long j = this.f2740a;
            StringBuilder stringBuilder = new StringBuilder(73);
            stringBuilder.append("updating media metadata with photos newer than time: ");
            stringBuilder.append(j);
            bli.m896d(str, stringBuilder.toString());
            cpo cpo = this.f2742c.f13074e;
            arrayList.addAll(cpn.m1440a(cpo.f13147a, cqk.f2769a, cqk.f2770b, this.f2740a, "datetaken DESC", cpo));
            cpo = this.f2742c.f13075f;
            arrayList.addAll(cpn.m1440a(cpo.f13169c, cqr.f2773a, cqr.f2774b, this.f2740a, "datetaken DESC, _id DESC", cpo));
            Collections.sort(arrayList, new cqh(new Date()));
        }
        this.f2742c.f13081l.mo8857b();
        return arrayList;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        List<err> list = (List) obj;
        this.f2742c.f13081l.mo8856a("LoadNewFilmstripItemsTask.onPostExecute");
        if (this.f2742c.f13073d.mo1827d()) {
            bli.m898e(coy.f13070a, "Activity is destroyed. Canceling load.");
        } else if (list != null) {
            String str;
            String str2 = coy.f13070a;
            int size = list.size();
            StringBuilder stringBuilder = new StringBuilder(46);
            stringBuilder.append("new photos query return num items: ");
            stringBuilder.append(size);
            bli.m896d(str2, stringBuilder.toString());
            if (!list.isEmpty()) {
                long a = cpy.m8716a((err) list.get(0));
                str = coy.f13070a;
                long j = this.f2742c.f13080k;
                StringBuilder stringBuilder2 = new StringBuilder(75);
                stringBuilder2.append("updating last item time (old:new) ");
                stringBuilder2.append(j);
                stringBuilder2.append(":");
                stringBuilder2.append(a);
                bli.m896d(str, stringBuilder2.toString());
                coy coy = this.f2742c;
                coy.f13080k = Math.max(coy.f13080k, a);
            }
            for (err err : list) {
                Uri uri = err.mo6541g().f4384h;
                Uri d = this.f2742c.f13076g.mo7413d(uri);
                if (d == null || this.f2742c.mo7813a(uri) == crb.f2784a) {
                    String str3 = coy.f13070a;
                    str = String.valueOf(uri);
                    StringBuilder stringBuilder3 = new StringBuilder(String.valueOf(str).length() + 24);
                    stringBuilder3.append("updating with new item: ");
                    stringBuilder3.append(str);
                    bli.m896d(str3, stringBuilder3.toString());
                    this.f2742c.mo7825a(err, cov.m8617a(err) ^ 1);
                } else {
                    str2 = coy.f13070a;
                    str = String.valueOf(d);
                    StringBuilder stringBuilder4 = new StringBuilder(String.valueOf(str).length() + 25);
                    stringBuilder4.append("skipping session source: ");
                    stringBuilder4.append(str);
                    bli.m896d(str2, stringBuilder4.toString());
                }
            }
            knk knk = this.f2741b;
            if (knk != null) {
                knk.mo15641a(null);
            }
        } else {
            bli.m898e(coy.f13070a, "null data returned from new photos query");
        }
        this.f2742c.f13081l.mo8857b();
    }
}
