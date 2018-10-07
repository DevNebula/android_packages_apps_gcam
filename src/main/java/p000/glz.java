package p000;

import android.location.Location;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.io.File;

/* compiled from: PG */
/* renamed from: glz */
public final class glz {
    /* renamed from: a */
    public final iqp f5642a;
    /* renamed from: b */
    public final ixx f5643b;
    /* renamed from: c */
    public kbg f5644c = kau.f21835a;
    /* renamed from: d */
    public kbg f5645d = kau.f21835a;
    /* renamed from: e */
    public kbg f5646e = kau.f21835a;
    /* renamed from: f */
    public kbg f5647f = kau.f21835a;

    public glz(iqp iqp, ixx ixx) {
        this.f5642a = iqp;
        this.f5643b = ixx;
    }

    /* renamed from: a */
    public final eqn mo7219a(File file) {
        return new gma(this, file);
    }

    /* renamed from: a */
    public final glz mo7221a(ExifInterface exifInterface) {
        this.f5645d = kbg.m4803b(exifInterface);
        return this;
    }

    /* renamed from: a */
    public final glz mo7220a(Location location) {
        this.f5647f = kbg.m4803b(location);
        return this;
    }

    /* renamed from: a */
    public final glz mo7222a(Integer num) {
        this.f5644c = kbg.m4803b(num);
        return this;
    }
}
