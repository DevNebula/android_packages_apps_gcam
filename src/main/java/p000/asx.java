package p000;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;

/* compiled from: PG */
/* renamed from: asx */
public final class asx {
    /* renamed from: a */
    public final ilp f978a;
    /* renamed from: b */
    public final irs f979b;
    /* renamed from: c */
    private final hig f980c;
    /* renamed from: d */
    private final hik f981d;
    /* renamed from: e */
    private final asn f982e;

    public asx(hig hig, hik hik, ilp ilp, irs irs, asn asn) {
        this.f980c = hig;
        this.f981d = hik;
        this.f978a = ilp;
        this.f979b = irs;
        this.f982e = asn;
    }

    /* renamed from: a */
    public final aub mo1788a(iut iut, PointF pointF, atc atc) {
        RectF a = this.f981d.mo7882a();
        hig hig = this.f980c;
        if (pointF.x < 0.0f || pointF.y < 0.0f) {
            String str = hig.f6592a;
            String valueOf = String.valueOf(pointF);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 22);
            stringBuilder.append("Negative focus point: ");
            stringBuilder.append(valueOf);
            bli.m898e(str, stringBuilder.toString());
        }
        float[] fArr = new float[]{hig.m3226a((pointF.x - a.left) / a.width()), hig.m3226a((pointF.y - a.top) / a.height())};
        int a2 = hig.f6593b.mo7041f().mo8806a();
        Matrix matrix = new Matrix();
        matrix.setRotate((float) a2, 0.5f, 0.5f);
        matrix.mapPoints(fArr);
        if (iut == iut.FRONT) {
            fArr[0] = 1.0f - fArr[0];
        }
        aub a3 = this.f982e.mo1782a(new asw(new PointF(fArr[0], fArr[1])));
        kow.m13878a(atc.mo1792a(), new asz(this, pointF, a), kpq.f8776a);
        return a3;
    }
}
