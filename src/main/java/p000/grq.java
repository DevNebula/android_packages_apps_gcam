package p000;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.File;

/* compiled from: PG */
/* renamed from: grq */
public final class grq extends izy {
    /* renamed from: a */
    private static final String f24442a = bli.m887a("LogAfctGenFunc");
    /* renamed from: b */
    private final ContentResolver f24443b;
    /* renamed from: c */
    private final klw f24444c = new klw();
    /* renamed from: d */
    private final gsp f24445d;
    /* renamed from: e */
    private final irs f24446e;

    public grq(ContentResolver contentResolver, boolean z, jiy jiy, String str, gsp gsp, irs irs) {
        int i;
        this.f24443b = contentResolver;
        this.f24446e = irs;
        klw klw = this.f24444c;
        switch (jiy.ordinal()) {
            case 0:
                i = 1;
                break;
            case 1:
                i = 2;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            default:
                String str2 = f24442a;
                String valueOf = String.valueOf(jiy);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 34);
                stringBuilder.append("Unknown creation type ");
                stringBuilder.append(valueOf);
                stringBuilder.append(" for logging");
                bli.m891b(str2, stringBuilder.toString());
                i = -1;
                break;
        }
        klw.f25311b = i;
        klw klw2 = this.f24444c;
        klw2.f25312c = z;
        klw2.f25310a = ept.m2032a().mo6480a(str);
        this.f24445d = gsp;
    }

    /* renamed from: a_ */
    public final /* synthetic */ void mo13769a_(Object obj) {
        kbg kbg = (kbg) obj;
        if (kbg.mo9709b()) {
            Uri uri = (Uri) kbg.mo9706a();
            if (uri == null) {
                bli.m891b(f24442a, "Couldn't get session URI");
                return;
            }
            Uri b = this.f24445d.mo7410b(uri);
            if (b == null) {
                String str = f24442a;
                String valueOf = String.valueOf(uri);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 37);
                stringBuilder.append("Couldn't get content URI for session ");
                stringBuilder.append(valueOf);
                bli.m891b(str, stringBuilder.toString());
            }
            String a = eio.m1802a(this.f24443b, b);
            if (a == null) {
                a = f24442a;
                String valueOf2 = String.valueOf(uri);
                StringBuilder stringBuilder2 = new StringBuilder(String.valueOf(valueOf2).length() + 27);
                stringBuilder2.append("Couldn't get file name for ");
                stringBuilder2.append(valueOf2);
                bli.m891b(a, stringBuilder2.toString());
                return;
            }
            epp epp = new epp(18, false, new File(a).getName());
            epp.f4273b.captureDoneEvent.smartburstCreationMeta = this.f24444c;
            this.f24446e.mo8892a(epp);
        }
    }
}
