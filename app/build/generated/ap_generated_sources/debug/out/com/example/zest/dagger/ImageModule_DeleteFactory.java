// Generated by Dagger (https://dagger.dev).
package com.example.zest.dagger;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ImageModule_DeleteFactory implements Factory<Boolean> {
  private final ImageModule module;

  private final Provider<String> pathProvider;

  public ImageModule_DeleteFactory(ImageModule module, Provider<String> pathProvider) {
    this.module = module;
    this.pathProvider = pathProvider;
  }

  @Override
  public Boolean get() {
    return Delete(module, pathProvider.get());
  }

  public static ImageModule_DeleteFactory create(ImageModule module,
      Provider<String> pathProvider) {
    return new ImageModule_DeleteFactory(module, pathProvider);
  }

  public static Boolean Delete(ImageModule instance, String path) {
    return Preconditions.checkNotNullFromProvides(instance.Delete(path));
  }
}
