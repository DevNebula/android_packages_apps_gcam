package p000;

import android.graphics.Matrix;
import android.util.Property;
import android.widget.ImageView;

/* compiled from: PG */
/* renamed from: at */
public final class C0048at extends Property {
    /* renamed from: a */
    private final Matrix f988a = new Matrix();

    public C0048at() {
        super(Matrix.class, "imageMatrixProperty");
    }

    public final /* synthetic */ Object get(Object obj) {
        this.f988a.set(((ImageView) obj).getImageMatrix());
        return this.f988a;
    }

    public final /* synthetic */ void set(Object obj, Object obj2) {
        ((ImageView) obj).setImageMatrix((Matrix) obj2);
    }
}
