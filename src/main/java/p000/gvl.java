package p000;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;

/* renamed from: gvl */
final /* synthetic */ class gvl implements iqt {
    /* renamed from: a */
    private final gvj f19689a;

    gvl(gvj gvj) {
        this.f19689a = gvj;
    }

    /* renamed from: a */
    public final void mo8826a(Object obj) {
        gvj gvj = this.f19689a;
        PointF pointF = (PointF) obj;
        RectF a = gvj.f19678c.mo7882a();
        hig hig = gvj.f19677b;
        float[] fArr = new float[]{pointF.x, pointF.y};
        if (gvj.f19679d == iut.FRONT) {
            fArr[0] = 1.0f - fArr[0];
        }
        int a2 = hig.f6593b.mo7041f().mo8806a();
        Matrix matrix = new Matrix();
        matrix.setRotate((float) (-a2), 0.5f, 0.5f);
        matrix.mapPoints(fArr);
        gvj.f19676a.mo12318b(new PointF(fArr[0] * a.width(), a.height() * fArr[1]));
    }
}
