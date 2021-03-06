// Generated by Dagger (https://dagger.dev).
package com.example.zest.fragment.createIngredientJourney;

import com.example.zest.async.FixedThreadPool;
import com.example.zest.room.repositories.IngredientRepository;
import com.example.zest.services.SharedPreferences;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class caloriesOfIngredientFragment_MembersInjector implements MembersInjector<caloriesOfIngredientFragment> {
  private final Provider<SharedPreferences> sharedPreferencesProvider;

  private final Provider<FixedThreadPool> fixedThreadPoolProvider;

  private final Provider<IngredientRepository> ingredientRepositoryProvider;

  public caloriesOfIngredientFragment_MembersInjector(
      Provider<SharedPreferences> sharedPreferencesProvider,
      Provider<FixedThreadPool> fixedThreadPoolProvider,
      Provider<IngredientRepository> ingredientRepositoryProvider) {
    this.sharedPreferencesProvider = sharedPreferencesProvider;
    this.fixedThreadPoolProvider = fixedThreadPoolProvider;
    this.ingredientRepositoryProvider = ingredientRepositoryProvider;
  }

  public static MembersInjector<caloriesOfIngredientFragment> create(
      Provider<SharedPreferences> sharedPreferencesProvider,
      Provider<FixedThreadPool> fixedThreadPoolProvider,
      Provider<IngredientRepository> ingredientRepositoryProvider) {
    return new caloriesOfIngredientFragment_MembersInjector(sharedPreferencesProvider, fixedThreadPoolProvider, ingredientRepositoryProvider);
  }

  @Override
  public void injectMembers(caloriesOfIngredientFragment instance) {
    injectSharedPreferences(instance, sharedPreferencesProvider.get());
    injectFixedThreadPool(instance, fixedThreadPoolProvider.get());
    injectIngredientRepository(instance, ingredientRepositoryProvider.get());
  }

  @InjectedFieldSignature("com.example.zest.fragment.createIngredientJourney.caloriesOfIngredientFragment.sharedPreferences")
  public static void injectSharedPreferences(caloriesOfIngredientFragment instance,
      SharedPreferences sharedPreferences) {
    instance.sharedPreferences = sharedPreferences;
  }

  @InjectedFieldSignature("com.example.zest.fragment.createIngredientJourney.caloriesOfIngredientFragment.fixedThreadPool")
  public static void injectFixedThreadPool(caloriesOfIngredientFragment instance,
      FixedThreadPool fixedThreadPool) {
    instance.fixedThreadPool = fixedThreadPool;
  }

  @InjectedFieldSignature("com.example.zest.fragment.createIngredientJourney.caloriesOfIngredientFragment.ingredientRepository")
  public static void injectIngredientRepository(caloriesOfIngredientFragment instance,
      IngredientRepository ingredientRepository) {
    instance.ingredientRepository = ingredientRepository;
  }
}
