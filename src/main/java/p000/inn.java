package p000;

import android.annotation.TargetApi;

@TargetApi(8)
/* compiled from: PG */
/* renamed from: inn */
public final class inn {
    /* renamed from: a */
    public final inh f7534a;
    /* renamed from: b */
    public final int[] f7535b = new int[]{8000, 11025, 12000, 16000, 22050, 24000, 44100, 48000};

    public inn(inh inh) {
        this.f7534a = inh;
    }

    /* renamed from: a */
    public static inp m3941a(ioa ioa, ine ine, int i, inc inc) {
        return new inl(ind.m3936b(ioa), ine, i, inc, ioa.mo8663h(), ioa.mo8665j(), ioa.mo8664i());
    }

    /* renamed from: a */
    public static boolean m3943a(ioa ioa, inc inc, ine ine) {
        if (inn.m3942a(ioa, inc) && inn.m3944a(ioa, ine) && ind.m3935a(ioa)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m3945b(ioa ioa, inc inc, ine ine) {
        if (inn.m3942a(ioa, inc) && inn.m3944a(ioa, ine) && ind.m3935a(ioa)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m3942a(ioa ioa, inc inc) {
        return inc.f7508f <= ioa.mo8667l();
    }

    /* renamed from: a */
    private static boolean m3944a(ioa ioa, ine ine) {
        return new iqp(ioa.mo8668m(), ioa.mo8666k()).equals(ine.mo8639c());
    }
}
