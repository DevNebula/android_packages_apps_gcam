package p000;

import java.io.File;

/* compiled from: PG */
/* renamed from: bjh */
public final class bjh implements bjg {
    /* renamed from: a */
    private static final String f11465a = bli.m887a("CdrMediaRecNextOutputFile");
    /* renamed from: b */
    private final biw f11466b;

    public bjh(biw biw) {
        this.f11466b = biw;
    }

    /* renamed from: a */
    public final void mo1982a(File file) {
        try {
            this.f11466b.mo1969a(file);
        } catch (ipu e) {
            String str = f11465a;
            String valueOf = String.valueOf(e);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 58);
            stringBuilder.append("Failed when call PreparedMediaRecorder#setNextOutputFile: ");
            stringBuilder.append(valueOf);
            bli.m891b(str, stringBuilder.toString());
        }
    }
}
