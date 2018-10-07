package p000;

import android.content.Context;
import com.google.android.GoogleCamera.R;

/* compiled from: PG */
/* renamed from: dta */
public final class dta implements kaw {
    /* renamed from: a */
    public static String m9506a(Context context, int i) {
        switch (i) {
            case 1:
                return context.getString(R.string.title);
            case 2:
                return context.getString(R.string.description);
            case 3:
                return context.getString(R.string.time);
            case 4:
                return context.getString(R.string.location);
            case 5:
                return context.getString(R.string.width);
            case 6:
                return context.getString(R.string.height);
            case 7:
                return context.getString(R.string.orientation);
            case 8:
                return context.getString(R.string.duration);
            case 9:
                return context.getString(R.string.mimetype);
            case 10:
                return context.getString(R.string.file_size);
            case 100:
                return context.getString(R.string.maker);
            case 101:
                return context.getString(R.string.model);
            case 102:
                return context.getString(R.string.flash);
            case 103:
                return context.getString(R.string.focal_length);
            case 104:
                return context.getString(R.string.white_balance);
            case 105:
                return context.getString(R.string.aperture);
            case 107:
                return context.getString(R.string.exposure_time);
            case 108:
                return context.getString(R.string.iso);
            case 200:
                return context.getString(R.string.path);
            default:
                StringBuilder stringBuilder = new StringBuilder(22);
                stringBuilder.append("Unknown key");
                stringBuilder.append(i);
                return stringBuilder.toString();
        }
    }

    /* renamed from: a */
    public static bcn m9505a(fer fer, fxe fxe, ilp ilp, hjf hjf) {
        bcn bcn = new bcn();
        bcn.mo1900a(fer, feq.AUTO);
        ivy ivy = hjf.f6633b;
        if (ivy.f7874d || ivy.f7875e || hjf.mo7905c() || hjf.mo7906d()) {
            bcn.mo1900a(ilp, "off");
        }
        ivy = hjf.f6633b;
        if (ivy.f7874d || ivy.f7875e) {
            bcn.mo1900a(fxe, fxj.AUTO);
        }
        return bcn;
    }
}
