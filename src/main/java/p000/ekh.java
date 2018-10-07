package p000;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* renamed from: ekh */
final class ekh implements Runnable {
    /* renamed from: a */
    private final /* synthetic */ byte[] f3957a;
    /* renamed from: b */
    private final /* synthetic */ ejy f3958b;

    ekh(ejy ejy, byte[] bArr) {
        this.f3958b = ejy;
        this.f3957a = bArr;
    }

    public final void run() {
        try {
            String str = (String) this.f3958b.f3921H.remove(0);
            OutputStream fileOutputStream = new FileOutputStream(str);
            File file = new File(str);
            str = String.valueOf(file);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 11);
            stringBuilder.append("imageFile: ");
            stringBuilder.append(str);
            if (ejv.m1861a()) {
                byte[] bArr = this.f3957a;
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                decodeByteArray.compress(CompressFormat.JPEG, 100, fileOutputStream);
                decodeByteArray.recycle();
            } else {
                fileOutputStream.write(this.f3957a);
            }
            fileOutputStream.close();
            ejy ejy = this.f3958b;
            if (ejy.f3944o < ejy.f3919F.size()) {
                ejy = this.f3958b;
                ejy.f3919F.get(ejy.f3944o);
                file.getAbsolutePath();
            }
            int i = this.f3958b.f3944o;
            int length = this.f3957a.length;
            StringBuilder stringBuilder2 = new StringBuilder(44);
            stringBuilder2.append("Photo ");
            stringBuilder2.append(i);
            stringBuilder2.append(" saved : ");
            stringBuilder2.append(length);
            stringBuilder2.append(" bytes.");
            ejy = this.f3958b;
            ejy.f3943n.get(ejy.f3944o);
            ((float[]) this.f3958b.f3920G.remove(0)).clone();
            ejx ejx = this.f3958b.f3917D;
            String absolutePath = file.getAbsolutePath();
            String valueOf = String.valueOf(absolutePath);
            String str2 = "alignNextImage called for ";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                str2.concat(valueOf);
            }
            ejx.f3909a.put(absolutePath);
            ejy = this.f3958b;
            ejy.f3944o++;
            ekm ekm = ejy.f3922I;
            ekm.f4037b = ejy.m1866a(file);
            ekm.mo6287a();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("Unexpected interruption");
        } catch (Throwable e2) {
            kqg.f8786a.mo10213b(e2);
        } catch (Throwable e22) {
            kqg.f8786a.mo10213b(e22);
        } catch (Throwable e222) {
            kqg.f8786a.mo10213b(e222);
        }
    }
}
