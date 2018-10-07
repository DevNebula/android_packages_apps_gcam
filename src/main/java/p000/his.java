package p000;

import android.view.Window;
import android.view.WindowManager.LayoutParams;

/* compiled from: PG */
/* renamed from: his */
public final class his {
    /* renamed from: a */
    private final Window f6618a;
    /* renamed from: b */
    private int f6619b = 0;

    public his(Window window) {
        this.f6618a = (Window) jri.m13404b((Object) window);
    }

    /* renamed from: a */
    public final void mo7887a() {
        boolean z;
        if (this.f6619b > 0) {
            z = true;
        } else {
            z = false;
        }
        jqk.m13347a(z);
        this.f6619b--;
        if (this.f6619b == 0) {
            m3238a(-1.0f);
        }
    }

    /* renamed from: b */
    public final void mo7888b() {
        m3238a(1.0f);
        this.f6619b++;
    }

    /* renamed from: a */
    private final void m3238a(float f) {
        LayoutParams attributes = this.f6618a.getAttributes();
        attributes.screenBrightness = f;
        this.f6618a.setAttributes(attributes);
    }
}
