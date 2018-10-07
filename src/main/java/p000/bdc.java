package p000;

import java.util.UUID;

/* compiled from: PG */
/* renamed from: bdc */
public final class bdc implements jxo {
    /* renamed from: b */
    private static final String f11190b = bli.m887a("XmpAddRasterSink");
    /* renamed from: a */
    public final jxo f11191a;
    /* renamed from: c */
    private final UUID f11192c;

    public bdc(jxo jxo, UUID uuid) {
        this.f11191a = jxo;
        this.f11192c = uuid;
    }

    /* renamed from: a */
    final C0556wd mo12357a(jwx jwx) {
        C0556wd a = ern.m2083a();
        try {
            C0557we.f9955a.mo11459a("http://ns.google.com/photos/1.0/creations/", "GCreations");
            a.mo11442a("http://ns.google.com/photos/1.0/creations/", "CameraBurstID", this.f11192c.toString());
            String str;
            String str2;
            try {
                Object obj;
                str = "http://ns.google.com/photos/1.0/creations/";
                str2 = "Type";
                if (jwx.f8436b.equals("image/gif")) {
                    obj = "GCameraAnimation";
                } else if (jiu.m4571b(jwx.f21791a)) {
                    obj = "GCameraCollage";
                } else if (jwx.f21791a.equals("AllSmiles")) {
                    obj = "GCameraGroupSmiles";
                } else if (jwx.f21791a.equals("Collage_PhotoBooth")) {
                    obj = "GCameraCollage";
                } else {
                    throw new bde();
                }
                a.mo11442a(str, str2, obj);
            } catch (bde e) {
                str = f11190b;
                str2 = "Unknown artifact type ";
                String valueOf = String.valueOf(jwx.f21791a);
                if (valueOf.length() == 0) {
                    valueOf = new String(str2);
                } else {
                    valueOf = str2.concat(valueOf);
                }
                bli.m898e(str, valueOf);
            }
            return a;
        } catch (Throwable e2) {
            throw new RuntimeException(e2);
        }
    }
}
