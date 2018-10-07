package p000;

import android.graphics.Bitmap;
import android.net.Uri;
import java.util.List;

/* compiled from: PG */
/* renamed from: buu */
final class buu implements glq {
    /* renamed from: a */
    private final /* synthetic */ but f11816a;

    buu(but but) {
        this.f11816a = but;
    }

    /* renamed from: a */
    public final void mo7205a(Uri uri) {
        but but = this.f11816a;
        if (but.f11814e.containsKey(uri)) {
            ((buo) but.f11814e.get(uri)).close();
            but.f11814e.remove(uri);
        }
    }

    /* renamed from: a */
    public final void mo7204a(Bitmap bitmap, int i) {
    }

    /* renamed from: a */
    public final void mo7210a(Uri uri, List list) {
        bli.m894c(buk.f1625a, "onSessionDone");
        but but = this.f11816a;
        if (but.f11814e.containsKey(uri)) {
            ((buo) but.f11814e.get(uri)).close();
            but.f11814e.remove(uri);
        }
    }

    /* renamed from: a */
    public final void mo7209a(Uri uri, hec hec, boolean z) {
        but but = this.f11816a;
        if (but.f11814e.containsKey(uri)) {
            ((buo) but.f11814e.get(uri)).close();
            but.f11814e.remove(uri);
        }
    }

    /* renamed from: b */
    public final void mo7212b(Uri uri) {
    }

    /* renamed from: a */
    public final void mo7211a(byte[] bArr, int i) {
    }

    /* renamed from: a */
    public final void mo7206a(Uri uri, int i) {
        buo buo = (buo) this.f11816a.f11814e.get(uri);
        if (buo != null) {
            buo.mo12428a(i);
        }
    }

    /* renamed from: a */
    public final void mo7208a(Uri uri, hec hec) {
    }

    /* renamed from: a */
    public final void mo7207a(Uri uri, glw glw, eqi eqi) {
        if (eqi == null) {
            bli.m891b(buk.f1625a, "sessionUri has no MediaStore record.");
            return;
        }
        String str = buk.f1625a;
        long b = eqi.mo6497b();
        StringBuilder stringBuilder = new StringBuilder(50);
        stringBuilder.append("onSessionQueued: MediaStoreId=");
        stringBuilder.append(b);
        bli.m894c(str, stringBuilder.toString());
        if (eqi == null) {
            stringBuilder = new StringBuilder(93);
            stringBuilder.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
            stringBuilder.append(1);
            throw new NullPointerException(stringBuilder.toString());
        }
        this.f11816a.f11814e.put(uri, new buq(eqi));
        bve bve = bve.NONE;
        switch (glw.ordinal()) {
            case 4:
                bve = bve.BURSTS;
                break;
            case 5:
                bve = bve.PANORAMA;
                break;
            case 6:
                bve = bve.PHOTOSPHERE;
                break;
            case 7:
            case 8:
                bve = bve.REFOCUS;
                break;
            case 13:
                bve = bve.PORTRAIT;
                break;
        }
        this.f11816a.f11812c.mo2175a(eqi.mo6497b(), bve);
    }

    /* renamed from: a */
    public final void mo7203a(Bitmap bitmap) {
    }

    /* renamed from: c */
    public final void mo7213c(Uri uri) {
        buo buo = (buo) this.f11816a.f11814e.get(uri);
        String str;
        String str2;
        StringBuilder stringBuilder;
        if (buo != null) {
            str = buk.f1625a;
            long b = buo.mo12430b().mo6497b();
            StringBuilder stringBuilder2 = new StringBuilder(51);
            stringBuilder2.append("onSessionUpdated: MediaStoreId=");
            stringBuilder2.append(b);
            bli.m894c(str, stringBuilder2.toString());
            kbg c = this.f11816a.f11813d.mo7412c(uri);
            if (c.mo9709b()) {
                String str3 = buk.f1625a;
                String valueOf = String.valueOf(uri);
                StringBuilder stringBuilder3 = new StringBuilder(String.valueOf(valueOf).length() + 62);
                stringBuilder3.append("  get thumbnail DrawableResource from Storage with sessionUri=");
                stringBuilder3.append(valueOf);
                bli.m896d(str3, stringBuilder3.toString());
                buo.mo12429a((agn) c.mo9706a());
                Uri c2 = buo.mo12430b().mo6498c();
                str = buk.f1625a;
                str3 = String.valueOf(c2);
                stringBuilder2 = new StringBuilder(String.valueOf(str3).length() + 32);
                stringBuilder2.append("  ContentResolver.notifyChange: ");
                stringBuilder2.append(str3);
                bli.m894c(str, stringBuilder2.toString());
                this.f11816a.f11811b.notifyChange(c2, null);
                return;
            }
            str2 = buk.f1625a;
            str = String.valueOf(uri);
            stringBuilder = new StringBuilder(String.valueOf(str).length() + 38);
            stringBuilder.append("thumbnailDrawable not present for uri ");
            stringBuilder.append(str);
            bli.m891b(str2, stringBuilder.toString());
            return;
        }
        str2 = buk.f1625a;
        str = String.valueOf(uri);
        stringBuilder = new StringBuilder(String.valueOf(str).length() + 51);
        stringBuilder.append("onSessionUpdated but no media is found: sessionUri=");
        stringBuilder.append(str);
        bli.m898e(str2, stringBuilder.toString());
    }
}
