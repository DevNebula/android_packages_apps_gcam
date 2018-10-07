package p000;

import android.graphics.Point;
import android.graphics.Rect;
import android.hardware.camera2.params.Face;

/* compiled from: PG */
/* renamed from: gic */
public final class gic {
    /* renamed from: a */
    public final Rect f5440a;
    /* renamed from: b */
    public final int f5441b;
    /* renamed from: c */
    public final Point f5442c;
    /* renamed from: d */
    public final Point f5443d;
    /* renamed from: e */
    public final Point f5444e;

    public gic(Rect rect, int i) {
        this(rect, i, null, null, null);
    }

    public gic(Rect rect, int i, Point point, Point point2, Point point3) {
        this.f5440a = rect;
        this.f5441b = i;
        this.f5442c = point;
        this.f5443d = point2;
        this.f5444e = point3;
    }

    /* renamed from: a */
    public static gic m2614a(Face face) {
        return new gic(face.getBounds(), face.getScore(), face.getLeftEyePosition(), face.getRightEyePosition(), face.getMouthPosition());
    }
}
