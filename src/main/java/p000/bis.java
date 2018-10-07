package p000;

import android.annotation.TargetApi;
import android.location.Location;
import android.media.MediaCodec;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.view.Surface;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.Executor;

@TargetApi(23)
/* compiled from: PG */
/* renamed from: bis */
public final class bis implements biq {
    /* renamed from: a */
    public static final String f22762a = bli.m887a("MediaRecPreparer");
    /* renamed from: b */
    public final ipv f22763b;
    /* renamed from: c */
    private final inm f22764c;
    /* renamed from: d */
    private final inp f22765d;
    /* renamed from: e */
    private final Executor f22766e;
    /* renamed from: f */
    private final gtf f22767f;
    /* renamed from: g */
    private final ipy f22768g;
    /* renamed from: h */
    private final ilp f22769h;
    /* renamed from: i */
    private final ilp f22770i;
    /* renamed from: j */
    private final kbg f22771j;
    /* renamed from: k */
    private final boolean f22772k;
    /* renamed from: l */
    private final guf f22773l;
    /* renamed from: m */
    private final int f22774m;
    /* renamed from: n */
    private final int f22775n;
    /* renamed from: o */
    private final ird f22776o;
    /* renamed from: p */
    private Surface f22777p;
    /* renamed from: q */
    private final kbg f22778q;
    /* renamed from: r */
    private final kbg f22779r;
    /* renamed from: s */
    private final Object f22780s = new Object();
    /* renamed from: t */
    private final kbg f22781t;
    /* renamed from: u */
    private boolean f22782u = false;

    public bis(ipy ipy, Executor executor, inm inm, inp inp, ipv ipv, gtf gtf, guf guf, kbg kbg, ilp ilp, ilp ilp2, kbg kbg2, boolean z, int i, int i2, kbg kbg3, ird ird) {
        kbg c;
        this.f22768g = ipy;
        this.f22766e = executor;
        this.f22764c = inm;
        this.f22765d = inp;
        this.f22763b = ipv;
        this.f22767f = gtf;
        this.f22773l = guf;
        this.f22778q = kbg;
        this.f22769h = ilp;
        this.f22770i = ilp2;
        this.f22771j = kbg2;
        this.f22772k = z;
        this.f22774m = i;
        this.f22775n = i2;
        this.f22779r = kbg3;
        this.f22776o = ird;
        if (z) {
            c = kbg.m4804c(MediaCodec.createPersistentInputSurface());
        } else {
            c = kau.f21835a;
        }
        this.f22781t = c;
    }

