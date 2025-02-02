package io.sentry.metrics;

import io.sentry.protocol.SentryId;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

@ApiStatus.Internal
public interface IMetricsClient {
  /** Captures one or more metrics to be sent to Sentry. */
  @NotNull
  SentryId captureMetrics(final @NotNull EncodedMetrics metrics);

  /** Captures one or more {@link CodeLocations} to be sent to Sentry. */
  // void captureCodeLocations(final @NotNull CodeLocations codeLocations);
}
