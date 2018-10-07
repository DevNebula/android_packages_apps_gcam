package p000;

import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;
import android.hardware.camera2.CameraManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* renamed from: iup */
final class iup implements iuo {
    /* renamed from: a */
    private final Object f21289a = new Object();
    /* renamed from: b */
    private final CameraManager f21290b;
    /* renamed from: c */
    private final iui f21291c;
    /* renamed from: d */
    private final iqz f21292d;
    /* renamed from: e */
    private List f21293e;

    public iup(CameraManager cameraManager, iui iui, iqz iqz) {
        this.f21290b = cameraManager;
        this.f21291c = iui;
        this.f21292d = iqz.mo8830a("CameraHWManager");
    }

    /* renamed from: a */
    public final boolean mo9090a() {
        for (iur iur : mo9089a(iut.BACK)) {
            if (iur.f7847a != null) {
                CameraInfo cameraInfo = new CameraInfo();
                Camera.getCameraInfo(iur.mo9096a(), cameraInfo);
                if (!cameraInfo.canDisableShutterSound) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: b */
    public final List mo9092b() {
        return m12746e();
    }

    /* renamed from: a */
    public final List mo9089a(iut iut) {
        List arrayList = new ArrayList();
        for (iur iur : m12746e()) {
            if (this.f21291c.mo9053a(iur).mo9064c() == iut) {
                arrayList.add(iur);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public final iur mo9093c() {
        List e = m12746e();
        if (!e.isEmpty()) {
            return (iur) e.get(0);
        }
        this.f21292d.mo8838f("No camera's found on this device!");
        return null;
    }

    /* renamed from: b */
    public final iur mo9091b(iut iut) {
        for (iur iur : m12746e()) {
            if (this.f21291c.mo9053a(iur).mo9064c() == iut) {
                return iur;
            }
        }
        iqz iqz = this.f21292d;
        String a = iut.m4316a(iut);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(a).length() + 32);
        stringBuilder.append("No ");
        stringBuilder.append(a);
        stringBuilder.append(" camera found on this device!");
        iqz.mo8838f(stringBuilder.toString());
        return null;
    }

    /* renamed from: a */
    public final iun mo9088a(iur iur) {
        return this.f21291c.mo9053a(iur);
    }

    /* renamed from: e */
    private final List m12746e() {
        synchronized (this.f21289a) {
            List list = this.f21293e;
            if (list == null || list.isEmpty()) {
                try {
                    Object cameraIdList = this.f21290b.getCameraIdList();
                    jri.m13404b(cameraIdList);
                    Collection arrayList = new ArrayList(r4);
                    for (String a : cameraIdList) {
                        arrayList.add(iur.m4312a(a));
                    }
                    this.f21293e = ken.m13713a(arrayList);
                } catch (Throwable e) {
                    throw new IllegalStateException("Unable to read camera list.", e);
                }
            }
        }
        return this.f21293e;
    }

    /* renamed from: c */
    public final boolean mo9094c(iut iut) {
        for (iur a : m12746e()) {
            if (this.f21291c.mo9053a(a).mo9064c() == iut) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo9095d() {
        for (iur a : m12746e()) {
            if (this.f21291c.mo9053a(a).mo9086y()) {
                return true;
            }
        }
        return false;
    }
}
