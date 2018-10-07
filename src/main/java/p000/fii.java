package p000;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureRequest.Key;
import android.hardware.camera2.CaptureResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* renamed from: fii */
public final class fii implements fij {
    /* renamed from: a */
    private final fij f18319a;

    public fii(fij fij) {
        this.f18319a = fij;
    }

    /* renamed from: b */
    private static Map m10591b(fim fim) {
        Map hashMap = new HashMap();
        for (fin fin : fim.f4796b) {
            hashMap.put(fin.f4800a, fin);
        }
        return hashMap;
    }

    /* renamed from: a */
    public final void mo6802a(fim fim) {
        jri.m13395a(fim.f4799e.mo9709b());
        fij fij = this.f18319a;
        Map b = fii.m10591b(fim);
        ArrayList arrayList = new ArrayList();
        arrayList.add(CaptureRequest.JPEG_ORIENTATION);
        arrayList.add(CaptureRequest.JPEG_THUMBNAIL_QUALITY);
        arrayList.add(CaptureRequest.JPEG_GPS_LOCATION);
        arrayList.add(CaptureRequest.JPEG_QUALITY);
        arrayList.add(CaptureRequest.JPEG_THUMBNAIL_SIZE);
        iwo d = ((iwp) fim.f4799e.mo9706a()).mo13733d();
        fio fio = new fio(fim);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            Key key = (Key) arrayList.get(i);
            if (b.containsKey(key)) {
                i = i2;
            } else if (d.mo13726a(key) == null) {
                i = i2;
            } else {
                fio.mo6812a(new fin(key, d.mo13726a(key)));
                i = i2;
            }
        }
        fim a = fio.mo6807a();
        iwp iwp = (iwp) a.f4799e.mo9706a();
        b = fii.m10591b(a);
        Object a2 = iwp.mo13730a(CaptureResult.NOISE_REDUCTION_MODE);
        Integer valueOf = Integer.valueOf(2);
        boolean b2 = kbf.m16778b(a2, valueOf);
        boolean containsKey = b.containsKey(CaptureRequest.NOISE_REDUCTION_MODE);
        fio fio2 = new fio(a);
        if (!containsKey) {
            if (b2) {
                fio2.mo6809a(CaptureRequest.NOISE_REDUCTION_MODE, Integer.valueOf(0));
            } else {
                fio2.mo6809a(CaptureRequest.NOISE_REDUCTION_MODE, valueOf);
            }
        }
        a = fio2.mo6807a();
        iwp = (iwp) a.f4799e.mo9706a();
        b = fii.m10591b(a);
        b2 = kbf.m16778b(iwp.mo13730a(CaptureResult.EDGE_MODE), valueOf);
        containsKey = b.containsKey(CaptureRequest.EDGE_MODE);
        fio2 = new fio(a);
        if (!containsKey) {
            if (b2) {
                fio2.mo6809a(CaptureRequest.EDGE_MODE, Integer.valueOf(0));
            } else {
                fio2.mo6809a(CaptureRequest.EDGE_MODE, valueOf);
            }
        }
        fij.mo6802a(fio2.mo6807a());
    }
}
