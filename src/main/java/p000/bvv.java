package p000;

import android.content.ContentProvider.PipeDataWriter;
import android.content.ContentUris;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Size;

/* compiled from: PG */
/* renamed from: bvv */
public final class bvv implements bvu {
    /* renamed from: b */
    private static int f11848b = -1;
    /* renamed from: a */
    public final ird f11849a;
    /* renamed from: c */
    private final bus f11850c;
    /* renamed from: d */
    private final bvy f11851d;
    /* renamed from: e */
    private final bvt f11852e;

    public bvv(bus bus, ird ird, bvy bvy, bvt bvt) {
        this.f11850c = bus;
        this.f11849a = ird;
        this.f11851d = bvy;
        this.f11852e = bvt;
    }

    /* renamed from: a */
    public final PipeDataWriter mo2178a(Uri uri) {
        kbg kbg;
        int i = f11848b + 1;
        f11848b = i;
        StringBuilder stringBuilder = new StringBuilder(14);
        stringBuilder.append("[r");
        stringBuilder.append(i);
        stringBuilder.append("]");
        String stringBuilder2 = stringBuilder.toString();
        String str = buk.f1625a;
        String valueOf = String.valueOf(uri);
        StringBuilder stringBuilder3 = new StringBuilder((String.valueOf(stringBuilder2).length() + 33) + String.valueOf(valueOf).length());
        stringBuilder3.append(stringBuilder2);
        stringBuilder3.append("processing thumbnail request uri=");
        stringBuilder3.append(valueOf);
        bli.m894c(str, stringBuilder3.toString());
        long parseId = ContentUris.parseId(uri);
        str = buk.f1625a;
        stringBuilder3 = new StringBuilder(String.valueOf(stringBuilder2).length() + 62);
        stringBuilder3.append(stringBuilder2);
        stringBuilder3.append("processing thumbnail request mediaStoreId=");
        stringBuilder3.append(parseId);
        bli.m896d(str, stringBuilder3.toString());
        StringBuilder stringBuilder4 = new StringBuilder(String.valueOf(stringBuilder2).length() + 24);
        stringBuilder4.append(stringBuilder2);
        stringBuilder4.append("[m");
        stringBuilder4.append(parseId);
        stringBuilder4.append("] ");
        String stringBuilder5 = stringBuilder4.toString();
        kbg kbg2 = kau.f21835a;
        str = uri.getQueryParameter("width");
        String queryParameter = uri.getQueryParameter("height");
        if (str == null) {
            kbg = kbg2;
        } else if (queryParameter != null) {
            Size size = new Size(Integer.parseInt(str), Integer.parseInt(queryParameter));
            str = buk.f1625a;
            queryParameter = String.valueOf(size);
            StringBuilder stringBuilder6 = new StringBuilder((String.valueOf(stringBuilder5).length() + 43) + String.valueOf(queryParameter).length());
            stringBuilder6.append(stringBuilder5);
            stringBuilder6.append("processing thumbnail request thumbnailSize=");
            stringBuilder6.append(queryParameter);
            bli.m896d(str, stringBuilder6.toString());
            kbg = kbg.m4804c(size);
        } else {
            kbg = kbg2;
        }
        kbg2 = this.f11850c.mo2158a(parseId);
        if (kbg2.mo9709b()) {
            agn a = ((buo) kbg2.mo9706a()).mo12427a();
            if (a == null) {
                bli.m891b(buk.f1625a, String.valueOf(stringBuilder5).concat("DrawableResource is not set in ProcessingMedia"));
                throw new bvz("DrawableResource is not set in ProcessingMedia");
            }
            Bitmap a2;
            ird ird = this.f11849a;
            String str2 = buk.f1625a;
            StringBuilder stringBuilder7 = new StringBuilder((String.valueOf(str2).length() + 26) + String.valueOf(stringBuilder5).length());
            stringBuilder7.append(str2);
            stringBuilder7.append(stringBuilder5);
            stringBuilder7.append("BitmapDrawable.getBitmap()");
            ird.mo8856a(stringBuilder7.toString());
            Bitmap b = hid.m3225b((Drawable) a.mo262b());
            this.f11849a.mo8857b();
            if (kbg.mo9709b()) {
                ird ird2 = this.f11849a;
                str2 = buk.f1625a;
                queryParameter = String.valueOf(kbg.mo9706a());
                int length = String.valueOf(str2).length();
                StringBuilder stringBuilder8 = new StringBuilder(((length + 31) + String.valueOf(stringBuilder5).length()) + String.valueOf(queryParameter).length());
                stringBuilder8.append(str2);
                stringBuilder8.append(stringBuilder5);
                stringBuilder8.append("Bitmap.createScaledBitmap#size=");
                stringBuilder8.append(queryParameter);
                ird2.mo8856a(stringBuilder8.toString());
                a2 = hid.m3222a(b, (Size) kbg.mo9706a());
                this.f11849a.mo8857b();
            } else {
                a2 = b;
            }
            ird = this.f11849a;
            str2 = buk.f1625a;
            stringBuilder7 = new StringBuilder((String.valueOf(str2).length() + 26) + String.valueOf(stringBuilder5).length());
            stringBuilder7.append(str2);
            stringBuilder7.append(stringBuilder5);
            stringBuilder7.append("BitmapSerializer.serialize");
            ird.mo8856a(stringBuilder7.toString());
            try {
                bvs bvs;
                bvy bvy = this.f11851d;
                if (kbg.mo9709b()) {
                    Object bvs2 = bvy;
                } else {
                    bvs2 = this.f11852e;
                }
                Object a3 = bvs2.mo2177a(a2);
                this.f11849a.mo8857b();
                jri.m13404b(a3);
                return new bvw(this, stringBuilder5, a3);
            } catch (Throwable e) {
                throw new bvz(e);
            } catch (Throwable th) {
                this.f11849a.mo8857b();
            }
        } else {
            bli.m891b(buk.f1625a, String.valueOf(stringBuilder5).concat("ProcessingMedia does not exist in ProcessingMediaManager"));
            throw new bvz("ProcessingMedia does not exist in ProcessingMediaManager");
        }
    }
}
