package p000;

import android.content.ContentResolver;
import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* renamed from: but */
public final class but implements bus {
    /* renamed from: a */
    public final bup f11810a;
    /* renamed from: b */
    public final ContentResolver f11811b;
    /* renamed from: c */
    public final bvm f11812c;
    /* renamed from: d */
    public final gsp f11813d;
    /* renamed from: e */
    public final Map f11814e;
    /* renamed from: f */
    private final glq f11815f = new buu(this);

    public but(bup bup, ContentResolver contentResolver, gsp gsp, bvm bvm, gnh gnh) {
        this.f11810a = bup;
        this.f11811b = contentResolver;
        this.f11813d = gsp;
        this.f11812c = bvm;
        this.f11814e = new HashMap();
        gnh.mo7250a(this.f11815f);
    }

    /* renamed from: a */
    public final kbg mo2158a(long j) {
        for (Object obj : this.f11814e.values()) {
            if (obj.mo12430b().mo6497b() == j) {
                break;
            }
        }
        String str = buk.f1625a;
        StringBuilder stringBuilder = new StringBuilder(52);
        stringBuilder.append("Mediastore record not found for ");
        stringBuilder.append(j);
        bli.m891b(str, stringBuilder.toString());
        Object obj2 = null;
        return kbg.m4803b(obj2);
    }

    /* renamed from: a */
    public final kbg mo2159a(Uri uri) {
        return kbg.m4803b((buo) this.f11814e.get(uri));
    }

    /* renamed from: a */
    public final List mo2157a() {
        List arrayList = new ArrayList();
        for (buo buo : this.f11814e.values()) {
            if (buo.mo12433e()) {
                arrayList.add(buo);
            }
        }
        return arrayList;
    }
}
