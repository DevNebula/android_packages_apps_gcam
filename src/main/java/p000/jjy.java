package p000;

import android.annotation.TargetApi;
import android.content.Context;
import com.google.android.libraries.smartburst.filterfw.geometry.MinDimensionScaler;
import com.google.android.libraries.smartburst.filterfw.geometry.Scaler;
import com.google.android.libraries.smartburst.filterpacks.motion.FrameWarper;
import com.google.android.libraries.smartburst.filterpacks.motion.HomographyTransform;
import com.google.android.libraries.smartburst.filterpacks.motion.MotionStabilizer;
import com.google.googlex.gcam.hdrplus.MetadataConverter;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Executor;

@TargetApi(19)
/* compiled from: PG */
/* renamed from: jjy */
public final class jjy extends jip {
    /* renamed from: e */
    private static final Scaler f24763e = new MinDimensionScaler(480);
    /* renamed from: d */
    public final boolean f24764d;
    /* renamed from: f */
    private final jjf f24765f;
    /* renamed from: g */
    private final MotionStabilizer f24766g;
    /* renamed from: h */
    private final List f24767h;

    public jjy(String str, int i, long j, jjf jjf, MotionStabilizer motionStabilizer, boolean z, List list) {
        super(str, i, j);
        jri.m13404b((Object) jjf);
        jri.m13404b((Object) motionStabilizer);
        jri.m13404b((Object) list);
        jri.m13395a(list.isEmpty() ^ 1);
        this.f24765f = jjf;
        this.f24766g = motionStabilizer;
        this.f24764d = z;
        this.f24767h = ken.m13713a((Collection) list);
    }

    /* renamed from: a */
    private final List m16623a(List list) {
        int i = 0;
        List arrayList = new ArrayList();
        long longValue = ((Long) this.f24767h.get(0)).longValue();
        List list2 = this.f24767h;
        long longValue2 = ((Long) list2.get(list2.size() - 1)).longValue();
        for (Long longValue3 : list) {
            long longValue4 = longValue3.longValue();
            if (longValue4 >= longValue && longValue4 <= longValue2) {
                HomographyTransform compensationTransformForTimestamp;
                if (this.f24764d) {
                    compensationTransformForTimestamp = this.f24766g.getCompensationTransformForTimestamp(longValue4);
                } else {
                    compensationTransformForTimestamp = HomographyTransform.createIdentityHomographyTransform();
                }
                int i2 = i + 1;
                arrayList.add(new jke(longValue4, i, compensationTransformForTimestamp));
                i = i2;
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    private final int m16625c() {
        List list = this.f24767h;
        return Math.max(1000, Math.min(MetadataConverter.COLOR_SPACE_TRANSFORM_MATRIX_RATIONAL_DENOMINATOR, (int) ((((Long) list.get(list.size() - 1)).longValue() - ((Long) this.f24767h.get(0)).longValue()) / 1000000)));
    }

    /* renamed from: b */
    private final jwx m16624b(jrg jrg) {
        int[] scale = f24763e.scale(jrg.f21668a, jrg.f21669b);
        return new jwx(this.f21537a, "image/gif", this.f21539c, scale[0], scale[1]);
    }

    /* renamed from: a */
    public final Collection mo13807a() {
        return this.f24767h;
    }

    /* renamed from: a */
    public final jaq mo9466a(jrg jrg, jxo jxo, Executor executor, jqo jqo) {
        boolean z;
        jri.m13404b((Object) jrg);
        jri.m13404b((Object) jxo);
        jri.m13404b((Object) executor);
        Iterable a = m16623a(jrg.mo13834d());
        if (a.size() >= 3) {
            z = true;
        } else {
            z = false;
        }
        jri.m13406b(z, (Object) "Too few frames in segment to create a GIF.");
        int c = m16625c() / a.size();
        Object b = m16624b(jrg);
        jzp a2 = jzp.m4772a(b.f8439e, b.f8438d);
        jje jje = new jje(this.f24765f);
        OutputStream bufferedOutputStream = new BufferedOutputStream(jxo.mo9601a(b), b.f8439e * b.f8438d);
        FrameWarper frameWarper = new FrameWarper(a2.f8515a, a2.f8516b);
        return jli.m13197b(jli.m13193a(a, executor, new jkf(this, jrg, a2, jqo, frameWarper)), executor, new jkd(jje, a2, c, a.size())).mo9275a(executor, new jki(bufferedOutputStream)).mo9275a(executor, ion.m3999a(b)).mo9279a(executor, new jkc(frameWarper));
    }

    /* renamed from: a */
    public final jaq mo9465a(jrg jrg, Context context, Executor executor, jqo jqo) {
        boolean z;
        jri.m13404b((Object) jrg);
        jri.m13404b((Object) executor);
        Iterable a = m16623a(jrg.mo13834d());
        if (a.size() >= 3) {
            z = true;
        } else {
            z = false;
        }
        jri.m13406b(z, (Object) "Too few frames in segment to create a GIF.");
        return jli.m13198b(a, executor, new jka(jrg, jqo)).mo9275a(executor, new jjz(context, m16625c() / a.size()));
    }
}
