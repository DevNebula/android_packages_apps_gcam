package p000;

import com.google.android.libraries.smartburst.buffers.FeatureTable;
import com.google.android.libraries.smartburst.filterpacks.motion.MotionStatistics;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: PG */
/* renamed from: jve */
public final class jve extends jum {
    /* renamed from: a */
    private final FeatureTable f24842a;
    /* renamed from: b */
    private final float f24843b = 0.3f;
    /* renamed from: c */
    private final float f24844c = 0.3f;
    /* renamed from: d */
    private final float f24845d = 0.25f;

    public jve(FeatureTable featureTable) {
        jri.m13404b((Object) featureTable);
        this.f24842a = featureTable;
    }

    /* renamed from: a */
    public final juh mo13869a(juh juh) {
        jri.m13404b((Object) juh);
        Collection b = khb.m4945b();
        Iterator it = juh.iterator();
        long j = -1;
        while (it.hasNext()) {
            long longValue = ((Long) it.next()).longValue();
            MotionStatistics motionStatistics = new MotionStatistics(this.f24843b, this.f24844c, this.f24845d);
            if (j != -1) {
                motionStatistics = MotionStatistics.getCumulativeMotionStatistics(this.f24842a, j, longValue, this.f24843b, this.f24844c, this.f24845d);
            }
            if (motionStatistics.isMovementTooLarge()) {
                j = longValue;
            } else if (motionStatistics.hasTooManyInvalidFrames()) {
                j = longValue;
            } else {
                b.add(Long.valueOf(longValue));
                j = longValue;
            }
        }
        return new juh(b);
    }

    public final String toString() {
        float f = this.f24843b;
        float f2 = this.f24844c;
        float f3 = this.f24845d;
        StringBuilder stringBuilder = new StringBuilder(131);
        stringBuilder.append("SmallMotionSegmentFilter[maxValidMovement=");
        stringBuilder.append(f);
        stringBuilder.append(", maxFrameMovement=");
        stringBuilder.append(f2);
        stringBuilder.append(", maxInvalidFramesRatio=");
        stringBuilder.append(f3);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
