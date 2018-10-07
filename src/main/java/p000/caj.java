package p000;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: caj */
public final class caj implements iqt {
    /* renamed from: a */
    private final Object f12069a = new Object();
    /* renamed from: b */
    private List f12070b = new ArrayList();
    /* renamed from: c */
    private iwp f12071c;
    /* renamed from: d */
    private MeteringRectangle f12072d;
    /* renamed from: e */
    private boolean f12073e = true;
    /* renamed from: f */
    private final Rect f12074f;

    static {
        bli.m887a("TouchListener");
    }

    public caj(ffc ffc) {
        this.f12074f = (Rect) jri.m13404b((Rect) ffc.mo9056a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
        Rect rect = this.f12074f;
        rect.bottom -= rect.top;
        rect.top = 0;
        rect.right -= rect.left;
        rect.left = 0;
    }

    /* renamed from: a */
    public final List mo12444a() {
        List arrayList;
        synchronized (this.f12069a) {
            arrayList = new ArrayList(this.f12070b);
            if (!this.f12073e) {
                arrayList.add(this.f12071c);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private final boolean m8023a(MeteringRectangle meteringRectangle) {
        boolean equals;
        synchronized (this.f12069a) {
            equals = meteringRectangle.getRect().equals(this.f12072d.getRect()) ^ 1;
        }
        return equals;
    }

    /* renamed from: a */
    private final synchronized void m8022a(iwp iwp) {
        MeteringRectangle meteringRectangle = ((MeteringRectangle[]) jri.m13404b((MeteringRectangle[]) iwp.mo13730a(CaptureResult.CONTROL_AE_REGIONS)))[0];
        synchronized (this.f12069a) {
            if (this.f12073e) {
                this.f12073e = false;
            } else if (m8023a(meteringRectangle)) {
                iwp iwp2 = this.f12071c;
                if (meteringRectangle.getRect().equals(this.f12074f)) {
                    this.f12070b.clear();
                } else if (this.f12070b.size() < 5) {
                    this.f12070b.add(iwp2);
                } else {
                    this.f12070b.remove(0);
                    this.f12070b.add(iwp2);
                }
            }
            this.f12071c = iwp;
            this.f12072d = meteringRectangle;
        }
    }
}
