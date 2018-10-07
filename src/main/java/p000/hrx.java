package p000;

import com.google.android.apps.refocus.processing.FocusSettings;

/* compiled from: PG */
/* renamed from: hrx */
public final class hrx {
    /* renamed from: a */
    public FocusSettings f6897a;

    /* renamed from: a */
    public static hrx m3373a(FocusSettings focusSettings) {
        hrx hrx = new hrx();
        hrx.f6897a = focusSettings;
        return hrx;
    }

    /* renamed from: a */
    public static hrx m3374a(C0556wd c0556wd) {
        if (c0556wd == null) {
            return null;
        }
        hrx.m3375a();
        if (!c0556wd.mo11449b("http://ns.google.com/photos/1.0/focus/", "FocalDistance") || !c0556wd.mo11449b("http://ns.google.com/photos/1.0/focus/", "BlurAtInfinity")) {
            return null;
        }
        FocusSettings focusSettings = new FocusSettings();
        try {
            focusSettings.focalDistance = c0556wd.mo11456h("http://ns.google.com/photos/1.0/focus/", "FocalDistance").floatValue();
            focusSettings.blurAtInfinity = c0556wd.mo11456h("http://ns.google.com/photos/1.0/focus/", "BlurAtInfinity").floatValue();
            if (c0556wd.mo11449b("http://ns.google.com/photos/1.0/focus/", "DepthOfField")) {
                try {
                    focusSettings.depthOfField = c0556wd.mo11456h("http://ns.google.com/photos/1.0/focus/", "DepthOfField").floatValue();
                } catch (Throwable e) {
                    kqg.f8786a.mo10213b(e);
                }
            }
            if (c0556wd.mo11449b("http://ns.google.com/photos/1.0/focus/", "FocalPointX") && c0556wd.mo11449b("http://ns.google.com/photos/1.0/focus/", "FocalPointY")) {
                try {
                    focusSettings.focalPointX = c0556wd.mo11456h("http://ns.google.com/photos/1.0/focus/", "FocalPointX").floatValue();
                    focusSettings.focalPointY = c0556wd.mo11456h("http://ns.google.com/photos/1.0/focus/", "FocalPointY").floatValue();
                } catch (Throwable e2) {
                    kqg.f8786a.mo10213b(e2);
                }
            }
            return hrx.m3373a(focusSettings);
        } catch (Throwable e3) {
            kqg.f8786a.mo10213b(e3);
            return null;
        }
    }

    /* renamed from: a */
    public static void m3375a() {
        try {
            C0557we.f9955a.mo11459a("http://ns.google.com/photos/1.0/focus/", "GFocus");
        } catch (Throwable e) {
            kqg.f8786a.mo10213b(e);
        }
    }
}
