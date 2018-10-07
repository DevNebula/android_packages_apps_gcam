package p000;

import android.graphics.Point;
import android.view.WindowManager;
import com.google.android.apps.camera.p005ui.views.MainActivityLayout;

/* compiled from: PG */
/* renamed from: hci */
public class hci implements hch {
    /* renamed from: a */
    public static hec m11977a() {
        return hee.f6453a;
    }

    /* renamed from: a */
    public static hec m11979a(int i, Object... objArr) {
        if (i < 0) {
            return hci.m11977a();
        }
        return new heg(i, objArr);
    }

    /* renamed from: a */
    public static hec m11978a(int i, int i2, Object... objArr) {
        if (i < 0) {
            return hci.m11977a();
        }
        return new hef(i, i2, objArr);
    }

    /* renamed from: a */
    public static void m11981a(MainActivityLayout mainActivityLayout, gye gye) {
        mainActivityLayout.f12894d = gye;
    }

    /* renamed from: a */
    public static boolean m11982a(hec hec) {
        return hec == hci.m11977a();
    }

    public void onShutterButtonClick() {
    }

    public void onShutterButtonLongPressRelease() {
    }

    public void onShutterButtonLongPressed() {
    }

    public void onShutterButtonPressedStateChanged(boolean z) {
    }

    public void onShutterTouch(hin hin) {
    }

    /* renamed from: a */
    public static heq m11980a(cbu cbu, bkw bkw) {
        Point point = new Point(0, 0);
        ((WindowManager) cbu.m1124a(cbu.f1865a, "window")).getDefaultDisplay().getSize(point);
        return new heq(new iqp(point.x, point.y), bkw);
    }
}
