package p000;

import android.graphics.Rect;
import android.util.Size;

/* compiled from: PG */
/* renamed from: gxv */
public abstract class gxv {
    /* renamed from: a */
    public abstract Rect mo7513a();

    /* renamed from: b */
    public abstract Rect mo7514b();

    /* renamed from: c */
    public abstract Rect mo7515c();

    /* renamed from: d */
    public abstract Rect mo7516d();

    /* renamed from: e */
    public abstract Rect mo7517e();

    /* renamed from: f */
    public abstract Rect mo7518f();

    /* renamed from: g */
    public abstract Rect mo7519g();

    /* renamed from: h */
    public abstract Size mo7520h();

    /* renamed from: i */
    static hba m2935i() {
        return new hba((byte) 0);
    }

    /* renamed from: a */
    static Rect m2934a(Rect rect, Size size, hir hir) {
        switch (hir.ordinal()) {
            case 0:
                return rect;
            case 1:
                return new Rect(rect.top, size.getHeight() - rect.right, rect.bottom, size.getHeight() - rect.left);
            case 2:
                return new Rect(size.getWidth() - rect.bottom, rect.left, size.getWidth() - rect.top, rect.right);
            case 3:
                return new Rect(size.getWidth() - rect.right, size.getHeight() - rect.bottom, size.getWidth() - rect.left, size.getHeight() - rect.top);
            default:
                String valueOf = String.valueOf(hir);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 27);
                stringBuilder.append("Unexpected UI Orientation: ");
                stringBuilder.append(valueOf);
                throw new RuntimeException(stringBuilder.toString());
        }
    }
}
