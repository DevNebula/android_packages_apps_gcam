package com.google.android.gms.feedback;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.zza;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import p000.htl;
import p000.hxy;

public class FileTeleporter extends zza {
    public static final Creator CREATOR = new hxy();
    /* renamed from: a */
    public File f23465a;
    /* renamed from: b */
    private ParcelFileDescriptor f23466b;
    /* renamed from: c */
    private final String f23467c;
    /* renamed from: d */
    private final String f23468d;

    public FileTeleporter(ParcelFileDescriptor parcelFileDescriptor, String str, String str2) {
        this.f23466b = parcelFileDescriptor;
        this.f23467c = str;
        this.f23468d = str2;
    }

    /* renamed from: a */
    private static void m15380a(Closeable closeable) {
        try {
            closeable.close();
        } catch (Throwable e) {
            Log.w("FileTeleporter", "Could not close stream", e);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        if (this.f23466b == null) {
            Closeable dataOutputStream = new DataOutputStream(m15379a());
            Object[] objArr = null;
            try {
                dataOutputStream.writeInt(objArr.length);
                dataOutputStream.writeUTF(this.f23467c);
                dataOutputStream.writeUTF(this.f23468d);
                dataOutputStream.write(null);
                m15380a(dataOutputStream);
            } catch (Throwable e) {
                throw new IllegalStateException("Could not write into unlinked file", e);
            } catch (Throwable th) {
                m15380a(dataOutputStream);
            }
        }
        int b = htl.m3487b(parcel, 20293);
        htl.m3468a(parcel, 2, this.f23466b, i);
        htl.m3469a(parcel, 3, this.f23467c);
        htl.m3469a(parcel, 4, this.f23468d);
        htl.m3496c(parcel, b);
    }

    /* renamed from: a */
    private final FileOutputStream m15379a() {
        File file = this.f23465a;
        if (file == null) {
            throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel.");
        }
        try {
            file = File.createTempFile("teleporter", ".tmp", file);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                this.f23466b = ParcelFileDescriptor.open(file, 268435456);
                file.delete();
                return fileOutputStream;
            } catch (FileNotFoundException e) {
                throw new IllegalStateException("Temporary file is somehow already deleted.");
            }
        } catch (Throwable e2) {
            throw new IllegalStateException("Could not create temporary file:", e2);
        }
    }
}
