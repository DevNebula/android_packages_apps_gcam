package p000;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.ExifInterface;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.camera.legacy.lightcycle.panorama.LightCycle;
import com.google.android.apps.lightcycle.panorama.LightCycleNative;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.Semaphore;

/* compiled from: PG */
/* renamed from: ejy */
public final class ejy implements OnClickListener {
    /* renamed from: a */
    public static final String f3913a = bli.m887a("LightCycleCtrlr");
    /* renamed from: A */
    public emc f3914A = null;
    /* renamed from: B */
    public final Handler f3915B;
    /* renamed from: C */
    public HandlerThread f3916C;
    /* renamed from: D */
    public ejx f3917D;
    /* renamed from: E */
    public emc f3918E;
    /* renamed from: F */
    public final List f3919F = new ArrayList();
    /* renamed from: G */
    public final List f3920G = new ArrayList();
    /* renamed from: H */
    public final List f3921H = new ArrayList();
    /* renamed from: I */
    public final ekm f3922I = new ekm();
    /* renamed from: J */
    public boolean f3923J = false;
    /* renamed from: K */
    public final Handler f3924K;
    /* renamed from: L */
    public final aag f3925L = new ekc(this);
    /* renamed from: M */
    public aaf f3926M = new ekd();
    /* renamed from: N */
    public aas f3927N = new eke(this);
    /* renamed from: O */
    public aaf f3928O = new ekf(this);
    /* renamed from: P */
    private float f3929P;
    /* renamed from: Q */
    private eln f3930Q;
    /* renamed from: b */
    public eki f3931b;
    /* renamed from: c */
    public eje f3932c;
    /* renamed from: d */
    public boolean f3933d = false;
    /* renamed from: e */
    public boolean f3934e;
    /* renamed from: f */
    public float f3935f;
    /* renamed from: g */
    public float f3936g;
    /* renamed from: h */
    public eld f3937h;
    /* renamed from: i */
    public double f3938i;
    /* renamed from: j */
    public double f3939j;
    /* renamed from: k */
    public boolean f3940k;
    /* renamed from: l */
    public int f3941l;
    /* renamed from: m */
    public final Semaphore f3942m = new Semaphore(0);
    /* renamed from: n */
    public final Vector f3943n = new Vector(100);
    /* renamed from: o */
    public int f3944o = 0;
    /* renamed from: p */
    public FileWriter f3945p = null;
    /* renamed from: q */
    public Context f3946q;
    /* renamed from: r */
    public cbr f3947r;
    /* renamed from: s */
    public final hjw f3948s;
    /* renamed from: t */
    public boolean f3949t = false;
    /* renamed from: u */
    public boolean f3950u = true;
    /* renamed from: v */
    public boolean f3951v = false;
    /* renamed from: w */
    public bwb f3952w;
    /* renamed from: x */
    public boolean f3953x = false;
    /* renamed from: y */
    public boolean f3954y = false;
    /* renamed from: z */
    public emc f3955z = null;

