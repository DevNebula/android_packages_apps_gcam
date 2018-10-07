package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;

/* compiled from: PG */
/* renamed from: gw */
public final class C0260gw {
    /* renamed from: a */
    public static final C0261ha f6082a = new C0844gz();
    /* renamed from: b */
    public static final C0292io f6083b = new C0292io(16);

    /* renamed from: a */
    public static Typeface m2902a(Context context, C0254gq c0254gq, Resources resources, int i, int i2, C0722mz c0722mz, Handler handler, boolean z) {
        Typeface a;
        if (c0254gq instanceof C0255gr) {
            C0255gr c0255gr = (C0255gr) c0254gq;
            a = C0269hk.m3271a(context, c0255gr.f6013a, c0722mz, null, c0255gr.f6015c == 0, c0255gr.f6014b, i2);
        } else {
            a = f6082a.mo7593a(context, (C0723na) c0254gq, resources, i2);
            if (c0722mz != null) {
                if (a != null) {
                    c0722mz.mo14244a(a, null);
                } else {
                    c0722mz.mo14242a(-3, null);
                }
            }
        }
        if (a != null) {
            f6083b.mo8654a(C0260gw.m2903a(resources, i, i2), a);
        }
        return a;
    }

    /* renamed from: a */
    public static Typeface m2901a(Context context, Resources resources, int i, String str, int i2) {
        Typeface a = f6082a.mo7592a(context, resources, i, str, i2);
        if (a != null) {
            f6083b.mo8654a(C0260gw.m2903a(resources, i, i2), a);
        }
        return a;
    }

    /* renamed from: a */
    public static String m2903a(Resources resources, int i, int i2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(resources.getResourcePackageName(i));
        stringBuilder.append("-");
        stringBuilder.append(i);
        stringBuilder.append("-");
        stringBuilder.append(i2);
        return stringBuilder.toString();
    }
}
