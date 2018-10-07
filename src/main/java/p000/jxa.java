package p000;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: jxa */
public class jxa {
    /* renamed from: a */
    public static final jxi f8410a = new jxj("TIMESTAMPNS");
    /* renamed from: b */
    public static final jxi f8411b = new jxl("METADATAIMAGESIZE");
    /* renamed from: c */
    public static final jxi f8412c = new jxe("FACES");
    /* renamed from: d */
    public static final jxi f8413d = new jxf("FACESHARPNESSLIST");
    /* renamed from: e */
    public static final jxi f8414e = new jxg("FACEAVERAGESHARPNESS");
    /* renamed from: f */
    public static final jxi f8415f = new jxg("FACEAVERAGELEFTEYEOPEN");
    /* renamed from: g */
    public static final jxi f8416g = new jxg("FACEMINIMUMMAXIMUMEYEOPEN");
    /* renamed from: h */
    public static final jxi f8417h = new jxg("FACEMINIMUMLEFTEYEOPEN");
    /* renamed from: i */
    public static final jxi f8418i = new jxg("FACEMAXIMUMLEFTEYEOPEN");
    /* renamed from: j */
    public static final jxi f8419j = new jxg("FACEAVERAGERIGHTEYEOPEN");
    /* renamed from: k */
    public static final jxi f8420k = new jxg("FACEMINIMUMRIGHTEYEOPEN");
    /* renamed from: l */
    public static final jxi f8421l = new jxg("FACEMAXIMUMRIGHTEYEOPEN");
    /* renamed from: m */
    public static final jxi f8422m = new jxg("FACEAVERAGESMILING");
    /* renamed from: n */
    public static final jxi f8423n = new jxg("FACEMINIMUMSMILING");
    /* renamed from: o */
    public static final jxi f8424o = new jxg("FACEMAXIMUMSMILING");
    /* renamed from: p */
    public static final jxi f8425p = new jxk("FACEBOUNDINGBOX");
    /* renamed from: q */
    public static final jxi f8426q = new jxg("INTEGRALMOTIONSALIENCY");
    /* renamed from: r */
    public static final jxi f8427r = new jxg("LOWPASSMOTIONSALIENCY");
    /* renamed from: s */
    public static final jxi f8428s = new jxc("HIGHMOTION");
    /* renamed from: t */
    public static final jxi f8429t = new jxg("PERCEPTUALSHARPNESS");
    /* renamed from: u */
    public static final jxi f8430u = new jxg("MAXGRIDSHARPNESS");
    /* renamed from: v */
    public static final jxi f8431v = new jxd("FACEIMAGES");
    /* renamed from: x */
    private static final kbn f8432x = jqk.m13343a(new jxb());
    /* renamed from: w */
    public final HashMap f8433w = khb.m4959d();

    static {
        jxh jxh = new jxh("STABILIZATIONTRANSFORM");
    }

    /* renamed from: a */
    public static jxi m4723a(String str) {
        return (jxi) ((Map) f8432x.mo9715b()).get(str);
    }

    /* renamed from: a */
    public final Object mo9589a(jxi jxi) {
        Object obj = this.f8433w.get(jxi);
        if (obj != null) {
            return obj;
        }
        String valueOf = String.valueOf(jxi);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 47);
        stringBuilder.append("Metadata does not contain any value for key '");
        stringBuilder.append(valueOf);
        stringBuilder.append("'.");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    /* renamed from: b */
    public final boolean mo9592b(jxi jxi) {
        return this.f8433w.containsKey(jxi);
    }

    /* renamed from: a */
    public final void mo9591a(jxa jxa) {
        for (Entry entry : jxa.f8433w.entrySet()) {
            jxi jxi = (jxi) entry.getKey();
            if (mo9592b(jxi)) {
                String valueOf = String.valueOf(jxi);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 26);
                stringBuilder.append("Merge conflict for key '");
                stringBuilder.append(valueOf);
                stringBuilder.append("'.");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            mo9590a(jxi, entry.getValue());
        }
    }

    /* renamed from: a */
    public final jxa mo9590a(jxi jxi, Object obj) {
        this.f8433w.put(jxi, obj);
        return this;
    }
}
