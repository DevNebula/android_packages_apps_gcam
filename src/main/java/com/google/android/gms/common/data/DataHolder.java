package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.io.Closeable;
import p000.htl;
import p000.hvg;

@KeepName
public final class DataHolder extends zza implements Closeable {
    public static final Creator CREATOR = new hvg();
    /* renamed from: a */
    public final String[] f23368a;
    /* renamed from: b */
    public Bundle f23369b;
    /* renamed from: c */
    public final CursorWindow[] f23370c;
    /* renamed from: d */
    public int[] f23371d;
    /* renamed from: e */
    public int f23372e;
    /* renamed from: f */
    private final int f23373f;
    /* renamed from: g */
    private final int f23374g;
    /* renamed from: h */
    private final Bundle f23375h;
    /* renamed from: i */
    private boolean f23376i = false;
    /* renamed from: j */
    private boolean f23377j = true;

    static {
        htl htl = new htl(new String[0], (byte) 0);
    }

    public DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.f23373f = i;
        this.f23368a = strArr;
        this.f23370c = cursorWindowArr;
        this.f23374g = i2;
        this.f23375h = bundle;
    }

    /* renamed from: a */
    private final boolean m15367a() {
        boolean z;
        synchronized (this) {
            z = this.f23376i;
        }
        return z;
    }

    public final void close() {
        synchronized (this) {
            if (!this.f23376i) {
                this.f23376i = true;
                int i = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.f23370c;
                    if (i >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i].close();
                    i++;
                }
            }
        }
    }

    protected final void finalize() {
        try {
            if (this.f23377j && this.f23370c.length > 0 && !m15367a()) {
                close();
                String valueOf = String.valueOf(toString());
                StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 178);
                stringBuilder.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                stringBuilder.append(valueOf);
                stringBuilder.append(")");
                Log.e("DataBuffer", stringBuilder.toString());
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3487b(parcel, 20293);
        htl.m3475a(parcel, 1, this.f23368a);
        htl.m3474a(parcel, 2, this.f23370c, i);
        htl.m3497c(parcel, 3, this.f23374g);
        htl.m3466a(parcel, 4, this.f23375h);
        htl.m3497c(parcel, 1000, this.f23373f);
        htl.m3496c(parcel, b);
    }
}
