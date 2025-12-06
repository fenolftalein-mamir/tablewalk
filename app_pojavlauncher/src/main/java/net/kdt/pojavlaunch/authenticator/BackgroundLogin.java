package org.tablewalk.authenticator;

import androidx.annotation.NonNull;

import org.tablewalk.authenticator.listener.LoginListener;
import org.tablewalk.authenticator.accounts.MinecraftAccount;

public interface BackgroundLogin {
    void createAccount(@NonNull LoginListener loginListener, String code);
    void refreshAccount(@NonNull LoginListener loginListener, MinecraftAccount account);
    interface Creator {
        BackgroundLogin create();
    }
}
