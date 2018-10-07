package p000;

import android.hardware.camera2.CaptureRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* renamed from: fgi */
public final class fgi implements kwk {
    /* renamed from: a */
    private final kwk f18241a;

    private fgi(kwk kwk) {
        this.f18241a = kwk;
    }

    /* renamed from: a */
    public static fgi m10505a(kwk kwk) {
        return new fgi(kwk);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo10566a() {
        iqp iqp;
        Object a;
        fgu fgu = (fgu) this.f18241a.mo10566a();
        iqp iqp2 = fgu.f4776a;
        if (iqp2 != null) {
            ipz b = ipz.m4077b(iqp2);
            List<iqp> list = fgu.f4777b;
            Collection arrayList = new ArrayList();
            for (iqp iqp3 : list) {
                if (iqp3.mo8812a() != 0 && ipz.m4077b(iqp3).mo8753b(b).equals(b)) {
                    arrayList.add(iqp3);
                }
            }
            arrayList.add(new iqp(0, 0));
            iqp3 = (iqp) Collections.max(arrayList, iqq.f7698a);
        } else {
            iqp3 = null;
        }
        if (iqp3 == null) {
            a = fds.m10411a();
        } else {
            a = fds.m10417a(Arrays.asList(new fin[]{new fin(CaptureRequest.JPEG_THUMBNAIL_QUALITY, Byte.valueOf((byte) 90)), new fin(CaptureRequest.JPEG_THUMBNAIL_SIZE, ion.m3997a(iqp3))}));
        }
        return (fis) ktm.m14219a(a, "Cannot return null from a non-@Nullable @Provides method");
    }
}
