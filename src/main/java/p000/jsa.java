package p000;

import android.graphics.Bitmap;
import com.google.android.libraries.smartburst.buffers.FeatureTable;
import com.google.android.libraries.smartburst.filterpacks.motion.MotionStatistics;
import java.util.List;

/* compiled from: PG */
/* renamed from: jsa */
public final class jsa implements jry {
    /* renamed from: a */
    private final FeatureTable f21691a;
    /* renamed from: b */
    private final jrg f21692b;
    /* renamed from: c */
    private final Object f21693c = new Object();
    /* renamed from: d */
    private boolean f21694d;
    /* renamed from: e */
    private boolean f21695e;

    public jsa(FeatureTable featureTable, jrg jrg) {
        jri.m13404b((Object) featureTable);
        jri.m13404b((Object) jrg);
        this.f21691a = featureTable;
        this.f21692b = jrg;
        this.f21694d = false;
    }

    /* renamed from: a */
    public final jxa mo9540a(long j, Bitmap bitmap) {
        float f;
        jky jky;
        float f2;
        jxa a;
        jri.m13404b((Object) bitmap);
        jkz rowIterator = this.f21691a.getRowIterator(this.f21691a.getEarliestTimestamp());
        float f3 = 0.0f;
        while (true) {
            f = f3;
            if (!rowIterator.mo9482a()) {
                break;
            }
            jky = (jky) rowIterator.next();
            float value = jky.mo9479a(jza.MOTION_SALIENCY).getValue();
            if (jky.mo9481b() > j) {
                break;
            }
            f3 = f + value;
        }
        jkz rowIterator2 = this.f21691a.getRowIterator(Math.max(this.f21691a.getEarliestTimestamp(), -1000000000 + j));
        f3 = 0.0f;
        while (true) {
            f2 = f3;
            if (!rowIterator2.mo9482a()) {
                break;
            }
            jky = (jky) rowIterator2.next();
            if (jky.mo9481b() > 1000000000 + j) {
                break;
            }
            f3 = jky.mo9479a(jza.MOTION_SALIENCY).getValue() + f2;
        }
        float f4 = f2 / 60.000004f;
        synchronized (this.f21693c) {
            if (!this.f21694d) {
                boolean z;
                List d = this.f21692b.mo13834d();
                MotionStatistics cumulativeMotionStatistics = MotionStatistics.getCumulativeMotionStatistics(this.f21691a, ((Long) d.get(0)).longValue(), ((Long) d.get(d.size() - 1)).longValue(), 0.1f, 0.15f, 0.15f);
                if (cumulativeMotionStatistics.isMovementTooLarge()) {
                    z = true;
                } else if (cumulativeMotionStatistics.hasTooManyInvalidFrames()) {
                    z = true;
                } else {
                    z = false;
                }
                this.f21695e = z;
                this.f21694d = true;
            }
            a = new jxa().mo9590a(jxa.f8426q, Float.valueOf(f)).mo9590a(jxa.f8427r, Float.valueOf(f4)).mo9590a(jxa.f8428s, Boolean.valueOf(this.f21695e));
        }
        return a;
    }

    public final String toString() {
        return "MotionMetadataExtractor";
    }
}
