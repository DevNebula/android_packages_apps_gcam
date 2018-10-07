package p000;

import android.graphics.PointF;

/* compiled from: PG */
/* renamed from: fck */
public final class fck {
    /* renamed from: a */
    private PointF f4697a;
    /* renamed from: b */
    private Integer f4698b;

    fck(byte b) {
        this();
    }

    /* renamed from: a */
    public final fcj mo6745a() {
        String str = "";
        if (this.f4697a == null) {
            str = String.valueOf(str).concat(" normalizedCenterPoint");
        }
        if (this.f4698b == null) {
            str = String.valueOf(str).concat(" confidenceScore");
        }
        if (str.isEmpty()) {
            return new fdc(this.f4697a, this.f4698b.intValue());
        }
        str = String.valueOf(str);
        String str2 = "Missing required properties:";
        if (str.length() == 0) {
            str = new String(str2);
        } else {
            str = str2.concat(str);
        }
        throw new IllegalStateException(str);
    }

    /* renamed from: a */
    public final fck mo6746a(int i) {
        this.f4698b = Integer.valueOf(i);
        return this;
    }

    /* renamed from: a */
    public final fck mo6747a(PointF pointF) {
        if (pointF == null) {
            throw new NullPointerException("Null normalizedCenterPoint");
        }
        this.f4697a = pointF;
        return this;
    }
}
