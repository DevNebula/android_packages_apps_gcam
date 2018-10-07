package p000;

import android.app.DialogFragment;
import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.support.p001v4.app.NotificationCompatJellybean;
import android.support.p003v8.renderscript.Allocation;
import android.support.p003v8.renderscript.RSRuntimeException;
import android.support.p003v8.renderscript.Sampler;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SeekBar;
import com.google.android.GoogleCamera.R;
import com.google.android.apps.camera.legacy.app.tinyplanet.TinyPlanetPreview;
import com.google.android.libraries.camera.exif.ExifInterface;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.TimeZone;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: PG */
/* renamed from: eaq */
public final class eaq extends DialogFragment implements eaz {
    /* renamed from: m */
    private static final String f17115m = bli.m887a("TinyPlanetActivity");
    /* renamed from: a */
    public final Lock f17116a = new ReentrantLock();
    /* renamed from: b */
    public final gln f17117b;
    /* renamed from: c */
    public final glj f17118c;
    /* renamed from: d */
    public TinyPlanetPreview f17119d;
    /* renamed from: e */
    public float f17120e = 0.5f;
    /* renamed from: f */
    public float f17121f = 0.0f;
    /* renamed from: g */
    public ProgressDialog f17122g;
    /* renamed from: h */
    public String f17123h = "";
    /* renamed from: i */
    public Bitmap f17124i;
    /* renamed from: j */
    public Bitmap f17125j;
    /* renamed from: k */
    public Boolean f17126k;
    /* renamed from: l */
    public Boolean f17127l;
    /* renamed from: n */
    private final cfh f17128n;
    /* renamed from: o */
    private final Handler f17129o = new Handler();
    /* renamed from: p */
    private Uri f17130p;
    /* renamed from: q */
    private int f17131q = 0;
    /* renamed from: r */
    private eba f17132r;
    /* renamed from: s */
    private final Runnable f17133s;

    public eaq(cfh cfh, gln gln, glj glj) {
        Boolean valueOf = Boolean.valueOf(false);
        this.f17126k = valueOf;
        this.f17127l = valueOf;
        this.f17133s = new ear(this);
        this.f17128n = (cfh) jri.m13404b((Object) cfh);
        this.f17117b = (gln) jri.m13404b((Object) gln);
        this.f17118c = (glj) jri.m13404b((Object) glj);
    }

    /* renamed from: a */
    private static byte[] m9752a(byte[] bArr) {
        ExifInterface exifInterface = new ExifInterface();
        exifInterface.mo12674a(ExifInterface.f13019i, System.currentTimeMillis(), TimeZone.getDefault());
        OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (bArr == null) {
            try {
                throw new IllegalArgumentException("Argument is null");
            } catch (Throwable e) {
                bli.m892b(f17115m, "Could not write EXIF", e);
            }
        } else {
            OutputStream a = exifInterface.mo12670a(byteArrayOutputStream);
            a.write(bArr, 0, bArr.length);
            a.flush();
            a.close();
            return byteArrayOutputStream.toByteArray();
        }
    }

    /* renamed from: a */
    private static Bitmap m9747a(int i, int i2) {
        double d = 1.0d;
        while (true) {
            try {
                break;
            } catch (OutOfMemoryError e) {
                d /= 2.0d;
                System.gc();
            }
        }
        return Bitmap.createBitmap((int) (((double) i) * d), (int) (((double) i2) * d), Config.ARGB_8888);
    }

    /* renamed from: a */
    final eay mo13107a() {
        this.f17116a.lock();
        try {
            this.f17125j.recycle();
            this.f17125j = null;
            this.f17124i.recycle();
            this.f17124i = null;
            Bitmap a = m9749a(this.f17130p, false);
            int width = (int) ((double) (a.getWidth() / 2));
            Bitmap a2 = eaq.m9747a(width, width);
            mo13108a(a, a2);
            a.recycle();
            OutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            a2.compress(CompressFormat.JPEG, 100, byteArrayOutputStream);
            return new eay(eaq.m9752a(byteArrayOutputStream.toByteArray()), a2.getWidth());
        } finally {
            this.f17116a.unlock();
        }
    }

    /* renamed from: a */
    private static Bitmap m9748a(Bitmap bitmap, C0556wd c0556wd, int i) {
        try {
            int a = eaq.m9746a(c0556wd, "CroppedAreaImageWidthPixels");
            int a2 = eaq.m9746a(c0556wd, "CroppedAreaImageHeightPixels");
            int a3 = eaq.m9746a(c0556wd, "FullPanoWidthPixels");
            int a4 = eaq.m9746a(c0556wd, "FullPanoHeightPixels");
            int a5 = eaq.m9746a(c0556wd, "CroppedAreaLeftPixels");
            int a6 = eaq.m9746a(c0556wd, "CroppedAreaTopPixels");
            if (a3 == 0 || a4 == 0) {
                return bitmap;
            }
            float f = (float) a3;
            float f2 = (float) ((double) (((float) i) / f));
            Bitmap a7 = eaq.m9747a((int) (f * f2), (int) (((float) a4) * f2));
            new Canvas(a7).drawBitmap(bitmap, null, new RectF(((float) a5) * f2, ((float) a6) * f2, ((float) (a + a5)) * f2, ((float) (a2 + a6)) * f2), null);
            return a7;
        } catch (C0554wb e) {
            return bitmap;
        }
    }

