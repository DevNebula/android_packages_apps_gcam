package p000;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.support.p003v8.renderscript.ScriptIntrinsicBLAS;
import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import com.google.googlex.gcam.DngColorCalibration.Illuminant;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: PG */
/* renamed from: anv */
public final class anv implements adq {
    /* renamed from: a */
    private static final anw f10606a = new anw();
    /* renamed from: b */
    private static final anx f10607b = new anx();
    /* renamed from: c */
    private final Context f10608c;
    /* renamed from: d */
    private final List f10609d;
    /* renamed from: e */
    private final anx f10610e;
    /* renamed from: f */
    private final adk f10611f;

    public anv(Context context, List list, agw agw, agu agu) {
        this(context, list, agw, agu, f10607b);
    }

    private anv(Context context, List list, agw agw, agu agu, anx anx) {
        this.f10608c = context.getApplicationContext();
        this.f10609d = list;
        this.f10611f = new adk(agw, agu);
        this.f10610e = anx;
    }

    /* renamed from: a */
    private final aob m6924a(ByteBuffer byteBuffer, int i, int i2, add add, adp adp) {
        long a = arm.m655a();
        StringBuilder stringBuilder;
        aob aob;
        try {
            if (add.f314b == null) {
                throw new IllegalStateException("You must call setData() before parseHeader()");
            }
            int i3;
            StringBuilder stringBuilder2;
            int i4;
            double a2;
            if (!add.mo163a()) {
                boolean z;
                adc adc;
                stringBuilder = new StringBuilder();
                for (i3 = 0; i3 < 6; i3++) {
                    stringBuilder.append((char) add.mo165b());
                }
                if (stringBuilder.toString().startsWith("GIF")) {
                    add.f315c.f307f = add.f314b.getShort();
                    add.f315c.f308g = add.f314b.getShort();
                    int b = add.mo165b();
                    adc adc2 = add.f315c;
                    if ((b & 128) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    adc2.f309h = z;
                    adc2.f310i = (int) Math.pow(2.0d, (double) ((b & 7) + 1));
                    add.f315c.f311j = add.mo165b();
                    add.mo165b();
                    if (add.f315c.f309h && !add.mo163a()) {
                        adc = add.f315c;
                        adc.f302a = add.mo164a(adc.f310i);
                        adc = add.f315c;
                        adc.f312k = adc.f302a[adc.f311j];
                    }
                } else {
                    add.f315c.f303b = 1;
                }
                if (!add.mo163a()) {
                    Object obj = null;
                    while (obj == null && !add.mo163a() && add.f315c.f304c <= LfuScheduler.MAX_PRIORITY) {
                        switch (add.mo165b()) {
                            case 33:
                                switch (add.mo165b()) {
                                    case 1:
                                        add.mo167d();
                                        break;
                                    case 249:
                                        add.f315c.f305d = new adb();
                                        add.mo165b();
                                        i3 = add.mo165b();
                                        adb adb = add.f315c.f305d;
                                        adb.f297g = (i3 & 28) >> 2;
                                        if (adb.f297g == 0) {
                                            adb.f297g = 1;
                                        }
                                        adb.f296f = (byte) (i3 & 1);
                                        i3 = add.f314b.getShort();
                                        if (i3 < 2) {
                                            i3 = 10;
                                        }
                                        adb = add.f315c.f305d;
                                        adb.f299i = i3 * 10;
                                        adb.f298h = add.mo165b();
                                        add.mo165b();
                                        break;
                                    case 254:
                                        add.mo167d();
                                        break;
                                    case Illuminant.kOther /*255*/:
                                        add.mo166c();
                                        stringBuilder2 = new StringBuilder();
                                        for (i3 = 0; i3 < 11; i3++) {
                                            stringBuilder2.append((char) add.f313a[i3]);
                                        }
                                        if (!stringBuilder2.toString().equals("NETSCAPE2.0")) {
                                            add.mo167d();
                                            break;
                                        }
                                        do {
                                            add.mo166c();
                                            if (add.f316d <= 0) {
                                                break;
                                            }
                                        } while (!add.mo163a());
                                        break;
                                    default:
                                        add.mo167d();
                                        break;
                                }
                            case 44:
                                adc = add.f315c;
                                if (adc.f305d == null) {
                                    adc.f305d = new adb();
                                }
                                add.f315c.f305d.f291a = add.f314b.getShort();
                                add.f315c.f305d.f292b = add.f314b.getShort();
                                add.f315c.f305d.f293c = add.f314b.getShort();
                                add.f315c.f305d.f294d = add.f314b.getShort();
                                i3 = add.mo165b();
                                i4 = i3 & 128;
                                int pow = (int) Math.pow(2.0d, (double) ((i3 & 7) + 1));
                                adb adb2 = add.f315c.f305d;
                                if ((i3 & 64) != 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                adb2.f295e = z;
                                if (i4 != 0) {
                                    adb2.f301k = add.mo164a(pow);
                                } else {
                                    adb2.f301k = null;
                                }
                                add.f315c.f305d.f300j = add.f314b.position();
                                add.mo165b();
                                add.mo167d();
                                if (!add.mo163a()) {
                                    adc = add.f315c;
                                    adc.f304c++;
                                    adc.f306e.add(adc.f305d);
                                    break;
                                }
                                break;
                            case 59:
                                obj = 1;
                                break;
                            default:
                                add.f315c.f303b = 1;
                                break;
                        }
                    }
                    adc = add.f315c;
                    if (adc.f304c < 0) {
                        adc.f303b = 1;
                    }
                }
            }
            adc adc3 = add.f315c;
            if (adc3.f304c > 0) {
                if (adc3.f303b == 0) {
                    Config config;
                    if (adp.mo11616a(aoi.f840a) != adg.PREFER_RGB_565) {
                        config = Config.ARGB_8888;
                    } else {
                        config = Config.RGB_565;
                    }
                    i3 = Math.min(adc3.f308g / i2, adc3.f307f / i);
                    if (i3 != 0) {
                        i3 = Integer.highestOneBit(i3);
                    } else {
                        i3 = 0;
                    }
                    i3 = Math.max(1, i3);
                    if (Log.isLoggable("BufferGifDecoder", 2) && i3 > 1) {
                        i4 = adc3.f307f;
                        int i5 = adc3.f308g;
                        StringBuilder stringBuilder3 = new StringBuilder(ScriptIntrinsicBLAS.RsBlas_cgemm);
                        stringBuilder3.append("Downsampling GIF, sampleSize: ");
                        stringBuilder3.append(i3);
                        stringBuilder3.append(", target dimens: [");
                        stringBuilder3.append(i);
                        stringBuilder3.append("x");
                        stringBuilder3.append(i2);
                        stringBuilder3.append("], actual dimens: [");
                        stringBuilder3.append(i4);
                        stringBuilder3.append("x");
                        stringBuilder3.append(i5);
                        stringBuilder3.append("]");
                        Log.v("BufferGifDecoder", stringBuilder3.toString());
                    }
                    ada ade = new ade(this.f10611f, adc3, byteBuffer, i3);
                    ade.mo155a(config);
                    ade.mo154a();
                    Bitmap h = ade.mo162h();
                    if (h == null) {
                        if (Log.isLoggable("BufferGifDecoder", 2)) {
                            a2 = arm.m654a(a);
                            stringBuilder2 = new StringBuilder(51);
                            stringBuilder2.append("Decoded GIF from stream in ");
                            stringBuilder2.append(a2);
                            Log.v("BufferGifDecoder", stringBuilder2.toString());
                        }
                        return null;
                    }
                    aob = new aob(new any(this.f10608c, ade, (alq) alq.f22480b, i, i2, h));
                    return aob;
                }
            }
            if (Log.isLoggable("BufferGifDecoder", 2)) {
                a2 = arm.m654a(a);
                stringBuilder2 = new StringBuilder(51);
                stringBuilder2.append("Decoded GIF from stream in ");
                stringBuilder2.append(a2);
                Log.v("BufferGifDecoder", stringBuilder2.toString());
            }
            return null;
        } finally {
            aob = Log.isLoggable("BufferGifDecoder", 2);
            if (aob != null) {
                double a3 = arm.m654a(a);
                stringBuilder = new StringBuilder(51);
                stringBuilder.append("Decoded GIF from stream in ");
                stringBuilder.append(a3);
                aob = stringBuilder.toString();
                Log.v("BufferGifDecoder", aob);
            }
        }
    }

    /* renamed from: a */
    private final aob m6925a(ByteBuffer byteBuffer, int i, int i2, adp adp) {
        add a = this.f10610e.mo1622a(byteBuffer);
        try {
            aob a2 = m6924a(byteBuffer, i, i2, a, adp);
            return a2;
        } finally {
            this.f10610e.mo1623a(a);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ boolean mo180a(Object obj, adp adp) {
        ByteBuffer byteBuffer = (ByteBuffer) obj;
        if (!((Boolean) adp.mo11616a(aoi.f841b)).booleanValue()) {
            ImageType a;
            List list = this.f10609d;
            if (byteBuffer != null) {
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    a = ((ImageHeaderParser) list.get(i)).mo2419a(byteBuffer);
                    if (a != ImageType.UNKNOWN) {
                        break;
                    }
                }
            }
            a = ImageType.UNKNOWN;
            if (a == ImageType.GIF) {
                return true;
            }
        }
        return false;
    }
}
