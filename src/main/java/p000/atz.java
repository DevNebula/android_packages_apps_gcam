package p000;

import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.params.MeteringRectangle;

/* compiled from: PG */
/* renamed from: atz */
public final class atz implements fdr {
    /* renamed from: a */
    private static final String f10759a = bli.m887a("PointMtgParams");
    /* renamed from: b */
    private final PointF f10760b;
    /* renamed from: c */
    private final PointF f10761c;
    /* renamed from: d */
    private final fdw f10762d;

    private atz(PointF pointF, PointF pointF2, fdw fdw) {
        this.f10760b = pointF;
        this.f10761c = pointF2;
        this.f10762d = fdw;
    }

    /* renamed from: a */
    private static int m7072a(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    /* renamed from: a */
    public static atz m7074a(PointF pointF, PointF pointF2, int i, fdy fdy) {
        boolean z;
        boolean z2 = true;
        if (i % 90 == 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13396a(z, (Object) "sensorOrientation must be a multiple of 90");
        if (i < 0) {
            z2 = false;
        }
        jri.m13396a(z2, (Object) "sensorOrientation must not be negative");
        return new atz(pointF, pointF2, new fdw(i % 360));
    }

    /* renamed from: a */
    public final MeteringRectangle[] mo6760a(Rect rect) {
        return new MeteringRectangle[]{m7073a(this.f10761c, rect)};
    }

    /* renamed from: b */
    public final MeteringRectangle[] mo6761b(Rect rect) {
        return new MeteringRectangle[]{m7073a(this.f10760b, rect)};
    }

    /* renamed from: a */
    private final MeteringRectangle m7073a(PointF pointF, Rect rect) {
        if (rect.width() < 0 || rect.height() < 0) {
            String str = f10759a;
            String valueOf = String.valueOf(rect);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 21);
            stringBuilder.append("Negative cropRegion: ");
            stringBuilder.append(valueOf);
            bli.m898e(str, stringBuilder.toString());
        }
        rect.left = Math.max(0, rect.left);
        rect.top = Math.max(0, rect.top);
        rect.right = Math.max(rect.left, rect.right);
        rect.bottom = Math.max(rect.top, rect.bottom);
        int max = Math.max(0, Math.min(rect.width(), rect.height()));
        PointF a = this.f10762d.mo6763a(pointF);
        PointF pointF2 = new PointF(((float) rect.left) + (a.x * ((float) rect.width())), (a.y * ((float) rect.height())) + ((float) rect.top));
        float f = (float) ((int) (((float) max) * 0.06125f));
        Rect rect2 = new Rect((int) (pointF2.x - f), (int) (pointF2.y - f), (int) (pointF2.x + f), (int) (f + pointF2.y));
        rect2.left = atz.m7072a(rect2.left, rect.left, rect.right);
        rect2.top = atz.m7072a(rect2.top, rect.top, rect.bottom);
        rect2.right = atz.m7072a(rect2.right, rect.left, rect.right);
        rect2.bottom = atz.m7072a(rect2.bottom, rect.top, rect.bottom);
        return new MeteringRectangle(rect2, 122);
    }
}
