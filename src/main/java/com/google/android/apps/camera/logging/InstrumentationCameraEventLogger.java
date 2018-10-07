package com.google.android.apps.camera.logging;

import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.common.logging.nano.eventprotos$CameraEvent;
import java.util.ArrayList;
import java.util.List;
import p000.epc;

@UsedByReflection
/* compiled from: PG */
public class InstrumentationCameraEventLogger implements epc {
    /* renamed from: a */
    private static final Integer f12815a = Integer.valueOf(100);
    /* renamed from: b */
    private static final List f12816b = new ArrayList();

    @UsedByReflection
    public static List getAndClearEvents() {
        List arrayList;
        synchronized (f12816b) {
            arrayList = new ArrayList(f12816b);
            f12816b.clear();
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo6439a(eventprotos$CameraEvent eventprotos_cameraevent) {
        synchronized (f12816b) {
            if (f12816b.size() == f12815a.intValue()) {
                f12816b.remove(f12816b.size() - 1);
            }
            f12816b.add(eventprotos_cameraevent);
        }
    }
}
