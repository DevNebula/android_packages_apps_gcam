package p000;

import java.util.Collection;
import java.util.UUID;

/* compiled from: PG */
/* renamed from: bbz */
public final class bbz {
    /* renamed from: a */
    public static void m815a(ikb ikb, ikb ikb2) {
        iqo b = ikb.mo8558b();
        b.mo8557a(ikb2);
        ikb2.mo8557a(b);
    }

    /* renamed from: a */
    public static C0556wd m814a(UUID uuid, boolean z, String str, boolean z2, C0556wd c0556wd) {
        try {
            C0557we.f9955a.mo11459a("http://ns.google.com/photos/1.0/creations/", "GCreations");
            C0557we.f9955a.mo11459a("http://ns.google.com/photos/1.0/camera/", "GCamera");
            c0556wd.mo11442a("http://ns.google.com/photos/1.0/creations/", "CameraBurstID", uuid.toString());
            c0556wd.mo11442a("http://ns.google.com/photos/1.0/camera/", "BurstID", uuid.toString());
            if (z) {
                c0556wd.mo11442a("http://ns.google.com/photos/1.0/camera/", "BurstPrimary", (Object) "1");
            }
            if (z2) {
                for (String a : erm.f4360a) {
                    c0556wd.mo11446a("http://ns.google.com/photos/1.0/camera/", "DisableAutoCreation", new C0782xj(512), a, new C0782xj());
                }
            }
            if (!bve.NONE.mo2167d().equals(str)) {
                ern.m2092a(c0556wd, str);
            }
            return c0556wd;
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public static C0556wd m813a(UUID uuid, boolean z, String str, boolean z2) {
        return bbz.m814a(uuid, z, str, z2, ern.m2083a());
    }

    /* renamed from: a */
    public static ikb m810a(Collection collection) {
        ikb ikb = new ikb();
        for (ikb a : collection) {
            bbz.m815a(a, ikb);
        }
        return ikb;
    }

    /* renamed from: a */
    public static kpk m812a(iqz iqz, kpk kpk, String str, String str2) {
        kow.m13878a(kpk, new bll(iqz, str, str2), kpq.f8776a);
        return kpk;
    }

    /* renamed from: a */
    public static iqo m811a(String str, String str2) {
        return new blm(str, str2);
    }
}
