package p000;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* renamed from: fst */
final class fst implements kov {
    /* renamed from: a */
    private final /* synthetic */ fsq f18764a;

    fst(fsq fsq) {
        this.f18764a = fsq;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
    }

    /* renamed from: b_ */
    public final /* synthetic */ void mo10186b_(Object obj) {
        obj = (fsm) obj;
        jri.m13404b(obj);
        for (fsn fsn : this.f18764a.f4922a) {
            String str;
            List arrayList = new ArrayList();
            for (fsl a : fsn.f4917a) {
                ftn a2 = a.mo6883a(obj);
                arrayList.add(a2);
                if (a2.f4939b.isEmpty()) {
                    iqz iqz = fsn.f4919c;
                    String valueOf = String.valueOf(a2.f4938a);
                    str = "Valid image created:";
                    if (valueOf.length() == 0) {
                        valueOf = new String(str);
                    } else {
                        valueOf = str.concat(valueOf);
                    }
                    iqz.mo8836d(valueOf);
                }
            }
            iqz iqz2 = fsn.f4919c;
            str = String.valueOf(arrayList);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 51);
            stringBuilder.append("ImageSaverTrace does not match any valid strategy: ");
            stringBuilder.append(str);
            iqz2.mo8834c(stringBuilder.toString());
            iqz2 = fsn.f4919c;
            str = String.valueOf(obj);
            stringBuilder = new StringBuilder(String.valueOf(str).length() + 8);
            stringBuilder.append("Trace = ");
            stringBuilder.append(str);
            iqz2.mo8834c(stringBuilder.toString());
            if (fsn.f4920d != bku.RELEASE) {
                str = String.valueOf(obj);
                stringBuilder = new StringBuilder(String.valueOf(str).length() + 62);
                stringBuilder.append("Image Saver Trace did not match any valid ImageSaverStrategy: ");
                stringBuilder.append(str);
                fsn.f4918b.execute(new fso(new IllegalStateException(stringBuilder.toString())));
            }
        }
    }
}
