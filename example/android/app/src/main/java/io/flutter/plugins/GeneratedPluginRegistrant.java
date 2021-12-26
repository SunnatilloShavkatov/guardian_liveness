package io.flutter.plugins;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import io.flutter.Log;

import io.flutter.embedding.engine.FlutterEngine;

/**
 * Generated file. Do not edit.
 * This file is generated by the Flutter tool based on the
 * plugins that support the Android platform.
 */
@Keep
public final class GeneratedPluginRegistrant {
  private static final String TAG = "GeneratedPluginRegistrant";
  public static void registerWith(@NonNull FlutterEngine flutterEngine) {
    try {
      flutterEngine.getPlugins().add(new lab.neruno.guardian_liveness.GuardianLivenessPlugin());
    } catch(Exception e) {
      Log.e(TAG, "Error registering plugin guardian_liveness, lab.neruno.guardian_liveness.GuardianLivenessPlugin", e);
    }
  }
}
