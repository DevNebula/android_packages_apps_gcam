package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.util.Arrays;
import p000.htl;
import p000.hwx;

public final class ConnectionResult extends zza {
    public static final Creator CREATOR = new hwx();
    /* renamed from: a */
    public static final ConnectionResult f23348a = new ConnectionResult(0);
    /* renamed from: b */
    public final int f23349b;
    /* renamed from: c */
    public final PendingIntent f23350c;
    /* renamed from: d */
    public final String f23351d;
    /* renamed from: e */
    private final int f23352e;

    public ConnectionResult(int i) {
        this(i, null, (byte) 0);
    }

    public ConnectionResult(int i, int i2, PendingIntent pendingIntent, String str) {
        this.f23352e = i;
        this.f23349b = i2;
        this.f23350c = pendingIntent;
        this.f23351d = str;
    }

    public ConnectionResult(int i, PendingIntent pendingIntent) {
        this(i, pendingIntent, (byte) 0);
    }

    private ConnectionResult(int i, PendingIntent pendingIntent, byte b) {
        this(1, i, pendingIntent, null);
    }

    /* renamed from: a */
    public static String m15360a(int i) {
        switch (i) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            case 13:
                return "CANCELED";
            case 14:
                return "TIMEOUT";
            case 15:
                return "INTERRUPTED";
            case 16:
                return "API_UNAVAILABLE";
            case 17:
                return "SIGN_IN_FAILED";
            case 18:
                return "SERVICE_UPDATING";
            case 19:
                return "SERVICE_MISSING_PERMISSION";
            case 20:
                return "RESTRICTED_PROFILE";
            case 21:
                return "API_VERSION_UPDATE_REQUIRED";
            case 99:
                return "UNFINISHED";
            case 1500:
                return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
            default:
                StringBuilder stringBuilder = new StringBuilder(31);
                stringBuilder.append("UNKNOWN_ERROR_CODE(");
                stringBuilder.append(i);
                stringBuilder.append(")");
                return stringBuilder.toString();
        }
    }

    /* renamed from: a */
    public final boolean mo14630a() {
        return (this.f23349b == 0 || this.f23350c == null) ? false : true;
    }

    /* renamed from: b */
    public final boolean mo14631b() {
        return this.f23349b == 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.f23349b == connectionResult.f23349b && htl.m3483a(this.f23350c, connectionResult.f23350c) && htl.m3483a(this.f23351d, connectionResult.f23351d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f23349b), this.f23350c, this.f23351d});
    }

    public final String toString() {
        return htl.m3455a((Object) this).mo8170a("statusCode", m15360a(this.f23349b)).mo8170a("resolution", this.f23350c).mo8170a("message", this.f23351d).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int b = htl.m3487b(parcel, 20293);
        htl.m3497c(parcel, 1, this.f23352e);
        htl.m3497c(parcel, 2, this.f23349b);
        htl.m3468a(parcel, 3, this.f23350c, i);
        htl.m3469a(parcel, 4, this.f23351d);
        htl.m3496c(parcel, b);
    }
}
