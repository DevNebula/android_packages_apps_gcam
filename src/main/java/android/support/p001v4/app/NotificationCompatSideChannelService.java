package android.support.p001v4.app;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.p001v4.app.INotificationSideChannel.Stub;

/* compiled from: PG */
/* renamed from: android.support.v4.app.NotificationCompatSideChannelService */
public abstract class NotificationCompatSideChannelService extends Service {

    /* compiled from: PG */
    /* renamed from: android.support.v4.app.NotificationCompatSideChannelService$NotificationSideChannelStub */
    class NotificationSideChannelStub extends Stub {
        NotificationSideChannelStub() {
        }

        public void cancel(String str, int i, String str2) {
            NotificationCompatSideChannelService.this.checkPermission(NotificationSideChannelStub.getCallingUid(), str);
            long clearCallingIdentity = NotificationSideChannelStub.clearCallingIdentity();
            try {
                NotificationCompatSideChannelService.this.cancel(str, i, str2);
            } finally {
                NotificationSideChannelStub.restoreCallingIdentity(clearCallingIdentity);
            }
        }

        public void cancelAll(String str) {
            NotificationCompatSideChannelService.this.checkPermission(NotificationSideChannelStub.getCallingUid(), str);
            long clearCallingIdentity = NotificationSideChannelStub.clearCallingIdentity();
            try {
                NotificationCompatSideChannelService.this.cancelAll(str);
            } finally {
                NotificationSideChannelStub.restoreCallingIdentity(clearCallingIdentity);
            }
        }

        public void notify(String str, int i, String str2, Notification notification) {
            NotificationCompatSideChannelService.this.checkPermission(NotificationSideChannelStub.getCallingUid(), str);
            long clearCallingIdentity = NotificationSideChannelStub.clearCallingIdentity();
            try {
                NotificationCompatSideChannelService.this.notify(str, i, str2, notification);
            } finally {
                NotificationSideChannelStub.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }

    public abstract void cancel(String str, int i, String str2);

    public abstract void cancelAll(String str);

    public abstract void notify(String str, int i, String str2, Notification notification);

    void checkPermission(int i, String str) {
        String[] packagesForUid = getPackageManager().getPackagesForUid(i);
        int length = packagesForUid.length;
        int i2 = 0;
        while (i2 < length) {
            if (!packagesForUid[i2].equals(str)) {
                i2++;
            } else {
                return;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("NotificationSideChannelService: Uid ");
        stringBuilder.append(i);
        stringBuilder.append(" is not authorized for package ");
        stringBuilder.append(str);
        throw new SecurityException(stringBuilder.toString());
    }

    public IBinder onBind(Intent intent) {
        if (intent.getAction().equals(NotificationManagerCompat.ACTION_BIND_SIDE_CHANNEL)) {
        }
        return null;
    }
}
