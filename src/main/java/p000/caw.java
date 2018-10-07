package p000;

import com.google.android.libraries.camera.exif.ExifInterface;

/* compiled from: PG */
/* renamed from: caw */
public final class caw implements kov {
    /* renamed from: a */
    private final /* synthetic */ iwz f12086a;
    /* renamed from: b */
    private final /* synthetic */ ExifInterface f12087b;
    /* renamed from: c */
    private final /* synthetic */ String f12088c;
    /* renamed from: d */
    private final /* synthetic */ gdy f12089d;
    /* renamed from: e */
    private final /* synthetic */ hjo f12090e;
    /* renamed from: f */
    private final /* synthetic */ long f12091f;
    /* renamed from: g */
    private final /* synthetic */ gdv f12092g;

    public caw(gdv gdv, iwz iwz, ExifInterface exifInterface, String str, gdy gdy, hjo hjo, long j) {
        this.f12092g = gdv;
        this.f12086a = iwz;
        this.f12087b = exifInterface;
        this.f12088c = str;
        this.f12089d = gdy;
        this.f12090e = hjo;
        this.f12091f = j;
    }

    /* renamed from: a */
    public final void mo10185a(Throwable th) {
        this.f12086a.close();
        this.f12090e.close();
        this.f12092g.f5338b.mo15476a(this.f12091f);
    }

    /* renamed from: b_ */
    public final /* synthetic */ void mo10186b_(Object obj) {
        foz foz = (foz) obj;
        this.f12086a.close();
        String tagStringValue = this.f12087b.getTagStringValue(ExifInterface.TAG_SOFTWARE);
        if (tagStringValue.charAt(tagStringValue.length() - 1) != 'b') {
            ExifInterface exifInterface = this.f12087b;
            int i = ExifInterface.TAG_SOFTWARE;
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(tagStringValue).length() + 1);
            stringBuilder.append(tagStringValue);
            stringBuilder.append('y');
            exifInterface.mo12669a(exifInterface.mo12668a(i, stringBuilder.toString()));
        }
        ExifInterface exifInterface2 = foz.f4884d;
        new itg(this.f12087b).mo8998a((int) exifInterface2.mo12678e(ExifInterface.f12935a).mo8988c(), (int) exifInterface2.mo12678e(ExifInterface.f12988b).mo8988c(), isx.m4216a(isx.m4217a(exifInterface2)), kau.f21835a);
        this.f12092g.f5338b.m17242a(foz, 100, false, this.f12088c, this.f12087b, this.f12089d);
        this.f12092g.f5338b.f25528j = true;
        this.f12090e.close();
        this.f12092g.f5338b.mo15476a(this.f12091f);
    }
}
