package org.tablewalk.authenticator.listener;

import org.tablewalk.authenticator.accounts.MinecraftAccount;

public interface LoginListener{
    void onLoginDone(MinecraftAccount account);
    void onLoginError(Throwable errorMessage);
    void onLoginProgress(int step);
    void setMaxLoginProgress(int max);
}
