package p000;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.media.CameraProfile;
import com.google.android.apps.camera.stats.BurstSessionStatistics;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: com */
public abstract class C0664com implements geu {
    /* renamed from: a */
    private static final String f13044a = bli.m887a("PostProcessingTask");
    /* renamed from: b */
    private final ipz f13045b;
    /* renamed from: c */
    private final int f13046c;
    /* renamed from: d */
    private final dpu f13047d;
    /* renamed from: e */
    public final gkr f13048e;
    /* renamed from: f */
    public final gln f13049f;
    /* renamed from: g */
    public final ExecutorService f13050g;
    /* renamed from: h */
    public final cjn f13051h;
    /* renamed from: i */
    public final File f13052i;
    /* renamed from: j */
    public final jqo f13053j;
    /* renamed from: k */
    public final jrg f13054k;
    /* renamed from: l */
    public final jrg f13055l;
    /* renamed from: m */
    public final jrg f13056m;
    /* renamed from: n */
    public final grw f13057n;
    /* renamed from: o */
    public final UUID f13058o;
    /* renamed from: p */
    private final ckm f13059p = new ckm(new File(gtu.m2875a().mo7426b(), this.f13048e.mo13385n()));

    /* renamed from: a */
    protected abstract void mo12882a(Context context);

    public C0664com(jrg jrg, int i, cjn cjn, gkr gkr, gln gln, jrg jrg2, jrg jrg3, File file, jqo jqo, grw grw, ExecutorService executorService, dpu dpu, UUID uuid, gsp gsp) {
        this.f13056m = jrg;
        this.f13048e = gkr;
        this.f13049f = gln;
        this.f13054k = jrg2;
        this.f13055l = jrg3;
        this.f13050g = executorService;
        this.f13051h = cjn;
        this.f13046c = i;
        this.f13052i = file;
        this.f13053j = jqo;
        this.f13057n = grw;
        this.f13047d = dpu;
        this.f13058o = uuid;
        Point e = gsp.mo7414e(this.f13048e.mo13386o());
        this.f13045b = ipz.m4076a(e.x, e.y).mo8750a();
    }

    public get getSession() {
        return this.f13048e;
    }

    public void process(Context context) {
        try {
            mo12882a(context);
            this.f13048e.mo13378f();
            bli.m888a(f13044a, "OnBurstSaved");
            cjn cjn = this.f13051h;
            ((BurstSessionStatistics) cjn.f2262a.f2237s.burstStats().getCurrentSession()).mo12587b();
            bli.m896d(cig.f2211a, "onBurstCompleted");
            cjn.f2262a.f2232n.close();
            cjn.f2262a.f2231m.mo15641a(null);
            cjn.f2262a.mo2328a();
        } catch (Exception e) {
            this.f13051h.mo2338a(e);
        } finally {
            this.f13050g.shutdown();
            new jzy(jqk.m13349b(this.f13056m)).mo15063a();
            this.f13059p.mo2352b();
        }
    }

    /* renamed from: a */
    protected final jaq mo12880a(Map map, List list, coe coe) {
        this.f13059p.mo2353c();
        bli.m896d(f13044a, "rasterizeFramesHighRes");
        Iterable arrayList = new ArrayList(list.size());
        List arrayList2 = new ArrayList(map.keySet());
        Collections.sort(arrayList2);
        Object obj = null;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= list.size()) {
                return jas.m12966b(jli.m13188a(arrayList));
            }
            boolean z;
            long longValue;
            coq coq = (coq) list.get(i2);
            long j = coq.f2724a;
            boolean z2 = coq.f2729f;
            gob gob = coq.f2726c;
            Long valueOf = Long.valueOf(j);
            jqs jqs = (jqs) map.get(valueOf);
            if (obj != null) {
                i = C0252go.f5884bd;
            } else {
                i = C0252go.f5883bc;
            }
            int indexOf = arrayList2.indexOf(valueOf);
            long j2 = coe.f2413c;
            if (i == C0252go.f5883bc) {
                z = true;
            } else {
                z = false;
            }
            String a = jxr.m4734a(indexOf, j2, "", z, z2);
            synchronized (this) {
                longValue = ((Long) coe.f2411a.get(j)).longValue();
            }
            arrayList.add(jli.m13190a(this.f13050g, new coo(gob, coq.f2731h, a, longValue, jqs)));
            i = i2 + 1;
            obj = 1;
        }
        while (true) {
        }
    }

    /* renamed from: a */
    protected final jaq mo12878a(File file) {
        File a = coc.m1239a(file);
        if (a.mkdirs() || a.isDirectory()) {
            try {
                new File(a, ".nomedia").createNewFile();
                Map hashMap = new HashMap();
                for (Long longValue : this.f13055l.mo13835e()) {
                    long longValue2 = longValue.longValue();
                    hashMap.put(Long.valueOf(longValue2), jxr.m4739b(longValue2));
                }
                return mo12881a(this.f13055l, a, hashMap);
            } catch (IOException e) {
                throw new IllegalStateException("Unable to create .nomedia file.");
            }
        }
        throw new IllegalStateException("Unable to create med res directory.");
    }

    /* renamed from: a */
    final jaq mo12881a(jrg jrg, File file, Map map) {
        int jpegEncodingQualityParameter = CameraProfile.getJpegEncodingQualityParameter(2);
        Iterable arrayList = new ArrayList();
        for (Long longValue : jrg.mo13835e()) {
            long longValue2 = longValue.longValue();
            String str = (String) map.get(Long.valueOf(longValue2));
            if (str != null) {
                arrayList.add(jrg.mo13829b(longValue2).mo9275a(this.f13050g, new con(this, new File(file, str), jpegEncodingQualityParameter)));
            }
        }
        return jas.m12966b(jli.m13188a(arrayList));
    }

    /* renamed from: a */
    protected final jaq mo12879a(List list, Executor executor) {
        bli.m896d(f13044a, "saveCapturedImages");
        coh coh = new coh(list, this.f13058o, this.f13047d, executor, new cny());
        return jli.m13188a(coh.mo2415a(this.f13056m, this.f13045b, this.f13046c)).mo9275a(coh.f2414a, coh.f2415b);
    }
}
