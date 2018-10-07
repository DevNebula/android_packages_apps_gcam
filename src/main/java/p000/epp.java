package p000;

import com.google.android.libraries.camera.exif.ExifInterface;
import com.google.common.logging.nano.eventprotos$CameraEvent;
import com.google.common.logging.nano.eventprotos$CaptureDone;

/* compiled from: PG */
/* renamed from: epp */
public final class epp {
    /* renamed from: a */
    public static final String f4272a = bli.m887a("CptDoneEvntBldr");
    /* renamed from: b */
    public final eventprotos$CameraEvent f4273b;

    public epp(int i, boolean z, String str) {
        boolean z2;
        if (i != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        jri.m13395a(z2);
        this.f4273b = new eventprotos$CameraEvent();
        this.f4273b.captureDoneEvent = new eventprotos$CaptureDone();
        eventprotos$CameraEvent eventprotos_cameraevent = this.f4273b;
        eventprotos_cameraevent.eventType = 3;
        eventprotos$CaptureDone eventprotos_capturedone = eventprotos_cameraevent.captureDoneEvent;
        eventprotos_capturedone.mode = i;
        eventprotos_capturedone.fileNameHash = ept.m2032a().mo6480a(str);
        this.f4273b.captureDoneEvent.frontCamera = z;
    }

    /* renamed from: a */
    public final epp mo6447a(isu isu) {
        if (isu == null) {
            bli.m894c(f4272a, "exif data is null; not adding to stats");
        } else {
            eventprotos$CaptureDone eventprotos_capturedone = this.f4273b.captureDoneEvent;
            kka kka = new kka();
            String tagStringValue = isu.getTagStringValue(ExifInterface.f13014d);
            if (tagStringValue != null) {
                kka.f25042b = tagStringValue;
            }
            tagStringValue = isu.getTagStringValue(ExifInterface.f13015e);
            if (tagStringValue != null) {
                kka.f25042b = tagStringValue;
            }
            tagStringValue = isu.getTagStringValue(ExifInterface.TAG_SOFTWARE);
            if (tagStringValue != null) {
                kka.f25041a = tagStringValue;
            }
            iqn b = isu.mo8966b(ExifInterface.f13024n);
            if (b != null) {
                kka.f25043c = ((float) b.f7693a) / ((float) b.f7694b);
            }
            Integer a = isu.mo8965a(ExifInterface.f13026p);
            if (a != null) {
                kka.f25044d = a.intValue();
            }
            b = isu.mo8966b(ExifInterface.f13032v);
            if (b != null) {
                kka.f25045e = ((float) b.f7693a) / ((float) b.f7694b);
            }
            b = isu.mo8966b(ExifInterface.f13028r);
            if (b != null) {
                kka.f25046f = ((float) b.f7693a) / ((float) b.f7694b);
            }
            boolean z = isu.mo8966b(ExifInterface.f12917E) == null ? false : isu.mo8966b(ExifInterface.f12919G) != null;
            kka.f25047g = z;
            a = isu.mo8965a(ExifInterface.f13017g);
            if (a != null) {
                kka.f25048h = a.intValue();
            }
            a = isu.mo8965a(ExifInterface.f13035y);
            if (a != null) {
                kka.f25049i = a.intValue();
            }
            a = isu.mo8965a(ExifInterface.f13034x);
            if (a != null) {
                kka.f25050j = a.intValue();
            }
            a = isu.mo8965a(ExifInterface.f13031u);
            if (a != null) {
                kka.f25051k = true;
                kka.f25052l = a.intValue();
            } else {
                kka.f25051k = false;
            }
            b = isu.mo8966b(ExifInterface.f13029s);
            if (b != null) {
                kka.f25053m = ((float) b.f7693a) / ((float) b.f7694b);
            }
            eventprotos_capturedone.exif = kka;
        }
        return this;
    }

    /* renamed from: a */
    public final epp mo6446a(int i) {
        this.f4273b.captureDoneEvent.flashSetting = i;
        return this;
    }

    /* renamed from: a */
    public final epp mo6449a(boolean z) {
        this.f4273b.captureDoneEvent.gridLines = z;
        return this;
    }

    /* renamed from: a */
    public final epp mo6445a(float f) {
        this.f4273b.captureDoneEvent.processingTime = f;
        return this;
    }

    /* renamed from: a */
    public final epp mo6448a(kmf kmf) {
        this.f4273b.captureDoneEvent.videoMeta = kmf;
        return this;
    }

    /* renamed from: b */
    public final epp mo6450b(float f) {
        this.f4273b.captureDoneEvent.zoomValue = f;
        return this;
    }
}
