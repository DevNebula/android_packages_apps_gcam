package com.google.android.gms.common.data;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import p000.htl;
import p000.hvf;

public class BitmapTeleporter extends zza implements ReflectedParcelable {
    public static final Creator CREATOR = new hvf();
    /* renamed from: a */
    public File f23363a;
    /* renamed from: b */
    private final int f23364b;
    /* renamed from: c */
    private ParcelFileDescriptor f23365c;
    /* renamed from: d */
    private final int f23366d;
    /* renamed from: e */
    private Bitmap f23367e = null;

    public BitmapTeleporter(int i, ParcelFileDescriptor parcelFileDescriptor, int i2) {
        this.f23364b = i;
        this.f23365c = parcelFileDescriptor;
        this.f23366d = i2;
    }

    /* renamed from: a */
    private final FileOutputStream m15365a() {
        File file = this.f23363a;
        if (file == null) {
            throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel");
        }
        try {
            file = File.createTempFile("teleporter", ".tmp", file);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                this.f23365c = ParcelFileDescriptor.open(file, 268435456);
                file.delete();
                return fileOutputStream;
            } catch (FileNotFoundException e) {
                throw new IllegalStateException("Temporary file is somehow already deleted");
            }
        } catch (Throwable e2) {
            throw new IllegalStateException("Could not create temporary file", e2);
        }
    }

    /* renamed from: a */
    private static void m15366a(Closeable closeable) {
        try {
            closeable.close();
        } catch (Throwable e) {
            Log.w("BitmapTeleporter", "Could not close stream", e);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        Object obj = null;
        if (this.f23365c == null) {
            Buffer allocate = ByteBuffer.allocate(obj.getRowBytes() * obj.getHeight());
            obj.copyPixelsToBuffer(allocate);
            byte[] array = allocate.array();
            Closeable dataOutputStream = new DataOutputStream(m15365a());
            try {
                dataOutputStream.writeInt(array.length);
                Bitmap bitmap = null;
                dataOutputStream.writeInt(bitmap.getWidth());
                bitmap = null;
                dataOutputStream.writeInt(bitmap.getHeight());
                bitmap = null;
                dataOutputStream.writeUTF(bitmap.getConfig().toString());
                dataOutputStream.write(array);
                m15366a(dataOutputStream);
            } catch (Throwable e) {
                throw new IllegalStateException("Could not write into unlinked file", e);
            } catch (Throwable th) {
                m15366a(dataOutputStream);
            }
        }
        int b = htl.m3487b(parcel, 20293);
        htl.m3497c(parcel, 1, this.f23364b);
        htl.m3468a(parcel, 2, this.f23365c, i | 1);
        htl.m3497c(parcel, 3, this.f23366d);
        htl.m3496c(parcel, b);
        this.f23365c = obj;
    }
}