    public final void close() {
        synchronized (this.f22780s) {
            if (this.f22782u) {
                bli.m891b(f22762a, "close twice!");
                return;
            }
            bli.m888a(f22762a, "close");
            this.f22782u = true;
            if (this.f22781t.mo9709b()) {
                bli.m888a(f22762a, "Release persistent recording surface.");
                ((Surface) this.f22781t.mo9706a()).release();
            } else {
                Surface surface = this.f22777p;
                if (surface != null) {
                    surface.release();
                }
            }
            bli.m888a(f22762a, "Release MediaRecorder.");
            this.f22768g.mo8735e();
            if (this.f22778q.mo9709b()) {
                bli.m888a(f22762a, "Close video intent file descriptor.");
                try {
                    ((ParcelFileDescriptor) this.f22778q.mo9706a()).close();
                } catch (IOException e) {
                    String str = f22762a;
                    String valueOf = String.valueOf(e);
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 39);
                    stringBuilder.append("Error on closing intentFileDescriptor: ");
                    stringBuilder.append(valueOf);
                    bli.m891b(str, stringBuilder.toString());
                }
            }
        }
    }

    /* renamed from: a */
    final /* synthetic */ kpk mo14568a(Long l) {
        String str;
        String valueOf;
        if (l.longValue() < 0) {
            str = f22762a;
            valueOf = String.valueOf(l);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 53);
            stringBuilder.append("The storage space is too low. available space (byte)=");
            stringBuilder.append(valueOf);
            bli.m891b(str, stringBuilder.toString());
            return kow.m13874a(new gso());
        }
        synchronized (this.f22780s) {
            kpk a;
            if (this.f22782u) {
                a = kow.m13874a(new IllegalStateException("MediaRecorderDevice has been closed."));
                return a;
            }
            File a2;
            Object obj;
            int i;
            int a3;
            str = f22762a;
            boolean z = this.f22772k;
            StringBuilder stringBuilder2 = new StringBuilder(33);
            stringBuilder2.append("Persistent Surface Enabled: ");
            stringBuilder2.append(z);
            bli.m888a(str, stringBuilder2.toString());
            this.f22776o.mo8856a(String.valueOf(f22762a).concat("#prepare"));
            if (!this.f22778q.mo9709b() || this.f22778q.mo9706a() == null) {
                a2 = this.f22767f.mo7436a(this.f22767f.mo7439b(System.currentTimeMillis()), this.f22765d.mo8648f().f7516c);
                obj = null;
            } else {
                a2 = null;
                obj = ((ParcelFileDescriptor) this.f22778q.mo9706a()).getFileDescriptor();
            }
            int intValue = ((Integer) this.f22770i.mo13673b()).intValue();
            str = f22762a;
            StringBuilder stringBuilder3 = new StringBuilder(44);
            stringBuilder3.append("MediaRecorder.setOrientationHint=");
            stringBuilder3.append(intValue);
            bli.m888a(str, stringBuilder3.toString());
            if (((Boolean) this.f22769h.mo13673b()).booleanValue()) {
                i = this.f22775n;
            } else {
                i = this.f22774m;
            }
            if (this.f22765d.mo8643a().mo8637d()) {
                a3 = i * this.f22765d.mo8643a().mo8635a();
            } else {
                a3 = i;
            }
            str = f22762a;
            stringBuilder3 = new StringBuilder(49);
            stringBuilder3.append("MediaRecorder.setMaxDuration=");
            stringBuilder3.append(a3);
            stringBuilder3.append("(seconds)");
            bli.m888a(str, stringBuilder3.toString());
            long longValue = l.longValue();
            long longValue2 = this.f22779r.mo9709b() ? ((Long) this.f22779r.mo9706a()).longValue() < longValue ? ((Long) this.f22779r.mo9706a()).longValue() : longValue : longValue;
            str = f22762a;
            stringBuilder3 = new StringBuilder(55);
            stringBuilder3.append("MediaRecorder.setMaxFileSize=");
            stringBuilder3.append(longValue2);
            stringBuilder3.append("(Byte)");
            bli.m888a(str, stringBuilder3.toString());
            kbg kbg = kau.f21835a;
            if (this.f22771j.mo9709b()) {
                Location d = ((hjw) this.f22771j.mo9706a()).mo7915d();
                if (d != null) {
                    bli.m888a(f22762a, "MediaRecorder.setLocation");
                    kbg = kbg.m4804c(d);
                }
            }
            try {
                StringBuilder stringBuilder4;
                ipy ipy = this.f22768g;
                kbg kbg2 = this.f22781t;
                inp inp = this.f22765d;
                inm inm = this.f22764c;
                kbg b = kbg.m4803b(obj);
                kbg b2 = kbg.m4803b(a2);
                a3 *= 1000;
                ipy.mo8737f();
                if (b.mo9709b() && b.mo9706a() != null) {
                    ipy.mo8727a((FileDescriptor) b.mo9706a());
                } else if (!b2.mo9709b() || b2.mo9706a() == null) {
                    Log.e("MedRecPrep", "Either output file path or descriptor should present");
                    throw new IllegalArgumentException("Either output file path or descriptor should present");
                } else {
                    ipy.mo8728a(((File) b2.mo9706a()).getAbsolutePath());
                }
                if (kbg2.mo9709b() && kbg2.mo9706a() != null) {
                    ipy.mo8725a((Surface) kbg2.mo9706a());
                }
                ipy.mo8736e(5);
                ipy.mo8747l(2);
                ipy.mo8742h(inp.mo8648f().f7514a);
                i = inp.mo8645c();
                StringBuilder stringBuilder5 = new StringBuilder(41);
                stringBuilder5.append("MediaRecorder.setVideoEncoder=");
                stringBuilder5.append(i);
                Log.d("MedRecPrep", stringBuilder5.toString());
                ipy.mo8744i(inp.mo8645c());
                if (!(inp.mo8647e() == -1 || inp.mo8646d() == -1)) {
                    i = inp.mo8647e();
                    int d2 = inp.mo8646d();
                    stringBuilder4 = new StringBuilder(80);
                    stringBuilder4.append("MediaRecorder.setVideoEncodingProfileLevel profile=");
                    stringBuilder4.append(i);
                    stringBuilder4.append(" level=");
                    stringBuilder4.append(d2);
                    Log.d("MedRecPrep", stringBuilder4.toString());
                    hsx.m3412a(ipy.mo8717a(), inp.mo8647e(), inp.mo8646d());
                }
                str = String.valueOf(inp.mo8649g());
                stringBuilder4 = new StringBuilder(String.valueOf(str).length() + 27);
                stringBuilder4.append("MediaRecorder.setVideoSize=");
                stringBuilder4.append(str);
                Log.d("MedRecPrep", stringBuilder4.toString());
                ipy.mo8721a(inp.mo8649g().mo8639c().f7695a, inp.mo8649g().mo8639c().f7696b);
                i = inp.mo8650h();
                stringBuilder5 = new StringBuilder(49);
                stringBuilder5.append("MediaRecorder.setVideoEncodingBitRate=");
                stringBuilder5.append(i);
                Log.d("MedRecPrep", stringBuilder5.toString());
                ipy.mo8745j(inp.mo8650h());
                i = inp.mo8643a().f7509g;
                stringBuilder5 = new StringBuilder(43);
                stringBuilder5.append("MediaRecorder.setVideoFrameRate=");
                stringBuilder5.append(i);
                Log.d("MedRecPrep", stringBuilder5.toString());
                ipy.mo8746k(inp.mo8643a().f7509g);
                i = inp.mo8643a().f7508f;
                stringBuilder5 = new StringBuilder(40);
                stringBuilder5.append("MediaRecorder.setCaptureRate=");
                stringBuilder5.append(i);
                Log.d("MedRecPrep", stringBuilder5.toString());
                ipy.mo8718a((double) inp.mo8643a().f7508f);
                i = inm.f7531b;
                stringBuilder5 = new StringBuilder(49);
                stringBuilder5.append("MediaRecorder.setAudioEncodingBitRate=");
                stringBuilder5.append(i);
                Log.d("MedRecPrep", stringBuilder5.toString());
                ipy.mo8732c(inm.f7531b);
                i = inm.f7533d;
                stringBuilder5 = new StringBuilder(42);
                stringBuilder5.append("MediaRecorder.setAudioChannels=");
                stringBuilder5.append(i);
                Log.d("MedRecPrep", stringBuilder5.toString());
                ipy.mo8720a(inm.f7533d);
                i = inm.f7532c;
                stringBuilder5 = new StringBuilder(46);
                stringBuilder5.append("MediaRecorder.setAudioSamplingRate=");
                stringBuilder5.append(i);
                Log.d("MedRecPrep", stringBuilder5.toString());
                ipy.mo8734d(inm.f7532c);
                str = String.valueOf(inm.f7530a);
                stringBuilder4 = new StringBuilder(String.valueOf(str).length() + 30);
                stringBuilder4.append("MediaRecorder.setAudioEncoder=");
                stringBuilder4.append(str);
                Log.d("MedRecPrep", stringBuilder4.toString());
                ipy.mo8730b(inm.f7530a.f7481a);
                if (kbg.mo9709b() && kbg.mo9706a() != null) {
                    Log.d("MedRecPrep", "MediaRecorder.setLocation");
                    ipy.mo8719a((float) ((Location) kbg.mo9706a()).getLatitude(), (float) ((Location) kbg.mo9706a()).getLongitude());
                }
                StringBuilder stringBuilder6 = new StringBuilder(44);
                stringBuilder6.append("MediaRecorder.setOrientationHint=");
                stringBuilder6.append(intValue);
                Log.d("MedRecPrep", stringBuilder6.toString());
                ipy.mo8740g(intValue);
                if (a3 > 0) {
                    stringBuilder6 = new StringBuilder(54);
                    stringBuilder6.append("MediaRecorder.setMaxDuration=");
                    stringBuilder6.append(a3);
                    stringBuilder6.append("(milliseconds)");
                    Log.d("MedRecPrep", stringBuilder6.toString());
                    ipy.mo8738f(a3);
                }
                if (longValue2 > 0) {
                    stringBuilder6 = new StringBuilder(55);
                    stringBuilder6.append("MediaRecorder.setMaxFileSize=");
                    stringBuilder6.append(longValue2);
                    stringBuilder6.append("(Byte)");
                    Log.d("MedRecPrep", stringBuilder6.toString());
                    ipy.mo8722a(longValue2);
                }
                Log.d("MedRecPrep", "MediaRecorder.prepare() BEGIN");
                ipy.mo8733d();
                Log.d("MedRecPrep", "MediaRecorder.prepare() END");
            } catch (ipu e) {
                valueOf = String.valueOf(e);
                StringBuilder stringBuilder7 = new StringBuilder(String.valueOf(valueOf).length() + 58);
                stringBuilder7.append("immediateFailedFuture: MediaRecorder.prepare() exception: ");
                stringBuilder7.append(valueOf);
                Log.e("MedRecPrep", stringBuilder7.toString());
                throw e;
            } catch (Throwable e2) {
                if (e2.getCause() instanceof FileNotFoundException) {
                    bli.m891b(f22762a, e2.getMessage());
                    return kow.m13874a(new gso(e2));
                }
            }
            this.f22776o.mo8857b();
            this.f22768g.mo8723a(new biu(this));
            this.f22777p = null;
            if (this.f22781t.mo9709b()) {
                this.f22777p = (Surface) this.f22781t.mo9706a();
            }
            if (this.f22777p == null) {
                this.f22777p = this.f22768g.mo8729b();
            }
            jri.m13404b(this.f22777p);
            a = kow.m13873a(new bix(this.f22772k, a2, intValue, this.f22768g, kbg, this.f22777p, this.f22778q));
            return a;
        }
    }

    /* renamed from: a */
    public final kpk mo12384a() {
        synchronized (this.f22780s) {
            if (this.f22782u) {
                kpk a = kow.m13874a(new IllegalStateException("MediaRecorderDevice has been closed."));
                return a;
            }
            bli.m888a(f22762a, "prepare");
            return kny.m18476a(this.f22773l.mo7456a(true), new bit(this), this.f22766e);
        }
    }

    /* renamed from: b */
    public final boolean mo12385b() {
        return this.f22772k;
    }
}
