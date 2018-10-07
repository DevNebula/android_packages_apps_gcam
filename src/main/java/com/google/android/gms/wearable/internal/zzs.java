package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import p000.htl;
import p000.iiy;

public final class zzs extends zza {
    public static final Creator CREATOR = new iiy();
    /* renamed from: a */
    private final zzu f23643a;
    /* renamed from: b */
    private final int f23644b;
    /* renamed from: c */
    private final int f23645c;
    /* renamed from: d */
    private final int f23646d;

    public zzs(zzu zzu, int i, int i2, int i3) {
        this.f23643a = zzu;
        this.f23644b = i;
        this.f23645c = i2;
        this.f23646d = i3;
    }

    public final String toString() {
        Object obj;
        String valueOf = String.valueOf(this.f23643a);
        int i = this.f23644b;
        switch (i) {
            case 1:
                obj = "CHANNEL_OPENED";
                break;
            case 2:
                obj = "CHANNEL_CLOSED";
                break;
            case 3:
                obj = "INPUT_CLOSED";
                break;
            case 4:
                obj = "OUTPUT_CLOSED";
                break;
            default:
                obj = Integer.toString(i);
                break;
        }
        String valueOf2 = String.valueOf(obj);
        i = this.f23645c;
        switch (i) {
            case 0:
                obj = "CLOSE_REASON_NORMAL";
                break;
            case 1:
                obj = "CLOSE_REASON_DISCONNECTED";
                break;
            case 2:
                obj = "CLOSE_REASON_REMOTE_CLOSE";
                break;
            case 3:
                obj = "CLOSE_REASON_LOCAL_CLOSE";
                break;
            default:
                obj = Integer.toString(i);
                break;
        }
        String valueOf3 = String.valueOf(obj);
        int i2 = this.f23646d;
        int length = String.valueOf(valueOf).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 81) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length());
        stringBuilder.append("ChannelEventParcelable[, channel=");
        stringBuilder.append(valueOf);
        stringBuilder.append(", type=");
        stringBuilder.append(valueOf2);
        stringBuilder.append(", closeReason=");
        stringBuilder.append(valueOf3);
        stringBuilder.append(", appErrorCode=");
        stringBuilder.append(i2);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3487b(parcel, 20293);
        htl.m3468a(parcel, 2, this.f23643a, i);
        htl.m3497c(parcel, 3, this.f23644b);
        htl.m3497c(parcel, 4, this.f23645c);
        htl.m3497c(parcel, 5, this.f23646d);
        htl.m3496c(parcel, b);
    }
}
