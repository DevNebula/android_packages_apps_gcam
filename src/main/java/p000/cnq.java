package p000;

import android.content.Context;
import android.util.Pair;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* renamed from: cnq */
public final class cnq extends C0664com {
    /* renamed from: a */
    public static final String f23227a = bli.m887a("ArtfctGenTask");
    /* renamed from: b */
    public final gsp f23228b;
    /* renamed from: c */
    public final ird f23229c;
    /* renamed from: d */
    public final glj f23230d;
    /* renamed from: p */
    private final jsb f23231p;
    /* renamed from: q */
    private final jsw f23232q;
    /* renamed from: r */
    private final jjd f23233r;
    /* renamed from: s */
    private final boolean f23234s;
    /* renamed from: t */
    private final irs f23235t;

    public cnq(jsb jsb, jsw jsw, jjd jjd, jrg jrg, int i, cjn cjn, gkr gkr, gln gln, jrg jrg2, jrg jrg3, File file, jqo jqo, grw grw, ExecutorService executorService, dpu dpu, UUID uuid, boolean z, gsp gsp, ird ird, irs irs, glj glj) {
        super(jrg, i, cjn, gkr, gln, jrg2, jrg3, file, jqo, grw, executorService, dpu, uuid, gsp);
        this.f23231p = jsb;
        this.f23232q = jsw;
        this.f23233r = jjd;
        this.f23234s = z;
        this.f23228b = gsp;
        this.f23229c = ird;
        this.f23235t = irs;
        this.f23230d = glj;
    }

    public final void addFinishedCallback(iqb iqb) {
        throw new RuntimeException("Not implemented yet");
    }

