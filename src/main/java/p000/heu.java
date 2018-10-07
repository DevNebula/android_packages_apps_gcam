package p000;

import android.annotation.TargetApi;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.Window;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: heu */
public final class heu {
    /* renamed from: a */
    public static final String f6495a = bli.m887a("CameraUiInflater");
    /* renamed from: b */
    public final Window f6496b;
    /* renamed from: c */
    public final hkh f6497c;
    /* renamed from: d */
    public final Activity f6498d;
    /* renamed from: e */
    public final LayoutInflater f6499e = this.f6498d.getLayoutInflater();

    public heu(Activity activity, hkh hkh, Window window) {
        this.f6498d = activity;
        this.f6497c = hkh;
        this.f6496b = window;
    }

    /* renamed from: a */
    public static void m3155a(Window window) {
        window.getDecorView().setSystemUiVisibility(1797);
    }
}
