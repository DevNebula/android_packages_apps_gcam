package p000;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
/* renamed from: ahe */
public final class ahe implements agw {
    /* renamed from: a */
    private static final Config f10292a = Config.ARGB_8888;
    /* renamed from: b */
    private final ahg f10293b;
    /* renamed from: c */
    private final Set f10294c;
    /* renamed from: d */
    private final long f10295d;
    /* renamed from: e */
    private long f10296e;
    /* renamed from: f */
    private long f10297f;
    /* renamed from: g */
    private int f10298g;
    /* renamed from: h */
    private int f10299h;
    /* renamed from: i */
    private int f10300i;
    /* renamed from: j */
    private int f10301j;

    public ahe(long j) {
        ahg ahi = new ahi();
        Set hashSet = new HashSet(Arrays.asList(Config.values()));
        hashSet.add(null);
        hashSet.remove(Config.HARDWARE);
        this(j, ahi, Collections.unmodifiableSet(hashSet));
    }

    private ahe(long j, ahg ahg, Set set) {
        this.f10295d = j;
        this.f10296e = j;
        this.f10293b = ahg;
        this.f10294c = set;
        ahf ahf = new ahf();
    }

    /* renamed from: a */
    public final void mo281a() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        m6506a(0);
    }

    /* renamed from: c */
    private static Bitmap m6508c(int i, int i2, Config config) {
        if (config == null) {
            config = f10292a;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    /* renamed from: b */
    private final void m6507b() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            m6509c();
        }
    }

    /* renamed from: c */
    private final void m6509c() {
        int i = this.f10298g;
        int i2 = this.f10299h;
        int i3 = this.f10300i;
        int i4 = this.f10301j;
        long j = this.f10297f;
        long j2 = this.f10296e;
        String valueOf = String.valueOf(this.f10293b);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 151);
        stringBuilder.append("Hits=");
        stringBuilder.append(i);
        stringBuilder.append(", misses=");
        stringBuilder.append(i2);
        stringBuilder.append(", puts=");
        stringBuilder.append(i3);
        stringBuilder.append(", evictions=");
        stringBuilder.append(i4);
        stringBuilder.append(", currentSize=");
        stringBuilder.append(j);
        stringBuilder.append(", maxSize=");
        stringBuilder.append(j2);
        stringBuilder.append("\nStrategy=");
        stringBuilder.append(valueOf);
        Log.v("LruBitmapPool", stringBuilder.toString());
    }

    /* renamed from: d */
    private final void m6511d() {
        m6506a(this.f10296e);
    }

    /* renamed from: a */
    public final Bitmap mo280a(int i, int i2, Config config) {
        Bitmap d = m6510d(i, i2, config);
        if (d == null) {
            return ahe.m6508c(i, i2, config);
        }
        d.eraseColor(0);
        return d;
    }

    /* renamed from: b */
    public final Bitmap mo285b(int i, int i2, Config config) {
        Bitmap d = m6510d(i, i2, config);
        if (d == null) {
            return ahe.m6508c(i, i2, config);
        }
        return d;
    }

    /* renamed from: d */
    private final synchronized Bitmap m6510d(int i, int i2, Config config) {
        Bitmap a;
        if (config == Config.HARDWARE) {
            String valueOf = String.valueOf(config);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 176);
            stringBuilder.append("Cannot create a mutable Bitmap with config: ");
            stringBuilder.append(valueOf);
            stringBuilder.append(". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        Config config2;
        String valueOf2;
        String str;
        ahg ahg = this.f10293b;
        if (config == null) {
            config2 = f10292a;
        } else {
            config2 = config;
        }
        a = ahg.mo294a(i, i2, config2);
        if (a == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                valueOf2 = String.valueOf(this.f10293b.mo295b(i, i2, config));
                str = "Missing bitmap=";
                if (valueOf2.length() == 0) {
                    valueOf2 = new String(str);
                } else {
                    valueOf2 = str.concat(valueOf2);
                }
                Log.d("LruBitmapPool", valueOf2);
            }
            this.f10299h++;
        } else {
            this.f10298g++;
            this.f10297f -= (long) this.f10293b.mo292a(a);
            a.setHasAlpha(true);
            a.setPremultiplied(true);
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            valueOf2 = String.valueOf(this.f10293b.mo295b(i, i2, config));
            str = "Get bitmap=";
            if (valueOf2.length() == 0) {
                valueOf2 = new String(str);
            } else {
                valueOf2 = str.concat(valueOf2);
            }
            Log.v("LruBitmapPool", valueOf2);
        }
        m6507b();
        return a;
    }

    /* renamed from: a */
    public final synchronized void mo284a(Bitmap bitmap) {
        String valueOf;
        if (bitmap == null) {
            throw new NullPointerException("Bitmap must not be null");
        } else if (bitmap.isRecycled()) {
            throw new IllegalStateException("Cannot pool recycled bitmap");
        } else if (bitmap.isMutable() && ((long) this.f10293b.mo292a(bitmap)) <= this.f10296e && this.f10294c.contains(bitmap.getConfig())) {
            int a = this.f10293b.mo292a(bitmap);
            this.f10293b.mo297c(bitmap);
            this.f10300i++;
            this.f10297f = ((long) a) + this.f10297f;
            if (Log.isLoggable("LruBitmapPool", 2)) {
                valueOf = String.valueOf(this.f10293b.mo296b(bitmap));
                String str = "Put bitmap in pool=";
                if (valueOf.length() == 0) {
                    valueOf = new String(str);
                } else {
                    valueOf = str.concat(valueOf);
                }
                Log.v("LruBitmapPool", valueOf);
            }
            m6507b();
            m6511d();
        } else {
            if (Log.isLoggable("LruBitmapPool", 2)) {
                valueOf = this.f10293b.mo296b(bitmap);
                boolean isMutable = bitmap.isMutable();
                boolean contains = this.f10294c.contains(bitmap.getConfig());
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 78);
                stringBuilder.append("Reject bitmap from pool, bitmap: ");
                stringBuilder.append(valueOf);
                stringBuilder.append(", is mutable: ");
                stringBuilder.append(isMutable);
                stringBuilder.append(", is allowed config: ");
                stringBuilder.append(contains);
                Log.v("LruBitmapPool", stringBuilder.toString());
            }
            bitmap.recycle();
        }
    }

    /* renamed from: a */
    public final synchronized void mo282a(float f) {
        this.f10296e = (long) Math.round(((float) this.f10295d) * f);
        m6511d();
    }

    @SuppressLint({"InlinedApi"})
    /* renamed from: a */
    public final void mo283a(int i) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            StringBuilder stringBuilder = new StringBuilder(29);
            stringBuilder.append("trimMemory, level=");
            stringBuilder.append(i);
            Log.d("LruBitmapPool", stringBuilder.toString());
        }
        if (i >= 40) {
            mo281a();
        } else if (i >= 20 || i == 15) {
            m6506a(this.f10296e / 2);
        }
    }

    /* renamed from: a */
    private final synchronized void m6506a(long j) {
        while (this.f10297f > j) {
            Bitmap a = this.f10293b.mo293a();
            if (a == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    m6509c();
                }
                this.f10297f = 0;
            } else {
                this.f10297f -= (long) this.f10293b.mo292a(a);
                this.f10301j++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    String valueOf = String.valueOf(this.f10293b.mo296b(a));
                    String str = "Evicting bitmap=";
                    if (valueOf.length() == 0) {
                        valueOf = new String(str);
                    } else {
                        valueOf = str.concat(valueOf);
                    }
                    Log.d("LruBitmapPool", valueOf);
                }
                m6507b();
                a.recycle();
            }
        }
    }
}
