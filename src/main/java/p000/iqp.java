package p000;

import android.graphics.Point;
import android.graphics.Rect;
import android.util.Size;
import java.util.Arrays;

/* compiled from: PG */
/* renamed from: iqp */
public final class iqp {
    /* renamed from: a */
    public final int f7695a;
    /* renamed from: b */
    public final int f7696b;
    /* renamed from: c */
    private volatile iqp f7697c;

    public iqp(int i, int i2) {
        this.f7695a = i;
        this.f7696b = i2;
        this.f7697c = null;
    }

    private iqp(int i, int i2, iqp iqp) {
        this.f7695a = i;
        this.f7696b = i2;
        this.f7697c = iqp;
    }

    /* renamed from: a */
    public final long mo8812a() {
        return ((long) this.f7695a) * ((long) this.f7696b);
    }

    /* renamed from: b */
    public final iqp mo8814b() {
        return this.f7695a >= this.f7696b ? this : mo8819f();
    }

    /* renamed from: c */
    public final iqp mo8815c() {
        return this.f7696b >= this.f7695a ? this : mo8819f();
    }

    /* renamed from: d */
    public final float mo8816d() {
        return ((float) this.f7695a) / ((float) this.f7696b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        iqp iqp = (iqp) obj;
        if (this.f7695a == iqp.f7695a && this.f7696b == iqp.f7696b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f7695a), Integer.valueOf(this.f7696b)});
    }

    /* renamed from: a */
    public static iqp m4101a(int i, int i2) {
        return new iqp(i, i2);
    }

    /* renamed from: a */
    public static iqp m4102a(Point point) {
        return new iqp(point.x, point.y);
    }

    /* renamed from: a */
    public static iqp m4103a(Rect rect) {
        return new iqp(rect.width(), rect.height());
    }

    /* renamed from: a */
    public final iqp mo8813a(iqm iqm) {
        switch (iqm.ordinal()) {
            case 1:
            case 3:
                return mo8819f();
            default:
                return this;
        }
    }

    /* renamed from: e */
    public final Size mo8817e() {
        return new Size(this.f7695a, this.f7696b);
    }

    public final String toString() {
        int i = this.f7695a;
        int i2 = this.f7696b;
        StringBuilder stringBuilder = new StringBuilder(23);
        stringBuilder.append(i);
        stringBuilder.append("x");
        stringBuilder.append(i2);
        return stringBuilder.toString();
    }

    /* renamed from: f */
    public final iqp mo8819f() {
        iqp iqp = this.f7697c;
        if (iqp != null) {
            return iqp;
        }
        iqp = new iqp(this.f7696b, this.f7695a, this);
        this.f7697c = iqp;
        return iqp;
    }
}
