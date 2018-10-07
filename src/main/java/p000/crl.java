package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/* renamed from: crl */
final /* synthetic */ class crl implements Runnable {
    /* renamed from: a */
    private final crj f2795a;
    /* renamed from: b */
    private final kpw f2796b;

    crl(crj crj, kpw kpw) {
        this.f2795a = crj;
        this.f2796b = kpw;
    }

    public final void run() {
        crj crj = this.f2795a;
        knk knk = this.f2796b;
        crj.f13198f.mo8856a("OnDemandLoader.loadNextBatchInBackground");
        if (!crj.f13197e.mo13666a()) {
            int i;
            List<err> a = crj.f13196d.mo5693a(crj.f13194b);
            if (a.size() < crj.f13194b) {
                bli.m894c(crj.f13193a, "All FilmstripItems loaded. No more partial loading after this.");
                crj.f13200h.set(true);
            }
            Collections.sort(a, new cqh(new Date()));
            for (err err : a) {
                crm crm = new crm();
                err.mo6547m();
            }
            for (i = 0; i < a.size(); i++) {
                crj.f13203k.mo5683a((err) a.get(i));
            }
            crj.f13198f.mo8856a("OnDemandLoader.setLastItems");
            crj.f13202j.clear();
            if (!crj.f13200h.get()) {
                crb crb = crj.f13203k;
                i = crb.f2788d.f2781c;
                if (i > 0) {
                    cre a2 = crb.mo5681a(i - 1);
                    crj.f13202j.add(a2);
                    cre cre = a2;
                    for (int i2 = 1; i2 < 10 && cre != cre.f2792c; i2++) {
                        cre = cre.mo5690c();
                        crj.f13202j.add(cre);
                    }
                    if (cre != cre.f2792c) {
                        String str = crj.f13193a;
                        int size = crj.f13202j.size();
                        long j = ((cre) crj.f13202j.get(0)).mo5692e().mo6541g().f4378b;
                        ArrayList arrayList = crj.f13202j;
                        long j2 = ((cre) arrayList.get(arrayList.size() - 1)).mo5692e().mo6541g().f4378b;
                        StringBuilder stringBuilder = new StringBuilder(94);
                        stringBuilder.append("setLastItems(): watching (");
                        stringBuilder.append(size);
                        stringBuilder.append(") nodes from ");
                        stringBuilder.append(j);
                        stringBuilder.append(" to ");
                        stringBuilder.append(j2);
                        bli.m888a(str, stringBuilder.toString());
                    }
                }
            }
            crj.f13198f.mo8857b();
            crj.f13199g.set(false);
            String str2 = crj.f13193a;
            i = crj.f13203k.f2788d.f2781c;
            StringBuilder stringBuilder2 = new StringBuilder(59);
            stringBuilder2.append("loadNextBatchInBackground() loaded total items: ");
            stringBuilder2.append(i);
            bli.m888a(str2, stringBuilder2.toString());
            if (knk != null) {
                knk.mo15641a(null);
            }
        }
        crj.f13198f.mo8857b();
    }
}
