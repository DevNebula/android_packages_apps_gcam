package p000;

import android.graphics.Rect;
import android.os.SystemClock;
import com.google.android.libraries.camera.exif.ExifInterface;
import com.google.common.logging.nano.eventprotos$BackgroundEvent;
import com.google.common.logging.nano.eventprotos$CameraEvent;
import com.google.common.logging.nano.eventprotos$CaptureDone;
import com.google.common.logging.nano.eventprotos$CaptureProfileEvent;
import com.google.common.logging.nano.eventprotos$CaptureTiming;
import com.google.common.logging.nano.eventprotos$LaunchReport;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* renamed from: grx */
public final class grx implements irs {
    /* renamed from: b */
    private static final String f19532b = bli.m887a("UsageStats");
    /* renamed from: u */
    private static final long f19533u = 3000000000L;
    /* renamed from: a */
    public epc f19534a;
    /* renamed from: c */
    private final String f19535c;
    /* renamed from: d */
    private int f19536d;
    /* renamed from: e */
    private long f19537e;
    /* renamed from: f */
    private final AtomicInteger f19538f = new AtomicInteger(0);
    /* renamed from: g */
    private final ept f19539g;
    /* renamed from: h */
    private final iya f19540h;
    /* renamed from: i */
    private String f19541i;
    /* renamed from: j */
    private String f19542j;
    /* renamed from: k */
    private final List f19543k = new ArrayList();
    /* renamed from: l */
    private long f19544l = 0;
    /* renamed from: m */
    private boolean f19545m = true;
    /* renamed from: n */
    private long f19546n = 0;
    /* renamed from: o */
    private bku f19547o;
    /* renamed from: p */
    private eio f19548p;
    /* renamed from: q */
    private int f19549q = 0;
    /* renamed from: r */
    private final ScheduledExecutorService f19550r;
    /* renamed from: s */
    private LinkedHashMap f19551s = new LinkedHashMap();
    /* renamed from: t */
    private int f19552t = 0;
    /* renamed from: v */
    private long f19553v;
    /* renamed from: w */
    private boolean f19554w = false;

    public grx(ept ept, iya iya, int i, String str, String str2, ScheduledExecutorService scheduledExecutorService, bku bku, boolean z, epc epc, eio eio, String str3) {
        this.f19539g = ept;
        this.f19540h = iya;
        this.f19536d = i;
        this.f19541i = str;
        this.f19542j = str2;
        this.f19550r = scheduledExecutorService;
        this.f19547o = bku;
        this.f19554w = z;
        this.f19548p = eio;
        this.f19534a = epc;
        this.f19535c = str3;
    }

