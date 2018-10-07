package p000;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* compiled from: PG */
/* renamed from: ay */
public final class C0636ay extends C0304jb {
    public static final Creator CREATOR = new C0052az();
    /* renamed from: a */
    public int f11026a;
    /* renamed from: b */
    public float f11027b;
    /* renamed from: c */
    public boolean f11028c;

    public C0636ay(Parcel parcel, ClassLoader classLoader) {
        boolean z;
        super(parcel, classLoader);
        this.f11026a = parcel.readInt();
        this.f11027b = parcel.readFloat();
        if (parcel.readByte() != (byte) 0) {
            z = true;
        } else {
            z = false;
        }
        this.f11028c = z;
    }

    public C0636ay(Parcelable parcelable) {
        super(parcelable);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f11026a);
        parcel.writeFloat(this.f11027b);
        parcel.writeByte(this.f11028c);
    }
}
