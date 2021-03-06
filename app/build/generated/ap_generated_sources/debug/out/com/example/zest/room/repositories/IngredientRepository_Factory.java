// Generated by Dagger (https://dagger.dev).
package com.example.zest.room.repositories;

import com.example.zest.room.interfaces.IngredientsDao;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class IngredientRepository_Factory implements Factory<IngredientRepository> {
  private final Provider<IngredientsDao> ingredientsDaoProvider;

  public IngredientRepository_Factory(Provider<IngredientsDao> ingredientsDaoProvider) {
    this.ingredientsDaoProvider = ingredientsDaoProvider;
  }

  @Override
  public IngredientRepository get() {
    return newInstance(ingredientsDaoProvider.get());
  }

  public static IngredientRepository_Factory create(
      Provider<IngredientsDao> ingredientsDaoProvider) {
    return new IngredientRepository_Factory(ingredientsDaoProvider);
  }

  public static IngredientRepository newInstance(IngredientsDao ingredientsDao) {
    return new IngredientRepository(ingredientsDao);
  }
}
