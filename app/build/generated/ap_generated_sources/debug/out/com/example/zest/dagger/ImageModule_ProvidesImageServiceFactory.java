// Generated by Dagger (https://dagger.dev).
package com.example.zest.dagger;

import com.example.zest.services.ImageProcessing;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ImageModule_ProvidesImageServiceFactory implements Factory<ImageProcessing> {
  private final ImageModule module;

  public ImageModule_ProvidesImageServiceFactory(ImageModule module) {
    this.module = module;
  }

  @Override
  public ImageProcessing get() {
    return providesImageService(module);
  }

  public static ImageModule_ProvidesImageServiceFactory create(ImageModule module) {
    return new ImageModule_ProvidesImageServiceFactory(module);
  }

  public static ImageProcessing providesImageService(ImageModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.providesImageService());
  }
}
