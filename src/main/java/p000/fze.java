package p000;

import android.graphics.Rect;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: fze */
public final class fze extends imq {
    /* renamed from: b */
    private static final String f26391b = bli.m887a("MultiCropRegion");
    /* renamed from: c */
    private final List f26392c;
    /* renamed from: d */
    private final float f26393d = ((Float) Collections.min(this.f26392c)).floatValue();
    /* renamed from: e */
    private final double f26394e;
    /* renamed from: f */
    private final int f26395f;
    /* renamed from: g */
    private final int f26396g;

    public fze(ilp ilp, iun iun) {
        super(ilp);
        String str = f26391b;
        String valueOf = String.valueOf(iun.mo9065d());
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 21);
        stringBuilder.append("current camera id =  ");
        stringBuilder.append(valueOf);
        bli.m888a(str, stringBuilder.toString());
        this.f26392c = iun.mo9068g();
        this.f26394e = ion.m3993a(iun);
        Rect n = iun.mo9075n();
        this.f26395f = n.width() / 2;
        this.f26396g = n.height() / 2;
    }

    /* renamed from: b */
    protected final /* synthetic */ Object mo15010b(Object obj) {
        boolean z;
        boolean z2 = false;
        float floatValue = ((Float) obj).floatValue();
        double a = ion.m3992a(this.f26393d, this.f26394e / ((double) floatValue));
        double d = this.f26394e;
        if (d > 0.0d) {
            z = true;
        } else {
            z = false;
        }
        jri.m13395a(z);
        if (a > 0.0d && a < 6.283185307179586d) {
            z2 = true;
        }
        jri.m13395a(z2);
        double tan = Math.tan(a / 2.0d);
        List list = this.f26392c;
        d = (double) ((float) (d / (tan + tan)));
        for (int size = list.size() - 1; size >= 0; size--) {
            floatValue = ((Float) list.get(size)).floatValue();
            double d2 = (double) floatValue;
            if (d2 < d || Math.abs(d - d2) < 9.999999747378752E-6d) {
                double a2 = ion.m3991a(a, floatValue) / this.f26394e;
                size = this.f26395f;
                int i = (int) (((double) size) * a2);
                int i2 = this.f26396g;
                int i3 = (int) (a2 * ((double) i2));
                return new fzd(new Rect(size - i, i2 - i3, size + i, i3 + i2), floatValue);
            }
        }
        StringBuilder stringBuilder = new StringBuilder(46);
        stringBuilder.append("focal length needed = ");
        stringBuilder.append(d);
        throw new IllegalStateException(stringBuilder.toString());
    }
}
