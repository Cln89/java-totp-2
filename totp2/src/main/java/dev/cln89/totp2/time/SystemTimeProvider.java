package dev.cln89.totp2.time;

import dev.cln89.totp2.exceptions.TimeProviderException;
import java.time.Instant;

public class SystemTimeProvider implements TimeProvider {
    @Override
    public long getTime() throws TimeProviderException {
        return Instant.now().getEpochSecond();
    }
}
