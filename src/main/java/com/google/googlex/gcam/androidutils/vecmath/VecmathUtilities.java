package com.google.googlex.gcam.androidutils.vecmath;

import android.graphics.Point;
import android.graphics.Rect;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
public final class VecmathUtilities {
    private VecmathUtilities() {
    }

    public static String matrix2x2ToString(float[] fArr) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 2; i++) {
            stringBuilder.append("[ ");
            for (int i2 = 0; i2 < 2; i2++) {
                stringBuilder.append(fArr[(i2 + i2) + i]);
                stringBuilder.append("\t");
            }
            stringBuilder.append("]\n");
        }
        return stringBuilder.toString();
    }

    public static String matrix3x3ToString(float[] fArr) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            stringBuilder.append("[ ");
            for (int i2 = 0; i2 < 3; i2++) {
                stringBuilder.append(fArr[(i2 * 3) + i]);
                stringBuilder.append("\t");
            }
            stringBuilder.append("]\n");
        }
        return stringBuilder.toString();
    }

    public static float[] matrix4fListToFloatArray(List list) {
        float[] fArr = new float[(list.size() << 4)];
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return fArr;
            }
            Matrix4f matrix4f = (Matrix4f) it.next();
            int i3 = i2 << 4;
            fArr[i3] = matrix4f.m00;
            fArr[i3 + 1] = matrix4f.m10;
            fArr[i3 + 2] = matrix4f.m20;
            fArr[i3 + 3] = matrix4f.m30;
            fArr[i3 + 4] = matrix4f.m01;
            fArr[i3 + 5] = matrix4f.m11;
            fArr[i3 + 6] = matrix4f.m21;
            fArr[i3 + 7] = matrix4f.m31;
            fArr[i3 + 8] = matrix4f.m02;
            fArr[i3 + 9] = matrix4f.m12;
            fArr[i3 + 10] = matrix4f.m22;
            fArr[i3 + 11] = matrix4f.m32;
            fArr[i3 + 12] = matrix4f.m03;
            fArr[i3 + 13] = matrix4f.m13;
            fArr[i3 + 14] = matrix4f.m23;
            fArr[i3 + 15] = matrix4f.m33;
            i = i2 + 1;
        }
    }

    public static String matrix4x4ToString(float[] fArr) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            stringBuilder.append("[ ");
            for (int i2 = 0; i2 < 4; i2++) {
                stringBuilder.append(fArr[(i2 << 2) + i]);
                stringBuilder.append("\t");
            }
            stringBuilder.append("]\n");
        }
        return stringBuilder.toString();
    }

    public static Rect2i toRect2i(Rect rect) {
        return new Rect2i(rect.left, rect.top, rect.width(), rect.height());
    }

    public static Vector2f toVector2f(Point point) {
        return new Vector2f((float) point.x, (float) point.y);
    }

    public static Vector3f toVector3f(Point point) {
        return new Vector3f((float) point.x, (float) point.y, 0.0f);
    }

    public static Vector4f toVector4f(Point point) {
        return new Vector4f((float) point.x, (float) point.y, 0.0f, 1.0f);
    }

    public static float[] vector4fListToFloatArray(List list) {
        float[] fArr = new float[(list.size() << 2)];
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return fArr;
            }
            Vector4f vector4f = (Vector4f) it.next();
            int i3 = i2 << 2;
            fArr[i3] = vector4f.f2705x;
            fArr[i3 + 1] = vector4f.f2706y;
            fArr[i3 + 2] = vector4f.f2707z;
            fArr[i3 + 3] = vector4f.f2704w;
            i = i2 + 1;
        }
    }
}
