package p000;

import android.annotation.TargetApi;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.util.Range;

@TargetApi(21)
/* compiled from: PG */
/* renamed from: bhr */
public final class bhr {
    /* renamed from: a */
    public static final String f1187a = bli.m887a("CdrCamReqBdrFty");
    /* renamed from: b */
    public final bgt f1188b;
    /* renamed from: c */
    public final ilp f1189c;
    /* renamed from: d */
    public final imw f1190d;
    /* renamed from: e */
    private final ilp f1191e;
    /* renamed from: f */
    private final ilp f1192f;
    /* renamed from: g */
    private final ilp f1193g;
    /* renamed from: h */
    private final ilp f1194h;
    /* renamed from: i */
    private final ilp f1195i;
    /* renamed from: j */
    private final ilp f1196j;
    /* renamed from: k */
    private final ilp f1197k;

    public bhr(bgt bgt, ilp ilp, ilp ilp2, ilp ilp3, ilp ilp4, ilp ilp5, ilp ilp6, ilp ilp7, ilp ilp8, imw imw) {
        this.f1188b = bgt;
        this.f1191e = ilp;
        this.f1192f = ilp2;
        this.f1193g = ilp3;
        this.f1194h = ilp4;
        this.f1189c = ilp5;
        this.f1195i = ilp6;
        this.f1196j = ilp7;
        this.f1197k = ilp8;
        this.f1190d = imw;
    }

    /* renamed from: a */
    public final void mo1955a(iwn iwn) {
        int i;
        int i2 = 1;
        if (this.f1190d.mo8611c()) {
            i = 2;
        } else {
            i = 1;
        }
        String str = f1187a;
        StringBuilder stringBuilder = new StringBuilder(24);
        stringBuilder.append("CONTROL_MODE=");
        stringBuilder.append(i);
        bli.m896d(str, stringBuilder.toString());
        iwn.mo9134a(CaptureRequest.CONTROL_MODE, Integer.valueOf(i));
        boolean c = this.f1190d.mo8611c();
        String str2 = f1187a;
        StringBuilder stringBuilder2 = new StringBuilder(30);
        stringBuilder2.append("CONTROL_SCENE_MODE=");
        stringBuilder2.append(i);
        bli.m896d(str2, stringBuilder2.toString());
        iwn.mo9134a(CaptureRequest.CONTROL_SCENE_MODE, Integer.valueOf(c));
        iwn.mo9134a(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(1));
        String str3 = f1187a;
        str = String.valueOf(this.f1194h.mo13673b());
        stringBuilder2 = new StringBuilder(String.valueOf(str).length() + 16);
        stringBuilder2.append("CONTROL_AE_LOCK=");
        stringBuilder2.append(str);
        bli.m896d(str3, stringBuilder2.toString());
        iwn.mo9134a(CaptureRequest.CONTROL_AE_LOCK, (Boolean) this.f1194h.mo13673b());
        str = f1187a;
        str3 = String.valueOf(((MeteringRectangle[]) this.f1191e.mo13673b())[0]);
        stringBuilder2 = new StringBuilder(String.valueOf(str3).length() + 19);
        stringBuilder2.append("CONTROL_AE_REGIONS=");
        stringBuilder2.append(str3);
        bli.m896d(str, stringBuilder2.toString());
        iwn.mo9134a(CaptureRequest.CONTROL_AE_REGIONS, (MeteringRectangle[]) this.f1191e.mo13673b());
        str3 = f1187a;
        str = String.valueOf(this.f1193g.mo13673b());
        stringBuilder2 = new StringBuilder(String.valueOf(str).length() + 33);
        stringBuilder2.append("CONTROL_AE_EXPOSURE_COMPENSATION=");
        stringBuilder2.append(str);
        bli.m896d(str3, stringBuilder2.toString());
        iwn.mo9134a(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, (Integer) this.f1193g.mo13673b());
        str = f1187a;
        str3 = String.valueOf(((MeteringRectangle[]) this.f1192f.mo13673b())[0]);
        stringBuilder2 = new StringBuilder(String.valueOf(str3).length() + 19);
        stringBuilder2.append("CONTROL_AF_REGIONS=");
        stringBuilder2.append(str3);
        bli.m896d(str, stringBuilder2.toString());
        iwn.mo9134a(CaptureRequest.CONTROL_AF_REGIONS, (MeteringRectangle[]) this.f1192f.mo13673b());
        iwn.mo9134a(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(0));
        iwn.mo9134a(CaptureRequest.CONTROL_AWB_MODE, (Integer) this.f1195i.mo13673b());
        fzd fzd = (fzd) this.f1197k.mo13673b();
        iwn.mo9134a(CaptureRequest.SCALER_CROP_REGION, fzd.f5066a);
        iwn.mo9134a(CaptureRequest.LENS_FOCAL_LENGTH, Float.valueOf(fzd.f5067b));
        iwn.mo9134a(CaptureRequest.STATISTICS_FACE_DETECT_MODE, Integer.valueOf(this.f1190d.mo8611c()));
        if (((Boolean) this.f1196j.mo13673b()).booleanValue()) {
            i = 2;
        } else {
            i = 0;
        }
        String str4 = f1187a;
        StringBuilder stringBuilder3 = new StringBuilder(22);
        stringBuilder3.append("FLASH_MODE=");
        stringBuilder3.append(i);
        bli.m896d(str4, stringBuilder3.toString());
        iwn.mo9134a(CaptureRequest.FLASH_MODE, Integer.valueOf(i));
        boolean e = this.f1190d.mo8613e();
        str4 = f1187a;
        stringBuilder3 = new StringBuilder(44);
        stringBuilder3.append("CONTROL_VIDEO_STABILIZATION_MODE=");
        stringBuilder3.append(e);
        bli.m896d(str4, stringBuilder3.toString());
        iwn.mo9134a(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, Integer.valueOf(e));
        e = this.f1190d.mo8615g();
        str4 = f1187a;
        stringBuilder3 = new StringBuilder(43);
        stringBuilder3.append("LENS_OPTICAL_STABILIZATION_MODE=");
        stringBuilder3.append(e);
        bli.m896d(str4, stringBuilder3.toString());
        iwn.mo9134a(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, Integer.valueOf(e));
        if (this.f1190d.mo8614f()) {
            i2 = 2;
        }
        str3 = f1187a;
        StringBuilder stringBuilder4 = new StringBuilder(32);
        stringBuilder4.append("NOISE_REDUCTION_MODE=");
        stringBuilder4.append(i2);
        bli.m896d(str3, stringBuilder4.toString());
        iwn.mo9134a(CaptureRequest.NOISE_REDUCTION_MODE, Integer.valueOf(i2));
    }

