package com.unact.yandexmapkitexample;

import androidx.annotation.NonNull;

import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.engine.FlutterEngine;

import com.yandex.mapkit.MapKitFactory;

public class MainActivity extends FlutterActivity {
  @Override
  public void configureFlutterEngine(@NonNull FlutterEngine flutterEngine) {
//    MapKitFactory.setLocale("YOUR_LOCALE");
    MapKitFactory.setApiKey("466da8cb-8784-4e2e-b549-94a9b7f0479b");
    super.configureFlutterEngine(flutterEngine);
  }
}
