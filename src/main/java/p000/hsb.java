package p000;

import android.support.p003v8.renderscript.RenderScript;

/* compiled from: PG */
/* renamed from: hsb */
public class hsb {
    /* renamed from: a */
    public static final int f6922a = 26;
    /* renamed from: b */
    public int f6923b;
    /* renamed from: c */
    public hsh f6924c;

    static {
        hrz.m3378a();
    }

    public hsb(int i, hrz hrz, RenderScript renderScript) {
        int i2 = 0;
        int b = hrz.mo8079b(i);
        this.f6924c = new hsh(renderScript, b);
        int i3 = 0;
        while (i2 < b) {
            int a = ((int) hrz.mo8077a(hrz.mo8078a(i, i2))) + 1;
            this.f6924c.mo13562a(i2, i3);
            this.f6924c.mo13563b(i2, a);
            this.f6924c.mo13564c(i2, a);
            a = (a + a) + 1;
            i3 += a * a;
            i2++;
        }
        this.f6923b = i3;
    }

    /* renamed from: a */
    public static int m3386a(float f) {
        return ((int) f) + 1;
    }
}