    /* renamed from: a */
    public final iwn mo1954a(bhj bhj) {
        int i;
        iwn a = bhj.mo12377a(3);
        mo1955a(a);
        Range a2 = this.f1188b.mo1944a();
        a.mo9134a(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, a2);
        String str = f1187a;
        String valueOf = String.valueOf(a2);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 28);
        stringBuilder.append("CONTROL_AE_TARGET_FPS_RANGE=");
        stringBuilder.append(valueOf);
        bli.m896d(str, stringBuilder.toString());
        boolean booleanValue = ((Boolean) this.f1189c.mo13673b()).booleanValue();
        if (booleanValue) {
            i = 4;
        } else {
            i = 1;
        }
        a.mo9134a(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(i));
        valueOf = f1187a;
        StringBuilder stringBuilder2 = new StringBuilder(40);
        stringBuilder2.append("CONTROL_AF_MODE=CONTINUOUS_PICTURE?");
        stringBuilder2.append(booleanValue);
        bli.m896d(valueOf, stringBuilder2.toString());
        return a;
    }

    /* renamed from: b */
    public final iwn mo1956b(bhj bhj) {
        Object obj;
        int i;
        iwn a = bhj.mo12377a(3);
        mo1955a(a);
        Range b = this.f1188b.mo1945b();
        a.mo9134a(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, b);
        String str = f1187a;
        String valueOf = String.valueOf(b);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 28);
        stringBuilder.append("CONTROL_AE_TARGET_FPS_RANGE=");
        stringBuilder.append(valueOf);
        bli.m896d(str, stringBuilder.toString());
        if (!this.f1190d.mo8610b()) {
            obj = null;
        } else if (((Boolean) this.f1189c.mo13673b()).booleanValue()) {
            obj = 1;
        } else {
            obj = null;
        }
        if (obj == null) {
            i = 1;
        } else {
            i = 3;
        }
        a.mo9134a(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(i));
        String str2 = f1187a;
        StringBuilder stringBuilder2 = new StringBuilder(27);
        stringBuilder2.append("CONTROL_AF_MODE=");
        stringBuilder2.append(i);
        bli.m896d(str2, stringBuilder2.toString());
        return a;
    }
}