    /* renamed from: a */
    public final void mo8888a(int i, klq[] klqArr, eventprotos$LaunchReport eventprotos_launchreport) {
        String str = f19532b;
        StringBuilder stringBuilder = new StringBuilder(31);
        stringBuilder.append("backgrounded (mode ");
        stringBuilder.append(i);
        stringBuilder.append(")");
        bli.m894c(str, stringBuilder.toString());
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Iterator it = this.f19551s.keySet().iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            gsc gsc = (gsc) this.f19551s.get(str2);
            long j = gsc.f6031a;
            if (elapsedRealtime > 30000 + j) {
                long j2 = gsc.f6033c;
                eventprotos$CameraEvent eventprotos_cameraevent = new eventprotos$CameraEvent();
                eventprotos_cameraevent.eventType = 5;
                eventprotos_cameraevent.interaction = new klc();
                klc klc = eventprotos_cameraevent.interaction;
                klc.f25214a = 6;
                klc.f25216c = this.f19539g.mo6480a(str2);
                klc klc2 = eventprotos_cameraevent.interaction;
                klc2.f25218e = gsc.f6032b;
                klc2.f25217d = ((float) (j2 - j)) * 0.001f;
                mo13465a(eventprotos_cameraevent);
                it.remove();
            }
        }
        eventprotos$CameraEvent eventprotos_cameraevent2 = new eventprotos$CameraEvent();
        eventprotos_cameraevent2.eventType = 14;
        eventprotos$BackgroundEvent eventprotos_backgroundevent = new eventprotos$BackgroundEvent();
        if (!(klqArr == null || klqArr.length == 0)) {
            eventprotos_backgroundevent.previewSmoothnessReport = klqArr;
        }
        eventprotos_backgroundevent.launchReport = eventprotos_launchreport;
        List list = this.f19543k;
        kjz[] kjzArr = (kjz[]) list.toArray(new kjz[list.size()]);
        this.f19543k.clear();
        eventprotos_backgroundevent.dirtyLensEvents = kjzArr;
        if (i == 1) {
            if (this.f19545m) {
                eventprotos_backgroundevent.shutterButtonDisabledDuration = -1.0f;
            } else {
                eventprotos_backgroundevent.shutterButtonDisabledDuration = ((float) (elapsedRealtimeNanos - this.f19546n)) / 1.0E9f;
            }
        }
        this.f19545m = true;
        this.f19546n = 0;
        eventprotos_cameraevent2.backgroundEvent = eventprotos_backgroundevent;
        mo13465a(eventprotos_cameraevent2);
    }

    /* renamed from: b */
    private static kjw m11642b(int i, int i2) {
        kjw kjw = new kjw();
        kjw.f25023a = i;
        kjw.f25024b = i2;
        return kjw;
    }

    /* renamed from: a */
    private static String m11639a(kjj kjj) {
        int i = kjj.f24983a;
        if (i == 0) {
            return "-UNKNOWN";
        }
        if (i == 1) {
            return "-API1_JPEG";
        }
        if (i == 9) {
            return "-API2BETA_HDR_PLUS";
        }
        if (i == 10) {
            return "-API2_LEGACY";
        }
        if (i == 14) {
            return "-API2_LIMITED";
        }
        if (i == 12) {
            return "-API2_ZSL";
        }
        if (i == 13) {
            return "-API2_HDR_PLUS";
        }
        if (i == 11) {
            return "-API2_AUTO_HDR_PLUS";
        }
        StringBuilder stringBuilder = new StringBuilder(20);
        stringBuilder.append("-UNKNOWN-");
        stringBuilder.append(i);
        return stringBuilder.toString();
    }

    /* renamed from: a */
    public final void mo8885a(int i, String str, int i2, int i3) {
        m11640a(i, str, i2, i3, 0);
    }

    /* renamed from: a */
    private final void m11640a(int i, String str, int i2, int i3, int i4) {
        eventprotos$CameraEvent eventprotos_cameraevent = new eventprotos$CameraEvent();
        eventprotos_cameraevent.eventType = 7;
        eventprotos_cameraevent.cameraFailure = new kjo();
        kjo kjo = eventprotos_cameraevent.cameraFailure;
        kjo.f24994a = i;
        kjo.f24999f = i4;
        if (str != null) {
            kjo.f24995b = str;
        }
        kjo.f24996c = this.f19542j;
        if (i2 != -1) {
            kjo.f24997d = i2;
        }
        if (i3 != -1) {
            kjo.f24998e = i3;
        }
        mo13465a(eventprotos_cameraevent);
    }

    /* renamed from: a */
    public final void mo8886a(int i, kll kll, kkx kkx, klu klu) {
        this.f19544l = SystemClock.elapsedRealtime();
        eventprotos$CameraEvent eventprotos_cameraevent = new eventprotos$CameraEvent();
        eventprotos_cameraevent.eventType = 13;
        eventprotos_cameraevent.captureComputeEvent = new kjq();
        kjq kjq = eventprotos_cameraevent.captureComputeEvent;
        kjq.f25002a = i;
        if (kkx != null) {
            kjq.f25003b = kkx;
        }
        if (kll != null) {
            kjq.f25004c = kll;
        }
        if (klu != null) {
            kjq.f25005d = klu;
        }
        mo13465a(eventprotos_cameraevent);
    }

    /* renamed from: a */
    public final void mo8882a(int i, int i2, long j, long j2) {
        eventprotos$CameraEvent eventprotos_cameraevent = new eventprotos$CameraEvent();
        eventprotos_cameraevent.eventType = 23;
        eventprotos_cameraevent.changeCameraEvent = new kjx();
        kjx kjx = eventprotos_cameraevent.changeCameraEvent;
        kjx.f25025a = i;
        kjx.f25026b = i2;
        kjx.f25027c = j;
        kjx.f25028d = j2;
        kjx.f25029e = this.f19552t;
        long j3 = this.f19544l;
        long j4 = this.f19553v;
        long j5 = j4 / 1000000;
        long j6 = f19533u;
        kjx kjx2 = eventprotos_cameraevent.changeCameraEvent;
        boolean z = j - j4 < j6 ? j3 < j5 : false;
        kjx2.f25030f = z;
        mo13465a(eventprotos_cameraevent);
        this.f19552t = 0;
        this.f19553v = j2;
    }

    /* renamed from: a */
    public final void mo8879a(int i, int i2) {
        mo8907b(i, i2, 0, 0);
    }

    /* renamed from: b */
    public final void mo8907b(int i, int i2, long j, long j2) {
        eventprotos$CameraEvent eventprotos_cameraevent = new eventprotos$CameraEvent();
        eventprotos_cameraevent.eventType = 1;
        eventprotos_cameraevent.navigationChange = new klh();
        klh klh = eventprotos_cameraevent.navigationChange;
        klh.f25249b = i;
        klh.f25250c = i2;
        int i3 = this.f19549q;
        klh.f25248a = i3;
        klh.f25252e = j;
        klh.f25253f = j2;
        if (i == 2 && this.f19544l != 0 && (i3 == 7 || i3 == 5 || i3 == 1 || i3 == 8 || i3 == 6 || i3 == 11)) {
            klh.f25251d = ((float) (SystemClock.elapsedRealtime() - this.f19544l)) / 1000.0f;
        }
        this.f19544l = 0;
        klh = eventprotos_cameraevent.navigationChange;
        i3 = klh.f25248a;
        if (!(i3 == 0 || i3 == klh.f25249b)) {
            mo13465a(eventprotos_cameraevent);
        }
        this.f19549q = i;
    }

    /* renamed from: a */
    public final void mo8878a(int i) {
        m11641a(i, null, null);
    }

    /* renamed from: a */
    private final void m11641a(int i, kmd kmd, klr klr) {
        eventprotos$CameraEvent eventprotos_cameraevent = new eventprotos$CameraEvent();
        eventprotos_cameraevent.eventType = 12;
        eventprotos_cameraevent.controlEvent = new kjy();
        kjy kjy = eventprotos_cameraevent.controlEvent;
        kjy.f25031a = i;
        kjy.f25032b = this.f19549q;
        if (kmd != null) {
            kjy.f25033c = kmd;
        }
        if (klr != null) {
            kjy.f25034d = klr;
        }
        mo13465a(eventprotos_cameraevent);
    }

    /* renamed from: a */
    public final void mo8881a(int i, int i2, int i3, boolean z, boolean z2, boolean z3) {
        String str = f19532b;
        StringBuilder stringBuilder = new StringBuilder(31);
        stringBuilder.append("foregrounded (mode ");
        stringBuilder.append(i3);
        stringBuilder.append(")");
        bli.m894c(str, stringBuilder.toString());
        eventprotos$CameraEvent eventprotos_cameraevent = new eventprotos$CameraEvent();
        eventprotos_cameraevent.eventType = 6;
        eventprotos_cameraevent.foregroundEvent = new kkd();
        kkd kkd = eventprotos_cameraevent.foregroundEvent;
        kkd.f25068a = i;
        kkd.f25069b = i3;
        kkd.f25070c = this.f19542j;
        kkd.f25071d = z;
        kkd.f25072e = z2;
        kkd.f25073f = z3;
        kkd.f25074g = 0;
        kkd.f25075h = i2;
        mo13465a(eventprotos_cameraevent);
        this.f19550r.execute(new gsa(this));
    }

    /* renamed from: a */
    public final long mo8877a() {
        return this.f19537e;
    }

    /* renamed from: b */
    public final boolean mo8910b() {
        return this.f19554w;
    }

    /* renamed from: a */
    public final void mo8883a(int i, int i2, String str, float f, float f2) {
        epp a = new epp(i, false, str).mo6450b(1.0f).mo6445a(f);
        if (i == 11) {
            klj klj = new klj();
            klj.f25255a = i2;
            klj.f25256b = f2;
            a.f4273b.captureDoneEvent.panoMeta = klj;
        }
        mo8892a(a);
    }

    /* renamed from: c */
    public final void mo8911c() {
        eventprotos$CameraEvent eventprotos_cameraevent = new eventprotos$CameraEvent();
        eventprotos_cameraevent.eventType = 28;
        eventprotos_cameraevent.preferencesEvent = new klp();
        klp klp = eventprotos_cameraevent.preferencesEvent;
        klp.f25276a = 1;
        klp.f25277b = 1;
        mo13465a(eventprotos_cameraevent);
    }

    /* renamed from: d */
    public final void mo8914d() {
        eventprotos$CameraEvent eventprotos_cameraevent = new eventprotos$CameraEvent();
        eventprotos_cameraevent.eventType = 28;
        eventprotos_cameraevent.preferencesEvent = new klp();
        klp klp = eventprotos_cameraevent.preferencesEvent;
        klp.f25276a = 2;
        klp.f25277b = 1;
        mo13465a(eventprotos_cameraevent);
    }

    /* renamed from: a */
    public final void mo8895a(String str, int i, float f) {
        eventprotos$CameraEvent eventprotos_cameraevent = new eventprotos$CameraEvent();
        eventprotos_cameraevent.eventType = 5;
        eventprotos_cameraevent.interaction = new klc();
        eventprotos_cameraevent.interaction.f25216c = this.f19539g.mo6480a(str);
        klc klc = eventprotos_cameraevent.interaction;
        klc.f25214a = i;
        klc.f25215b = 1;
        if (f != 0.0f) {
            klc.f25217d = f;
        }
        mo13465a(eventprotos_cameraevent);
        if (i == 2) {
            this.f19550r.execute(new grz(this));
        }
    }

    /* renamed from: e */
    public final void mo8915e() {
        eventprotos$CameraEvent eventprotos_cameraevent = new eventprotos$CameraEvent();
        eventprotos_cameraevent.eventType = 7;
        eventprotos_cameraevent.cameraFailure = new kjo();
        kjo kjo = eventprotos_cameraevent.cameraFailure;
        kjo.f24994a = 8;
        kjo.f24996c = this.f19542j;
        mo13465a(eventprotos_cameraevent);
    }

    /* renamed from: a */
    public final void mo8896a(String str, long j, float f) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime <= 30000 + j) {
            if (this.f19551s.containsKey(str)) {
                gsc gsc = (gsc) this.f19551s.get(str);
                if (f > gsc.f6032b) {
                    gsc.f6032b = f;
                    gsc.f6033c = elapsedRealtime;
                    return;
                }
                return;
            }
            this.f19551s.put(str, new gsc(j, f, elapsedRealtime));
        }
    }

    /* renamed from: f */
    public final void mo8916f() {
        eventprotos$CameraEvent eventprotos_cameraevent = new eventprotos$CameraEvent();
        eventprotos_cameraevent.eventType = 32;
        eventprotos_cameraevent.adviceShown = new kje();
        eventprotos_cameraevent.adviceShown.f24958a = 1;
        mo13465a(eventprotos_cameraevent);
    }

    /* renamed from: a */
    public final void mo8899a(String str, Object obj, Object obj2) {
        eventprotos$CameraEvent eventprotos_cameraevent = new eventprotos$CameraEvent();
        eventprotos_cameraevent.eventType = 33;
        eventprotos_cameraevent.preferenceChangeEvent = new klo();
        klo klo = eventprotos_cameraevent.preferenceChangeEvent;
        klo.f25271b = str;
        if (obj2 instanceof Boolean) {
            klo.f25270a = 1;
            klo.f25272c = ((Boolean) obj).booleanValue();
            eventprotos_cameraevent.preferenceChangeEvent.f25273d = ((Boolean) obj2).booleanValue();
        } else if (obj2 instanceof String) {
            klo.f25270a = 2;
            klo.f25274e = (String) obj;
            klo.f25275f = (String) obj2;
        }
        mo13465a(eventprotos_cameraevent);
    }

    /* renamed from: a */
    public final void mo8891a(long j, glw glw, int i, int i2) {
        kjj kjj = new kjj();
        kjj.f24983a = grx.m11637a(glw);
        eventprotos$CameraEvent eventprotos_cameraevent = new eventprotos$CameraEvent();
        eventprotos_cameraevent.eventType = 20;
        eventprotos_cameraevent.captureProfileAbortedEvent = new kjr();
        kjr kjr = eventprotos_cameraevent.captureProfileAbortedEvent;
        kjr.f25007b = j;
        kjr.f25008c = SystemClock.elapsedRealtimeNanos();
        kjr = eventprotos_cameraevent.captureProfileAbortedEvent;
        kjr.f25006a = kjj;
        kjr.f25009d = grx.m11642b(i, i2);
        String a = grx.m11639a(kjj);
        String str = f19532b;
        a = String.valueOf(a);
        String str2 = "onCaptureCanceled";
        if (a.length() == 0) {
            a = new String(str2);
        } else {
            a = str2.concat(a);
        }
        bli.m898e(str, a);
        mo13465a(eventprotos_cameraevent);
    }

    /* renamed from: a */
    public final void mo8890a(long j, glw glw) {
        kjj kjj = new kjj();
        kjj.f24983a = grx.m11637a(glw);
        eventprotos$CameraEvent eventprotos_cameraevent = new eventprotos$CameraEvent();
        eventprotos_cameraevent.eventType = 27;
        eventprotos_cameraevent.captureProfileDeletedEvent = new kjs();
        kjs kjs = eventprotos_cameraevent.captureProfileDeletedEvent;
        kjs.f25011b = j;
        kjs.f25012c = SystemClock.elapsedRealtimeNanos();
        eventprotos_cameraevent.captureProfileDeletedEvent.f25010a = kjj;
        mo13465a(eventprotos_cameraevent);
    }

    /* renamed from: b */
    public final void mo8909b(long j, glw glw, int i, int i2) {
        kjj kjj = new kjj();
        kjj.f24983a = grx.m11637a(glw);
        eventprotos$CameraEvent eventprotos_cameraevent = new eventprotos$CameraEvent();
        eventprotos_cameraevent.eventType = 25;
        eventprotos_cameraevent.captureProfileFailedEvent = new kjt();
        kjt kjt = eventprotos_cameraevent.captureProfileFailedEvent;
        kjt.f25014b = j;
        kjt.f25015c = SystemClock.elapsedRealtimeNanos();
        kjt = eventprotos_cameraevent.captureProfileFailedEvent;
        kjt.f25013a = kjj;
        kjt.f25016d = grx.m11642b(i, i2);
        String a = grx.m11639a(kjj);
        String str = f19532b;
        a = String.valueOf(a);
        String str2 = "onCaptureFailed";
        if (a.length() == 0) {
            a = new String(str2);
        } else {
            a = str2.concat(a);
        }
        bli.m898e(str, a);
        mo13465a(eventprotos_cameraevent);
    }

    /* renamed from: a */
    public final void mo8889a(long j, long j2, long j3, long j4, long j5, long j6, long j7, klb[] klbArr, long j8, glw glw, int i, int i2) {
        kjj kjj = new kjj();
        kjj.f24983a = grx.m11637a(glw);
        eventprotos$CaptureTiming eventprotos_capturetiming = new eventprotos$CaptureTiming();
        eventprotos_capturetiming.captureStartNs = j;
        if (j2 > 0) {
            eventprotos_capturetiming.captureTinyThumbNs = j2;
        }
        if (j3 > 0) {
            eventprotos_capturetiming.captureMediumThumbNs = j3;
        }
        if (j4 > 0) {
            eventprotos_capturetiming.captureProcessingStartNs = j4;
        }
        if (j5 > 0) {
            eventprotos_capturetiming.captureProcessingEndNs = j5;
        }
        if (j8 > 0) {
            eventprotos_capturetiming.capturePersistedEndNs = j8;
        }
        if (j6 > 0) {
            eventprotos_capturetiming.captureFrameSelectStartNs = j6;
        }
        if (j7 > 0) {
            eventprotos_capturetiming.captureFrameSelectEndNs = j7;
        }
        if (klbArr != null) {
            eventprotos_capturetiming.captureScoreCalculations = klbArr;
        }
        eventprotos$CaptureProfileEvent eventprotos_captureprofileevent = new eventprotos$CaptureProfileEvent();
        eventprotos_captureprofileevent.timing = eventprotos_capturetiming;
        eventprotos_captureprofileevent.cameraConfiguration = kjj;
        eventprotos_captureprofileevent.captureTrace = grx.m11642b(i, i2);
        eventprotos$CameraEvent eventprotos_cameraevent = new eventprotos$CameraEvent();
        eventprotos_cameraevent.eventType = 19;
        eventprotos_cameraevent.captureProfileEvent = eventprotos_captureprofileevent;
        String a = grx.m11639a(kjj);
        String str = f19532b;
        a = String.valueOf(a);
        String str2 = "onCapturePersisted";
        if (a.length() == 0) {
            a = new String(str2);
        } else {
            a = str2.concat(a);
        }
        bli.m894c(str, a);
        mo13465a(eventprotos_cameraevent);
    }

    /* renamed from: c */
    public final void mo8913c(long j, glw glw, int i, int i2) {
        kjj kjj = new kjj();
        kjj.f24983a = grx.m11637a(glw);
        eventprotos$CameraEvent eventprotos_cameraevent = new eventprotos$CameraEvent();
        eventprotos_cameraevent.eventType = 26;
        eventprotos_cameraevent.captureProfileStartCommittedEvent = new kju();
        kju kju = eventprotos_cameraevent.captureProfileStartCommittedEvent;
        kju.f25018b = j;
        kju.f25019c = SystemClock.elapsedRealtimeNanos();
        kju = eventprotos_cameraevent.captureProfileStartCommittedEvent;
        kju.f25017a = kjj;
        kju.f25020d = grx.m11642b(i, i2);
        String a = grx.m11639a(kjj);
        String str = f19532b;
        a = String.valueOf(a);
        String str2 = "onCaptureStartCommitted";
        if (a.length() == 0) {
            a = new String(str2);
        } else {
            a = str2.concat(a);
        }
        bli.m894c(str, a);
        mo13465a(eventprotos_cameraevent);
    }

    /* renamed from: b */
    public final void mo8908b(long j, glw glw) {
        kjj kjj = new kjj();
        kjj.f24983a = grx.m11637a(glw);
        eventprotos$CameraEvent eventprotos_cameraevent = new eventprotos$CameraEvent();
        eventprotos_cameraevent.eventType = 18;
        eventprotos_cameraevent.captureProfileStartEvent = new kjv();
        kjv kjv = eventprotos_cameraevent.captureProfileStartEvent;
        kjv.f25022b = j;
        kjv.f25021a = kjj;
        String a = grx.m11639a(kjj);
        String str = f19532b;
        a = String.valueOf(a);
        String str2 = "onCaptureStarted";
        if (a.length() == 0) {
            a = new String(str2);
        } else {
            a = str2.concat(a);
        }
        bli.m894c(str, a);
        mo13465a(eventprotos_cameraevent);
    }

    /* renamed from: a */
    public final void mo8903a(boolean z) {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        if (!this.f19545m && z) {
            long j = this.f19546n;
            if (j != 0) {
                eventprotos$CameraEvent eventprotos_cameraevent = new eventprotos$CameraEvent();
                eventprotos_cameraevent.eventType = 24;
                eventprotos_cameraevent.blockShotEvent = new kji();
                kji kji = eventprotos_cameraevent.blockShotEvent;
                kji.f24980a = j;
                kji.f24981b = elapsedRealtimeNanos;
                kji.f24982c = this.f19549q;
                mo13465a(eventprotos_cameraevent);
            }
        }
        this.f19546n = elapsedRealtimeNanos;
        this.f19545m = z;
    }

    /* renamed from: b */
    public final void mo8906b(int i) {
        m11640a(9, null, -1, -1, i);
    }

    /* renamed from: a */
    public final void mo8894a(irt irt) {
        eventprotos$CameraEvent eventprotos_cameraevent = new eventprotos$CameraEvent();
        eventprotos_cameraevent.eventType = 22;
        eventprotos_cameraevent.openDeviceRetryEvent = new kli();
        eventprotos_cameraevent.openDeviceRetryEvent.f25254a = irt.f7746d;
        mo13465a(eventprotos_cameraevent);
    }

    /* renamed from: a */
    public final void mo8884a(int i, epr epr, ExifInterface exifInterface, boolean z, Float f, List list, kla kla, int i2, epu epu, Long l, Integer num, klg klg, kkc kkc, kln kln, Long l2) {
        long longValue;
        this.f19544l = SystemClock.elapsedRealtime();
        klk klk = new klk();
        klk.f25257a = epr.mo6457g();
        klk.f25258b = z;
        if (l2 == null) {
            bli.m898e(f19532b, "Submitting log event with zero file size");
        }
        if (l2 != null) {
            longValue = l2.longValue() / 1024;
        } else {
            longValue = 0;
        }
        klk.f25259c = longValue;
        epp b = new epp(i, epr.mo6454d(), epr.mo6452b()).mo6447a((isu) exifInterface).mo6450b(epr.mo6464n());
        String c = epr.mo6453c();
        if (c == null) {
            bli.m894c(epp.f4272a, "flashSetting is null, not adding to stats");
        } else {
            b.f4273b.captureDoneEvent.flashSetting = 0;
            if (c.equals("off")) {
                b.f4273b.captureDoneEvent.flashSetting = 1;
            } else if (c.equals("auto")) {
                b.f4273b.captureDoneEvent.flashSetting = 2;
            } else if (c.equals("on") || c.equals("torch")) {
                b.f4273b.captureDoneEvent.flashSetting = 3;
            }
        }
        b = b.mo6449a(epr.mo6455e());
        float k = epr.mo6461k();
        eventprotos$CaptureDone eventprotos_capturedone = b.f4273b.captureDoneEvent;
        eventprotos_capturedone.timerSeconds = k;
        eventprotos_capturedone.photoMeta = klk;
        epp a = b.mo6445a(f.floatValue());
        hin hin = (hin) epr.mo6462l().mo9710c();
        if (hin == null) {
            bli.m894c(epp.f4272a, "touch is null, not adding to stats");
        } else {
            kme kme = new kme();
            kme.f25340a = hin.f6602a;
            kme.f25341b = hin.f6603b;
            kme.f25342c = hin.f6604c;
            kme.f25343d = hin.f6605d;
            a.f4273b.captureDoneEvent.touchCoord = kme;
        }
        a.f4273b.captureDoneEvent.volumeButtonShutter = epr.mo6463m().booleanValue();
        Rect a2 = epr.mo6451a();
        if (list == null) {
            bli.m894c(epp.f4272a, "camera2Faces is null, not adding to stats");
        } else {
            int min = Math.min(5, list.size());
            kkb[] kkbArr = new kkb[min];
            for (int i3 = 0; i3 < min; i3++) {
                gic gic = (gic) list.get(i3);
                Rect rect = gic.f5440a;
                kkb kkb = new kkb();
                kkb.f25057a = (float) rect.left;
                kkb.f25059c = (float) rect.top;
                kkb.f25058b = (float) rect.right;
                kkb.f25060d = (float) rect.bottom;
                kkb.f25063g = (float) gic.f5441b;
                if (a2 != null) {
                    kkb.f25061e = (float) a2.right;
                    kkb.f25062f = (float) a2.bottom;
                }
                kkbArr[i3] = kkb;
            }
            a.f4273b.captureDoneEvent.face = kkbArr;
        }
        bli.m888a(epp.f4272a, "dirtyLensProbability is null, not adding to stats");
        eventprotos$CaptureDone eventprotos_capturedone2 = a.f4273b.captureDoneEvent;
        eventprotos_capturedone2.captureFailure = i2;
        if (kla == null) {
            bli.m894c(epp.f4272a, "luckyShotMeta is null, not adding to stats");
        } else {
            eventprotos_capturedone2.luckyShotMeta = kla;
        }
        if (epr.mo6459i().mo9709b()) {
            a.f4273b.captureDoneEvent.meteringData = (klf) epr.mo6459i().mo9706a();
        }
        if (epu != null) {
            a.f4273b.captureDoneEvent.gcamMeta = epu.f4294a;
        }
        if (l != null) {
            kmf kmf = new kmf();
            kmf.f25345b = l.longValue();
            a.mo6448a(kmf);
        }
        if (num != null) {
            a.f4273b.captureDoneEvent.photosInFlight = num.intValue();
        }
        if (klg != null) {
            a.f4273b.captureDoneEvent.microvideoMeta = klg;
        }
        if (kkc != null) {
            a.f4273b.captureDoneEvent.faceretouchingMeta = kkc;
        }
        if (kln != null) {
            a.f4273b.captureDoneEvent.portraitMetadata = kln;
        }
        mo8892a(a);
    }

    /* renamed from: a */
    public final void mo8901a(String str, boolean z, glw glw) {
        String str2 = f19532b;
        String valueOf = String.valueOf(glw);
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 66) + String.valueOf(valueOf).length());
        stringBuilder.append("Log photo review launch event for ");
        stringBuilder.append(str);
        stringBuilder.append(", in progress=");
        stringBuilder.append(z);
        stringBuilder.append(", media type=");
        stringBuilder.append(valueOf);
        bli.m888a(str2, stringBuilder.toString());
        eventprotos$CameraEvent eventprotos_cameraevent = new eventprotos$CameraEvent();
        eventprotos_cameraevent.launchPhotosReviewEvent = new kkw();
        eventprotos_cameraevent.eventType = 30;
        kkw kkw = eventprotos_cameraevent.launchPhotosReviewEvent;
        kkw.f25185a = str;
        kkw.f25186b = z;
        switch (glw.ordinal()) {
            case 1:
                eventprotos_cameraevent.launchPhotosReviewEvent.f25187c = 1;
                break;
            case 2:
                eventprotos_cameraevent.launchPhotosReviewEvent.f25187c = 2;
                break;
            case 3:
                eventprotos_cameraevent.launchPhotosReviewEvent.f25187c = 3;
                break;
            case 4:
                eventprotos_cameraevent.launchPhotosReviewEvent.f25187c = 31;
                break;
            case 5:
                eventprotos_cameraevent.launchPhotosReviewEvent.f25187c = 20;
                break;
            case 6:
                eventprotos_cameraevent.launchPhotosReviewEvent.f25187c = 20;
                break;
            case 7:
            case 8:
                eventprotos_cameraevent.launchPhotosReviewEvent.f25187c = 30;
                break;
            case 12:
                eventprotos_cameraevent.launchPhotosReviewEvent.f25187c = 10;
                break;
            case 13:
                eventprotos_cameraevent.launchPhotosReviewEvent.f25187c = 32;
                break;
            default:
                eventprotos_cameraevent.launchPhotosReviewEvent.f25187c = 0;
                break;
        }
        mo13465a(eventprotos_cameraevent);
    }

    /* renamed from: c */
    public final void mo8912c(int i) {
        eventprotos$CameraEvent eventprotos_cameraevent = new eventprotos$CameraEvent();
        eventprotos_cameraevent.eventType = 31;
        eventprotos_cameraevent.photoVideoModeChangeEvent = new klm();
        klm klm = eventprotos_cameraevent.photoVideoModeChangeEvent;
        klm.f25265a = 2;
        klm.f25266b = i;
        mo13465a(eventprotos_cameraevent);
    }

    /* renamed from: a */
    public final void mo8880a(int i, int i2, int i3, float f, int i4) {
        kll kll = new kll();
        kll.f25260a = i2;
        kll.f25261b = i3;
        kll.f25262c = f;
        switch (i4 - 1) {
            case 0:
                kll.f25263d = 3;
                break;
            case 1:
                kll.f25263d = 2;
                break;
            case 2:
                kll.f25263d = 1;
                break;
            default:
                kll.f25263d = 0;
                break;
        }
        mo8886a(i, kll, null, null);
    }

    /* renamed from: a */
    final void mo13465a(eventprotos$CameraEvent eventprotos_cameraevent) {
        if (this.f19534a != null) {
            int i = eventprotos_cameraevent.eventType;
            if (i == 3 || i == 13 || i == 6) {
                eventprotos_cameraevent.timezone = this.f19541i;
            }
            eventprotos_cameraevent.isTestDevice = this.f19554w;
            eventprotos_cameraevent.runId = this.f19536d;
            switch (this.f19547o.ordinal()) {
                case 1:
                    eventprotos_cameraevent.buildSource = 1;
                    break;
                case 2:
                    eventprotos_cameraevent.buildSource = 2;
                    break;
                case 3:
                    eventprotos_cameraevent.buildSource = 3;
                    break;
                default:
                    eventprotos_cameraevent.buildSource = 0;
                    break;
            }
            eventprotos_cameraevent.appVersionName = this.f19535c;
            eventprotos_cameraevent.sessionId = this.f19537e;
            eventprotos_cameraevent.counter = this.f19538f.getAndIncrement();
            this.f19550r.execute(new gry(this, eventprotos_cameraevent));
        }
    }

    /* renamed from: g */
    public final void mo8917g() {
        eventprotos$CameraEvent eventprotos_cameraevent = new eventprotos$CameraEvent();
        eventprotos_cameraevent.eventType = 21;
        kjp kjp = new kjp();
        kjp.f25001a = 2;
        eventprotos_cameraevent.cameraPrewarmEvent = kjp;
        mo13465a(eventprotos_cameraevent);
    }

    /* renamed from: h */
    public final void mo8918h() {
        eventprotos$CameraEvent eventprotos_cameraevent = new eventprotos$CameraEvent();
        eventprotos_cameraevent.eventType = 21;
        kjp kjp = new kjp();
        kjp.f25001a = 1;
        eventprotos_cameraevent.cameraPrewarmEvent = kjp;
        mo13465a(eventprotos_cameraevent);
    }

    /* renamed from: i */
    public final void mo8919i() {
        eventprotos$CameraEvent eventprotos_cameraevent = new eventprotos$CameraEvent();
        eventprotos_cameraevent.eventType = 21;
        kjp kjp = new kjp();
        kjp.f25001a = 3;
        eventprotos_cameraevent.cameraPrewarmEvent = kjp;
        mo13465a(eventprotos_cameraevent);
    }

    /* renamed from: a */
    public final void mo8905a(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        kkx kkx = new kkx();
        kkx.f25188a = z;
        kkx.f25189b = z2;
        kkx.f25190c = z3;
        kkx.f25191d = z4;
        kkx.f25192e = z5;
        kkx.f25193f = z6;
        kkx.f25194g = z7;
        kkx.f25195h = z8;
        kkx.f25196i = z9;
        mo8886a(6, null, kkx, null);
    }

    /* renamed from: a */
    public final void mo8897a(String str, ExifInterface exifInterface, boolean z, float f, boolean z2) {
        int i;
        kky kky = new kky();
        if (z2) {
            i = 1;
        } else {
            i = 2;
        }
        kky.f25201a = i;
        epp b = new epp(6, z, str).mo6447a((isu) exifInterface).mo6450b(1.0f);
        b.f4273b.captureDoneEvent.lensBlurMeta = kky;
        mo8892a(b.mo6445a(f));
    }

    /* renamed from: a */
    public final void mo8902a(HashMap hashMap, String str) {
        eventprotos$CameraEvent eventprotos_cameraevent = new eventprotos$CameraEvent();
        eventprotos_cameraevent.eventType = 15;
        eventprotos_cameraevent.memoryReport = new kld();
        kld kld = eventprotos_cameraevent.memoryReport;
        kld.f25220a = str;
        kld.f25221b = ((Long) hashMap.get("availMem")).longValue();
        eventprotos_cameraevent.memoryReport.f25222c = ((Long) hashMap.get("totalMem")).longValue();
        eventprotos_cameraevent.memoryReport.f25223d = ((Long) hashMap.get("memoryClass")).longValue();
        eventprotos_cameraevent.memoryReport.f25224e = ((Long) hashMap.get("largeMemoryClass")).longValue();
        eventprotos_cameraevent.memoryReport.f25225f = ((Long) hashMap.get("totalPSS")).longValue();
        eventprotos_cameraevent.memoryReport.f25226g = ((Long) hashMap.get("nativePSS")).longValue();
        eventprotos_cameraevent.memoryReport.f25227h = ((Long) hashMap.get("dalvikPSS")).longValue();
        eventprotos_cameraevent.memoryReport.f25228i = ((Long) hashMap.get("otherPSS")).longValue();
        eventprotos_cameraevent.memoryReport.f25229j = ((Long) hashMap.get("threshold")).longValue();
        mo13465a(eventprotos_cameraevent);
    }

    /* renamed from: a */
    private static int m11637a(glw glw) {
        if (glw == glw.HDR_PLUS) {
            return 13;
        }
        if (glw == glw.NORMAL) {
            return 12;
        }
        if (glw == glw.HDR_PLUS_AUTO) {
            return 11;
        }
        return 0;
    }

    /* renamed from: j */
    public final void mo8920j() {
        this.f19552t = 1;
    }

    /* renamed from: k */
    public final long mo8921k() {
        this.f19537e = UUID.randomUUID().getLeastSignificantBits();
        return this.f19537e;
    }

    /* renamed from: a */
    public final void mo8900a(String str, klx klx, iut iut, float f) {
        boolean z;
        if (iut == iut.FRONT) {
            z = true;
        } else {
            z = false;
        }
        epp a = new epp(17, z, str).mo6450b(1.0f).mo6445a(f);
        if (klx == null) {
            bli.m894c(epp.f4272a, "smartBurstMeta is null, not adding to stats");
        } else {
            a.f4273b.captureDoneEvent.smartBurstMeta = klx;
        }
        mo8892a(a);
    }

    /* renamed from: l */
    public final void mo8922l() {
        eventprotos$CameraEvent eventprotos_cameraevent = new eventprotos$CameraEvent();
        eventprotos_cameraevent.eventType = 17;
        eventprotos_cameraevent.storageWarning = new kmc();
        eventprotos_cameraevent.storageWarning.f25334a = -4;
        mo13465a(eventprotos_cameraevent);
    }

    /* renamed from: a */
    public final void mo8892a(epp epp) {
        this.f19550r.execute(new gsb(this, epp));
    }

    /* renamed from: a */
    public final void mo8893a(hin hin, Float f, boolean z) {
        kmd kmd = new kmd();
        if (f != null) {
            kmd.f25336b = f.floatValue();
        }
        kme kme = new kme();
        if (hin != null) {
            kme.f25340a = hin.f6602a;
            kme.f25341b = hin.f6603b;
            kme.f25342c = hin.f6604c;
            kme.f25343d = hin.f6605d;
        }
        kmd.f25335a = kme;
        kmd.f25337c = z;
        m11641a(1, kmd, null);
    }

    /* renamed from: a */
    public final void mo8887a(int i, boolean z) {
        klr klr = new klr();
        klr.f25288a = i;
        klr.f25289b = z;
        m11641a(7, null, klr);
    }

    /* renamed from: a */
    public final void mo8904a(boolean z, String str, iut iut, iqp iqp, long j, long j2, float f, boolean z2, boolean z3, boolean z4, int i) {
        int i2;
        boolean z5;
        this.f19544l = SystemClock.elapsedRealtime();
        kmf kmf = new kmf();
        kmf.f25344a = (float) TimeUnit.MILLISECONDS.toSeconds(j);
        kmf.f25347d = iqp.f7695a;
        kmf.f25346c = iqp.f7696b;
        kmf.f25345b = j2;
        kmf.f25348e = f;
        kmf.f25349f = z4;
        kmf.f25350g = i;
        if (z) {
            i2 = 20;
        } else {
            i2 = 8;
        }
        if (iut == iut.FRONT) {
            z5 = true;
        } else {
            z5 = false;
        }
        epp epp = new epp(i2, z5, str);
        if (z2) {
            i2 = 3;
        } else {
            i2 = 1;
        }
        mo8892a(epp.mo6446a(i2).mo6449a(z3).mo6448a(kmf));
    }

    /* renamed from: a */
    public final void mo8898a(String str, iut iut, isu isu, float f, boolean z, float f2) {
        boolean z2;
        int i = 1;
        this.f19544l = SystemClock.elapsedRealtime();
        if (iut == iut.FRONT) {
            z2 = true;
        } else {
            z2 = false;
        }
        epp epp = new epp(9, z2, str);
        epp b = epp.mo6447a(isu).mo6450b(f);
        if (z) {
            i = 3;
        }
        b.mo6446a(i).mo6445a(f2);
        mo8892a(epp);
    }
}
