package p000;

import android.location.Location;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: coj */
final class coj implements kaw {
    /* renamed from: a */
    private final File f12763a;
    /* renamed from: b */
    private final bdb f12764b;
    /* renamed from: c */
    private final kbg f12765c;

    coj(File file, bdb bdb, kbg kbg, cny cny) {
        jri.m13404b((Object) file);
        jri.m13404b((Object) bdb);
        jri.m13404b((Object) kbg);
        jri.m13404b((Object) cny);
        this.f12763a = file;
        this.f12764b = bdb;
        this.f12765c = kbg;
    }

    /* renamed from: a */
    private final kah m8484a(foz foz) {
        jri.m13404b((Object) foz);
        try {
            byte[] bArr = foz.f4882b;
            File file = this.f12763a;
            ExifInterface exifInterface = foz.f4884d;
            OutputStream fileOutputStream = new FileOutputStream(file);
            kbg kbg = this.f12765c;
            if (kbg.mo9709b()) {
                itg itg = new itg(exifInterface);
                itg.mo8999a((Location) kbg.mo9706a());
                exifInterface = itg.f7821a;
            }
            bdf.m826b(bArr, exifInterface.mo12670a(fileOutputStream), this.f12764b.f1107a);
            try {
                return jqk.m13341a(new kab(jqk.m13349b(cny.m1233a(this.f12763a))));
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable e2) {
            kqg.f8786a.mo10213b(e2);
            throw new RuntimeException(e2);
        }
    }
}
