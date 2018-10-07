package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Rect;
import java.io.File;

/* compiled from: PG */
/* renamed from: jqz */
public final class jqz implements jqs {
    /* renamed from: a */
    public final int f24782a;
    /* renamed from: b */
    public final int f24783b;
    /* renamed from: c */
    private final File f24784c;

    public jqz(File file) {
        this.f24784c = file;
        Options options = new Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        if (options.outWidth <= 0 || options.outHeight <= 0) {
            throw new jra();
        }
        this.f24782a = options.outWidth;
        this.f24783b = options.outHeight;
    }

    public final void close() {
    }

    /* renamed from: a */
    public final int mo9533a() {
        return this.f24783b;
    }

    /* renamed from: b */
    public final int mo9534b() {
        return this.f24782a;
    }

    /* renamed from: a */
    public final jqr mo13824a(jqo jqo) {
        return mo13825b(jqo);
    }

    /* renamed from: b */
    public final jqr mo13825b(jqo jqo) {
        return jqp.m4667a(jqo, this.f24784c.getAbsolutePath(), new Options());
    }

    /* renamed from: a */
    public final jqr mo13823a(Rect rect, jqo jqo) {
        boolean z;
        boolean z2 = true;
        jri.m13404b((Object) rect);
        if (rect.width() > 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13395a(z);
        if (rect.height() <= 0) {
            z2 = false;
        }
        jri.m13395a(z2);
        return jqp.m4668a(jqo, this.f24784c.getAbsolutePath(), rect);
    }

    /* renamed from: a */
    public final jqr mo13822a(int i, int i2, jqo jqo) {
        boolean z;
        boolean z2 = false;
        int i3 = 1;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        jri.m13396a(z, (Object) "width must be > 0.");
        if (i2 > 0) {
            z2 = true;
        }
        jri.m13396a(z2, (Object) "height must be > 0.");
        int i4 = this.f24782a;
        int i5 = this.f24783b;
        if (i5 > i2 || i4 > i) {
            i5 /= 2;
            i4 /= 2;
            while (i5 / i3 > i2 && i4 / i3 > i) {
                i3 += i3;
            }
        }
        Options options = new Options();
        options.inSampleSize = i3;
        jqr a = jqp.m4667a(jqo, this.f24784c.getAbsolutePath(), options);
        if (a.mo15047b() == i && a.mo15046a() == i2) {
            return a;
        }
        jqr a2 = jqp.m4665a(jqo, "jpeg", (Bitmap) a.mo9674e(), i, i2);
        a.mo15063a();
        return a2;
    }
}
