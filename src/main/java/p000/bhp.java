package p000;

import android.view.Surface;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: bhp */
final /* synthetic */ class bhp implements Runnable {
    /* renamed from: a */
    private final bho f1181a;
    /* renamed from: b */
    private final Surface f1182b;
    /* renamed from: c */
    private final Surface f1183c;
    /* renamed from: d */
    private final kbg f1184d;
    /* renamed from: e */
    private final kpw f1185e;
    /* renamed from: f */
    private final kbg f1186f;

    bhp(bho bho, Surface surface, Surface surface2, kbg kbg, kpw kpw, kbg kbg2) {
        this.f1181a = bho;
        this.f1182b = surface;
        this.f1183c = surface2;
        this.f1184d = kbg;
        this.f1185e = kpw;
        this.f1186f = kbg2;
    }

    public final void run() {
        bho bho = this.f1181a;
        Surface surface = this.f1182b;
        Surface surface2 = this.f1183c;
        kbg kbg = this.f1184d;
        knk knk = this.f1185e;
        kbg kbg2 = this.f1186f;
        bli.m888a(bho.f11395a, "Execute CameraCaptureSession-creation task on camera handler thread.");
        List arrayList = new ArrayList();
        arrayList.add(surface);
        arrayList.add(surface2);
        if (kbg.mo9709b()) {
            arrayList.add((Surface) kbg.mo9706a());
        }
        iwi bhq = new bhq(knk);
        try {
            if (kbg2.mo9709b()) {
                iwv iwv = new iwv((byte) 0);
                iwv.f7887a = Integer.valueOf(0);
                iwv.f7888b = arrayList;
                Executor executor = bho.f11397c;
                if (executor == null) {
                    throw new NullPointerException("Null executor");
                }
                iwv.f7889c = executor;
                iwv.f7890d = bhq;
                iwo iwo = (iwo) kbg2.mo9706a();
                if (iwo == null) {
                    throw new NullPointerException("Null sessionParameters");
                }
                iwv.f7891e = iwo;
                bho.f11396b.mo13721a(iwv.mo9143a());
                return;
            }
            bho.f11396b.mo13722a(arrayList, bhq, null);
        } catch (Throwable e) {
            bli.m892b(bho.f11395a, "CameraDeviceProxy has been closed. (ResourceUnavailableException)", e);
            knk.mo15642a(e);
        }
    }
}
