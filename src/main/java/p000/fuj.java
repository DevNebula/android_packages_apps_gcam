package p000;

import android.hardware.camera2.CaptureResult;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: fuj */
final class fuj implements kaw {
    fuj(fuh fuh) {
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo9689a(Object obj) {
        List<iwp> list = (List) obj;
        List arrayList = new ArrayList();
        for (iwp iwp : list) {
            arrayList.add(jqk.m13351b("Metadata").mo9703a("timestamp", iwp.mo13730a(CaptureResult.SENSOR_TIMESTAMP)).mo9703a("NR", iwp.mo13730a(CaptureResult.NOISE_REDUCTION_MODE)).mo9703a("EDGE", iwp.mo13730a(CaptureResult.EDGE_MODE)).mo9703a("REEF", iwp.mo13730a(CaptureResult.REPROCESS_EFFECTIVE_EXPOSURE_FACTOR)).mo9703a("Jpeg Qual", iwp.mo13730a(CaptureResult.JPEG_QUALITY)).toString());
        }
        return arrayList.toString();
    }
}
