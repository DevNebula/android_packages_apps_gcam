package p000;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import java.io.Closeable;
import java.io.File;

/* compiled from: PG */
/* renamed from: jrc */
final class jrc implements izi {
    /* renamed from: a */
    private final /* synthetic */ long f21665a;
    /* renamed from: b */
    private final /* synthetic */ Bitmap f21666b;

    jrc(long j, Bitmap bitmap) {
        this.f21665a = j;
        this.f21666b = bitmap;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9217a(Object obj) {
        Throwable th;
        File file = new File((File) obj, jxr.m4736a(this.f21665a));
        Object obj2 = this.f21666b;
        jri.m13404b((Object) file);
        jri.m13404b(obj2);
        Closeable a;
        try {
            a = jqk.m13329a(file);
            try {
                obj2.compress(CompressFormat.JPEG, 100, a);
                kit.m5024a(a, false);
                return jqk.m13340a(new jqz(file));
            } catch (Throwable th2) {
                th = th2;
                kit.m5024a(a, false);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            a = null;
        }
    }
}
