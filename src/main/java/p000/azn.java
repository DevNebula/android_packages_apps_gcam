package p000;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import java.util.ArrayList;

/* compiled from: PG */
/* renamed from: azn */
final class azn implements iqt {
    /* renamed from: a */
    private final /* synthetic */ CameraManager f11078a;
    /* renamed from: b */
    private final /* synthetic */ ayp f11079b;
    /* renamed from: c */
    private final /* synthetic */ azr f11080c;

    azn(CameraManager cameraManager, ayp ayp, azr azr) {
        this.f11078a = cameraManager;
        this.f11079b = ayp;
        this.f11080c = azr;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo8826a(Object obj) {
        if (!((Boolean) obj).booleanValue()) {
            try {
                ArrayList arrayList = new ArrayList();
                for (String a : this.f11078a.getCameraIdList()) {
                    arrayList.add(this.f11079b.mo1856a(iur.m4312a(a)));
                }
                azr azr = this.f11080c;
                azr.f1065a.f1068a.Reset();
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    ((azp) obj2).mo8826a(azr.f1065a.mo1867a());
                }
                bsn bsn = azr.f1066b;
            } catch (CameraAccessException e) {
            }
        }
    }
}
