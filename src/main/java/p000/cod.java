package p000;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* renamed from: cod */
public final class cod extends C0664com {
    /* renamed from: a */
    private static final String f23239a = bli.m887a("CBurstTask");

    public cod(jrg jrg, int i, cjn cjn, gkr gkr, gln gln, jrg jrg2, jrg jrg3, File file, jqo jqo, grw grw, ExecutorService executorService, dpu dpu, UUID uuid, gsp gsp) {
        super(jrg, i, cjn, gkr, gln, jrg2, jrg3, file, jqo, grw, executorService, dpu, uuid, gsp);
    }

    public final void addFinishedCallback(iqb iqb) {
        throw new RuntimeException("Not implemented yet");
    }

    /* renamed from: a */
    public final void mo12882a(Context context) {
        Object obj = this.f13054k;
        jri.m13404b(obj);
        String str = f23239a;
        int f = obj.mo13836f();
        StringBuilder stringBuilder = new StringBuilder(37);
        stringBuilder.append("rasterize frame previews: ");
        stringBuilder.append(f);
        bli.m896d(str, stringBuilder.toString());
        List arrayList = new ArrayList(obj.mo13836f());
        Iterable arrayList2 = new ArrayList(obj.mo13836f());
        for (Long longValue : obj.mo13835e()) {
            long longValue2 = longValue.longValue();
            gob c = this.f13048e.mo13375c();
            jaq a = obj.mo13829b(longValue2).mo9275a(jlk.f8281a, jkm.m13148b(this.f13053j, context));
            arrayList.add(new coq(longValue2, 0.0f, c, a, false, false, c.f19413c, new File(this.f13052i, jxr.m4736a(longValue2))));
            arrayList2.add(a.mo9275a(jlk.f8281a, new cos(c, C0252go.f5884bd)));
        }
        jaq a2 = ((coq) arrayList.get(0)).f2727d.mo9275a(jlk.f8281a, new cor(this.f13048e));
        arrayList2.add(a2);
        a2.mo9282a(izw.f21401a);
        jli.m13202c(jli.m13188a(arrayList2));
        this.f13051h.mo2337a();
        this.f13057n.mo7384a(this.f13054k.mo13836f(), arrayList.size());
        Map map = (Map) jli.m13202c(mo12879a(arrayList, this.f13050g));
        jaq a3 = mo12880a(map, arrayList, new coe(this.f13054k.mo13834d(), this.f13048e.mo13383l()));
        jli.m13189a(new ArrayList(map.values()), this.f13050g, ion.m4002a()).mo9282a(izw.f21401a);
        jli.m13189a(khb.m4924a(this.f13054k, this.f13055l), this.f13050g, ion.m4002a()).mo9282a(izw.f21401a);
        jli.m13202c(a3);
    }

    public final void removeFinishedCallback(iqb iqb) {
        throw new RuntimeException("Not implemented yet");
    }

    public final void resume() {
    }

    public final void suspend() {
    }
}