    /* renamed from: a */
    protected final void mo12882a(Context context) {
        this.f23229c.mo8856a("ArtifactGenerationTask#doPostProcessing");
        ArrayList a = khb.m4924a(this.f13054k, this.f13055l);
        try {
            long longValue;
            Long valueOf;
            jsw jsw = this.f23232q;
            jqo jqo = this.f13053j;
            Executor executor = this.f13050g;
            for (Long valueOf2 : jsw.f8320d.f21670c) {
                longValue = valueOf2.longValue();
                jxa jxa = new jxa();
                jxa.mo9590a(jxa.f8410a, Long.valueOf(longValue));
                jsw.f8321e.mo9600a(jxa);
            }
            jaq a2 = jli.m13198b(jsw.f8320d.mo13832c(), executor, new jsy(jsw, jqo)).mo9275a(executor, new jta(jsw)).mo9275a(executor, ion.m3999a(Pair.create(jsw.f8323g, jsw.f8321e)));
            a2.mo9275a(this.f13050g, new cnr(this)).mo9282a(izw.f21401a);
            Object obj = (jis) jli.m13202c(a2.mo9277a(jlk.f8281a, new cnu(this.f23231p)));
            jxm jxm = (jxm) ((Pair) jli.m13202c(a2)).second;
            grw grw = this.f13057n;
            klt[] kltArr = new klt[obj.f8243a.size()];
            Iterator it = obj.mo9471b().iterator();
            int i = 0;
            while (true) {
                int i2 = i;
                jip jip;
                Object obj2;
                if (it.hasNext()) {
                    jip = (jip) it.next();
                    klt klt = new klt();
                    klt.f25296b = jip.mo13807a().size();
                    String str = jip.f21537a;
                    switch (str.hashCode()) {
                        case -2055687343:
                            if (!str.equals("GIF_Action")) {
                                obj2 = -1;
                                break;
                            } else {
                                obj2 = null;
                                break;
                            }
                        case 2364907:
                            if (!str.equals("GIF_Summary")) {
                                obj2 = -1;
                                break;
                            } else {
                                obj2 = 1;
                                break;
                            }
                        default:
                            obj2 = -1;
                            break;
                    }
                    switch (obj2) {
                        case null:
                            i = 1;
                            break;
                        case 1:
                            i = 1;
                            break;
                        default:
                            i = 0;
                            break;
                    }
                    klt.f25295a = i;
                    i = i2 + 1;
                    kltArr[i2] = klt;
                } else {
                    grw.f6021a.f25316d = kltArr;
                    if (obj.mo9471b().isEmpty()) {
                        throw new IllegalStateException(String.format("No artifacts generated (%d images captured)", new Object[]{Integer.valueOf(this.f13056m.mo13836f())}));
                    }
                    List b = khb.m4945b();
                    i2 = Integer.MIN_VALUE;
                    for (jip jip2 : obj.mo9471b()) {
                        if (jip2.f21538b > i2) {
                            i2 = jip2.f21538b;
                        }
                    }
                    for (jip jip22 : obj.mo9471b()) {
                        if (jip22.f21538b == i2) {
                            b.add(jip22);
                        }
                    }
                    if (b.isEmpty()) {
                        String valueOf3 = String.valueOf(obj);
                        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf3).length() + 25);
                        stringBuilder.append("No cover artifact found: ");
                        stringBuilder.append(valueOf3);
                        throw new IllegalStateException(stringBuilder.toString());
                    }
                    kbg c;
                    long longValue2;
                    jip jip3 = (jip) b.get(0);
                    cnv cnv = new cnv(this, context, jip3);
                    coe coe = new coe(this.f13054k.mo13834d(), this.f13048e.mo13383l());
                    if (this.f23234s) {
                        c = kbg.m4804c(cnv.mo2411a(this.f13054k, coe.f2412b));
                    } else {
                        c = kau.f21835a;
                    }
                    jrg jrg = this.f13054k;
                    jri.m13404b(obj);
                    jjd jjd = this.f23233r;
                    Object jjb = new jjb((byte) 0);
                    obj2 = new ArrayList();
                    for (Long valueOf22 : jrg.mo13832c()) {
                        obj2.add(Float.valueOf(jjd.f8244a.mo9554a(valueOf22.longValue()).mo9629a()));
                    }
                    long longValue3 = ((Long) jrg.mo13832c().get(obj2.indexOf(Float.valueOf(((Float) Collections.max(obj2)).floatValue())))).longValue();
                    Set set = jrg.f21670c;
                    int i3 = 0;
                    for (Long valueOf222 : jrg.mo13835e()) {
                        float f;
                        boolean z;
                        longValue2 = valueOf222.longValue();
                        boolean contains = set.contains(Long.valueOf(longValue2));
                        if (contains) {
                            f = Float.NEGATIVE_INFINITY;
                        } else {
                            f = jjd.f8244a.mo9554a(longValue2).mo9629a();
                        }
                        int i4 = i3 + 1;
                        if (longValue2 == longValue3) {
                            z = true;
                        } else {
                            z = false;
                        }
                        jjb.mo9470a(new jkr(longValue2, i3, f, z, contains));
                        i3 = i4;
                    }
                    jjb jjb2 = (jjb) kow.m13881c(jli.m13199b(jjb).mo9281a());
                    List arrayList = new ArrayList(jjb2.f8243a.size());
                    Iterable arrayList2 = new ArrayList();
                    for (jkr jkr : jjb2.mo9471b()) {
                        longValue2 = jkr.f21590a;
                        float f2 = jkr.f21591b;
                        gob c2 = this.f13048e.mo13375c();
                        jaq a3 = jrg.mo13829b(longValue2).mo9275a(jlk.f8281a, jkm.m13148b(this.f13053j, context));
                        arrayList.add(new coq(longValue2, f2, c2, a3, jkr.f21592c, jkr.f21593d, c2.f19413c, new File(this.f13052i, jxr.m4736a(longValue2))));
                        arrayList2.add(a3.mo9275a(jlk.f8281a, new cos(c2, C0252go.f5884bd)));
                    }
                    Collections.sort(arrayList, new cnt());
                    jaq a4 = ((coq) arrayList.get(0)).f2727d.mo9275a(jlk.f8281a, new cor(this.f13048e));
                    arrayList2.add(a4);
                    a4.mo9282a(izw.f21401a);
                    jli.m13202c(jli.m13188a(arrayList2));
                    this.f13051h.mo2337a();
                    File file = new File(gtu.m2875a().mo7425a(), this.f13048e.mo13385n());
                    if (file.mkdirs() || file.isDirectory()) {
                        a2.mo9275a(this.f13050g, new cnx(file)).mo9282a(izw.f21401a);
                        this.f13057n.mo7384a(this.f13054k.mo13836f(), arrayList.size());
                        Map map = (Map) jli.m13202c(mo12879a(arrayList, this.f13050g));
                        jli.m13202c(mo12880a(map, arrayList, coe));
                        jli.m13189a(new ArrayList(map.values()), this.f13050g, ion.m4002a()).mo9282a(izw.f21401a);
                        Iterable arrayList3 = new ArrayList();
                        if (c.mo9709b()) {
                            jrg jrg2;
                            if (!(jiu.m4572c(jip3.f21537a) || jiu.m4573d(jip3.f21537a)) || this.f13055l.mo13836f() <= this.f13054k.mo13836f()) {
                                jrg a5 = jqk.m13339a(file, jxr.m4738a(jxm)).mo9217a();
                                a.add(a5);
                                jrg2 = a5;
                            } else {
                                jrg2 = this.f13055l;
                            }
                            arrayList3.add(cnv.mo2412a(jrg2, file, (gkr) c.mo9706a()).mo9283b(new ikd(), new cns(c)));
                        }
                        arrayList3.add(mo12878a(file));
                        if (jlo.m4600c()) {
                            File file2 = this.f13052i;
                            Map hashMap = new HashMap();
                            for (Long valueOf2222 : this.f13054k.mo13835e()) {
                                longValue = valueOf2222.longValue();
                                valueOf2222 = Long.valueOf(longValue);
                                StringBuilder stringBuilder2 = new StringBuilder(38);
                                stringBuilder2.append("low-res-frame-");
                                stringBuilder2.append(longValue);
                                stringBuilder2.append(".jpg");
                                hashMap.put(valueOf2222, stringBuilder2.toString());
                            }
                            arrayList3.add(super.mo12881a(this.f13054k, file2, hashMap));
                        }
                        jli.m13202c(jli.m13188a(arrayList3));
                        return;
                    }
                    throw new IllegalStateException("Unable to create burst output directory");
                }
            }
        } finally {
            jli.m13189a((Iterable) a, this.f13050g, ion.m4002a()).mo9282a(izw.f21401a);
            this.f23229c.mo8857b();
        }
    }

    public final void removeFinishedCallback(iqb iqb) {
        throw new RuntimeException("Not implemented yet");
    }

    public final void resume() {
        this.f23231p.resume();
    }

    public final void suspend() {
        this.f23231p.suspend();
    }
}