    @SuppressLint({"NewApi"})
    public ejy(Context context, eje eje, eld eld, eln eln, ejx ejx, eki eki, hjw hjw, cbr cbr) {
        this.f3947r = cbr;
        this.f3946q = context;
        this.f3937h = eld;
        this.f3930Q = eln;
        this.f3917D = ejx;
        this.f3948s = hjw;
        this.f3924K = new Handler(Looper.getMainLooper());
        try {
            this.f3945p = new FileWriter(this.f3930Q.f4169f);
        } catch (IOException e) {
            String str = f3913a;
            String valueOf = String.valueOf(this.f3930Q.f4169f);
            String str2 = "Could not create file writer for : ";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                valueOf = str2.concat(valueOf);
            }
            bli.m891b(str, valueOf);
        }
        this.f3916C = new HandlerThread("FileHandlerThread");
        this.f3916C.start();
        this.f3915B = new Handler(this.f3916C.getLooper());
        this.f3932c = eje;
        if (this.f3932c == null) {
            bli.m896d(f3913a, "Error creating CameraPreview.");
            return;
        }
        this.f3931b = eki;
        this.f3931b.f3967I = this;
        this.f3947r.mo2249a().getDefaultDisplay();
        eki eki2 = this.f3931b;
        eki2.f3966H = eld;
        eki2.f3960B = new ekv();
        this.f3937h.f4144p = new ejz(this);
        this.f3922I.f4038c = ejv.m1863b();
        this.f3954y = ije.m3836a(this.f3946q.getContentResolver(), "camera:requires_focus_on_pitch_change", false);
    }

    /* renamed from: a */
    public final float mo6266a() {
        float b = mo6268b();
        String str;
        StringBuilder stringBuilder;
        if (b > 0.0f) {
            str = f3913a;
            stringBuilder = new StringBuilder(40);
            stringBuilder.append("Field of view : ");
            stringBuilder.append(b);
            stringBuilder.append(" degrees.");
            bli.m896d(str, stringBuilder.toString());
        } else {
            b = this.f3929P;
            if (b > 75.0f) {
                b = 55.0f;
            }
            str = f3913a;
            stringBuilder = new StringBuilder(40);
            stringBuilder.append("Field of view : ");
            stringBuilder.append(b);
            stringBuilder.append(" degrees.");
            bli.m896d(str, stringBuilder.toString());
        }
        return b;
    }

    /* renamed from: b */
    public final float mo6268b() {
        if (this.f3932c == null) {
            throw new IllegalStateException("Cannot use stopped controller");
        }
        int a = ije.m3829a(this.f3946q.getContentResolver(), "camera:field_of_view_millidegrees", -1);
        if (a > 0) {
            return ((float) a) / 1000.0f;
        }
        return ejv.m1859a(this.f3929P);
    }

    /* renamed from: a */
    public static float m1867a(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((double) ((x * x) + (y * y)));
    }

    public final void onClick(View view) {
    }

    /* renamed from: a */
    static double m1866a(File file) {
        try {
            String attribute = new ExifInterface(file.getAbsolutePath()).getAttribute("ExposureTime");
            if (attribute == null) {
                return -1.0d;
            }
            try {
                return Double.parseDouble(attribute);
            } catch (NumberFormatException e) {
                return -2.0d;
            }
        } catch (IOException e2) {
            return -3.0d;
        }
    }

    /* renamed from: a */
    public final void mo6267a(int i) {
        String str = this.f3930Q.f4166c;
        float a;
        switch (i - 1) {
            case 0:
                LightCycle.m1322a(str, mo6266a());
                break;
            case 1:
                a = mo6266a();
                synchronized (LightCycle.f2562a) {
                    LightCycleNative.ResetForHorizontalCapture(str, a);
                    LightCycle.f2563b = Boolean.valueOf(true);
                }
            case 2:
                a = mo6266a();
                synchronized (LightCycle.f2562a) {
                    LightCycleNative.ResetForVerticalCapture(str, a);
                    LightCycle.f2563b = Boolean.valueOf(true);
                }
            case 3:
                a = mo6266a();
                synchronized (LightCycle.f2562a) {
                    LightCycleNative.ResetForWideCapture(str, a);
                    LightCycle.f2563b = Boolean.valueOf(true);
                }
            case 4:
                a = mo6266a();
                synchronized (LightCycle.f2562a) {
                    LightCycleNative.ResetForFisheyeCapture(str, a);
                    LightCycle.f2563b = Boolean.valueOf(true);
                }
            default:
                LightCycle.m1322a(str, mo6266a());
                break;
        }
        eki eki = this.f3931b;
        ekt ekt = eki.f4012d;
        if (ekt != null) {
            ekt.mo6292b();
        }
        eki.f4013e.mo2666a();
        if (i == C0252go.f5839al) {
            float[] fArr = new float[16];
            Matrix.setIdentityM(fArr, 0);
            eki eki2 = this.f3931b;
            ekt ekt2 = eki2.f4012d;
            if (ekt2 != null) {
                ekt2.mo6291a(fArr);
            }
            if (eki2.f4024p && eki2.f4031w == C0252go.f5834ag) {
                eki2.f4013e.mo2669b(eki2.f3959A);
            }
            eki2.f4032x = true;
        }
        this.f3953x = false;
        this.f3944o = 0;
    }

    /* renamed from: c */
    public final void mo6269c() {
        float[] e = LightCycle.m1334e();
        ekn ekn = this.f3931b.f4010b;
        ekn.f17492f = 6;
        ekn.f3886a = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        ekn.f3887b = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        int i = ekn.f17492f;
        ekn.f3888c = ByteBuffer.allocateDirect(i + i).order(ByteOrder.nativeOrder()).asShortBuffer();
        ekn.f17495i = ByteBuffer.allocateDirect(16).order(ByteOrder.nativeOrder()).asShortBuffer();
        for (i = 0; i < 12; i++) {
            ekn.f3886a.put(i, e[i]);
        }
        int i2 = 0;
        short s = (short) 0;
        while (i2 < 2) {
            float f = (float) i2;
            short s2 = s;
            for (i = 0; i < 2; i++) {
                ekn.f3887b.put(s2, (float) i);
                ekn.f3887b.put(s2 + 1, f);
                s2 += 2;
            }
            i2++;
            s = s2;
        }
        for (s = (short) 0; s <= (short) 0; boolean z = true) {
            for (s = (short) 0; s <= (short) 0; z = true) {
                ekn.f3888c.put(0, (short) 0);
                ekn.f3888c.put(1, (short) 3);
                ekn.f3888c.put(2, (short) 2);
                ekn.f3888c.put(3, (short) 0);
                ekn.f3888c.put(4, (short) 1);
                ekn.f3888c.put(5, (short) 3);
            }
        }
        int i3 = 0;
        i = 0;
        while (i3 < 2) {
            i2 = i + 1;
            ekn.f17495i.put(i, (short) i3);
            i3++;
            i = i2;
        }
        int i4 = i;
        i = (short) 0;
        while (i < 2) {
            i3 = i4 + 1;
            ekn.f17495i.put(i4, (short) ((i + i) + 1));
            i++;
            i4 = i3;
        }
        i = 1;
        while (i >= 0) {
            i3 = i4 + 1;
            ekn.f17495i.put(i4, (short) (i + 2));
            i--;
            i4 = i3;
        }
        i = i4;
        i4 = 1;
        while (i4 >= 0) {
            i3 = i + 1;
            ekn.f17495i.put(i, (short) (i4 + i4));
            i4--;
            i = i3;
        }
        ekn.f17493g = 7;
        ekn.f17494h = true;
    }

    /* renamed from: d */
    public final synchronized void mo6270d() {
        if (this.f3951v) {
            this.f3951v = false;
            this.f3931b.f4029u = true;
            eje eje = this.f3932c;
            if (eje != null) {
                aah aah = eje.f3862b;
                if (aah != null) {
                    if (aah.mo23d().mo77a() != 1) {
                        eje.f3862b.mo30k();
                        eje.f3862b.mo11a(eje.f3861a, null);
                        eje.f3862b.mo16a(true);
                    }
                    eje.f3863c = null;
                }
                emd.m1921a(this.f3930Q.f4168e, this.f3919F);
                try {
                    this.f3945p.close();
                } catch (Throwable e) {
                    kqg.f8786a.mo10213b(e);
                }
            }
        } else {
            bli.m898e(f3913a, "stopCamera invoked, but camera is already stopped!");
        }
        return;
    }

    /* renamed from: e */
    public final synchronized int mo6271e() {
        int i = 0;
        synchronized (this) {
            int i2 = this.f3944o;
            if (i2 != 0) {
                this.f3944o = i2 - 1;
                List list = this.f3919F;
                list.remove(list.size() - 1);
                try {
                    this.f3945p.close();
                    BufferedReader bufferedReader = new BufferedReader(new FileReader(this.f3930Q.f4169f));
                    StringBuilder stringBuilder = new StringBuilder();
                    while (i < this.f3944o) {
                        stringBuilder.append(bufferedReader.readLine());
                        stringBuilder.append("\n");
                        i++;
                    }
                    bufferedReader.close();
                    this.f3945p = new FileWriter(this.f3930Q.f4169f);
                    this.f3945p.write(stringBuilder.toString());
                    this.f3945p.flush();
                } catch (Throwable e) {
                    bli.m892b(f3913a, "undo image exception:", e);
                }
                i = this.f3944o;
                if (i == 0) {
                    this.f3953x = false;
                }
                this.f3923J = true;
            }
        }
        return i;
    }

    /* renamed from: f */
    public final void mo6272f() {
        this.f3929P = this.f3932c.f3862b.mo27h().getHorizontalViewAngle();
    }
}
