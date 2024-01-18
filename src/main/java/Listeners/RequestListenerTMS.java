package Listeners;

import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;

public class RequestListenerTMS implements ServletRequestListener {
    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("Request Listener in");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("Request Listener out");
    }
}
