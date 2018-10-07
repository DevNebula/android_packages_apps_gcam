package p000;

/* compiled from: PG */
/* renamed from: hce */
final class hce implements hch {
    /* renamed from: a */
    private final /* synthetic */ hcd f19898a;

    hce(hcd hcd) {
        this.f19898a = hcd;
    }

    public final void onShutterButtonClick() {
        synchronized (this.f19898a.f6322b) {
            for (hch onShutterButtonClick : this.f19898a.f6323c) {
                onShutterButtonClick.onShutterButtonClick();
            }
        }
    }

    public final void onShutterButtonLongPressRelease() {
        synchronized (this.f19898a.f6322b) {
            for (hch onShutterButtonLongPressRelease : this.f19898a.f6323c) {
                onShutterButtonLongPressRelease.onShutterButtonLongPressRelease();
            }
        }
    }

    public final void onShutterButtonLongPressed() {
        synchronized (this.f19898a.f6322b) {
            for (hch onShutterButtonLongPressed : this.f19898a.f6323c) {
                onShutterButtonLongPressed.onShutterButtonLongPressed();
            }
        }
    }

    public final void onShutterButtonPressedStateChanged(boolean z) {
        synchronized (this.f19898a.f6322b) {
            for (hch onShutterButtonPressedStateChanged : this.f19898a.f6323c) {
                onShutterButtonPressedStateChanged.onShutterButtonPressedStateChanged(z);
            }
        }
    }

    public final void onShutterTouch(hin hin) {
        synchronized (this.f19898a.f6322b) {
            for (hch onShutterTouch : this.f19898a.f6323c) {
                onShutterTouch.onShutterTouch(hin);
            }
        }
    }
}
