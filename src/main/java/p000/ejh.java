package p000;

import android.content.Context;
import android.graphics.ImageFormat;
import android.graphics.Point;
import android.os.Handler;

/* compiled from: PG */
/* renamed from: ejh */
public final class ejh {
    /* renamed from: a */
    private static final String f3874a = bli.m887a("CameraUtility");

    /* renamed from: a */
    public static void m1816a(aah aah, abw abw, Handler handler, aag aag) {
        aah.mo21b(handler, null);
        int i = aah.mo28i().f145k;
        int bitsPerPixel = ImageFormat.getBitsPerPixel(i);
        if (bitsPerPixel <= 0) {
            StringBuilder stringBuilder = new StringBuilder(33);
            stringBuilder.append("Unknown image format: ");
            stringBuilder.append(i);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        Point point = abw.f178a;
        bitsPerPixel = (int) Math.ceil((double) (((float) (point.y * point.x)) * (((float) bitsPerPixel) / 8.0f)));
        for (i = 0; i < 3; i++) {
            aah.mo17a(new byte[bitsPerPixel]);
        }
        aah.mo21b(handler, aag);
    }

    /* renamed from: a */
    public static float m1813a(aah aah) {
        if (aah == null) {
            return 0.0f;
        }
        ejg a = ejf.m1810a(aah.mo24e());
        abo i = aah.mo28i();
        Point point = a.f3873b.f178a;
        i.mo71a(new abw(point.x, point.y));
        Point point2 = a.f3872a.f178a;
        i.mo73b(new abw(point2.x, point2.y));
        aah.mo18a(i);
        return ejv.m1859a(aah.mo24e().f67u);
    }

    /* renamed from: a */
    public static abb m1814a(aaz aaz) {
        if (aaz.mo47a(abb.OFF)) {
            return abb.OFF;
        }
        if (aaz.mo47a(abb.AUTO)) {
            return abb.AUTO;
        }
        if (aaz.mo47a(abb.NO_FLASH)) {
            return abb.NO_FLASH;
        }
        bli.m891b(f3874a, "no supported flash mode found, need OFF, AUTO or NO_FLASH!");
        throw new IllegalStateException("no supported flash mode found!");
    }

    /* renamed from: a */
    public static abc m1815a(Context context, aaz aaz) {
        boolean z = true;
        if (!(ije.m3836a(context.getContentResolver(), "camera:requires_focus_on_pitch_change", false) || ejv.f3903a.f3907b)) {
            z = false;
        }
        if (!z) {
            if (aaz.mo48a(abc.INFINITY)) {
                bli.m894c(f3874a, "Using Focus mode infinity");
                return abc.INFINITY;
            } else if (aaz.mo48a(abc.FIXED) && !ejv.f3903a.f3907b) {
                bli.m894c(f3874a, "Using Focus mode fixed");
                return abc.FIXED;
            }
        }
        bli.m894c(f3874a, "Using Focus mode auto");
        return abc.AUTO;
    }

    /* renamed from: b */
    public static abw m1818b(aaz aaz) {
        abw abw = new abw(0, 0);
        if (aaz == null) {
            return abw;
        }
        Point point = ejf.m1810a(aaz).f3872a.f178a;
        return new abw(point.x, point.y);
    }

    /* renamed from: c */
    public static abd m1819c(aaz aaz) {
        if (aaz.mo49a(abd.AUTO)) {
            return abd.AUTO;
        }
        return abd.NO_SCENE_MODE;
    }

    /* renamed from: a */
    public static void m1817a(aaz aaz, abo abo) {
        int[] a = hjg.m3260a(aaz.mo50b());
        if (a == null || a.length <= 0) {
            bli.m891b(f3874a, "No supported frame rates returned!");
        } else {
            abo.mo70a(a[0], a[1]);
        }
    }
}
