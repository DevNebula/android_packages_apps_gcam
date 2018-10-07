package p000;

import com.google.android.libraries.camera.exif.ExifInterface;
import java.util.UUID;

/* compiled from: PG */
/* renamed from: bzo */
public final class bzo {
    /* renamed from: a */
    private final iqz f1786a;
    /* renamed from: b */
    private final hju f1787b;

    public bzo(hju hju, iqz iqz) {
        this.f1787b = hju;
        this.f1786a = iqz.mo8830a("JpegCompressSaving");
    }

    /* renamed from: a */
    final void mo2231a(fwa fwa, ikb ikb, kbn kbn, byte[] bArr, iqp iqp, int i, ExifInterface exifInterface) {
        if (fwa.f4982b.mo13382k() == glw.RAW) {
            fqv fqv = (fqv) jri.m13404b((fqv) kbn.mo9715b());
            String str = fqu.f18662a;
            String valueOf = String.valueOf(fqv.f24299b);
            int length = bArr.length;
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 59);
            stringBuilder.append("Called addJpegImage with burstId ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" and file size ");
            stringBuilder.append(length);
            bli.m894c(str, stringBuilder.toString());
            foz a = foz.m2410a(fqv.f24298a.mo13383l() + 1, bArr, iqp, i, exifInterface, fqv.f24302e.f18663b, false);
            gkr gkr = fqv.f24298a;
            String n = gkr.mo13385n();
            long l = fqv.f24298a.mo13383l();
            UUID uuid = fqv.f24299b;
            bve bve = bve.NONE;
            long j = a.f4881a;
            iqm a2 = iqm.m4095a(a.f4883c);
            iqp iqp2 = a.f4885e;
            gkr.mo13367a(new bnm(n, 1, l, j, uuid, a2, iqp2.f7695a, iqp2.f7696b, a.f4882b, a.f4884d, gdy.m2550c().mo7062a(), bve, false, "JPEG"));
            fqv.f24302e.f18664c.mo9168a(1.0f, a.f4881a);
            synchronized (fqv) {
                fqv.f24300c = true;
                fqv.mo14901a(ikb);
            }
            return;
        }
        fwa.f4984d.mo13291a(new fwc(bArr, iqp, i, exifInterface, this.f1787b));
        fwa.f4984d.close();
        ikb.close();
    }

    /* renamed from: a */
    public final void mo2232a(fwa fwa, kbn kbn, ikb ikb, int i, int i2, byte[] bArr) {
        int i3 = fwa.f4981a.f4677d;
        try {
            Object exifInterface = new ExifInterface();
            exifInterface.mo12673a(bArr);
            isx a = isx.m4217a((ExifInterface) exifInterface);
            if (i3 >= 0) {
                ite a2 = exifInterface.mo12668a(ExifInterface.f12923K, (Object) "M");
                ite a3 = exifInterface.mo12668a(ExifInterface.f12924L, new iqn((long) i3, 1));
                exifInterface.mo12669a(a2);
                exifInterface.mo12669a(a3);
            }
            byte[] bArr2 = fwa.f4981a.f4679f;
            if (bArr2.length > 0) {
                exifInterface.mo12669a(exifInterface.mo12668a(ExifInterface.f13013c, new String(bArr2)));
            }
            fwa.f4982b.mo7077h().mo7365a((long) bArr.length);
            mo2231a(fwa, ikb, kbn, bArr, iqp.m4101a(i, i2), isx.m4216a(a).f7692e, (ExifInterface) jri.m13404b(exifInterface));
        } catch (Throwable e) {
            this.f1786a.mo8835c("Could not read exif from gcam jpeg", e);
            throw new IllegalStateException("Could not read exif from gcam jpeg", e);
        }
    }
}
