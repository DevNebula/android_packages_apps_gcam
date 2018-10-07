package p000;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;

/* compiled from: PG */
/* renamed from: akr */
public final class akr implements ajz {
    /* renamed from: a */
    private final ajz f10370a;

    public akr(ajz ajz) {
        this.f10370a = ajz;
    }

    /* renamed from: a */
    public final /* synthetic */ aka mo343a(Object obj, int i, int i2, adp adp) {
        Object obj2;
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            obj2 = null;
        } else if (str.charAt(0) != '/') {
            obj2 = Uri.parse(str);
            if (obj2.getScheme() == null) {
                obj2 = akr.m6633a(str);
            }
        } else {
            obj2 = akr.m6633a(str);
        }
        if (obj2 == null || !this.f10370a.mo344a(obj2)) {
            return null;
        }
        return this.f10370a.mo343a(obj2, i, i2, adp);
    }

    /* renamed from: a */
    private static Uri m6633a(String str) {
        return Uri.fromFile(new File(str));
    }
}
