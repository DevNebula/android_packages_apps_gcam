package p000;

import com.google.android.libraries.camera.exif.ExifInterface;

/* compiled from: PG */
/* renamed from: bzp */
public final class bzp implements kov {
    /* renamed from: a */
    private final /* synthetic */ iwz f12055a;
    /* renamed from: b */
    private final /* synthetic */ ExifInterface f12056b;
    /* renamed from: c */
    private final /* synthetic */ fwa f12057c;
    /* renamed from: d */
    private final /* synthetic */ ikb f12058d;
    /* renamed from: e */
    private final /* synthetic */ kbn f12059e;
    /* renamed from: f */
    private final /* synthetic */ bzo f12060f;

    public bzp(bzo bzo, iwz iwz, ExifInterface exifInterface, fwa fwa, ikb ikb, kbn kbn) {
        this.f12060f = bzo;
        this.f12055a = iwz;
        this.f12056b = exifInterface;
        this.f12057c = fwa;
        this.f12058d = ikb;
        this.f12059e = kbn;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        this.f12057c.f4983c.mo6926a();
        this.f12057c.f4984d.close();
    }

    /* renamed from: b_ */
    public final /* synthetic */ void mo10186b_(Object obj) {
        ExifInterface exifInterface;
        obj = (foz) obj;
        this.f12055a.close();
        String str = (String) jri.m13404b(this.f12056b.getTagStringValue(ExifInterface.TAG_SOFTWARE));
        if (str.charAt(str.length() - 1) != 'b') {
            exifInterface = this.f12056b;
            int i = ExifInterface.TAG_SOFTWARE;
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 1);
            stringBuilder.append(str);
            stringBuilder.append('y');
            exifInterface.mo12669a(exifInterface.mo12668a(i, stringBuilder.toString()));
        }
        exifInterface = ((foz) jri.m13404b(obj)).f4884d;
        new itg(this.f12056b).mo8998a((int) ((ite) jri.m13404b(exifInterface.mo12678e(ExifInterface.f12935a))).mo8988c(), (int) ((ite) jri.m13404b(exifInterface.mo12678e(ExifInterface.f12988b))).mo8988c(), isx.m4216a(isx.m4217a(exifInterface)), kau.f21835a);
        this.f12060f.mo2231a(this.f12057c, this.f12058d, this.f12059e, obj.f4882b, obj.f4885e, obj.f4883c, this.f12056b);
    }
}
