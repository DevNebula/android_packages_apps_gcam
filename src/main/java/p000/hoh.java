package p000;

import com.google.android.apps.refocus.processing.DepthmapTask;
import com.google.android.gms.wearable.Asset;

/* compiled from: PG */
/* renamed from: hoh */
final class hoh extends aqq {
    /* renamed from: a */
    private final /* synthetic */ hod f26659a;

    hoh(hod hod) {
        this.f26659a = hod;
        super(DepthmapTask.DEPTH_PROCESSING_LR_MAX_SIZE_PX, DepthmapTask.DEPTH_PROCESSING_LR_MAX_SIZE_PX);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo12307a(Object obj, ara ara) {
        byte[] bArr = (byte[]) obj;
        try {
            hod hod = this.f26659a;
            Asset a = Asset.m15389a(bArr);
            igo a2 = igo.m3801a("/camera_packet");
            if (a != null) {
                a2.f7367b.f7365a.put("postview_thumbnail", a);
            }
            hod.mo14939a(a2, null);
        } catch (Throwable e) {
            bli.m892b(hod.f24495a, "error setting thumbnail data item", e);
        }
    }
}
