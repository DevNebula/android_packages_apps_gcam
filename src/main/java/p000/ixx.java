package p000;

import com.google.android.apps.camera.metadata.refocus.GDepthUtil;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* renamed from: ixx */
public enum ixx {
    DNG("image/x-adobe-dng", ".dng"),
    GIF("image/gif", ".gif"),
    JPEG(GDepthUtil.MIME_JPEG, ".jpg"),
    PHOTOSPHERE("application/vnd.google.panorama360+jpg", ".jpg"),
    MPEG4("video/mp4", ".mp4"),
    THREE_GPP("video/3gpp", ".3gp"),
    WEBM("video/webm", ".webm");
    
    /* renamed from: h */
    public static final Set f7906h = null;
    /* renamed from: l */
    private static final Map f7908l = null;
    /* renamed from: m */
    private static final Set f7909m = null;
    /* renamed from: i */
    public final String f7911i;
    /* renamed from: j */
    public final String f7912j;

    static {
        khb khb = new khb();
        ixx[] values = ixx.values();
        int length = values.length;
        int i;
        while (i < length) {
            Object obj = values[i];
            khb.mo9983a(obj.f7911i, obj);
            i++;
        }
        f7908l = khb.mo9981a();
        f7906h = keu.m13730a(DNG, GIF, JPEG, PHOTOSPHERE);
        f7909m = keu.m13728a(MPEG4, THREE_GPP);
    }

    private ixx(String str) {
        this.f7911i = "";
        this.f7912j = "";
    }

    private ixx(String str, String str2) {
        this.f7911i = str;
        this.f7912j = str2;
    }

    /* renamed from: a */
    public final boolean mo9169a() {
        return f7909m.contains(this);
    }

    /* renamed from: a */
    public static ixx m4391a(String str) {
        if (f7908l.containsKey(str)) {
            return (ixx) f7908l.get(str);
        }
        return f7907k;
    }
}
