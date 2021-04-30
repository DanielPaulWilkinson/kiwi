// Generated by Dagger (https://dagger.dev).
package com.example.zest.dagger;

import com.example.zest.room.entities.Ingredients;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import java.util.concurrent.Callable;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class FixedThreadModule_GetIngredientFactory implements Factory<Ingredients> {
  private final FixedThreadModule module;

  private final Provider<Callable<Ingredients>> callableProvider;

  public FixedThreadModule_GetIngredientFactory(FixedThreadModule module,
      Provider<Callable<Ingredients>> callableProvider) {
    this.module = module;
    this.callableProvider = callableProvider;
  }

  @Override
  public Ingredients get() {
    return GetIngredient(module, callableProvider.get());
  }

  public static FixedThreadModule_GetIngredientFactory create(FixedThreadModule module,
      Provider<Callable<Ingredients>> callableProvider) {
    return new FixedThreadModule_GetIngredientFactory(module, callableProvider);
  }

  public static Ingredients GetIngredient(FixedThreadModule instance,
      Callable<Ingredients> callable) {
    return Preconditions.checkNotNullFromProvides(instance.GetIngredient(callable));
  }
}