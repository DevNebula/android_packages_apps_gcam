package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* compiled from: PG */
/* renamed from: te */
public final class C0491te implements Parcelable {
    public static final Creator CREATOR = new C0492tf();
    /* renamed from: a */
    public int f9782a;
    /* renamed from: b */
    public int f9783b;
    /* renamed from: c */
    public boolean f9784c;

    C0491te(Parcel parcel) {
        boolean z = true;
        this.f9782a = parcel.readInt();
        this.f9783b = parcel.readInt();
        if (parcel.readInt() != 1) {
            z = false;
        }
        this.f9784c = z;
    }

    public C0491te(C0491te c0491te) {
        this.f9782a = c0491te.f9782a;
        this.f9783b = c0491te.f9783b;
        this.f9784c = c0491te.f9784c;
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: a */
    final boolean mo11142a() {
        return this.f9782a >= 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f9782a);
        parcel.writeInt(this.f9783b);
        parcel.writeInt(this.f9784c);
    }
}
