package p000;

import android.content.ContentResolver;
import android.content.SharedPreferences;

/* compiled from: PG */
/* renamed from: bkw */
public final class bkw {
    /* renamed from: a */
    public final ContentResolver f1283a;
    /* renamed from: b */
    public final hjf f1284b;
    /* renamed from: c */
    private final SharedPreferences f1285c;

    public bkw(ContentResolver contentResolver, hjf hjf, SharedPreferences sharedPreferences) {
        this.f1283a = contentResolver;
        this.f1284b = hjf;
        this.f1285c = sharedPreferences;
        bkz bkz = new bkz();
    }

    /* renamed from: a */
    public final String mo1997a() {
        return ije.m3831a(this.f1283a, "camera:blacklisted_resolutions_back", "");
    }

    /* renamed from: a */
    public final boolean mo1998a(ContentResolver contentResolver, String str, boolean z) {
        if (this.f1285c.contains(str)) {
            return this.f1285c.getBoolean(str, z);
        }
        return ije.m3836a(contentResolver, str, z);
    }

    /* renamed from: b */
    public final int mo1999b() {
        int d = mo2001d();
        hjf hjf = this.f1284b;
        ivy ivy = hjf.f6633b;
        if (ivy.f7874d || ivy.f7875e) {
            d *= 5;
        } else if (hjf.mo7905c()) {
            d <<= 2;
        } else if (this.f1284b.mo7906d()) {
            d <<= 2;
        }
        return ije.m3829a(this.f1283a, "camera:max_hdr_plus_imagereader_image_count", d);
    }

    /* renamed from: c */
    public final int mo2000c() {
        int i = 14;
        hjf hjf = this.f1284b;
        ivy ivy = hjf.f6633b;
        if (!(ivy.f7874d || ivy.f7875e || hjf.mo7905c() || this.f1284b.mo7906d())) {
            i = 15;
        }
        return ije.m3829a(this.f1283a, "camera:max_imagereader_image_count", i + 6);
    }

    /* renamed from: d */
    public final int mo2001d() {
        int i = 7;
        hjf hjf = this.f1284b;
        ivy ivy = hjf.f6633b;
        if (!(ivy.f7874d || ivy.f7875e || hjf.mo7905c() || this.f1284b.mo7906d())) {
            i = 8;
        }
        return ije.m3829a(this.f1283a, "camera:max_hdr_plus_burst_frame_count", i);
    }

    /* renamed from: e */
    public final boolean mo2002e() {
        return mo1998a(this.f1283a, "camera:gcam_enabled", true);
    }

    /* renamed from: f */
    public final boolean mo2003f() {
        boolean z = true;
        hjf hjf = this.f1284b;
        ivy ivy = hjf.f6633b;
        if (!(ivy.f7874d || ivy.f7875e || hjf.mo7905c() || this.f1284b.mo7906d())) {
            z = false;
        }
        return mo1998a(this.f1283a, "camera:hybrid_burst_enabled", z);
    }

    /* renamed from: g */
    public final boolean mo2004g() {
        if (this.f1284b.mo7905c()) {
            return true;
        }
        if (this.f1284b.mo7906d()) {
            return true;
        }
        if (this.f1284b.mo7904b()) {
            return ije.m3836a(this.f1283a, "camera:google_photos_gallery_pixel_2016", false);
        }
        return false;
    }

    /* renamed from: h */
    public final boolean mo2005h() {
        boolean z = true;
        hjf hjf = this.f1284b;
        ivy ivy = hjf.f6633b;
        if (!(ivy.f7874d || ivy.f7875e || hjf.mo7905c() || this.f1284b.mo7906d())) {
            z = false;
        }
        return mo1998a(this.f1283a, "camera:smartburst_enabled", z);
    }
}