    /* renamed from: a */
    private final Bitmap m9749a(Uri uri, boolean z) {
        Throwable th;
        InputStream a = m9750a(uri);
        if (a == null) {
            bli.m891b(f17115m, "Could not create input stream for image.");
            dismiss();
        }
        Bitmap decodeStream = BitmapFactory.decodeStream(a);
        try {
            a = m9750a(uri);
            try {
                C0556wd a2 = ern.m2084a(a);
                eaq.m9751a(a);
                if (a2 == null) {
                    return decodeStream;
                }
                int min;
                if (z) {
                    Display defaultDisplay = this.f17128n.mo12479e().getDefaultDisplay();
                    Point point = new Point();
                    defaultDisplay.getSize(point);
                    min = Math.min(point.x, point.y);
                } else {
                    min = decodeStream.getWidth();
                }
                return eaq.m9748a(decodeStream, a2, min);
            } catch (Throwable th2) {
                th = th2;
                eaq.m9751a(a);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* renamed from: a */
    private static int m9746a(C0556wd c0556wd, String str) {
        return c0556wd.mo11449b("http://ns.google.com/photos/1.0/panorama/", str) ? c0556wd.mo11457i("http://ns.google.com/photos/1.0/panorama/", str).intValue() : 0;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, R.style.Theme.Camera);
        this.f17132r = new eba(getActivity().getApplicationContext());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        getDialog().getWindow().requestFeature(1);
        getDialog().setCanceledOnTouchOutside(true);
        View inflate = layoutInflater.inflate(R.layout.tinyplanet_editor, viewGroup, false);
        this.f17119d = (TinyPlanetPreview) inflate.findViewById(R.id.preview);
        this.f17119d.f2560c = this;
        ((SeekBar) inflate.findViewById(R.id.zoomSlider)).setOnSeekBarChangeListener(new eat(this));
        ((SeekBar) inflate.findViewById(R.id.angleSlider)).setOnSeekBarChangeListener(new eau(this));
        ((Button) inflate.findViewById(R.id.createTinyPlanetButton)).setOnClickListener(new eav(this));
        this.f17123h = getArguments().getString(NotificationCompatJellybean.KEY_TITLE);
        this.f17130p = Uri.parse(getArguments().getString("uri"));
        this.f17124i = m9749a(this.f17130p, true);
        if (this.f17124i == null) {
            bli.m891b(f17115m, "Could not decode source image.");
            dismiss();
        }
        return inflate;
    }

    /* renamed from: a */
    public final void mo6182a(int i) {
        this.f17131q = i;
        this.f17116a.lock();
        try {
            Bitmap bitmap = this.f17125j;
            if (!(bitmap != null && bitmap.getWidth() == i && this.f17125j.getHeight() == i)) {
                bitmap = this.f17125j;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                int i2 = this.f17131q;
                this.f17125j = Bitmap.createBitmap(i2, i2, Config.ARGB_8888);
            }
            this.f17116a.unlock();
            mo13109b();
        } catch (Throwable th) {
            this.f17116a.unlock();
        }
    }

    /* renamed from: a */
    private final InputStream m9750a(Uri uri) {
        try {
            return this.f17128n.mo12486q().openInputStream(uri);
        } catch (Throwable e) {
            bli.m892b(f17115m, "Could not load source image.", e);
            return null;
        }
    }

    /* renamed from: a */
    final void mo13108a(Bitmap bitmap, Bitmap bitmap2) {
        eba eba = this.f17132r;
        float f = this.f17120e;
        float f2 = this.f17121f;
        SystemClock.elapsedRealtimeNanos();
        eba.f3705c.mo15702a(Sampler.WRAP_LINEAR(eba.f3704b));
        eba.f3705c.mo15701a(Allocation.createFromBitmap(eba.f3704b, bitmap));
        eba.f3705c.mo15704b(bitmap.getWidth());
        eba.f3705c.mo15700a(bitmap.getHeight());
        eba.f3705c.mo15706d(((float) bitmap2.getWidth()) * 0.5f);
        eba.f3705c.mo15705c(((float) bitmap2.getHeight()) * 0.5f);
        eba.f3705c.mo15703b(5.0f / ((f * 4.0f) * ((float) bitmap2.getWidth())));
        eba.f3705c.mo15699a(f2);
        Allocation createFromBitmap = Allocation.createFromBitmap(eba.f3704b, bitmap2);
        C0848xo c0848xo = eba.f3705c;
        if (createFromBitmap.getType().getElement().isCompatible(c0848xo.f26613a)) {
            c0848xo.forEach(1, null, createFromBitmap, null, null);
            createFromBitmap.copyTo(bitmap2);
            String str = eba.f3703a;
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            StringBuilder stringBuilder = new StringBuilder(47);
            stringBuilder.append(" TinyPlanet processed (");
            stringBuilder.append(width);
            stringBuilder.append(",");
            stringBuilder.append(height);
            stringBuilder.append(")");
            bli.m896d(str, stringBuilder.toString());
            return;
        }
        throw new RSRuntimeException("Type mismatch with U8_4!");
    }

    /* renamed from: a */
    private static void m9751a(InputStream inputStream) {
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                String str = f17115m;
                String valueOf = String.valueOf(e);
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 24);
                stringBuilder.append("Unable to close stream: ");
                stringBuilder.append(valueOf);
                bli.m898e(str, stringBuilder.toString());
            }
        }
    }

    /* renamed from: b */
    final void mo13109b() {
        this.f17129o.removeCallbacks(this.f17133s);
        this.f17129o.postDelayed(this.f17133s, 10);
    }
}
