package p000;

import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseOutputStream;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.Callable;

/* renamed from: iio */
final class iio implements Callable {
    /* renamed from: a */
    private final /* synthetic */ ParcelFileDescriptor f7372a;
    /* renamed from: b */
    private final /* synthetic */ byte[] f7373b;

    iio(ParcelFileDescriptor parcelFileDescriptor, byte[] bArr) {
        this.f7372a = parcelFileDescriptor;
        this.f7373b = bArr;
    }

    /* renamed from: a */
    private final Boolean m3815a() {
        if (Log.isLoggable("WearableClient", 3)) {
            String valueOf = String.valueOf(this.f7372a);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 36);
            stringBuilder.append("processAssets: writing data to FD : ");
            stringBuilder.append(valueOf);
            Log.d("WearableClient", stringBuilder.toString());
        }
        AutoCloseOutputStream autoCloseOutputStream = new AutoCloseOutputStream(this.f7372a);
        String valueOf2;
        StringBuilder stringBuilder2;
        String valueOf3;
        StringBuilder stringBuilder3;
        try {
            autoCloseOutputStream.write(this.f7373b);
            autoCloseOutputStream.flush();
            if (Log.isLoggable("WearableClient", 3)) {
                valueOf2 = String.valueOf(this.f7372a);
                stringBuilder2 = new StringBuilder(String.valueOf(valueOf2).length() + 27);
                stringBuilder2.append("processAssets: wrote data: ");
                stringBuilder2.append(valueOf2);
                Log.d("WearableClient", stringBuilder2.toString());
            }
            Boolean valueOf4 = Boolean.valueOf(true);
            try {
                if (Log.isLoggable("WearableClient", 3)) {
                    valueOf3 = String.valueOf(this.f7372a);
                    stringBuilder3 = new StringBuilder(String.valueOf(valueOf3).length() + 24);
                    stringBuilder3.append("processAssets: closing: ");
                    stringBuilder3.append(valueOf3);
                    Log.d("WearableClient", stringBuilder3.toString());
                }
                autoCloseOutputStream.close();
                return valueOf4;
            } catch (IOException e) {
                return valueOf4;
            }
        } catch (IOException e2) {
            valueOf2 = String.valueOf(this.f7372a);
            stringBuilder2 = new StringBuilder(String.valueOf(valueOf2).length() + 36);
            stringBuilder2.append("processAssets: writing data failed: ");
            stringBuilder2.append(valueOf2);
            Log.w("WearableClient", stringBuilder2.toString());
            try {
                if (Log.isLoggable("WearableClient", 3)) {
                    valueOf2 = String.valueOf(this.f7372a);
                    stringBuilder2 = new StringBuilder(String.valueOf(valueOf2).length() + 24);
                    stringBuilder2.append("processAssets: closing: ");
                    stringBuilder2.append(valueOf2);
                    Log.d("WearableClient", stringBuilder2.toString());
                }
                autoCloseOutputStream.close();
            } catch (IOException e3) {
            }
            return Boolean.valueOf(false);
        } catch (Throwable th) {
            try {
                if (Log.isLoggable("WearableClient", 3)) {
                    valueOf3 = String.valueOf(this.f7372a);
                    stringBuilder3 = new StringBuilder(String.valueOf(valueOf3).length() + 24);
                    stringBuilder3.append("processAssets: closing: ");
                    stringBuilder3.append(valueOf3);
                    Log.d("WearableClient", stringBuilder3.toString());
                }
                autoCloseOutputStream.close();
            } catch (IOException e4) {
            }
            throw th;
        }
    }
}
