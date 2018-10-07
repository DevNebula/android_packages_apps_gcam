package p000;

import android.support.p001v4.app.Person;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: bve */
public enum bve {
    NONE(hrb.BADGE, R.string.photo_name, R.string.photo_description, R.drawable.ic_photo),
    REFOCUS(hrb.EDIT, R.string.refocus_name, R.string.refocus_description, R.drawable.ic_refocus, Integer.valueOf(R.string.refocus_action_name), Integer.valueOf(R.string.refocus_action_promote), "com.google.android.apps.refocus.ViewerActivity"),
    PANORAMA(hrb.BADGE, R.string.panorama_name, R.string.panorama_description, R.drawable.ic_panorama_normal),
    PHOTOSPHERE(hrb.BADGE, R.string.photosphere_name, R.string.photosphere_description, R.drawable.ic_photosphere_normal),
    BURSTS(hrb.BADGE, R.string.burst_name, R.string.burst_description, R.drawable.ic_burst_mode_white_36dp),
    PORTRAIT(hrb.BADGE, R.string.gouda_name, R.string.gouda_description, R.drawable.ic_gouda),
    DNG(hrb.BADGE, R.string.dng_name, R.string.dng_description, R.drawable.ic_photo);
    
    /* renamed from: h */
    public final hrb f1643h;
    /* renamed from: i */
    public final int f1644i;
    /* renamed from: j */
    public final int f1645j;
    /* renamed from: k */
    public final int f1646k;
    /* renamed from: l */
    private final Integer f1647l;
    /* renamed from: m */
    private final Integer f1648m;
    /* renamed from: n */
    private final String f1649n;

    private bve(hrb hrb, int i, int i2, int i3) {
        this(r11, r12, hrb, i, i2, i3, null, null, null);
    }

    private bve(hrb hrb, int i, int i2, int i3, Integer num, Integer num2, String str) {
        boolean z = true;
        this.f1643h = hrb;
        this.f1644i = i;
        this.f1645j = i2;
        this.f1646k = i3;
        this.f1648m = num2;
        this.f1647l = num;
        this.f1649n = str;
        bve.m1026a(this.f1645j, "description");
        bve.m1026a(this.f1646k, "icon");
        bve.m1026a(this.f1644i, Person.NAME_KEY);
        boolean z2;
        if (this.f1643h.equals(hrb.BADGE)) {
            if (this.f1649n == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            bve.m1027a(z2, "Action activity must be null");
            if (this.f1647l == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            bve.m1027a(z2, "Action description must be null");
            if (this.f1648m != null) {
                z = false;
            }
            bve.m1027a(z, "Action promotion message must be null");
            return;
        }
        if (this.f1649n != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        bve.m1027a(z2, "Action activity cannot be null");
        if (this.f1647l != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        bve.m1027a(z2, "Action description cannot be null");
        if (this.f1648m == null) {
            z = false;
        }
        bve.m1027a(z, "Action promotion message cannot be null");
    }

    /* renamed from: a */
    private static void m1027a(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: a */
    private static void m1026a(int i, String str) {
        boolean z;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        bve.m1027a(z, String.valueOf(str).concat(" must be a valid resource id"));
    }

    /* renamed from: a */
    public static kbg m1025a(String str) {
        if (kbi.m4811a(str)) {
            return kau.f21835a;
        }
        try {
            return kbg.m4803b(bve.m1028b(str));
        } catch (IllegalArgumentException e) {
            String[] split = str.split("-");
            if (split.length != 2 || !split[0].equals("com.google.android.apps.camera.gallery.specialtype.SpecialType")) {
                return kau.f21835a;
            }
            try {
                return kbg.m4803b(bve.m1028b(split[1]));
            } catch (IllegalArgumentException e2) {
            } catch (NullPointerException e3) {
            }
        }
        return kau.f21835a;
    }

    /* renamed from: a */
    public final kbg mo2164a() {
        Integer num = this.f1647l;
        if (num != null) {
            return kbg.m4804c(num);
        }
        return kau.f21835a;
    }

    /* renamed from: b */
    public final kbg mo2165b() {
        if (this.f1649n == null || !this.f1643h.equals(hrb.EDIT)) {
            return kau.f21835a;
        }
        return kbg.m4804c(this.f1649n);
    }

    /* renamed from: c */
    public final kbg mo2166c() {
        Integer num = this.f1648m;
        if (num != null) {
            return kbg.m4804c(num);
        }
        return kau.f21835a;
    }

    /* renamed from: d */
    public final String mo2167d() {
        String valueOf = String.valueOf("com.google.android.apps.camera.gallery.specialtype.SpecialType-");
        String valueOf2 = String.valueOf(name());
        return valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
    }

    /* renamed from: e */
    public final kbg mo2168e() {
        if (this.f1649n == null || !this.f1643h.equals(hrb.INTERACT)) {
            return kau.f21835a;
        }
        return kbg.m4804c(this.f1649n);
    }

    /* renamed from: f */
    public final kbg mo2169f() {
        if (this.f1649n == null || !this.f1643h.equals(hrb.LAUNCH)) {
            return kau.f21835a;
        }
        return kbg.m4804c(this.f1649n);
    }

    /* renamed from: b */
    private static bve m1028b(String str) {
        return (bve) Enum.valueOf(bve.class, str);
    }
}
