package p000;

import android.net.Uri;
import android.os.AsyncTask;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* renamed from: cpj */
final class cpj extends AsyncTask {
    /* renamed from: a */
    private final /* synthetic */ coy f2745a;

    cpj(coy coy) {
        this.f2745a = coy;
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        int i = 0;
        crb[] crbArr = (crb[]) objArr;
        this.f2745a.f13081l.mo8856a("RemoveDeletedTask");
        crb crb = crbArr[0];
        List arrayList = new ArrayList();
        Set hashSet = new HashSet();
        cqm cqm = this.f2745a.f13074e;
        hashSet.addAll(cpn.m1441a(cqm.f13147a, cqk.f2769a, new String[]{"_id"}, "datetaken DESC"));
        cqx cqx = this.f2745a.f13075f;
        hashSet.addAll(cpn.m1441a(cqx.f13169c, cqr.f2773a, new String[]{"_id"}, "datetaken DESC, _id DESC"));
        while (i < crb.f2788d.f2781c) {
            err e = crb.mo5681a(i).mo5692e();
            eru g = e.mo6541g();
            if (!(g.f4385i || e == this.f2745a.f13082m || g.mo6554a(hashSet))) {
                arrayList.add(g.f4384h);
            }
            i++;
        }
        this.f2745a.f13081l.mo8857b();
        return arrayList;
    }

    protected final /* synthetic */ void onPostExecute(Object obj) {
        List<Uri> list = (List) obj;
        if (this.f2745a.f13073d.mo1827d()) {
            bli.m898e(coy.f13070a, "Activity is destroyed. Canceling load.");
            return;
        }
        this.f2745a.f13081l.mo8856a("RemoveDeleted");
        for (Uri a : list) {
            cre a2 = this.f2745a.f13078i.mo5682a(a);
            if (a2 != cre.f2792c) {
                this.f2745a.mo7830b(a2);
            }
        }
        this.f2745a.f13081l.mo8857b();
    }
}
